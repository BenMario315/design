package pers.mario.command;

/**
 * @Project: design
 * @PackageName: pers.mario.command
 * @FileName: WriterCommand.java
 * @Description: The WriterCommand is...
 * @Author: mario
 * @Time: 2019-06-05 15:13:04
 * @Version:V1.0.0
 */
public class WriterCommand implements Command {

    private Book book;

    public WriterCommand(Book book){
        this.book = book;
    }

    @Override
    public void execute() {
        book.write();
    }
}
