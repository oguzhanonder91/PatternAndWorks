package CommandPattern;

public class TvOpen implements Command {
    Tv tv = null;

    public TvOpen(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
    tv.open();
    }
}

