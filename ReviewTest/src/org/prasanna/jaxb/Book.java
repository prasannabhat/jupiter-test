package org.prasanna.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "book")
// If you want you can define the order in which the fields are written
// Optional
@XmlType(propOrder = { "author", "name", "publisher", "isbn" })
public class Book {

  private String name;
  private String author;
  private String publisher;
  private String isbn;

  // If you like the variable name, e.g. "name", you can easily change this
  // name for your XML-Output:
  @XmlElement(name = "title")
  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(final String author) {
    this.author = author;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public void setPublisher(final String publisher) {
    this.publisher = publisher;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public void setIsbn(final String isbn) {
    this.isbn = isbn;
  }

}