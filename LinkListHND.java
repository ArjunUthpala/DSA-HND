import java.util.Scanner;

public  class  LinkListHND 
{
Node head;
Node tail;

public void add( int   cid, int  refno)
 {
	Node p = new Node(cid,refno);
	if (tail == null) //empty list
	{
		head = p; 
		tail = p; 
	} 
	else // non empty list with data
	{
		tail.next = p;
		tail = p;
	}
} //end add

public void printList()
{
Node p = head;
System.out.println("LIST OF RESERVATIONS");
System.out.println("CUST ID      REF NO");
while (p!= null) 
{
	System.out.println(p.customerid+"          "+p.referenceno);
	p = p.next;
}
} //end print list


public void remove(int    refno) 
{
Node  q = null;
Node  p = head;
boolean  found= false;
while (p!= null && found==false) 
{
if (refno==p.referenceno)	
  {
	found=true;
	System.out.println("Match found for ref. no "+p.referenceno);
                 System.out.println("Customer id  "+p.customerid);
	System.out.print("Accept [Y/N] : ");
	Scanner obj = new Scanner(System.in);
                	String    answer = obj.nextLine();
	if (answer.equals("Y")||answer.equals("y") )
                {                  
                  if (q==null) // first node
	 { 
               		head = p.next;   //delete first node
                		System.out.println("Reservation Deleted");
	}
	else               //some other node
	{ 
                		q.next = p.next;  //delete node
		System.out.println("Reservation Deleted");
	}
  	}

 }       
else //ref no not matching current node so go to NEXT NODE
  {
	q = p;
	p = p.next;
   }
} //end while
if (found==false)
      System.out.println("Reference number not found");
} //end remove

public static void main(String arg[]) 
{
LinkListHND   bookings = new LinkListHND();
int choice=0;
while (choice!=4)
  {
System.out.println("                                                                       ");
System.out.println("BANQUET HALL RESERVATIONS");
System.out.println("1. Add to reservations list");
System.out.println("2. View reservations");
System.out.println("3. Remove reservations");
System.out.println("4. Exit");  
System.out.print("Enter Choice [1/2/3/4]:");
Scanner obj = new Scanner(System.in);
choice = obj.nextInt();
if (choice==1)
{
	System.out.println("ADD  RESERVATIONS");
	System.out.print("Enter Customer ID :");
	int cid = obj.nextInt();
	System.out.print("Enter Ref No  :");
	int rid = obj.nextInt();
	bookings.add (cid, rid);
	System.out.println("Reservation added successfully");
 }
else
if (choice ==2)
	bookings.printList();
else
if (choice==3)
  	{
		System.out.println("REMOVE RESERVATION");
		System.out.print("Enter Reference No  :");
		int refno = obj.nextInt();
		bookings.remove (refno);
     	}
       }//end choice loop
  } //end main
}//end class
