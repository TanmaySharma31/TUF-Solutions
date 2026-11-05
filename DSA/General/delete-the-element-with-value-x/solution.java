/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        if(temp.data==X){
            return head.next;

        }
        while(temp.next!=null){
            if(temp.next.data==X){
                temp.next=temp.next.next;
                return head;
            }
            temp=temp.next;
        }
        
        return head;
    }
}