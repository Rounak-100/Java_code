import java.util.*;

class Student{
    String name,dept;
    int roll;
    float avg;
    Student(String n,String d, int r, float a)
    {
       name=n;dept=d;roll=r;avg=a;
    }
    void show()
    {
        System.out.println(name+" "+roll+" "+dept+" "+avg);
    }
}
class StudentList
{
    int n;
    Student list[];
    StudentList(int n)
    {
        this.n=n;
        list=new Student[this.n];
    }
    void input()
    {
        int i,r;
        String n1,d;
        float a;
        Scanner sc;
        sc=new Scanner(System.in);
    
        for(i=0;i<n;i++)
        {
            System.out.println("Name:");
            n1=sc.next(); //nextLine for space 
            sc.nextLine();
            System.out.println("Dept:");
            d=sc.next();
            System.out.println("Roll:");
            r=sc.nextInt();
            System.out.println("Avg. marks:");
            a=sc.nextFloat();
            list[i]=new Student(n1,d,r,a);
        }
    }
    void display()
    {
        if(n==0)
          System.out.println("empty list");
        else{
            System.out.println("All information: ");
            for(int i=0;i<n;i++)
            {
                list[i].show();
            }
        }
    }
    void search()
    {
        int r,flag=-1;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(list[i].roll==r)
            {
               flag=i;
            }
        }
        if(flag==-1)
          System.out.println("Not present");
        else{
            list[flag].show();
        }
    }
    void sort()
{
    int i,j;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
           if((list[j].name).compareTo(list[j+1].name)>0)
           {
            String s1,s2;
            int x1;
            float f1;
            s1=list[j].name;
            s2=list[j].dept;
            x1=list[j].roll;
            f1=list[j].avg;

            list[j].name=list[j+1].name;
            list[j].dept=list[j+1].dept;
            list[j].roll=list[j+1].roll;
            list[j].avg=list[j+1].avg;

            list[j+1].name=s1;
            list[j+1].dept=s2;
            list[j+1].roll=x1;
            list[j+1].avg=f1;

           }
        }
    }
}
void insert()
{
    int pos;
    Scanner sc=new Scanner(System.in);
    pos=sc.nextInt();
    n=n+1;
    for(int i=n-1;i>=pos-1;i--)
    {
       list[i+1]=list[i];
    }
}
}
class Main
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.print("Enter number of student:");
    n=sc.nextInt();
    StudentList std = new StudentList(n);
    std.input();
    std.display();
    std.search();
    std.sort();
    std.display();
   }
}