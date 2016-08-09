public class Main {
  
  public static void main(String[] args) {
    
    //Create linked list
    LinkedList list = new LinkedList();
    
    //Insert nodes into the list
    list.insert("Todd", 45);
    list.insert("Terry", 6);
    list.insert("Jeff", 55);
    list.insert("Mary", 82);
    list.insert("Tim", 12);
    list.insert("Larry", 66);
    list.insert("Richard", 8);
    list.insert("Carry", 15);
    list.insert("Stephanie", 98);
    list.insert("Emily", 37);
    list.insert("Donald", 61);
    list.insert("Robert", 11);
    list.insert("Milton", 105);
    
    System.out.println("-------------------");
    System.out.println("TOP TEN HIGH SCORES");
    System.out.println("-------------------");
    
    //Print out all elements in the list
    list.print();
  
  }
}