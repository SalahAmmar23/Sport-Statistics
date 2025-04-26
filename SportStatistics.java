
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();


        System.out.println("File: ");
        String filename = scan.nextLine();

        try(Scanner reader = new Scanner(Paths.get(filename))){

            while(reader.hasNextLine()){
                String line = reader.nextLine();
                if(line.isEmpty()){
                    continue;
                }


                String[] parts = line.split(",");
                String homeTeam =  parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.parseInt(parts[2]);
                int visitingTeamPoints = Integer.parseInt(parts[3]);


                teams.add(new Team(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
                
            }
        }catch(Exception e ){
            System.out.println("Error"+ e.getMessage());
        }

        System.out.println("Team: ");
        String checkTeam = scan.nextLine();

        int countgames = 0;
        for(Team team : teams){
            if(team.hasTeam(checkTeam)){
                countgames++;
            }
        }

        int wins = 0;
        int losses = 0;
        for (Team match : teams) {
            if (match.hasTeam(checkTeam)) {
                if (match.didWin(checkTeam)) {
                    wins++;
                } else if (match.didLose(checkTeam)) {
                    losses++;
                }
            }
        }
                

        System.out.println("Games: " + countgames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: "+ losses);


    }

}
