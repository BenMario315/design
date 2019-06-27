package pers.mario.bridge;

/**
 * @Project: design
 * @PackageName: pers.mario.bridge
 * @FileName: AbstractBook.java
 * @Description: The AbstractBook is...
 * @Author: mario
 * @Time: 2019-04-16 18:58:52
 * @Version:V1.0.0
 */
public abstract class AbstractBook {
    Material material;

    public AbstractBook(Material material) {
        this.material = material;
    }

    /**
     * 获取材料信息
     */
    public abstract void materialInfo();
}
