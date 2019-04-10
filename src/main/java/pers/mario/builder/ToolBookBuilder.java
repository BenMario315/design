package pers.mario.builder;

/**
 * @Project: design
 * @PackageName: pers.mario.builder
 * @FileName: ToolBookBuilder.java
 * @Description: The ToolBookBuilder is...
 * @Author: mario
 * @Time: 2019-04-10 15:53:49
 * @Version:V1.0.0
 */
public class ToolBookBuilder implements BookBuilder {
    ToolBook book = new ToolBook();
    @Override
    public void setBookId(Integer id) {
        book.setId(id);
    }

    @Override
    public void setBookName(String name) {
        book.setName(name);
    }

    @Override
    public Book createBook() {
        return book;
    }

    public void setPurpose(String purpose) {
        book.setPurpose(purpose);
    }
}
