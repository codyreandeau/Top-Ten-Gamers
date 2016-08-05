public class LinkedList {
  
  private Node head;
  private Node tail;
  
  public void insert(String name, int score) {
     
    Node newNode = new Node(name, score);
    
    //If head is empty, the new node is the head
    if(isEmpty()) {
      head = newNode;
      head.setNext(tail);
    //if the heads score is less than the new node, than add to the front of the list
    } else if(head.getScore() <= newNode.getScore()) {
      newNode.setNext(head);
      head = newNode;
    }
  }

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
      System.out.println(temp.getName() + "-" + temp.getScore());
      temp = temp.getNext();
    }
  }
  
}