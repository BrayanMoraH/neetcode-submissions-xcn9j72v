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
        Map<Node, Node> copyToNew = new HashMap<>();
        copyToNew.put(null, null);
        Node current = head;

        while(current != null){
            Node copy = new Node(current.val);
            copyToNew.put(current, copy);
            current = current.next;
        }

        current = head;

        while(current != null){
            Node copy = copyToNew.get(current);
            copy.next = copyToNew.get(current.next);
            copy.random = copyToNew.get(current.random);

            current = current.next;
        }

        return copyToNew.get(head);
    }
}
