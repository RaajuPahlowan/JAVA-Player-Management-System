import java.util.*;
import java.io.*;

class PlayerDetails{

	String name;
    String team_name;
    String email;
    String position;
    String player_id;
    String player_salary;
    String sport_name;

    public void getInfo()
    {
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter Player's name --------: ");
        name=sc.nextLine();
        System.out.print("Enter Player's Team name -: ");
        team_name=sc.nextLine();
        System.out.print("Enter Player's ID ----------: ");
        player_id=sc.nextLine();
        System.out.print("Enter Player's Email ID ----: ");
        email=sc.nextLine();
        System.out.print("Enter Player's Position ----: ");
        position=sc.nextLine();
        System.out.print("Enter Player's Sport Name --: ");
        sport_name=sc.nextLine();
        System.out.print("Enter Players's Salary ------: ");
        player_salary=sc.nextLine();
    }

}