package question2;

class FootballPlayer extends Player {
    FootballPlayer(String var1, int var2, int var3) {
        System.out.println("I am a Cricket Player");
        super.name = var1;
        super.age = var2;
        super.matches = var3;
    }

    void display() {
        System.out.println("Name of player : " + super.name);
        System.out.println("Age of player : " + super.age);
        System.out.println("Number of matches played : " + super.matches);
    }
}
