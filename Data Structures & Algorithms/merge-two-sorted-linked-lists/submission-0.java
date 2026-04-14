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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode head2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode nextnode;
          nextnode = dummy;
        while(head1!=null&& head2!=null){
              
            if(head1.val<=head2.val){
            
                nextnode.next = head1;
                nextnode = nextnode.next;
                head1= head1.next;
            }
            else {
                 nextnode.next = head2;
                nextnode = nextnode.next;
                head2= head2.next;
            }
        }
        if(head1!=null) nextnode.next = head1;
           if(head2!=null) nextnode.next = head2;
           return dummy.next;


        
    }
}