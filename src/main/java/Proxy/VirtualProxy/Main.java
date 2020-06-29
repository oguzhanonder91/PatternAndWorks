package Proxy.VirtualProxy;

public class Main {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutorProxy("Sample","Wrong-pwd");
        try {
            commandExecutor.runCommand("ls -ltr");
            commandExecutor.runCommand("rm -rf abc.pdf");

        }catch (Exception e){
            System.out.println("Exception Message : " + e.getMessage());
        }
    }
}