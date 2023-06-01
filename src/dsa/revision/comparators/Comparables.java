package dsa.revision.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparables {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        PlayerAgeComparator p = new PlayerAgeComparator(){};
        Collections.sort(footballTeam, p);
        System.out.println("After Sorting : " + footballTeam);
    }

    static abstract class PlayerAgeComparator implements Comparator<Player> {

        @Override
        public int compare(Player p1, Player p2) {
            return Integer.compare(p2.getRanking(), p1.getRanking());
        }
    }

    static class Player {

        public Player(int ranking, String name, int age) {
            this.ranking = ranking;
            this.name = name;
            this.age = age;
        }

        private int ranking;
        private String name;
        private int age;

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Player{" + "ranking=" + ranking + ", name=" + name + ", age=" + age + '}';
        }
    }
}
