package LinkedList;

public class LinkedList {
  private Node front;
  private int size;

  public LinkedList() {
    this.front = null;
    this.size = 0;
  }

  public int size() {
    return this.size;
  }

  public void add(Object value) {
    Node node = new Node(value);
    if (this.front == null) {
      this.front = node;
    } else {
      Node currentNode = this.front;
      while (currentNode.getNextLink() != null) {
        currentNode = currentNode.getNextLink();
      }
      currentNode.setNextLink(node);
    }
    this.size++;
  }

  private Node findNodeAt(int index) {
    if (index + 1 > this.size)
      throw new Error(String.format("Index [%d] out of range", index));

    int current = 0;
    Node currentNode = this.front;
    while (currentNode.getNextLink() != null) {
      if (current == index) break;
      currentNode = currentNode.getNextLink();
      current ++;
    }
    return currentNode;
  }

  public Object getValueAt(int index) {
    return this.findNodeAt(index).getValue();
  }

  public void removeFront() {
    Node next = this.front.getNextLink();
    this.front = next;
    this.size--;
  }

  public void removeAt(int index) {
    if (index == 0) {
      this.removeFront();
      return;
    }
    Node currentNode = this.findNodeAt(index - 1);
    Node remove = currentNode.getNextLink();
    currentNode.setNextLink(remove.getNextLink());
    this.size--;
  }

  public void insertFront(Object value) {
    if (this.size == 0) {
      this.add(value);
      return;
    }
    Node node = new Node(this.front.getValue());
    node.setNextLink(this.front.getNextLink());
    this.front.setValue(value);
    this.front.setNextLink(node);
    this.size++;
  }

  public void insert(int index, Object value) {
    if (index == 0) {
      this.insertFront(value);
      return;
    }
    if (index == this.size) {
      this.add(value);
      return;
    }

    Node node = new Node(value);
    Node prevNode = this.findNodeAt(index - 1);
    Node nextNode = prevNode.getNextLink();
    prevNode.setNextLink(node);
    node.setNextLink(nextNode);
    this.size++;
  }
}
