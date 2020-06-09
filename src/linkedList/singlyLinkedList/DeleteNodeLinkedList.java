package linkedList.singlyLinkedList;

public class DeleteNodeLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
	   Node(int a){
		   data = a;
		   next = null;
		}
	}
	
	public void printList(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void deleteHead(){
		head = head.next;
	}
	
	public void deleteByKey(int key){
		if(head.data==key){head=head.next;return;}
		Node prev= null,temp = head;
		while(temp.data!=key){
			prev = temp;
			temp=temp.next;
		}
		prev.next = temp.next;
	}
	
	public void deleteByPosition(int position){
		if(position ==0){System.out.println("Linklist is EMPTY.");return;}
		int tempPosition= 1;
		Node prev=null,tempNode = head;
		while(tempPosition!=position){
			prev =tempNode;
			tempNode=tempNode.next;
			tempPosition++;
		}
		prev.next = tempNode.next;
	}
	
	public void deleteLast(){
		if(head == null){
			System.out.println("Linklist is EMPTY.");
			return;
		}
		if(head.next==null){
			head = null;
			return;
		}
			
		Node temp = head;
		while((temp.next).next!=null){
			temp= temp.next;
		}
		temp.next = null;
	}
	
	public static void main(String[] args) {
		DeleteNodeLinkedList lnklst = new DeleteNodeLinkedList();
		lnklst.head = new Node(13);
		Node second  = new Node(26);
		Node third = new Node(39);
		Node fourth = new Node(52);
		Node fifth = new Node(65);
		Node sixth = new Node(78);
		lnklst.head.next =second;
		second.next= third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		System.out.print("The main Linklist is:\n ");
		lnklst.printList();
		System.out.print("\n");
		System.out.print("After deleting Head from list:\n ");
		lnklst.deleteHead();
		lnklst.printList();
		System.out.print("\nAfter deleting the Node with value 39 from list:\n ");
		lnklst.deleteByKey(39);
		lnklst.printList();
		System.out.print("\nAfter deleting last node from list:\n ");
		lnklst.deleteLast();
		lnklst.printList();
//		System.out.print("\nAfter deleting last node from list:\n ");
//		lnklst.deleteLast();
//		lnklst.printList();
//		System.out.print("\nAfter deleting last node from list:\n ");
//		lnklst.deleteLast();
//		lnklst.printList();
//		lnklst.deleteLast();
		System.out.print("\nAfter deleting node at position 2 from list:\n ");
		lnklst.deleteByPosition(2);
		lnklst.printList();
		
	}

}
