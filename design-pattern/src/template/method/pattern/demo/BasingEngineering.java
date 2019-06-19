package template.method.pattern.demo;

public abstract class BasingEngineering {
    public void Papers(){
        // Common Papers

        Math();

        SoftSkills();

        SpecialPaper();
    }

    public void Math() {
        System.out.println("Mathmatics");
    }

    public void SoftSkills() {
        System.out.println("SoftSkills");
    }
    // Abstract method SpecialPaper() must be implemented in derived classes


    public abstract void SpecialPaper();


}
