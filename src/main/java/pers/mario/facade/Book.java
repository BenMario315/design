package pers.mario.facade;

/**
 * @Project: design
 * @PackageName: pers.mario.facade
 * @FileName: Book.java
 * @Description: The Book is...
 * @Author: mario
 * @Time: 2019-04-17 13:46:44
 * @Version:V1.0.0
 */
public class Book {

    NovelBook novelBook = new NovelBook();
    ToolBook toolBook = new ToolBook();

    public void read(){
        novelBook.read();
        toolBook.use();
    }

}
