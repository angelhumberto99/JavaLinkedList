import LinkedList.LinkedList;

public class Program {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("First");
    list.add("Second");
    list.add("Third");
    System.out.println("Add");
    iterList(list);

    list.removeAt(1);
    System.out.println("\nRemove");
    iterList(list);

    list.insert(1, "Value inserted");
    System.out.println("\nInsert");
    iterList(list);
  }
  
  public static void iterList(LinkedList list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.getValueAt(i));
    }
  }
}