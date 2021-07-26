/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookCatalog;

/**
 *
 * @author ragonba3
 */
public class BookCatalog {
    
    public class Book {
    private String name;
    private String id;
    private String author;
    private String type;
    private int price;
    private boolean isBorrow;
    
    public Book(String name, String id, String author, String type, int price, boolean isBorrow) {
        this.name = name;//accessors getters
        this.id = id;
        this.author = author;
        this.type = type;
        this.price = price;
        this.isBorrow = isBorrow;
//mutators setters
    }   

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public boolean isIsBorrow() {
            return isBorrow;
        }

        public void setIsBorrow(boolean isBorrow) {
            this.isBorrow = isBorrow;
        }

    }
}