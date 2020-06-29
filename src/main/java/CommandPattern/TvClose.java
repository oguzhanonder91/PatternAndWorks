package CommandPattern;

public class TvClose implements Command {

    Tv tv = null ;

    public TvClose(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
     tv.close();
    }
}
