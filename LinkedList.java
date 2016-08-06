public class LinkedList {
  
  private Node head;
  private Node tail;
  
  public void insert(String name, int score) {
     
    Node newNode = new Node(name, score);
    
    //If head is empty, the new node is the head
    if(isEmpty()) {
      head = newNode;
      head.setNext(tail);
    }else{
      Node temp = head;
      Node pre = null;
      //Until temps score is greater than the newNodes score, execute while loop
      while(temp != null && temp.getScore() > newNode.getScore()){
                 pre = temp;
                 temp = temp.getNext();
            }
              //If newNode does not fullfill the requirements of the above while loop 
              //and is greater than temp, set as the head
               if(pre == null){
                head = newNode;
                newNode.setNext(temp);
            }
               // If pre does not equal null, that means we need to place
               // the newNode in its rightful place in the list
               else{
                pre.setNext(newNode);
                newNode.setNext(temp);
            } 
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