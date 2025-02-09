/*package linkedlist;
import java.util.*;

//structure creation
class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
	
	Node(int data,Node next)
	{
		this.data=data;
		this.next=next;
	}
}
 

public class insertnode {
	
  //print linkedlist
public static void printll(Node newnode)
{
	while(newnode!=null) {
		System.out.print(newnode.data+"->");
		newnode=newnode.next;
	}
    System.out.println("NULL");

}
		
	//Insert Head
	public static Node inserthead(int val,Node head)
	{
		Node temp=new Node(val,head);
	//	temp.next=temp;
		return temp;
	}
	
	//InsertEnd
	public static Node insertend(int val,Node head) {
		//Node lastnode=new Node(val);
		Node temp=head;
	while(temp.next!=null)
	{
		temp=temp.next;
 	}
	Node lastnode=new Node(val);
    temp.next=lastnode;
    return head;
	}
	
	//Delete Node at END
	public static Node deleteEnd(Node head) {
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	
	//insert at given Position
	public static Node insertAtGivenPosition(int pos,int val,Node head)
	{
		Node temp=head;
		if(pos==1)
		{
		return	inserthead(val, head);
		}
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.next;
		}
	    Node insertednode=new Node(val,temp.next);
	    temp.next=insertednode;
	    return head;
		
	}
	
	//delete at given position
	public static Node deleteAtGivenPosition(int pos,Node head) {
		Node temp=head;
		for(int i=1;i<pos-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;
	}
	
	
	//counting how many nodes are available
	public static int countNodes(Node head)
	{
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	//Reverse a LinkedList
	public static Node ReverseLinkedList(Node head) {
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
		    current.next=prev;
		    prev=current;
		    current=next;
		}
	return prev;	
	}
	
	//find middle
	public static Node FindMiddleNode(Node head)
	{
		Node slow=head;
		Node Fast=head;
		while(Fast!=null&&Fast.next!=null)
		{
			slow =slow.next;
			Fast=Fast.next.next;
		}
		return slow;
	}
	
	//Checking if Linkedlist is a palindrome or not
	public static boolean CheckPalindrome(Node head)
	{
	
		Node midNode=FindMiddleNode(head);
		
		Node prev=null;
		Node curr=midNode;
		Node next;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
		    prev=curr;
		    curr=next;
		}
		Node right=prev;
		Node left=head;
		while(right!=null)
		{
			if(left.data!=right.data) {
				return false;
			}
			else {
				left=left.next;
				right=right.next;
			}
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(2);
head.next.next.next=new Node(5);
//head.next.next.next.next=new Node(5);
//head.next.next.next.next.next=new Node(6);



Scanner sc=new Scanner(System.in);
//int pos=sc.nextInt();
//int val=sc.nextInt();
//Node newnode=inserthead(val,head);
//Node lastone=insertend(val,head);
//Node deleted=deleteEnd(head);
//Node updatedlist=insertAtGivenPosition(pos, val, head);
//Node updatedoneadafterdeletion=deleteAtGivenPosition(pos, head);
//int cnt=countNodes(head);
//System.out.println(cnt);
//System.out.printlns(lastone);
//System.out.println(newnode.data);
//System.out.println(lastone.data);
//printll(updatedoneadafterdeletion);
System.out.println("Original Linked List");
printll(head);

Node reversed=ReverseLinkedList(head);
System.out.println("Reversed Linked List");
printll(reversed);
boolean val=CheckPalindrome(head);
System.out.println(val);

	}
}*/





package linkedlist;
import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
    
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class insertnode {
    
    public static void printll(Node newnode) {
        while (newnode != null) {
            System.out.print(newnode.data + "->");
            newnode = newnode.next;
        }
        System.out.println("NULL");
    }

    public static Node inserthead(int val, Node head) {
        return new Node(val, head);
    }

    public static Node insertend(int val, Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }

    public static Node deleteEnd(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node insertAtGivenPosition(int pos, int val, Node head) {
        Node temp = head;
        if (pos == 1) {
            return inserthead(val, head);
        }
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        Node insertednode = new Node(val, temp.next);
        temp.next = insertednode;
        return head;
    }

    public static Node deleteAtGivenPosition(int pos, Node head) {
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static int countNodes(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node ReverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static Node FindMiddleNode(Node head) {
        Node slow = head;
        Node Fast = head;
        while (Fast != null && Fast.next != null) {
            slow = slow.next;
            Fast = Fast.next.next;
        }
        return slow;
    }

    public static boolean CheckPalindrome(Node head) {
        Node midNode = FindMiddleNode(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);

        System.out.println("Choose an operation:");
        System.out.println("1. Insert at Head");
        System.out.println("2. Insert at End");
        System.out.println("3. Delete from End");
        System.out.println("4. Insert at Given Position");
        System.out.println("5. Delete at Given Position");
        System.out.println("6. Count Nodes");
        System.out.println("7. Reverse Linked List");
        System.out.println("8. Find Middle Node");
        System.out.println("9. Check if Palindrome");
        System.out.println("10. Print Linked List");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Enter value to insert at head:");
                int val1 = sc.nextInt();
                head = inserthead(val1, head);
                printll(head);
                break;
            case 2:
                System.out.println("Enter value to insert at end:");
                int val2 = sc.nextInt();
                head = insertend(val2, head);
                printll(head);
                break;
            case 3:
                head = deleteEnd(head);
                printll(head);
                break;
            case 4:
                System.out.println("Enter position and value to insert:");
                int pos1 = sc.nextInt();
                int val3 = sc.nextInt();
                head = insertAtGivenPosition(pos1, val3, head);
                printll(head);
                break;
            case 5:
                System.out.println("Enter position to delete:");
                int pos2 = sc.nextInt();
                head = deleteAtGivenPosition(pos2, head);
                printll(head);
                break;
            case 6:
                System.out.println("Number of nodes: " + countNodes(head));
                break;
            case 7:
                head = ReverseLinkedList(head);
                printll(head);
                break;
            case 8:
                Node mid = FindMiddleNode(head);
                System.out.println("Middle Node: " + mid.data);
                break;
            case 9:
                System.out.println("Is Palindrome: " + CheckPalindrome(head));
                break;
            case 10:
                printll(head);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}

