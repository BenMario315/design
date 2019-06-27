package pers.mario.Iterator;

import java.util.Vector;

/**
 * @Project: design
 * @PackageName: pers.mario.Iterator
 * @FileName: BookBox.java
 * @Description: The BookBox is...
 * @Author: mario
 * @Time: 2019-06-26 18:25:34
 * @Version:V1.0.0
 */
public class BookBox implements Box {
    private Vector vector = new Vector();

    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    public Object getElement(Integer index) {
        if (index < vector.size()) {
            return vector.get(index);
        }
        return null;
    }

    public Integer size() {
        return vector.size();
    }

    @Override
    public Iterator createIterator() {
        return new BoxIterator(this);
    }
}
