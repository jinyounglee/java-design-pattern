package decorator.pattern.demo;

public abstract class AbstractDecorator extends Component{

    protected Component com;


    public void SetTheComponent(Component c){
        this.com = c;
    }

    @Override
    public void doJob() {
        if(com != null) {
            com.doJob();
        }
    }
}
