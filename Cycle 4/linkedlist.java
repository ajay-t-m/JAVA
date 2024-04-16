import java.util.*;
public class linkedlist {
public static void main(String[] args){
System.out.println("Name: Ajay T M\nRollno: 23mca007\nTitle: Linked List (Remove elements)\nDate: 09-04-2024\n");
System.out.println();
LinkedList<String> L=new LinkedList<>();
L.add("Gold");
L.add("Silver");
L.add("Bronze");
L.add(0,"Olympics Medals");
System.out.println(L);
L.remove("Bronze");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);

}
}
