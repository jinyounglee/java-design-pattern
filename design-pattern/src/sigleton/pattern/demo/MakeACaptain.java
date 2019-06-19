package sigleton.pattern.demo;

public class MakeACaptain {

    private static MakeACaptain _captain;

    private static class SingletonHelper {
        private static final MakeACaptain _captain = new MakeACaptain();
    }

    public static MakeACaptain getCaptain() {
//        if(_captain == null) {
//            _captain = new MakeACaptain();
//            System.out.println("New Captain selected for our team");
//        }
//        else {
//            System.out.println("You already have a Captain for your team.");
//            System.out.println("Send him for the toss");
//        }
        return SingletonHelper._captain;
    }

    private MakeACaptain() {
    }
}
