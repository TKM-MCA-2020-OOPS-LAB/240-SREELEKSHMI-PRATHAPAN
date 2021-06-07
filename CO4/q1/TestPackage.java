Pacakage org.shape;
import java.util.*;
class TestPackage
{
public static void main(String[] args)
 {
        
Scanner sc= new Scanner(System.in);
System.out.print("enter the sides of peremeter");
int s=sc.nextInt();
Square sq= new Square(s);
System.out.print("peremeter of square is"+sq.peremeter());
System.out.print("area of square is"+sq.area());

System.out.print("enter the  first sides of Triangle");
int s1=sc.nextInt();
System.out.print("enter the  second sides of Triangle");
int s2=sc.nextInt();
System.out.print("enter the  third sides of Triangle");
int s3=sc.nextInt();
Triangle tc= new Triangle(s1,s2,s3);
System.out.print("peremeter of square is"+tc.Tperemeter());
System.out.print("area of square is"+tc.area());


}