package pers.mario.abstracted.factory;

/**
 * @Project: design
 * @PackageName: pers.mario.abstracted.factory
 * @FileName: OracleOpareteFactory.java
 * @Description: The OracleOpareteFactory is...
 * @Author: mario
 * @Time: 2019-04-09 17:00:09
 * @Version:V1.0.0
 */
public class OracleOpareteFactory implements OperateFactory {
    @Override
    public void addBook(Book book) {
        System.out.println("从oracle中添加一本书");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("从oracle中删除id为" + id + "的数据");
    }

    @Override
    public Book getBook(Integer id) {
        System.out.println("从oracle中根据id查询一本书");
        return new Book() {
        };
    }

    @Override
    public Boolean modify(Book book) {
        System.out.println("从oracle中修改一本书");
        return Boolean.TRUE;
    }
}
