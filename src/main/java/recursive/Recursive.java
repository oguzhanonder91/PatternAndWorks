package recursive;

public class Recursive {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    static int sum(int val) {
        if (val > 0) {
            return val + sum(val - 1);
        } else {
            return 0;
        }
    }
}
