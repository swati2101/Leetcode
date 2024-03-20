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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp3=list1;
        ListNode temp2=list2;
        while(temp2.next!=null){
            temp2=temp2.next;
            
        }
        System.out.println(temp2.val);
        int i=0,j=0;
        while(i!=a-1){
            if(i==a-1){
                temp1=temp1.next;
                System.out.println(temp1.val+" "+i);
                break;
            }
            
            i++;
            
            temp1=temp1.next;
            
        }
        j=a;
        temp3=temp1.next;
        while(j!=b+1){
            if(j==b+1){
                temp3=temp3.next;
                System.out.println(temp3.val+" "+j);
                break;
            }
            j++;
            temp3=temp3.next;
        }
        //System.out.println(temp1.val+" "+temp2.val+" "+temp3.val);
        temp1.next=list2;
        temp2.next=temp3;
        return list1;
        
    }
}