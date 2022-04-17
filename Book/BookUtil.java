package Book;


import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.LinkedList;

public class BookUtil implements BookData {

    @NotNull
    public static Book generateBook(String name, String author, double price) {
            Book result = new Book(name, author, price);
            return result;
    }
    public static LinkedList<Book> creatList(int quantity){
            LinkedList<Book> temp = new LinkedList<Book>();
            for(int i = 0; i< quantity; i++){
                // num will generate random number not including right border up to array size
                int num = (int) (Math.random()* arr_names.length);
                temp.add(generateBook(arr_names[num],arr_authors[num], arr_price[num]));

            }
            return temp;
    }
    public static HashSet<Book> generateHashSetOfBooks(int n){
        HashSet<Book> hs1 = new HashSet<Book>();
       Book book_1 = new Book("Anna Karenina","Lev Tolstoi", 12.99);
       final int QNTY_A_K = 7;
       for(int i=0; i< QNTY_A_K; i++){
           hs1.add(book_1);
       }
       for(int i=0; i< n-QNTY_A_K; i++){
           int num = (int) (Math.random()* arr_names.length);
           hs1.add(generateBook(arr_names[num],arr_authors[num], arr_price[num]));
       }
       return hs1;
    }
}
