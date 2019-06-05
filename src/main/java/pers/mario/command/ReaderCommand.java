package pers.mario.command;

/**
 * @Project: design
 * @PackageName: pers.mario.command
 * @FileName: ReaderCommand.java
 * @Description: The ReaderCommand is...
 * @Author: mario
 * @Time: 2019-06-05 15:10:16
 * @Version:V1.0.0
 */
public class ReaderCommand implements Command {

    private Book book;

    public ReaderCommand(Book book){
        this.book = book;
    }

    @Override
    public void execute() {
        book.read();
    }
}
