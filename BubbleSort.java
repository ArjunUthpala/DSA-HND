public  class Sort1
{
public  void  bubbleSort(int  T[]) 
{
int   temp, p, c , noOfChecks ;
p =1;
noOfChecks = T.length-2;
while ( p <= T.length-1 )
{
c = 0;
while (c <= noOfChecks )
{
	if (T[c] > T[c + 1])
	{
		temp = T[c];
		T[c] = T[c+1];
		T[c+1] = temp;
	}
	c ++ ;
} //end for C
p++ ;
noOfChecks -- ;
} //end for P
} //end bubble sort

public void  display(int   T[])
{
int   x = 0 ;
System.out.println("SORTED  DATA  BUBBLE SORT");
while  (x<T.length)
{
     System.out.println(T[x]);
     x++;
}//end while
}//end display

public  static  void  main(String  arg[]) 
{
   int  T[]  = {40, 25, 15 , 19, 65, 78, 10 } ;
    Sort1  s1 = new Sort1();
    s1.bubbleSort(T);
    s1.display(T);
}//end main 
} //end class
