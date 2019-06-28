package pers.mario.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: design
 * @PackageName: pers.mario.memento
 * @FileName: VersionControl.java
 * @Description: The VersionControl is...
 * @Author: mario
 * @Time: 2019-06-28 15:20:47
 * @Version:V1.0.0
 */
public class VersionControl {
    List<Backup> list = new ArrayList<>();

    Integer versionNo = 0;


    public void addBackup(Backup backup){
        backup.setVersionNo(versionNo++);
        list.add(backup);
    }

    public Backup get(Integer versoin){
        for(Backup backup : list){
            if(backup.getVersionNo().equals(versoin)){
                return backup;
            }
        }
        return null;
    }
}
