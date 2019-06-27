package pers.mario.abstracted.factory;

/**
 * @Project: design
 * @PackageName: pers.mario.abstracted.factory
 * @FileName: MysqlOperateFactory.java
 * @Description: The MysqlOperateFactory is...
 * @Author: mario
 * @Time: 2019-04-09 16:56:22
 * @Version:V1.0.0
 */
public class MysqlOperateFactory implements OperateFactory {

    @Override
    public void addBook(Book book) {
        System.out.println("从mysql中添加一本书");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("从mysql中删除id为" + id + "的数据");
    }

    @Override
    public Book getBook(Integer id) {
        System.out.println("从mysql中根据id查询一本书");
        return new Book() {
        };
    }

    @Override
    public Boolean modify(Book book) {
        System.out.println("从mysql中修改一本书");
        return Boolean.TRUE;
    }
}
