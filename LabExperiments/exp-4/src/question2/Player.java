package question2;

class Player {
    String name;
    int age;
    int matches;

    Player() {
    }

    void numOfMatches(int var1) {
        this.matches = var1;
        System.out.println("Number of matches played : " + var1);
    }
}
