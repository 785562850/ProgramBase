package DesignPattern.ProxyPattern;

/**
 * Created by john on 2017/10/2.
 */
public class RealImage implements Image{
    private String fileName;

    public RealImage() {
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
