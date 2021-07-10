import java.util.Scanner;
import cn.com.demo.Solution;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long str1 = Solution.trailingZeros(Long.parseLong(sc.next()));
        System.out.println(str1);
    }
}
