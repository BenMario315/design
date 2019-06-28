package pers.mario.memento;

/**
 * @Project: design
 * @PackageName: pers.mario.memento
 * @FileName: Document.java
 * @Description: The Document is...
 * @Author: mario
 * @Time: 2019-06-28 14:53:01
 * @Version:V1.0.0
 */
public class Document {

    public Document(String name, String content) {
        this.name = name;
        this.content = content;
    }

    private String name;//文件名称一般不需要备份
    private String content;//文件内容一般需要备份

    public Backup backup() {
        System.out.println("文件被保存备份");
        return new Backup(this);
    }

    public void recover(Backup backup) {
        System.out.println("文件被还原");
        this.content = backup.getContent();
    }


    /*
    为了测试，这里重写toString方法
     */
    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
