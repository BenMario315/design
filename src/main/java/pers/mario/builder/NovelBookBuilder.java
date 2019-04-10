package pers.mario.builder;

/**
 * @Project: design
 * @PackageName: pers.mario.builder
 * @FileName: NovelBookBuilder.java
 * @Description: The NovelBookBuilder is...
 * @Author: mario
 * @Time: 2019-04-10 15:43:46
 * @Version:V1.0.0
 */
public class NovelBookBuilder implements BookBuilder {
    NovelBook book = new NovelBook();
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

    public void setBookPlot(String plot){
        book.setPlot(plot);
    }
}
