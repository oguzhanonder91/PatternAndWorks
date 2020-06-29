package limitedObject;

/**
 * Created by oguzhanonder on 25/10/16.
 */
public class LimitedNewObject {

    public  static  int a =0;

    public LimitedNewObject(){
        a++;
    }

   public static LimitedNewObject getInstance() {
        if(a<5){
            return new LimitedNewObject();
        }
        else{
            throw new NullPointerException();
        }

    }

}
