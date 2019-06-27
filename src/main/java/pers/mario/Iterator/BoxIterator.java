package pers.mario.Iterator;

/**
 * @Project: design
 * @PackageName: pers.mario.Iterator
 * @FileName: BoxIterator.java
 * @Description: The BoxIterator is...
 * @Author: mario
 * @Time: 2019-06-26 18:18:06
 * @Version:V1.0.0
 */
public class BoxIterator implements Iterator {
    private BookBox bookBox;
    private Integer size;
    private Integer index;

    public BoxIterator(BookBox bookBox) {
        this.bookBox = bookBox;
        this.size = bookBox.size();
        this.index = 0;
    }

    @Override
    public Object next() {
        if (index < size) {
            return bookBox.getElement(index++);
        }
        return null;
    }

    @Override
    public Boolean hasNext() {
        return index < size;
    }
}
