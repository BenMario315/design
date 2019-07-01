package pers.mario.interpreter;

/**
 * @Project: design
 * @PackageName: pers.mario.interpreter
 * @FileName: CommandKey.java
 * @Description: The CommandKey is...
 * @Author: mario
 * @Time: 2019-07-01 18:24:38
 * @Version:V1.0.0
 */
public class CommandKey extends AbstractKey {
    private AbstractKey node;

    @Override
    public void interpreter(Directive directive) {
        if (directive.getCurrentCommand().equalsIgnoreCase("loop"))
        {
            node = new LoopKey();
            node.interpreter(directive);
        }
        else
        {
            node = new EndKey();
            node.interpreter(directive);
        }
    }

    @Override
    public void execute() {
        node.execute();
    }
}
