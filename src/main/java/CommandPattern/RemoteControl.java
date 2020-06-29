package CommandPattern;

public class RemoteControl {

    Command [] commands = new Command [2];

    public RemoteControl() {
        Tv tv = new Tv();
        commands[0] = new TvOpen(tv);
        commands[1] = new TvClose(tv);
    }

    public void test(int i){
        if(i > commands.length || i < 0){
            throw  new RuntimeException(""+"Wrong command");
        }
        commands[i].execute();
    }
}
