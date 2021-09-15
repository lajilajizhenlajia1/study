import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入1-10的抽奖号");
        int num=in.nextInt();
        switch (num){
            case 3:
                System.out.println("恭喜U盘");
                break;
            case 6:
                System.out.println("恭喜数据线");
                break;
            case 9:
                System.out.println("很遗憾没有");
                break;
        }
    }
}
