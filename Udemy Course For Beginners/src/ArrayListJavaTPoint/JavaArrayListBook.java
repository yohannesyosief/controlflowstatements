package ArrayListJavaTPoint;

import java.util.ArrayList;
import java.util.List;

//Let's see an ArrayList example where we are adding books to list and printing all the books.
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}}
	



public class JavaArrayListBook {

	public static void main(String[] args) {
		
		//Creating list of Books
		List<Book> list=new ArrayList<Book>();
		
		//creating Books
		Book b1=new Book(101,"Memories Of MidNight","Sidney Sheldon","NewYorkTimes",500);
		Book b2=new Book(102,"the LastJuror","John Grisham","NewYorkTimes",600);
		Book b3=new Book(103,"Aynifalale","Alemesged Tesfay","Awghet",900);
		
		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b:list)
		{System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		
			}

}}
