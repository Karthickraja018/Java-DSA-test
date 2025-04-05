class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Cycles {
    public static boolean hasCycle(Node head){
        if(head==null||head.next==null){
            return false;
        }
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Node head = new Node(5);
        head.next = new Node(7);
        head.next.next = new Node(3);
        head.next.next.next = head.next;

        boolean result = hasCycle(head);
        if(result){
            System.out.println("Cycle detected");
        }else{
            System.out.println("No Cycle detected");
        }
    }
}
