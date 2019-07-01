package pers.mario.interpreter;

/**
 * @Project: design
 * @PackageName: pers.mario.interpreter
 * @FileName: EndKey.java
 * @Description: The EndKey is...
 * @Author: mario
 * @Time: 2019-07-01 18:29:29
 * @Version:V1.0.0
 */
public class EndKey extends AbstractKey {

    private String name;
    private String text;

    @Override
    public void interpreter(Directive directive) {
        name = directive.getCurrentCommand();
        directive.skipCurrentCommand(name);

        if (!name.equalsIgnoreCase("PRINT")
                && !name.equalsIgnoreCase("BREAK")
                && !name.equalsIgnoreCase("SPACE")) {
            System.out.println("非法指令");
        }

        if (name.equalsIgnoreCase("PRINT")) {
            text = directive.getCurrentCommand();
            directive.nextCommand();
        }
    }

    @Override
    public void execute() {
        if (name.equalsIgnoreCase("PRINT")) System.out.print(text);
        else if (name.equalsIgnoreCase("SPACE")) System.out.print(" ");
        else if (name.equalsIgnoreCase("BREAK")) System.out.print("\r\n");

    }

}
