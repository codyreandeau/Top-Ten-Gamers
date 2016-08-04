public class Node {
  
  private String name;
  private int score;
  private Node next;
  
  public Node(String name, int score, Node next) {
    this.name = name;
    this.score = score;
    this.next = next;
  }
  
  public Node(String name, int score) {
    this(name, score, null);
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getScore() {
    return score;
  }
  
  public void setScore(int score) {
    this.score = score;
  }
  
  public Node getNext() {
    return next;
  }
  
  public void setNext(Node next) {
    this.next = next;
  }
}