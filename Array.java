import java.util.*;


class Array{
    public static int[][] arr = new int[10][10];
    public static void Set(int row,int col,int data){
        arr[row][col]=data;
    }
    public static void get(int row,int col){
        System.out.println(arr[row][col]); 
    }
    // public static void print(){
    //     System.out.println()
    // }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int data = scan.nextInt();
        // int data=5,row=1,col=1;
        Set(row,col,data);

        get(row,col);
        scan.close();
    }
}
