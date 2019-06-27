package pers.mario.builder;

/**
 * @Project: design
 * @PackageName: pers.mario.builder
 * @FileName: BookBuilder.java
 * @Description: The BookBuilder is...
 * @Author: mario
 * @Time: 2019-04-10 15:41:31
 * @Version:V1.0.0
 */
public interface BookBuilder {
    /**
     * 设置书的id
     *
     * @param id
     */
    void setBookId(Integer id);

    /**
     * 设置书的名称
     *
     * @param name
     */
    void setBookName(String name);

    /**
     * 创建一本书
     *
     * @return AbstractBook的具体实现类对象
     */
    AbstractBook createBook();
}
