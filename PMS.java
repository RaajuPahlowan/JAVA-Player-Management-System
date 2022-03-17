import java.util.*;
import java.io.*;

class PMS {

	public static void main(String arv[]) {

		Scanner sc=new Scanner(System.in);
		PlayerShow ps = new PlayerShow();

		int i=0;

		MainMenu obj1 = new MainMenu();
    	obj1.menu();

    	while(i<6) 
    {

      System.out.print("\nPlease Enter choice :");
      i=Integer.parseInt(sc.nextLine());

      
      switch(i)
      {
        case 1:
        {

        PlayerAdd pa = new PlayerAdd();
        pa.createFile();

        obj1.menu();
        break;
        }



        case 2:
        {
          System.out.print("\nPlease Enter Player's ID :");
          String s=sc.nextLine();
          try
          {
            ps.viewFile(s);}
            
            catch(Exception e){System.out.println(e);}


            System.out.print("\nPress Enter to Continue...");
            sc.nextLine();
            obj1.menu();
            break;
          }




        case 3:
        {
          System.out.print("\nPlease Enter Player's ID :");
          String s=sc.nextLine();
          PlayerRemove pr = new PlayerRemove();
          pr.removeFile(s);

          System.out.print("\nPress Enter to Continue...");
          sc.nextLine();
          obj1.menu();
          break;
        }



        case 4:
        {
            System.out.print("\nPlease Enter Player's ID :");
            String I=sc.nextLine();
            try
            {
              ps.viewFile(I);
            }
            catch(Exception e)
            {
              System.out.println(e);
            }
            PlayerUpdate pu = new PlayerUpdate();
            System.out.print("Please Enter the detail you want to Update :");
    	      System.out.print("\nFor Example :\n");
            System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
            String s=sc.nextLine();
            System.out.print("Please Enter the Updated Info :");
            String n=sc.nextLine();
            try
            {
              pu.updateFile(I,s,n);

              System.out.print("\nPress Enter to Continue...");
              sc.nextLine();
              obj1.menu();
              break;
            }
            catch(IOException e)
            {
              System.out.println(e);
            }
        }
        case 5:
        {
          CodeExit obj = new CodeExit();
          obj.out();
        }
      }
    }

  }

}