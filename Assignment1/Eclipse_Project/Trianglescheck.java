import java.util.*;
public class Trianglescheck 
{
	 public static void main(String[] args)
	    {
		 System.out.println("Please enter lengths of 3 sides of triangles");
		 Scanner length = new Scanner(System.in);
	        int l1 = length.nextInt();
	        int l2 = length.nextInt();
	        int l3 = length.nextInt();
	        System.out.println (classifyTriangle(l1,l2,l3));
	       //Added extra function to check whether entered lengths can form right angle triangle or not along with scalene
	        if (l1!=0 && l2 !=0&& l3 !=0)
	        {
	        	System.out.println (checkrightangle(l1,l2,l3));
	        }
	    }
	 public static String classifyTriangle(int a,int b, int c)
	 {
		 if(a<=0||b<=0||c<=0)
		 {
			 String result = "Length of any side of the triangle cannot be zero";
			 return result;	
		 }
		 else if(a==b && b==c)
		 {
			 String result = "Equilateral";
			 return result;
		 }
		 else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
		 {
			 String result = "Isosceles";
			 return result;
		 }
		 else if(a!=b && b!=c && c!=a)
		 {
			 String result = "Scalene";
			 return result;
		 }
			 return null;
	 }
	 public static String checkrightangle (int a,int b, int c)
	 { 
		 if ( (( Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))|| (( Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2)) ||
            (( Math.pow(c, 2) + Math.pow(b, 2)) == Math.pow(a, 2)))
		 {
			 String result = "This is also a Right angle triangle";
			 return result;
		 }
		 return "But this is not a right angle triangle";
	 } 
}