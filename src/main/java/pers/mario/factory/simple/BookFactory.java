package pers.mario.factory.simple;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.simple
 * @FileName: BookFactory.java
 * @Description: The BookFactory is...
 * @Author: mario
 * @Time: 2019-04-08 13:51:00
 * @Version:V1.0.0
 */
public class BookFactory {

    /**
     * 制造书的工厂，不要问我制造什么书，你给我你要制造的书的类型，我就给你制造对应类型的书，我不会造就会给你null。
     * @param type 书籍的类型
     * @return book 或者 null
     */
    public static Book createBook(BookType type) {
        switch (type) {
            case Tool:
                return new ToolBook();
            case Novel:
                return new NovelBook();
            default:
                return null;
        }
    }
}
