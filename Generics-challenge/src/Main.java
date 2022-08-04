public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<FootballPlayer> melbourbe = new Team<>("Melbourne");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Bulls");

        hawthorne.matchResult(fremantle,1,0);
        hawthorne.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle,2,1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourbe);
        footballLeague.add(fremantle);
        footballLeague.add(hawthorne);
//        footballLeague.add(baseballTeam);


        footballLeague.showLeagueTable();

    }
}
