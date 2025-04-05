class TreeNode{
    int val;
    TreeNode next;
    TreeNode(int val){
        this.val = val;
        this.next = null;
    }

}
public class Circular{
    public static void add(TreeNode head,int data){
        if (head == null) {
            head = new TreeNode(data);
        } else {
            TreeNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new TreeNode(data);
        }
    }
    public static TreeNode remove(TreeNode head,int data){
        if (head == null) {
            return null;
        }

        if (head.val == data) {
            return head.next; 
        }

        TreeNode current = head;
        while (current.next != null && current.next.val != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; 
        }

        return head;
    }
    public static boolean contains(TreeNode head,int data){
        TreeNode current = head;
        while (current != null) {
            if (current.val == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        add(head, 2);
        add(head, 3);
        add(head, 4);
        System.out.println("Original list:");
        TreeNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
        head = remove(head, 3);
        System.out.println("After removing 3:");
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println("Contains 2? " + contains(head, 2));
        System.out.println("Contains 3? " + contains(head, 3));
    }
}