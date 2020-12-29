import java.net.*;
import java.io.*;

public class client
{
    public static void main(String[] args) throws IOException
    {
      Socket s = new Socket("localhost", 4999);

      Printwriter pr = new Printwriter(s.getOutputStream());
      pr.println("it is working");
      pr.flush();


      InputStreamReader in = new InputStreamReader(s.getInputStream());
      BufferedReader bf = new BufferedReader(in);

      String str = bf.readLine();
      System.out.println("server: "  + str);





    }






}
