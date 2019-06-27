package pers.mario.bridge;

/**
 * @Project: design
 * @PackageName: pers.mario.bridge
 * @FileName: NovelBook.java
 * @Description: The NovelBook is...
 * @Author: mario
 * @Time: 2019-04-16 19:07:10
 * @Version:V1.0.0
 */
public class NovelBook extends AbstractBook {
    public NovelBook(Material material) {
        super(material);
    }

    @Override
    public void materialInfo() {
        System.out.println("小说都用" + material.getSheet() + "来制作。");
    }
}
