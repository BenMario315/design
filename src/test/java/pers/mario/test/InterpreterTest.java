package pers.mario.test;

import org.junit.Test;
import pers.mario.interpreter.AbstractKey;
import pers.mario.interpreter.Directive;
import pers.mario.interpreter.ExpressionKey;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: InterpreterTest.java
 * @Description: The InterpreterTest is...
 * @Author: mario
 * @Time: 2019-07-01 18:34:54
 * @Version:V1.0.0
 */
public class InterpreterTest {

    @Test
    public void interpretertest(){
        String directiveStr = "LOOP 2 PRINT good SPACE END PRINT study BREAK LOOP 2 PRINT day SPACE END PRINT up";
        Directive directive = new Directive(directiveStr);

        AbstractKey node = new ExpressionKey();
        node.interpreter(directive);


        System.out.println("原指令："+directiveStr);
        System.out.println("解析后：");

        node.execute();

    }
}
