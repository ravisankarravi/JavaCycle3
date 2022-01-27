import java.util.*;
class stud
{
    int rollno;
    String name;
    float[] marks = new float[5];

    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many students : ");
        int i, ns = sc.nextInt();
        stud s[] = new stud[ns];
        for( i=0; i<ns ; i++)
        {
                s[i]= new stud();
                s[i].read();
        }
        for( i=0; i<ns ; i++)
            s[i].display();
    }
    void read()
    {
        int j;
                Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Roll Number of the Student : ");
        rollno= sc.nextInt();
        System.out.println("Enter the Name of the Student : ");
        name = sc.next();
        System.out.println("Enter the Marks of 5 subjects of the Student : ");
       for(j=0; j<5; j++)
            marks[j] = sc.nextFloat();
    }

    void display()
    {
    int j;

        System.out.println();
        System.out.println("Roll No : "+rollno);
        System.out.println("Name : "+name);
       for(j=0; j<5; j++)
          System.out.println("Marks of Subject" + j+ ":"+marks[j]);
    }
}
/*
Output
Enter how many students : 1
Enter the Roll Number of the Student : 
1
Enter the Name of the Student : 
Abhijith
Enter the Marks of 5 subjects of the Student : 
45
42
47
48
49

Roll No : 1
Name : Abhijith
Marks of Subject0:45.0
Marks of Subject1:42.0
Marks of Subject2:47.0
Marks of Subject3:48.0
Marks of Subject4:49.0
*/
