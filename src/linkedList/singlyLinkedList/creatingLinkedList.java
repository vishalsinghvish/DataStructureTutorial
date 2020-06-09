package linkedList.singlyLinkedList;

public class creatingLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
			}
	}
	
	public void printList(){
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n= n.next;
		}
	}
	
	/*Time complexity of push() is O(1) as it does constant amount of work. */
	public void push(int newdata){
		Node newNode = new Node(newdata);
		newNode.next = head;
		head=newNode;
	}
	
	/* Time complexity of insertAfter() is O(1) as it does constant amount of work. */
	public void insertAfter(Node prevNode, int dataAfter){
		if(prevNode==null){
			System.out.println("Previous Node can't be null.");
		return;
		}
		Node insertAfter = new Node(dataAfter);
		insertAfter.next = prevNode.next;
		prevNode.next=insertAfter;
	}
	
	/* Time complexity of append is O(n) where n is the number of nodes in linked list. Since there is a loop from head to end, the function does O(n) work.
This method can also be optimized to work in O(1) by keeping an extra pointer to tail of linked list */
	public void insertlast(int insertlastData){
		Node lastNode = new Node(insertlastData);
		if(head==null){
			head = lastNode; 
			lastNode.next=null;
			return;
		}
		Node last= head;
		while(last.next!=null){
			last = last.next;
		}
		last.next = lastNode;
		lastNode.next=null;
	}
	public static void main(String[] args) {
		creatingLinkedList lnklist = new creatingLinkedList();
		lnklist.head = new Node(12);
		Node second = new Node(22);
		Node third = new Node(43);
		lnklist.head.next = second;
		second.next = third;
		lnklist.printList();
		lnklist.push(5);
		System.out.println();
		lnklist.printList();
		lnklist.insertAfter(second, 23);
		System.out.println();
		lnklist.printList();
		System.out.println();
		lnklist.insertlast(100);
		lnklist.printList();
	}

}
