/*we have to implement a library using java class Library
  methods: addbook,issuebook,returnbook,showavailablebooks
  properties: array to store the available books
              array to store the issued books
 */
package java_class;

import java.util.Scanner;

class Library{
    int n=50; //total available books maximum
    int n1=0; //actually available
    int m=20; //total issued books maximum
    int m2=0; //actually issued
    String available_books[]=new String[n];
    String issued_books[]=new String[m];

    void addbook(String b)
    {
    available_books[n1]=b;  
     n1++;
    }
    void issuebook(String b)
    {
        n1--;
        issued_books[m2]=b;
        m2++;
        System.out.println("book is issued");
    }
   void showavailablebooks()
   {
    for(int i=0;i<available_books.length;i++)
    {
        for(int j=0;j<issued_books.length;j++)
        {
            if(available_books[i]==issued_books[j])
            {
                available_books[i]=null;
            }
        }
    }
    System.out.println("The available books are: ");
    for(int i=0;i<available_books.length;i++)
    {
       
        if(available_books[i]==null)
        {
            continue;
        }
        System.out.print(available_books[i]+", ");
       
    } 
   }

   void returnbook(String b)
   {
    n1++;
    m2--;
    available_books[n1]=b;
   }
}

public class online_library {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Library l=new Library();
        l.addbook(sc.nextLine());
        l.addbook(sc.nextLine());
        
        l.showavailablebooks();
        System.out.println();
        System.out.println("total available books: "+l.n1);
        System.out.println("total issued books: "+l.m2);
        l.issuebook("this book");
        System.out.println("total issued books: "+l.m2);
        l.showavailablebooks();

        
    }
}
