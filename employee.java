import java.util.*;
class employe
{
int empno;
long phno;
String name;
}
class employee
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of employee : ");
    int n = sc.nextInt();
    employe e[] = new employe[n];
    for(int i=0; i<n ; i++)
    {
    e[i] = new employe();
        System.out.print("Enter the employee number of Employee " + (i+1)+":");
        e[i].empno = sc.nextInt();
        System.out.print("Enter the name of employee ");
        e[i].name = sc.next();
        System.out.print("Enter the Phone Number of employee ");
        e[i].phno = sc.nextLong();
    }
    for(int j=0;j<n;j++)
    {
    System.out.println();
    System.out.println("Employee ID : " + e[j].empno);
    System.out.println("Employee name : "+e[j].name);
    System.out.println("Employee Phone Number : " + e[j].phno);
    }
}
}
/*
Output
Enter the number of employee : 5
Enter the employee number of Employee 1:1
Enter the name of employee Abhijith
Enter the Phone Number of employee 9495969696
Enter the employee number of Employee 2:2
Enter the name of employee Adarsh
Enter the Phone Number of employee 9696499696
Enter the employee number of Employee 3:3
Enter the name of employee Althaf
Enter the Phone Number of employee 9495867896
Enter the employee number of Employee 4:4
Enter the name of employee Amal
Enter the Phone Number of employee 6969585874
Enter the employee number of Employee 5:5
Enter the name of employee Aromal
Enter the Phone Number of employee 9495968687

Employee ID : 1
Employee name : Abhijith
Employee Phone Number : 9495969696

Employee ID : 2
Employee name : Adarsh
Employee Phone Number : 9696499696

Employee ID : 3
Employee name : Althaf
Employee Phone Number : 9495867896

Employee ID : 4
Employee name : Amal
Employee Phone Number : 6969585874

Employee ID : 5
Employee name : Aromal
Employee Phone Number : 9495968687
*/
