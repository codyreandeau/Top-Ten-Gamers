public class LinkedList {
  
  private Node head;
  private Node tail;
  
  public int size() {
    int counter = 0;
    Node temp = head;
    while(temp!=null) {
      counter++;
      temp = temp.getNext();
    }
    return counter;
 } 
  
  public boolean isEmpty() {
    return head == null;
  }
  
  
}