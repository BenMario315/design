package pers.mario.decorator;

/**
 * @Project: design
 * @PackageName: pers.mario.decorator
 * @FileName: AbstractDecorator.java
 * @Description: The AbstractDecorator is...
 * @Author: mario
 * @Time: 2019-04-15 10:56:00
 * @Version:V1.0.0
 */
public abstract class AbstractDecorator implements Author {
    private Author author = null;
    public AbstractDecorator(Author author){
        this.author = author;
    }

    @Override
    public void write() {
        this.author.write();
    }

    @Override
    public void sign() {
        this.author.sign();
    }
}
