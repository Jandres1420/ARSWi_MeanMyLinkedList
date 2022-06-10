package MyLinkedList;

public class MyLinkedList<T> {
    Node head;
    public void insert(T data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
             head = node;
        }else{
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node= node.next;
        }
        System.out.println(node.data);
    }

    public void delete(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node= node.next;
        }
        node.data= null;
    }

}
