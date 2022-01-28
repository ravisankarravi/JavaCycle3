import java.util.*;
class Perimeter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of Rectangle in cm: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the radius of circle in cm : ");
		int r = sc.nextInt();
		Perimeter ab = new Perimeter(l,b);
		ab = new Perimeter(r);
	}
	Perimeter(int r)
	{
		System.out.println("Perimeter of the circle = "+ (float)(2*3.14*r)+" cm");
	}
	Perimeter(int l, int b)
	{
		System.out.println("Perimeter of the Rectangle = "+ (2*(l+b))+" cm");
	}

	
	
	
}
/*
Output
Enter the length and breadth of Rectangle in cm: 
1
2
Enter the radius of circle in cm : 
1
Perimeter of the Rectangle = 6 cm
Perimeter of the circle = 6.28 cm
*/
