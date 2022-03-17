import java.util.*;
import java.io.*;

class PlayerRemove{

	public void removeFile(String ID)
    {

    File file = new File("file"+ID+".txt");

      if(file.exists())
       {
         if(file.delete());
         {
           System.out.println("\nPlayer has been removed Successfully");
         }
       }
      else
       {
            System.out.println("\nPlayer does not exists :( ");
       }
     }
}