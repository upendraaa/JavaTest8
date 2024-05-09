package testc;

public class Node {

    int value;

    Node nextNode;

    public Node(int value){
        this.value = value;
        nextNode = null;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void printNode(Node node){
        while (node!=null){
            System.out.println(node.value);
            node = node.nextNode;
        }
    }






}
