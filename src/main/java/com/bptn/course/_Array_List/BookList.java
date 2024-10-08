package com.bptn.course._Array_List;
import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		// create a new Arraylist called "myBooks"
		int counter =1;
ArrayList <String> myBooks = new ArrayList<>();

//add 3 books

myBooks.add("Book1".toLowerCase());
myBooks.add("Book2".toLowerCase());
myBooks.add("Book3".toLowerCase());

//print it out

System.out.println("my favourite books are" + myBooks);
//another print method
for(String book:myBooks) {
	System.out.println("Book" + counter +":" + book);
	counter ++;
}

//Disply 1st book from the list

System.out.println(myBooks.getFirst());

//delete second book

myBooks.remove(1);
System.out.println("my favourite books are" + myBooks);
 
//search for a book
if(myBooks.contains("Book3".toLowerCase())) {
	System.out.println("Book found");
}else {
	System.out.println("Book not found");
	
	//size of the list
	System.out.println("The size of the book is" + myBooks.size());
	
	System.out.println("The last item in the list is" + myBooks.get(myBooks.size()-1));
	

}
	}

}
