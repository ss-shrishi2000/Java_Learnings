
import java.util.*;

public class demo {
	
	public static void calc()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int diff = a- b;
		int mul = a * b;
		float div = a/b;
		System.out.println("The addition is "+ sum + ", The difference is " + diff + ", The product is " + mul);
	}
	
	public static void Conditions(int age)
	{
		if(age > 18)
			System.out.println("Adult");
		else if(age > 14 && age < 18)
			System.out.println("Midway between both");
		else
			System.out.println("Child");
	}
	
	public static void Looping()
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 0; j < i; j++)
				System.out.print(" * ");
			System.out.print("\n");
		}
		
		int i = 0;
		while(i < 11)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public static void PatternPrinting()
	{
		/*
		 *   pattern 01 => *****
		 *   *****
		 *   *****
		 *   *****
		 *   *****
		 */
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)System.out.print("*");
			System.out.print("\n");
		}
		
		/*
		 * Pattern 02 => 
		 *    *
		 *   * *
		 *  * * *
		 */
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 0; j < 5-i; j++)
				System.out.print(" ");
			for(int j = 0; j < i; j++)
				System.out.print("* ");
			
			System.out.print("\n");
		}
		
		/*
		 *   pattern 03 =>
		 *   *****
		 *   *   *
		 *   *   *
		 *   *   *
		 *   *****
		 */
		 
		for(int i = 1; i <= 5; i++)
		{
			if(i==1 || i==5)
			{
				for(int j = 0; j < 5; j++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
			else
			{
				System.out.print("*   *\n");
			}
		}
	}
	
	// In Java by default; if no values are assigned then 
	// all the memory locations store :-
	// integer => 0
	// float => 0.0
	// double => 0.0
	// String => " "
	// unlike C++ that stores a garbage value if not mentioned otherwise
	
	public static void Arrays() {
		// type[] arrayName = new int[size];
		int[] marks = new int[3];
		for(int i = 0; i < 3; i++)
		{
			marks[i] = i + 50;
		}
		for(int i = 0; i < 3; i++)
			System.out.println(marks[i]);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] m = new int[n];
		for(int i = 0; i < n; i++)
		{
			int x = sc.nextInt();
			m[i] = x;
		}
		
		for(int i = 0; i < n; i++)
			System.out.println(m[i]);
	}
	
	public static void BinarySearch(int x, int[] arr, int sz)
	{
		int low = 0, high = sz-1;
		while(low < high)
		{
			int mid = (low + high)/2;
			if(arr[mid] == x)
			{
				System.out.println("The index at which the element is present is : "+mid);
				return;
			}
			else if(arr[mid] > x)
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;    
			}
		}
	}
	
	public static void two_D_arrays() {
		// type[][] arrayName = new type[rows][columns];
		// int[][] arr = new int[3][5];
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				int x = sc.nextInt();
				arr[i][j] = x;
			}
		}
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
				System.out.print(arr[i][j] + " ");
			
			System.out.print("\n");
		}
	}
	
	public static void Strings() {
		String name = "Shri";
		String fullname = "Shri Singh";
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
		// String manipulations in Java
		String finalname = name + " " + fullname;
		System.out.print(finalname);
		// for the size of the string => finalname.length();
		// to access any specific character at a given position in Java => charAt(index);
		for(int i = 0; i < input.length(); i++)
		{
			System.out.println(input.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello There");
		String a = "Shrishti";
		System.out.print(a);
		Scanner sc = new Scanner(System.in);
		String newname = sc.next();
		// next() will take the input only till the first whitespace 
		// and will terminate later
		
		// nextInt() and nextFloat for taking input of the various types
		System.out.println(newname);
		calc();
		Conditions(19);
		Conditions(17);
		Conditions(12);
		Looping();
		PatternPrinting();
		Arrays();
		int[] arr = new int[4];
		int sz = 4;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++)
		{
			int x = sc.nextInt();
			arr[i] = x;
		}
		BinarySearch(4, arr, sz);
		//two_D_arrays();
		Strings();
	}
}
