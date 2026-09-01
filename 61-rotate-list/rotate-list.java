/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        int length=1;
        ListNode tail=head;

        while(tail.next!=null){
            tail=tail.next;
            length+=1;
        }
        tail.next=head;
         k=k%length;
         int newtailindex=length-k-1;
         ListNode newtail=head;

         for(int i=0 ;i<newtailindex;i++){
             newtail =newtail.next;
         }
         ListNode newhead=newtail.next;
         newtail.next=null;

         return newhead;



    }
}