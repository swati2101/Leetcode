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
    public ListNode swapNodes(ListNode head, int k) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        //System.out.println(count);
        int k1=count-k+1;
        temp=head;
        while(k1-->1){
            temp=temp.next;
        }
        ListNode val1=temp;
        temp=head;
        while(k-->1){
            temp=temp.next;
        }
        ListNode val2=temp;
        int temp2=val1.val;
        val1.val=val2.val;
        val2.val=temp2;
        return head;
    }
}