import java.util.*;
 class Student
{
    String name;
    String gender;
    int no_subject;
    int mark;
    Scanner sc=new Scanner(System.in);
  public Student()
{
    System.out.println("ENTER THE DETAILS");
    System.out.println("enter the name");
    name = sc.next();
    System.out.println("enter the gender");
    gender = sc.next();
    System.out.println("enter the no_subject");
    no_subject = sc.nextInt();
    System.out.println("enter the mark");
    mark = sc.nextInt();
}  
}
class Sports extends Student
{
    int student_id;
    String item_name;
    int score;
   Scanner em= new Scanner(System.in);
   public Sports()
   {
    System.out.println("enter the chest number");
    student_id = em.nextInt();
    System.out.println("enter the item name");
   item_name = em.next();
    System.out.println("enter score");
    score = em.nextInt();
   } 
}
class Result extends Sports
{
    int sum;
    public Result()
    {
     sum =score + mark;
    System.out.println("emter the details of student");
    }
    public void display1()
    {
   System.out.println("------Student details-------");
   System.out.println("The name:"+name);
   System.out.println("The gender:"+gender);
   System.out.println("The nosubject:"+no_subject);
   System.out.println("The mark obtained:"+mark);
   System.out.println("chest number :"+student_id);
   System.out.println("item_name:"+item_name);
   System.out.println("score of sports:"+score);
   System.out.println("total points is : "+sum);
} 
}
 public class Mark
 {
   public static void main(String[] args)
    {
    Scanner tr = new Scanner(System.in);
    int i;
    System.out.println("Enter number of student: ");
    int n=tr.nextInt();
    Result t[]=new Result[n];
    for(i=0;i<n;i++) 
    {
       t[i]=new Result();
    }
    for(i=0;i<n;i++) 
    {
     t[i].display1();
    }
     }
   }