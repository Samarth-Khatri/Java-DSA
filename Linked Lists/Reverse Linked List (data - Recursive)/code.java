// Question not available on NADOS
// Just writing the user defined functions

Node left = null; // Left pointer defined in heap 

public void reverseDR() {
    left = head; // left pointer assigned null
    reverseDRHelper(head,0); // function call
}

private void reverseDRHelper(Node right, int floor) {
    if(right.next==null) // base case
        return;
    if(florr<=size/2) {  // only reverse till mid
        reverseDRHelper(right.next, floor+1); // recursive call
        int temp = left.data; // swapping left and right data
        left.data = right.data;
        right.data = temp;
        left = left.next; // increment the left pointer
    }
}