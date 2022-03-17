import java.util.*;
import java.io.*;

class PlayerAdd{

	public void createFile(){

		Scanner sc=new Scanner(System.in);

		PlayerDetails pl = new PlayerDetails();
		pl.getInfo();

		try{

			File f1=new File("file"+pl.player_id+".txt");

            if(f1.createNewFile()){

                FileWriter myWriter = new FileWriter("file"+pl.player_id+".txt");

                myWriter.write("Player ID:"+pl.player_id+"\n"+"Player Name     :"+pl.name+"\n"+
                "Teams's Name     :"+pl.team_name+"\n"+"Sports Name  :"+pl.sport_name+"\n"+
                "Email Information :"+pl.email+"\n"+"Player position :"+pl.position+"\n"+
                "Player Salary   :"+pl.player_salary);

                myWriter.close();
                System.out.println("\nPlayer has been Added :)\n");

                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
            else {
                System.out.println("\nPlayer already exists :(");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
		}
		catch(Exception e){System.out.println(e);}
	}
}