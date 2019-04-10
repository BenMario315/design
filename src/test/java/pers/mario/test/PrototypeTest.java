package pers.mario.test;

import org.junit.Test;
import pers.mario.prototype.Author;
import pers.mario.prototype.CloneBook;
import pers.mario.prototype.DeepCloneBook;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: PrototypeTest.java
 * @Description: The PrototypeTest is...
 * @Author: mario
 * @Time: 2019-04-10 16:49:57
 * @Version:V1.0.0
 */
public class PrototypeTest {


    @Test
    public void CloneTest() {
        CloneBook cloneBook = new CloneBook();
        Author author = new Author();
        author.setName("mario");
        author.setAge(18);
        cloneBook.setAuthor(author);
        cloneBook.setName("BookName");

        CloneBook cloneBookClone = cloneBook.clone();

        CloneBook cloneBookEvaluation = cloneBook;

        System.out.println("模版hashCode:"+ cloneBook.hashCode());
        System.out.println("克隆hashCode:"+ cloneBookClone.hashCode());
        System.out.println("赋值hashCode:"+ cloneBookEvaluation.hashCode());

        System.out.println("模版Author.hashCode:"+ cloneBook.getAuthor().hashCode());
        System.out.println("克隆Author.hashCode:"+ cloneBookClone.getAuthor().hashCode());
        System.out.println("克隆Author.hashCode:"+ cloneBookEvaluation.getAuthor().hashCode());

    }

    @Test
    public void DeepCloneTest() {
        DeepCloneBook cloneBook = new DeepCloneBook();
        Author author = new Author();
        author.setName("mario");
        author.setAge(18);
        cloneBook.setAuthor(author);
        cloneBook.setName("BookName");

        DeepCloneBook cloneBookClone = cloneBook.clone();

        DeepCloneBook cloneBookEvaluation = cloneBook;

        System.out.println("模版hashCode:"+ cloneBook.hashCode());
        System.out.println("克隆hashCode:"+ cloneBookClone.hashCode());
        System.out.println("赋值hashCode:"+ cloneBookEvaluation.hashCode());

        System.out.println("模版Author.hashCode:"+ cloneBook.getAuthor().hashCode());
        System.out.println("克隆Author.hashCode:"+ cloneBookClone.getAuthor().hashCode());
        System.out.println("克隆Author.hashCode:"+ cloneBookEvaluation.getAuthor().hashCode());

    }
}
