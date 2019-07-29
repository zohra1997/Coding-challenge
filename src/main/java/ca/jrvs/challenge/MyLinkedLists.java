package ca.jrvs.challenge;

/**
 * LinkedList implementation
 */
public class MyLinkedLists {
     static class Node {
        public int val;
        public Node next;

        //Node constructor
        // with an integer value and a pointer to the next node
        public Node(int val) {
            this.val = val;
            this.next = null;
        }

    }

    public Node node;
    public int size;

    // LinkedList Constructor creating a node with value 0
    public MyLinkedLists(Node node) {
        this.node = node;
        size = 0;
    }

    public int getValue(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node current = node.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;

    }

    public void addAtHead(int value) {
        Node head = new Node(value);
        head.next = node.next;
        node.next = head;
        size++;
    }

    public void addAtTail(int value) {
        Node tail = new Node(value);
        Node current = node.next;
        for (int i = 0; i < size - 1; i++) {
            current = current.next;
        }
        current.next = tail;
        size++;
    }

    public void AddNode(int index, int value) {
        Node newNode = new Node(value);
        if (index == size - 1) {
            addAtHead(value);
        }
        Node previous = node;
        for (int i = 0; i < index; i++) {
            previous = previous.next;
        }
        newNode.next = previous.next;
        previous.next = newNode;
        size++;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Illegal index");
        }
        Node previous = node;
        for (int i = 0; i < index; i++) {
            previous = previous.next;
        }
        previous.next = previous.next.next;
        size--;

    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        Node current = node.next;
        while (current != null) {
            res.append(current + "->");
            current = current.next;
        }
        res.append("NULL");
        return res.toString();
    }

    public int lengthLinkedList(Node head) {
        Node tmp = head;
        if (tmp == null) {
            return 0;
        } else {
            return 1 + lengthLinkedList(tmp.next);
        }

    }

    public int length(Node head) {
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    public  Node middleNode(Node [] ListNodes) {
        Node head = ListNodes[0];
        int t = 0;
        while (head.next != null) {
            ListNodes[t] = head;
            head = head.next;
            t++;
        }
        return ListNodes[t / 2];
    }
    public void reverse (){
        Node pointer = node;
        Node prev = null;
        Node currnt = null;
        while (pointer != null){
            currnt = pointer;
            pointer = pointer.next;
            // reverse
            currnt.next=prev;
            prev=currnt;
            node=currnt;
        }
    }



}































