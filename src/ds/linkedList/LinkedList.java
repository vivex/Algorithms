package ds.linkedList;

public class LinkedList {
  Node head;

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.push(1);
    linkedList.push(2);
    linkedList.printList();
  }

  public void swapNodes(int x, int y) {
    // Nothing to do if x and y are same
    if (x === y) return ;

    // search for x and keep track of just previous node of x
    Node prevX = null, currX = head;
    while(currX != null && curX.data !=x) {
      prevX = currX;
      currX = currX.next;
    }

    // same for y
    Node prevY = null, currY = head;

    while(currY != null && currY.data != y) {
      prevY = currY;
      currY = currY.next;
    }
    

    if (currY == null || currX == null)
      return;
    
    // if x is not head of linked list
    if (prevX != null)
        prevX.next = currY;
    else
      head = currY;

    //if y is not head of linked list
    if (prevY != null)
      prevY.next = currX;
    else 
      head = currX;
    
    // swap next pointers
    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
  }

  public void push (int newData) {
    Node newNode = new Node(newData);
    newNode.next = head;
    head = newNode;
  }

  public void printList() {
    Node tNode = head;
    while (tNode != null) {
    System.out.println("data is: " + tNode.data);
    tNode = tNode.next;
    }
  }
}
