package linkedList.doublyLinkedList;


public class DeleteNodeLinkedList {
	Node head;
	
	public static class Node{
		int data;
		Node prev,next;
		
		Node(int d){
			data =d;
			next=null;
			prev =null;
		}
	}
	
	public void printList(){
		Node temp = head;
		int lengthList=0;
		while(temp!=null){
		System.out.print(temp.data+" ");
		lengthList++;
		temp= temp.next;
		}
		System.out.println("  --> An the length of the doubly LinkedList is "+lengthList);
	}
	
	public void deleteNodeBydata(int data){
		Node temp =head,preNode=null,nexNode=null;
		if(head.data == data){
			nexNode = head.next;
			head=nexNode;
		}
		else{
		while(temp!=null){
			if(temp.next==null && temp.data==data)
			{
				preNode.next = null;
				temp=temp.next;
			}
			else{
			nexNode = temp.next;
			if(temp.data==data){
				preNode.next = nexNode;
				nexNode.prev =preNode;
				temp=temp.next;
			}
			else
				preNode=temp;
				temp=temp.next;
		}
		}
		}
	}
	
	public void deleteNodeByPosition(int position){
		Node temp =head,preNode=null,nexNode=null;
		int posPointer=1;
		if(position ==1){
			nexNode = head.next;
			head=nexNode;
		}
		else{
		while(temp!=null){
			if(temp.next==null && posPointer==position)
			{
				preNode.next = null;
				temp=temp.next;
				posPointer++;
			}
//			else if(temp.next==null && posPointer!=position){
//				System.out.println("Given position is more than the linkedlist length. So can't delete.");
//				break;
//			}
			else{
			nexNode = temp.next;
			if(posPointer==position){
				preNode.next = nexNode;
				nexNode.prev =preNode;
				temp=temp.next;
				posPointer++;
			}
			else
				preNode=temp;
				temp=temp.next;
				posPointer++;
		}
		}
		}
	}
	
	public static void main(String[] args) {

		DeleteNodeLinkedList lnklst = new DeleteNodeLinkedList();
		lnklst.head = new Node(13);
		Node second = new Node(26);
		Node third = new Node(39);
		Node fourth = new Node(52);
		Node fifth = new Node(65);
		Node sixth = new Node(78);
		Node seventh = new Node(91);
		lnklst.head.prev =null;
		lnklst.head.next=second;
		second.prev=lnklst.head;
		second.next = third;
		third.prev = second;
		third.next  =fourth;
		fourth.prev = third;
		fourth.next = fifth;
		fifth.prev = fourth;
		fifth.next = sixth;
		sixth.prev = fifth;
		sixth.next = seventh;
		seventh.prev = sixth;
		seventh.next =null;
		lnklst.printList();
		
//		lnklst.deleteNodeBydata(26);
		lnklst.deleteNodeByPosition(2);
		lnklst.printList();
	}

}
