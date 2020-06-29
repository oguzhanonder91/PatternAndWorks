package FacadePattern;

public class FacadeImpl implements ComponentFacade {
    @Override
    public void doSomething() {
        System.out.println("FacadeImple doSomeThing method called");
    new SampleClass().doSomething();
    }
}
