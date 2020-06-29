package FacadePattern;

public class FacadeFactory {

    private static FacadeFactory facadeFactory  ;

    private FacadeFactory(){}

    public  synchronized static  FacadeFactory getInstance(){
       if(facadeFactory == null){
           facadeFactory = new FacadeFactory();
       }
       return facadeFactory;
    }

    public ComponentFacade getFacadeImpl(){
        return new FacadeImpl();
    }
}
