import java.io.*;
import java.util.*;

public class Main {

  public static class HashMap<K,V> {
    private class HMPair {
      K key;
      V val;

      HMPair(K key, V val) {
        this.key = key;
        this.val = val;
      }
    }

    int size; // n
    LinkedList<HMPair>[] buckets; // N = buckets.length

    public HashMap() {
      initbuckets(4);
      size = 0;
    }

    private void initbuckets(int N) {
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; ++bi) {
        buckets[bi] = new LinkedList<>();
      }
    }

    public boolean containsKey(K key) {
      int bi = hashFunction(key);
      int di = findInBucket(key,bi);
      return (di != -1);
    }

    public V get(K key) {
      int bi = hashFunction(key);
      int di = findInBucket(key,bi);
      if(di == -1) return null;
      else {
        HMPair pair = buckets[bi].get(di);
        return pair.val;
      }
    }

    public V remove(K key) {
      int bi = hashFunction(key);
      int di = findInBucket(key,bi);
      if(di == -1) return null;
      else {
        HMPair pair = buckets[bi].remove(di);
        size--;
        return pair.val;
      }
    }

    public void put(K key, V val) {
      int bi = hashFunction(key);
      int di = findInBucket(key,bi);
      if(di == -1) {
        HMPair pair = new HMPair(key,val);
        buckets[bi].add(pair);
        size++;
      }
      else {
        HMPair pair = buckets[bi].get(di);
        pair.val = val;
      }

      double lambda = size * 1.0 / buckets.length;
      if(lambda > 2.0) rehash(); 
    }

    private void rehash() {
      LinkedList<HMPair>[] oba = buckets;
      size = 0;
      initbuckets(2*oba.length);
      for(int bi = 0; bi < oba.length; ++bi) {
        for(int di = 0; di < buckets[bi].size(); ++di) {
          HMPair pair = oba[bi].get(di);
          put(pair.key, pair.val);
        }
      }
    }

    public ArrayList<K> keyset() {
      ArrayList<K> keys = new ArrayList<K>();
      for(int bi = 0; bi < buckets.length; ++bi) 
        for(int di = 0; di < buckets[bi].size(); ++di) {
          HMPair pair = buckets[bi].get(di);
          keys.add(pair.key);
        }
        return keys;
    }

    public int size() {
      return size;
    }

    public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.print("Bucket" + bi + " ");
        for (HMPair pair : buckets[bi]) 
          System.out.print(pair.key + "@" + pair.val + " ");
        System.out.println(".");
      }
      System.out.println("Display Ends");
    }

    private int hashFunction(K key) {
      int hash = key.hashCode();
      int bi = Math.abs(hash) % buckets.length; // compression
      return bi;
    }

    private int findInBucket(K key, int bi) {
      for(int di = 0; di < buckets[bi].size(); ++di) {
        HMPair pair = buckets[bi].get(di);
        if(pair.key.equals(key)) return di;
      }
      return -1;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("put")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        Integer val = Integer.parseInt(parts[2]);
        map.put(key, val);
      } else if (str.startsWith("get")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.get(key));
      } else if (str.startsWith("containsKey")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.containsKey(key));
      } else if (str.startsWith("remove")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.remove(key));
      } else if (str.startsWith("size")) {
        System.out.println(map.size());
      } else if (str.startsWith("keyset")) {
        System.out.println(map.keyset());
      } else if (str.startsWith("display")) {
        map.display();
      }
      str = br.readLine();
    }
  }
}