package pers.mario.test;

import org.junit.Test;
import pers.mario.command.Book;
import pers.mario.command.Command;
import pers.mario.command.Invoker;
import pers.mario.command.ReaderCommand;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: CommandTest.java
 * @Description: The CommandTest is...
 * @Author: mario
 * @Time: 2019-06-05 15:18:20
 * @Version:V1.0.0
 */
public class CommandTest {

    @Test
    public void commandTes(){

        Command command = new ReaderCommand(new Book());

        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        invoker.action();
    }
}
