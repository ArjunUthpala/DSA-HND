
public  class Sort2 
{
void SelectionSort(int T[])
{
    int   x, minindex, index, temp;
    index=0;
    while (index <= T.length-2)
    {		
        //Find the minimum element in unsorted array
        minindex = index;
        x = index + 1;
        while (x<T.length)
         {
            if (T[x] < T[minindex])
                	minindex = x;
            x=x+1 ;
        } //end while x
       //Swap the found minimum element with the first element
        temp = T[minindex];
        T[minindex] = T[index];
        T[index] = temp;
        index=index+1;
   } // end while index           
}//end selection sort

public void  display(int   T[])
{
int   x = 0 ;
System.out.println("SORTED  DATA - SELECTION SORT");
while  (x<T.length)
{
     System.out.println(T[x]);
     x++;
}//end while
}//end display

public  static  void  main(String  arg[])
{
    int  T[]  = {50, 45, 10 , 11, 9 , 7} ;
    Sort2  s1 = new Sort2();
    s1.SelectionSort(T);
    s1.display(T);
}//end main 
} //end class






