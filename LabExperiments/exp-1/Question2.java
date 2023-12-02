//Wrtie a prg in java to create a player class. Inhereit a class cricket_player, football_player and hockey_player forma player class
class player {
    
    String name;
    int age;
    int matches;

    void numOfMatches(int matches) {

        this.matches = matches;
        System.out.println("Number of matches played : " + matches);

    }

}

class cricket_player extends player{

    cricket_player(String name, int age, int matches) {

        System.out.println("I am a Football Player");
        
        super.name = name;
        super.age = age;
        super.matches = matches;

    }

    void display() {

        System.out.println("Name of player : " + super.name);
        System.out.println("Age of player : " + super.age);
        System.out.println("Number of matches played : " + super.matches);

    }

}

class hockey_player extends player{

    hockey_player(String name, int age, int matches) {

        System.out.println("I am a Hockey Player");

        super.name = name;
        super.age = age;
        super.matches = matches;

    }

    void display() {

        System.out.println("Name of player : " + super.name);
        System.out.println("Age of player : " + super.age);
        System.out.println("Number of matches played : " + super.matches);

    }

}

class football_player extends player{

    football_player(String name, int age, int matches) {

        System.out.println("I am a Cricket Player");

        super.name = name;
        super.age = age;
        super.matches = matches;

    }

    void display() {

        System.out.println("Name of player : " + super.name);
        System.out.println("Age of player : " + super.age);
        System.out.println("Number of matches played : " + super.matches);

    }

}

public class Question2 {

    public static void main(String[] args) {

        cricket_player cObj = new cricket_player("Aryan", 21, 100);
        football_player fObj = new football_player("Kanav", 18, 90);
        hockey_player hObj = new hockey_player("Arayana", 22, 88);

        cObj.display();
        fObj.display();
        hObj.display();

    }

}