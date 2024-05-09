package testc;

public class Dummy {

    /**
     * Given a pointer to the head node of a linked list, the task is to reverse the linked list. We need to reverse the list by changing the links between nodes
     * from Geet Upadhyay (Amex) to Everyone21:23
     * Input: Head of following linked list 1->2->3->4->NULL
     * Output: Linked list should be changed to, 4->3->2->1->NULL
     *
     * 1<-2<-
     * @param args
     */


    public static Node addItem(Node head,int value){

        if(head == null) {
            head = new Node(value);
            return head;
        }
        Node lastNode = head;

        while(lastNode.nextNode != null){

            lastNode = lastNode.nextNode;
        }

        lastNode.setNextNode(new Node(value));
        return head;

    }


    public static void main(String[] args) {


        System.out.println("From dummy class");
        Node head = null;
        head = addItem(head,0);
        head = addItem(head,1);
        head = addItem(head,2);
        head = addItem(head,3);
        head = addItem(head,4);
        head = addItem(head,5);


        head.printNode(head);



       Dummy dummy = new Dummy();
       head = dummy.reversLinkedList(head);

       head.printNode(head);





    }

    public  Node reversLinkedList(Node head){

        Node previousNode = null;
        Node nextNode = null;
        Node current = head;

        while (current != null){

            nextNode = current.nextNode;
            current.nextNode = previousNode;
            previousNode = current;
            current = nextNode;
        }

        return previousNode;

    }
}
