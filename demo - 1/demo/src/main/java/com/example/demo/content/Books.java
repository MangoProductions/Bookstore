package com.example.demo.content;

public class Books {
private long id;
private String title;
private String author;
private int year;
private String isbn;
private double price;
public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
  public String getTitle() {
	    return title;
	  }

	  public void setTitle(String title) {
	    this.title = title;
	  }
	  public String getAuthor() {
		    return author;
		  }

		  public void setAuthor(String author) {
		    this.author = author;
		  }
		  public int getYear() {
			    return year;
			  }

			  public void setYear(int year) {
			    this.year = year;
			  }
			  public String getIsbn() {
				    return isbn;
				  }

				  public void setIsbn(String isbn) {
				    this.isbn = isbn;
				  }
				  public double getPrice() {
					    return price;
					  }

					  public void setPrice(long price) {
					    this.price = price;
					  }

					public static Object findAll() {
						// TODO Auto-generated method stub
						return null;
					}

}
