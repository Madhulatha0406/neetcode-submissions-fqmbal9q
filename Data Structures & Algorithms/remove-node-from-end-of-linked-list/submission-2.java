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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        int count =0;
    while(temp!=null){
        temp = temp.next;
        count++;

    }
    if(count<=1) return null;
    if (count==2){
        if(n%2==0){
            head= head.next;
           
            return head;}
        else {
            head.next = null;
            return head;
        }
    }
    temp = head;
    if(n == count) return head.next;
    for(int i =1;i<count-n;i++){
        temp = temp.next;
    }
   if(temp!=null&&temp.next!=null) temp.next = temp.next.next;
    return head;

    }
}
