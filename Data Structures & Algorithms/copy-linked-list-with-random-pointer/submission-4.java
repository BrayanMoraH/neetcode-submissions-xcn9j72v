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
        Map<Node, Node> newToCopy = new HashMap<>();
        Node current = head;

        while(current != null){
            Node newNode = new Node(current.val);
            newToCopy.put(current, newNode);
            current = current.next;
        }

        current = head;

        while(current != null){
            Node newNode = newToCopy.get(current);
            newNode.next = newToCopy.get(current.next);
            newNode.random = newToCopy.get(current.random);
            current = current.next;
        }

        return newToCopy.get(head);
    }
}
