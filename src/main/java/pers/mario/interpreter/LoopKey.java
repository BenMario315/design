package pers.mario.interpreter;

/**
 * @Project: design
 * @PackageName: pers.mario.interpreter
 * @FileName: LoopKey.java
 * @Description: The LoopKey is...
 * @Author: mario
 * @Time: 2019-07-01 18:26:30
 * @Version:V1.0.0
 */
public class LoopKey extends AbstractKey {
    // 循环次数
    private int number;
    // 循环语句中的表达式
    private AbstractKey commandNode;


    @Override
    public void interpreter(Directive directive) {
        directive.skipCurrentCommand("LOOP");
        number = directive.getCurrentNum(directive.getCurrentCommand());
        directive.nextCommand();
        // 循环语句中的表达式
        commandNode = new ExpressionKey();
        commandNode.interpreter(directive);
    }

    @Override
    public void execute() {
        for (int i = 0; i < number; i++)
        {
            commandNode.execute();
        }
    }

}
