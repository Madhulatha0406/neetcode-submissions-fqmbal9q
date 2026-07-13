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
        if(head==null||head.next==null)return null;
        ListNode curr = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int len=0;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        curr = dummy;
        for(int i =0;i<len-n;i++){
            curr= curr.next;
        }
       if(curr!=null&&curr.next!=null) curr.next = curr.next.next;
        return dummy.next;
    }
}
