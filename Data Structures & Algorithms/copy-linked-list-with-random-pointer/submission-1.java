/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node d = new Node(-1);
        Node dummy =d;
        Node curr = head;
        while(curr!=null){
            dummy.next = new Node(curr.val);
            map.put(curr, dummy.next);
            curr= curr.next;
            dummy = dummy.next;

        }
        curr = head;
        dummy = d.next;

        while(curr!=null){
           dummy.random= map.get(curr.random) ;
           curr= curr.next;
           dummy = dummy.next;
           

        }
        return d.next;
    }
}
