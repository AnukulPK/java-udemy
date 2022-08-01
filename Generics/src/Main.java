

public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team<FootballPlayer> csk = new Team<>("CSK");
        csk.addPlayer(joe);

        System.out.println(csk.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Bulls");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this wont work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourbe = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourbe.addPlayer(banks);

        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorne.matchResult(fremantle,1,0);



    }

//    private static void printDoubled(ArrayList<Integer> n){
//        for(int i :n) {
//            System.out.println(i * 2);
//        }
//    }
}
