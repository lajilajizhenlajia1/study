import java.util.Random;

public class test1 {

    public static void main (String[] args){
        int[][] a=new int[30][5];
        int[] b=new int[30];
        for(int i =0;i<a.length; i++){
            System.out.print("第"+(i+1)+"个学生的五门成绩：\t");
            int count=0;
            for (int j=0;j<a[i].length;j++){
                do {
                    a[i][j]=new Random().nextInt(101);
                }while (a[i][j]<60);
                count+=a[i][j];
                System.out.print(a[i][j]+"\t");
            }
            count=count/5;
            b[i]=count;

            System.out.println("第"+(i+1)+"个学生的5门成绩的平均成绩");
            System.out.println(b[i]);
            System.out.println();
        }
    }

}
