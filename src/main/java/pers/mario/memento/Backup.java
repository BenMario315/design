package pers.mario.memento;

/**
 * @Project: design
 * @PackageName: pers.mario.memento
 * @FileName: Backup.java
 * @Description: The Backup is...
 * @Author: mario
 * @Time: 2019-06-28 15:03:38
 * @Version:V1.0.0
 */
public class Backup {
    public Backup(Document document) {
        this.content = document.getContent();
    }

    private String content;
    private Integer versionNo;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }
}
