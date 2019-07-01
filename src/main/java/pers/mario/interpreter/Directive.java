package pers.mario.interpreter;

/**
 * @Project: design
 * @PackageName: pers.mario.interpreter
 * @FileName: Directive.java
 * @Description: The Directive is...
 * @Author: mario
 * @Time: 2019-07-01 17:36:45
 * @Version:V1.0.0
 */
public class Directive {
    private Integer index = 0;
    private String [] commands;
    private String currentCommand;

    public Directive(String directive){
        commands =  directive.split(" ");
        nextCommand();

    }

    public String nextCommand() {
        if(index < commands.length){
            currentCommand =  commands[index++];
        }else {
            currentCommand = null;
        }
        return currentCommand;
    }

    public String getCurrentCommand(){
        return currentCommand;
    }

    public void skipCurrentCommand(String command){
        if(!command.equalsIgnoreCase(currentCommand)){
            System.err.println("错误提示："+command+"解析错误");
        }
        nextCommand();
    }

    public Integer getCurrentNum(String command){
        try{
            return Integer.parseInt(command);
        }catch (EnumConstantNotPresentException e){
            System.err.println("错误提示:"+command+"不是数字");
        }
        return null;
    }

}
