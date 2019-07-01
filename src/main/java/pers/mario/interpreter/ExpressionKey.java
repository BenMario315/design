package pers.mario.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: design
 * @PackageName: pers.mario.interpreter
 * @FileName: ExpressionKey.java
 * @Description: The ExpressionKey is...
 * @Author: mario
 * @Time: 2019-07-01 18:17:39
 * @Version:V1.0.0
 */
public class ExpressionKey extends AbstractKey {

    private List<AbstractKey> list = new ArrayList<>();


    @Override
    public void interpreter(Directive directive) {
        while (true) {
            if (directive.getCurrentCommand() == null) break;
            else if (directive.getCurrentCommand().equalsIgnoreCase("end")) {
                directive.skipCurrentCommand(directive.getCurrentCommand());
                break;
            } else {
                AbstractKey expression = new CommandKey();
                expression.interpreter(directive);
                list.add(expression);
            }
        }

    }

    @Override
    public void execute() {
        list.forEach(item -> {
            item.execute();
        });
    }
}

