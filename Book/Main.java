package Book;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.*;

public class Main {
    public static LinkedList<Book> generateListOfBooks(int n){
        return BookUtil.creatList(n);
    }
    public static void printList(LinkedList<Book> listOfBooks){
        for (Book book : listOfBooks){
            System.out.println(book);
        }
    }
    public static void printListRemove(LinkedList<Book> listOfBooksRemove){
        listOfBooksRemove.remove(6);
        for (Book book : listOfBooksRemove){
            System.out.println(book);
        }
    }
    public static HashSet<Book> generateHashSet(int n){
        return BookUtil.generateHashSetOfBooks(n);
    }
    public static void printHashSet(HashSet<Book> hs){
        for (Book book : hs){
            System.out.println(book);
        }
    }
    public static void printHashSetFirstVowel(HashSet<Book> hs ) {
        for (Book book : hs) {
            if (Main.isVowel(book.getName().charAt(0))) {
                System.out.println(book);
            }
        }
    }
        public static boolean isVowel(char c){
            boolean result;

            if(c=='A' || c=='E' || c=='I' || c=='U' || c=='O' || c=='Y'){
                result= true;
            }
            else{
                result= false;
            }
            return result;
        }
        public static void sortHashSet(String atr, HashSet<Book> hs){
           List<Book> sortedList = new ArrayList<Book>(hs);
           if(atr.equalsIgnoreCase("name")) {
               Collections.sort(sortedList, new Sortbyname());
               for (Book book : sortedList) {
                   System.out.println(book);
               }
           }

        }




    public static void main(String[] args) {
        final int BOOKS_QTY = 20;
        final int BOOKS_QTY_HASH = 25;
        LinkedList<Book> books = new LinkedList<Book>();
        if (books.addAll(Main.generateListOfBooks(BOOKS_QTY))) Main.printList(books);
        System.out.println();
        Main.printListRemove(books);
        System.out.println();
        HashSet<Book> bookHashSet = new HashSet<Book>();
        if(bookHashSet.addAll(Main.generateHashSet(BOOKS_QTY_HASH))) Main.printHashSet(bookHashSet);
        System.out.println();
        Main.printHashSetFirstVowel(bookHashSet);
        System.out.println();
        Main.sortHashSet("name",bookHashSet);



    }
}
class Sortbyname implements Comparator<Book>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Book a, Book b)
    {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}