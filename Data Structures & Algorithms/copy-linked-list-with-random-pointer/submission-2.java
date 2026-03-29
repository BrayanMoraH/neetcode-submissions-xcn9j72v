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
        Map<Node, Node> oldNew = new HashMap<>();
        oldNew.put(null, null);
        Node current = head;

        while(current != null){
            Node copy = new Node(current.val);
            oldNew.put(current, copy);
            current = current.next;
        }

        current = head;

        while(current != null){
            Node copy = oldNew.get(current);
            copy.next = oldNew.get(current.next);
            copy.random = oldNew.get(current.random);

            current = current.next;
        }

        return oldNew.get(head);
    }
}
