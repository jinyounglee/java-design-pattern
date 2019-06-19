package template.method.pattern.demo;

public class TemplateMethodPatternEx {

    public static void main(String[] args) {
        BasingEngineering bs = new ComputerScience();

        System.out.println("Computer Sc Papers::: ");

        bs.Papers();
        System.out.println();

        bs = new Electronics();


        bs.Papers();


    }
}
