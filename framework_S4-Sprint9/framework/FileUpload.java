package etu1927.framework;

public class FileUpload {
    String name;
    String path;
    Byte[] bytes;

    //SETTERS
    public void setName(String n){
        this.name = n;
    }
    public void setPath(String p){
        this.path = p;      
    }
    public void setBytes(Byte[] b){
        this.bytes = b;
    }
    //GETTERS
    public String getName(){
        return this.name;
    }
    public String getPath(){
        return this.path;      
    }
    public Byte[] getBytes(){
        return this.bytes;
    }
    //CONSTRUCTOR
    public FileUpload(String name , Byte[] bytes){
        this.setName(name);
        this.setBytes(bytes);
    }
    public FileUpload(){}

    //METHODS
}