import java.util.Scanner;
public class Assignment3{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int id;
System.out.print("Enter any id=");
  id=input.nextInt();
  System.out.println("id="+id);
  
  String title;
System.out.print("Enter any title=");
  title=input.next();
  System.out.println("title="+title);
  
  int price;
System.out.print("Enter any price=");
  price=input.nextInt();
  System.out.println("price="+price);
  
  String description;
System.out.print("Enter any description=");
  description=input.next();
  System.out.println("description="+description);
  
  String category;
System.out.print("Enter category name=");
  category=input.nextLine();
  System.out.println("category="+category);
}}