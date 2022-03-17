import java.util.*;
import java.io.*;

class PlayerShow{

	public void viewFile(String s) throws Exception{
    
    File file = new File("file"+s+".txt");
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine())
     {
       System.out.println(sc.nextLine());
     }
   }
}