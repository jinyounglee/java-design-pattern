package sigleton.pattern.demo;

public class SigletonPatternEx {

    public static void main(String[] args) {
        System.out.println("*** Singleton Pattern Demo***\n");

        MakeACaptain captain = MakeACaptain.getCaptain();

        MakeACaptain captain2 = MakeACaptain.getCaptain();

        if( captain == captain2) {
            System.out.println("Captain can be only one person.");
        }
    }
}
