package FiksturOlusturucu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class FixtureGenerator {
    public static List<String[]> generateFixtures(List<String> teams) {
        List<String[]> fixtures = new ArrayList<>();

        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int totalRounds = teams.size() - 1;
        int matchesPerRound = teams.size() / 2;

        List<String> homeTeams = new ArrayList<>(teams.subList(0, matchesPerRound));
        List<String> awayTeams = new ArrayList<>(teams.subList(matchesPerRound, teams.size()));
        Collections.reverse(awayTeams);

        for (int round = 0; round < totalRounds; round++) {
            List<String[]> roundFixtures = new ArrayList<>();
            for (int match = 0; match < matchesPerRound; match++) {
                String[] fixture = {homeTeams.get(match), awayTeams.get(match)};
                roundFixtures.add(fixture);
            }
            fixtures.addAll(roundFixtures);

            // Rotate teams
            String lastHomeTeam = homeTeams.remove(homeTeams.size() - 1);
            awayTeams.add(0, lastHomeTeam);
            homeTeams.add(1, awayTeams.remove(awayTeams.size() - 1));
        }

        return fixtures;
    }
    

    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Beşiktaş");
        teams.add("fenerbahçe");
        teams.add("Trabzonspor");
        teams.add("Bursaspor");
        teams.add("Başakşehir");

        List<String[]> fixtures = generateFixtures(teams);
        for (int round = 0; round < fixtures.size(); round++) {
            System.out.println("Round " + (round + 1) + ":");
            for (String[] match : fixtures) {
                System.out.println(match[0] + " vs " + match[1]);
            }
            System.out.println();
        }
    }
}
