package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
    public static void main(String[] args) {
        int a= reverse(156);
        System.out.println(a);
    }
    public static  int reverse(int x) {
        int result = 0;
        while (x!=0){
            int tail = x%10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
