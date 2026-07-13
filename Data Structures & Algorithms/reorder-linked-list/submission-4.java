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
     public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev= curr;
            curr= next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
          if (head == null || head.next == null)
            return;
        ListNode slow = head;
        ListNode fast = head;
         ListNode firstEnd =slow;
        while(fast!=null&&fast.next!=null){
             firstEnd = slow;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        ListNode middle = slow;
        firstEnd.next = null;
        ListNode h2 =reverseList(middle);
        ListNode h1 = head; 
        ListNode d = new ListNode(-1);
        ListNode dummy = d;
        int i =0;
         while(h1!=null&&h2!=null){
         
            if(i%2!=0){
         
                dummy.next = h2;
             
                h2= h2.next;

                
            }
            else{
                
                dummy.next = h1;
              
                h1=h1.next;
            }
            dummy = dummy.next;
            i++;
           
        }
        if(h1!=null) dummy.next = h1;
        else dummy.next = h2;


    }
}
