package pers.mario.decorator;

/**
 * @Project: design
 * @PackageName: pers.mario.decorator
 * @FileName: AuthorDecorator.java
 * @Description: The AuthorDecorator is...
 * @Author: mario
 * @Time: 2019-04-15 11:00:03
 * @Version:V1.0.0
 */
public class AuthorDecorator extends AbstractDecorator {
    public AuthorDecorator(Author author) {
        super(author);
    }

    /**
     * 我可能还需要喝点酒
     */
    private void drink(){
        System.out.println("我要喝两杯");
    }

    @Override
    public void write() {
        this.drink();
        super.write();
    }

    @Override
    public void sign() {
        this.drink();
        super.sign();
    }
}
