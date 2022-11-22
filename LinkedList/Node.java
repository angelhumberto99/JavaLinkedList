package LinkedList;

public class Node {
  private Object value;
  private Node nextLink;

  Node(Object value) {
    this.value = value;
    this.nextLink = null;
  }

  // Setters
  public void setValue(Object value) {
    this.value = value;
  }

  public void setNextLink(Node nextLink) {
    this.nextLink = nextLink;
  }

  // Getters
  public Object getValue() {
    return this.value;
  }

  public Node getNextLink() {
    return this.nextLink;
  }
}