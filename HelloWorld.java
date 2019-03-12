/* This is a not simple Java program 3.
   FileName : "HelloWorld.java". */
import java.util.Date;

class HelloWorld
{
    public static void main(String args[])
    {
        Date date = new Date();
        String Str = String.format("Hello World: %tc", date);
        System.out.println(Str);
    }
}
