package day13;

import java.util.*;
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

//Write MyBook Class
class MyBook extends Book{
   int price;
   MyBook(String title2, String author2,int price2) {
      super(title2,author2);
      price=price2;
   }
    void display(){
         System.out.println("Title: "+title);
         System.out.println("Author: "+author);
         System.out.println("Price: "+price);
      }
   
}

public class solution
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}
