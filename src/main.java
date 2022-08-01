import java.io.*;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

     /*   String path = "C:\\Users\\Home\\Desktop\\hello.txt";

        FileInputStream input = new FileInputStream(path);
        int  i= 0;
        while ((i= input.read())!= -1){
            System.out.println((char)i);}*/

        FileOutputStream output = new FileOutputStream("text.txt");

        String statment = "Hello world";
        byte[] statmentbyte = statment.getBytes(StandardCharsets.UTF_8);
        output.write(statmentbyte);
        output.close();

        String path = "C:\\Users\\Home\\IdeaProjects\\playingWithFiles\\text.txt";
        FileInputStream input = new FileInputStream(path);
        int  i= 0;
        while ((i= input.read())!= -1){
            System.out.println((char)i);}



    }
}
