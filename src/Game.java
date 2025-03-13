public class Game {
    private String name = "none";
    private Rule[] rules = new Rule[100];
    private int numRules = 0;
    private int teams = 0;
    private int teamSize = 0;

    //
    public Game(String n) {
        name=n;
    }

    //
    public Game(String n,Rule[] rs){
        name=n;

        if (rules.length-numRules >= rs.length){
            for(int i=0; i <rs.length; i++){
                rules[numRules]=rs[i];
                numRules ++;
            }
        }else{
            System.out.println("Error, there is not enough space to store the rules");
            System.exit(1);
        }
    }

    //
    public Game(String n, Rule[] rs, int t, int ts){
        name=n;

        if (rs.length<=numRules){
            for(int i=0; i <rs.length; i++){
                rules[numRules]=rs[i];
                numRules ++;
            }
        }else{
            System.out.println("Error, there is not enough space to store the rules");
            System.exit(1);
        }

        teams= t;
        teamSize = ts;
    }

    //
    public  Game(){}


    // Getters
    public String getName() {
        return name;
    }

    public int getTeams() {
        return teams;
    }

    public int getTeamSize() {
        return teamSize;
    }


    // Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setTeams(int teams) {
        this.teams = teams;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }


    public boolean addRule(Rule r){
        if (rules.length>numRules){
            return true;
        }else{
            return false;
        }
    }

    public Rule[] getRules(){
        return rules;
    }

    public int getNumRules() {
        return numRules;
    }
}
