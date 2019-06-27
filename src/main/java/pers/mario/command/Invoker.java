package pers.mario.command;

/**
 * @Project: design
 * @PackageName: pers.mario.command
 * @FileName: Invoker.java
 * @Description: The Invoker is...
 * @Author: mario
 * @Time: 2019-06-05 15:17:19
 * @Version:V1.0.0
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
