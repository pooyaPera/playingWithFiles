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

        String statment = "Hello world"; //Creating an statememt to work out
        byte[] statmentbyte = statment.getBytes(StandardCharsets.UTF_8);//parsing it into bytes
        output.write(statmentbyte);//writng byts to the file
        output.close();//closing the file

        String path = "C:\\Users\\Home\\IdeaProjects\\playingWithFiles\\text.txt";//finding the file
        FileInputStream input = new FileInputStream(path);//inputting it
        //System.out.println((int)input.read());//Outputs the Byte value of the first letter of the sentence in this case H with value of 72
        int  i= 0;
        while ((i= input.read())!= -1) {
            System.out.print((char)i);}//printing it out



    }
}
