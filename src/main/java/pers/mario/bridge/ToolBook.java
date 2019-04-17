package pers.mario.bridge;

/**
 * @Project: design
 * @PackageName: pers.mario.bridge
 * @FileName: ToolBook.java
 * @Description: The ToolBook is...
 * @Author: mario
 * @Time: 2019-04-17 09:35:40
 * @Version:V1.0.0
 */
public class ToolBook extends AbstractBook {
    public ToolBook(Material material) {
        super(material);
    }

    @Override
    public void materialInfo() {
        System.out.println("工具书都是"+material.getSheet()+"制作的");
    }
}
