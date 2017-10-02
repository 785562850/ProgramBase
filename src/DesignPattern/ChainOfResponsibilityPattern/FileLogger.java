package DesignPattern.ChainOfResponsibilityPattern;

/**
 * Created by john on 2017/10/2.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
