public class LinkedList {
  
  private Node head;
  private Node tail;
  
  
  /**
   * Method that checks the size of the list
   */
  public int size() {
    int counter = 0;
    Node temp = head;
    while(temp!=null) {
      counter++;
      temp = temp.getNext();
    }
    return counter;
 } 
  
  /**
   * Method that checks if the head is Empty
   */
  public boolean isEmpty() {
    return head == null;
  }
  
  /**
   * Method that prints out each node in the list
   */
 public void print() {
    Node temp = head;
    while(temp!= null)
    {
      System.out.println(temp.getName());
      temp = temp.getNext();
    }
  }
  
}