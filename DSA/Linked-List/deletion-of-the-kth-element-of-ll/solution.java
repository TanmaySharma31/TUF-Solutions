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
    public ListNode deleteKthNode(ListNode head, int k) {
        if(k==1){
            return head.next;
        }
        ListNode temp=head;
        int count=1;
        while(temp.next.next!=null){
            if(count==k-1){
                temp.next=temp.next.next;
                return head;
            }
            temp=temp.next;
            count++;
        }
        temp.next=null;
        return head;
    }
}