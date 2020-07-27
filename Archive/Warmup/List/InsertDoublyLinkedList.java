package Hackerank.Warmup;

public class InsertDoublyLinkedList {

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        DoublyLinkedListNode current = head;

        if (head == null) {
            head = newNode;
            return head;
        }

        while (current != null) {
            if (current.data >= data) {
                if (current.prev == null) {
                    newNode.next = current;
                    current.prev = newNode;
                    head = newNode;
                } else {
                    newNode.next = current;
                    newNode.prev = current.prev;
                    current.prev.next = newNode;
                    current.prev = newNode;
                }

                break;
            }


            if (current.next == null) {
                current.next = newNode;
                newNode.prev = current;
                break;
            }

            current = current.next;
        }

        return head;
    }

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }
}
