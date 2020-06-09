package linkedList.singlyLinkedList;

public class AddingNumberInList {

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
		int lengthList = 0;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
			lengthList++;
		} 
		System.out.println(" ->  And the length of the linkedlist is:"+lengthList);
	}
	
	public void reverseList(){
		Node prevNode= null,temp = head,nextNode=null;
		while(temp!=null){
			nextNode = temp.next;
			temp.next = prevNode;
			prevNode = temp;
			temp = nextNode;
		}
		head=prevNode;
	}
	
	public void reverseTwice(){
		reverseList();
		reverseList();
	}
		
		public void add1(){
			reverseList();
			Node temp = head;
			temp.data++;
			while(temp!=null){
				if(temp.data==10){
					temp.data = 0;
					if(temp.next!=null)
					temp.next.data++;
					else{
						Node carry = new Node(1);
						temp.next = carry;
					}
					temp = temp.next;
					System.out.println("if statement executed");
					System.out.println(temp.data);
					}

				else{
					System.out.println("else statement executed");
					System.out.println(temp.data);
					break;                // if here you put return, it will not run the next reverseList() method.
				}
			}
			reverseList();
			}
	
		public void add1(int addNumber){
			reverseList();
			int quo,carry;
			Node temp = head;
			temp.data+=addNumber;
			while(temp!=null){
				if(temp.data>=9){
					quo = temp.data%10;
					carry = temp.data/10;
					temp.data = quo;
					if(temp.next!=null)
					temp.next.data+=carry;
					else{
						Node carryNode = new Node(1);
						temp.next = carryNode;
					}
					temp = temp.next;
					System.out.println("if statement executed");
					System.out.println(temp.data);
					}

				else{
					System.out.println("else statement executed");
					System.out.println(temp.data);
					break;                // if here you put return, it will not run the next reverseList() method.
				}
			}
			reverseList();
			}
	
	
	public static void main(String[] args) {
		AddingNumberInList lnklst = new AddingNumberInList(); 
		lnklst.head = new Node(9);
		Node second  = new Node(9);
		Node third = new Node(9);
		Node fourth = new Node(9);
		lnklst.head.next =second;
		second.next= third;
		third.next=fourth;
		System.out.print("The main Linklist is:\n ");
		lnklst.printList();
//		lnklst.reverseList();
		lnklst.add1(509);
//		lnklst.printList();
//		lnklst.reverseList();
//		lnklst.reverseTwice();
		lnklst.printList();
	}

}
