public class Main {
  
  public static void main(String[] args) {
    
    //Create linked list
    LinkedList list = new LinkedList();
    
    //Insert nodes into the list
    list.insert("Todd", 45);
    list.insert("Jeff", 55);
    list.insert("Mary", 82);
    list.insert("Tim", 12);
    list.insert("Larry", 66);
    list.insert("Richard", 8);
    list.insert("Carry", 15);
    list.insert("Stephanie", 98);
    list.insert("Emily", 37);
    
    System.out.println("-------------------");
    System.out.println("TOP TEN HIGH SCORES");
    System.out.println("-------------------");
    
    //Print out all elements in the list
    list.print();
  
  }
}