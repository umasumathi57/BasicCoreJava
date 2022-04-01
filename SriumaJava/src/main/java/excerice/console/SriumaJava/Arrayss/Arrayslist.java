package excerice.console.SriumaJava.Arrayss;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayslist {
	
	public static void main(String[] args) {
	/*
	Integer arr[]= {1,2};
	System.out.println(arr);
	System.out.println(arr.length);
	System.out.println(Arrays.toString(arr));
	*/
		
		Integer arr[]=new Integer[10];
		//Integer sam[]={13,76,99,88};i
		Scanner scan=new Scanner(System.in);
		/* Integer i;
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Enter the no's");
			arr[i]=scan.nextInt();
		}
		*/
		System.out.println(Arrays.toString(arr));
		fn obj=new fn();
		obj.list(arr);
		list1 ob=new list1();
		ob.forlop(arr);
		
	}
}

 class fn
{
	public void list(Integer[] elements)
	{
		for(Integer temp:elements)
		{
			System.out.print(temp);
		}
	}
	}
 class list1
 {
	 public void forlop(Integer[] arr)
	 {
		for(Integer index=0;index<arr.length;index++)
		{
			System.out.print("forloop");

			System.out.print(arr[index]);
		}
	 }
	 
	 public void copyy(Integer[] sam)
	 {
		 
	 }
 }

