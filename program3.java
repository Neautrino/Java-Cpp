
// Count number of nodes in circular linked list 

class LinkNode {
    public int data;
    public LinkNode next;

    public LinkNode(int data, LinkNode first) {
        this.data = data;
        this.next = first;
    }
}

public class program3 {
    public LinkNode head;

    // Class constructor
    public program3() {
        this.head = null;
    }

    // Insert node at end of circular linked list
    public void insert(int value) {
        // Create a new node
        LinkNode node = new LinkNode(value, this.head);
        if (this.head == null) {
            // First node of linked list
            this.head = node;
            node.next = this.head;
        } else {
            LinkNode temp = this.head;
            // Find the last node
            while (temp.next != this.head) {
                // Visit to next node
                temp = temp.next;
            }
            // Add new node at the last
            temp.next = node;
        }
    }

    public int countNode() {
        if (this.head == null) {
            return 0;
        }
        // Start with second node
        LinkNode temp = this.head.next;
        // This is used to count linked node
        int count = 1;
        // iterate circular linked list
        while (temp != this.head) {
            count += 1;
            // Visit to next node
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        program3 cll = new program3();
        // Add nodes
        cll.insert(1);
        cll.insert(3);
        cll.insert(5);
        cll.insert(7);
        cll.insert(9);
        cll.insert(11);
        // Display result
        System.out.println(cll.countNode());
    }
}