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
    public void reorderList(ListNode head) {
        int length =0;
        ListNode next = head;
        ListNode newHead = head;
        while(next!=null){
            next = next.next;
            length++;
        }
        ListNode sec = head;
   for(int i =1;i<(length+1)/2;i++){
    sec= sec.next;
   }
   ListNode list1 =head;
   newHead = sec.next;
   sec.next = null;
   ListNode rev = reverseList(newHead);
   ListNode l1next;
   ListNode l2next;
   newHead = head;

   while(rev!=null){
 l1next = list1.next;
 l2next = rev.next;
 list1.next = rev;
 rev.next = l1next;
 list1 = l1next;
 rev = l2next;

   } 
   

    }
   static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
