/*class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    // Function to find intersection point in Y shaped Linked Lists.
    public Node intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null) return null;

        // Change "ListNode" to "Node" to match your class definition
        Node a = head1;
        Node b = head2;

        // Traverse both lists; pointers will meet at the intersection
        while (a != b) {
            // When a pointer reaches the end, redirect to the other list's head
            a = (a == null) ? head2 : a.next;
            b = (b == null) ? head1 : b.next;
        }

        // Returns the intersection node or null if no intersection exists
        return a;
    }
}
