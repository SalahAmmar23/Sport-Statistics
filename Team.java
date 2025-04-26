public class Team {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Team(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints){
        this.homeTeam = homeTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeam = visitingTeam;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam(){
        return this.homeTeam;
    }

    public boolean hasTeam(String name){
        return homeTeam.equals(name) ||  visitingTeam.equals(name);
    }

    public String toString(){
        return "Home Team: "+ this.homeTeam +"Visiting Team: "+ this.visitingTeam;
    }

    public boolean homeWinner(){
        if(this.homeTeamPoints > this.visitingTeamPoints){
            return true; 
        }
        return false;
    }

    
    public boolean visitorWinner(){
        if(this.homeTeamPoints < this.visitingTeamPoints){
            return true; 
        }
        return false;
    }

    public boolean didWin(String name){
       return (homeTeam.equals(name) && homeWinner()) ||
           (visitingTeam.equals(name) && visitorWinner());
    }
    
    public boolean didLose(String name){
        return (homeTeam.equals(name) && !homeWinner()) ||
           (visitingTeam.equals(name) && !visitorWinner());
    }



}



/*

ENCE,Vitality,9,16
ENCE,Vitality,16,12
ENCE,Vitality,9,16
ENCE,Heroic,10,16
SJ,ENCE,0,16
SJ,ENCE,3,16
FURIA,NRG,7,16
FURIA,Prospects,16,1

 */