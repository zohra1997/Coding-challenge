package ca.jrvs.challenge;
import ca.jrvs.challenge.MyLinkedLists;

public class ReverseLinkedList {

    public static void main(String[] args) {
        MyLinkedLists.Node head = new MyLinkedLists.Node(1);
        MyLinkedLists myLinkedLists = new MyLinkedLists(head);
        myLinkedLists.AddNode(1,2);
        myLinkedLists.AddNode(2,3);
        myLinkedLists.toString();
        myLinkedLists.reverse();
        myLinkedLists.toString();

    }
}