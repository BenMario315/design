package pers.mario.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project: design
 * @PackageName: pers.mario.flyweight
 * @FileName: BookFactory.java
 * @Description: The BookFactory is...
 * @Author: mario
 * @Time: 2019-06-05 10:52:59
 * @Version:V1.0.0
 */
public class BookFactory {
    private static Map<String,Book> pool = new HashMap<>();

    private BookFactory(){}

    public static Book getBook(String type){
        Book book = pool.get(type);
        if(book ==null){
            book = new Book(type);
            pool.put(type,book);
        }
        return book;
    }
}
