//Write a Java program to demonstrate Single Inheritance using a Library Management example. Create a parent class Library with a method showBooks() and a child class Member with a method borrowBook(). Access both methods using a child class object.

package inheritance;  // single inheritance

//Parent class
class Library {

 void showBooks() {

     System.out.println("Books are available in the library");
 }
}

//Subclass
class Member extends Library {

 void borrowBook() {

     System.out.println("Member borrowed a book");
 }
}


public class LibraryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Member obj = new Member();

       
        obj.showBooks();
        obj.borrowBook();

	}

}
