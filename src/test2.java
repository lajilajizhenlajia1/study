import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int temp=1;
        int i=1;
        int num;
        System.out.println("请输入一个数字");
        num=in.nextInt();
        while (i<=num){
            temp*=i;
            i++;
        }
        System.out.println(num+"的阶乘是："+temp);
    }
}
