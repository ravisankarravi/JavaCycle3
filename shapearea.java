import java.util.*;
class shapearea
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of Rectangle : ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the radius of circle : ");
		int r = sc.nextInt();
		System.out.println("Enter the 3 sides of Triangle : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		shapearea ab = new shapearea();
		ab.Area(r);
		ab.Area(l,b);
		ab.Area(x,y,z);
	}
	void Area(int r)
	{
		System.out.println("Area of the circle = "+ (3.14*r*r));
	}
	void Area(int l, int b)
	{
		System.out.println("Area of the Rectangle = "+ (l*b));
	}
	void Area(int x, int y, int z)
	{
		float s = (x+y+z)/2;
		float a = (float)Math.sqrt(s*(s-x)*(s-y)*(s-z));
		System.out.println("Area of the Triangle = "+ a);
	}
	
	
	
}
/*
Output
Enter the length and breadth of Rectangle : 
1
2
Enter the radius of circle : 
1
Enter the 3 sides of Triangle : 
3
4
5
Area of the circle = 3.14
Area of the Rectangle = 2
Area of the Triangle = 6.0
*/
