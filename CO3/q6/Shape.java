import java.util.*;
import java.math.*;
interface calcul
{
    void input();
    void area();
    void perimeter();

}
 class Circle implements calcul
{
    
    double area;
    double peri;
    double radius;
    @Override
    public void area()
    {
        area=3.14*radius*radius;
        System.out.print("area of circle"+area);
    }
    @Override
    
        public void perimeter()
         {
        peri=2*3.14*radius;
        System.out.print("perimetr of circle"+peri);   
        }
    @Override
    public void input() 
    {
        Scanner sc=new Scanner(System.in); 
        System.out.print("enter radius");
        radius=sc.nextDouble();

    }
}
class Rectangle extends Circle
{
    int p,l,b,a;
   Scanner em= new Scanner(System.in);
   public void input()
   {
    super.input();
    System.out.print("enter length");
    l=em.nextInt();
    System.out.print("enter bradth");
    b=em.nextInt();
   }
   public void area()
{
    super.area();
    a=l*b;
    System.out.print("area of reactangle"+a);
}
public void perimeter()
{
    super.perimeter();
    p=2*l+b;
    System.out.print("perimeter of reactangle"+p);
}
   

}

 public class Shape
 {   
public static void main(String[] args)
 {
 
 System.out.println("CALCULATIONS ");
   System.out.println("1.area of circle & Rectangle");
   System.out.println("2.perimeter of circle & Rectangle:");

   System.out.println("enter the choice:");
   Scanner pc =new Scanner(System.in);
   Rectangle r=new Rectangle();
   int choice=pc.nextInt();
   switch(choice)
   {
       case 1: System.out.println("area of circle and rectangle");
        r.input();
       r.area();
       break;
       case 2: System.out.println("perimetr of circle and rectangle");
       r.input();
       r.area();
       break;
          default:
       System.out.println("invalid choice");
       break;      
   }
 
  }
}