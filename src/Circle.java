import java.util.LinkedList;
import java.util.List;

public class Circle {
    private int size;
    private int count;
    private Node head;

    public Circle(int size, int count, Node firstnode){
        this.count = count;
        this.size = size;
        this.head = firstnode;
    }

    public int lastStandingPosition(){
        Node current = head;
        for(int i = 0; i <= size-1; i++)
        {
            if(i==0){
                for(int j = 0; j<=count-2; j++){
                    current = current.next;
                    System.out.println("Current is " + current);
                }
            }
            else{
                for(int j = 0; j<=count-1; j++){
                    current = current.next;
                    System.out.println("Current is " + current);
                }
            }
            System.out.println(current.next + " has been removed");
            current.next = current.next.next;
        }
        return current.data;
    }


}
