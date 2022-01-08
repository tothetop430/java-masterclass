package academy.learnprogramming;

class Movie {
    private String name;
    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No Plot";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "Shark eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }
    public String plot() {
        return "Alien Invasion";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }
    public String plot() {
        return "Zombie Virus Apocalypse";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }
    public String plot() {
        return "Imperial Forces to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
}

public class Main {

    public static void main(String[] args) {

        for(int i=0; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie " + movie.getName() + " has plot = " + movie.plot());
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number Generated = " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new MazeRunner();
            case 3:
                return new IndependenceDay();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}
