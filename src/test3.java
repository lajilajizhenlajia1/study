public class test3 {
    public static void main(String[] args) {
        double zi=2;
        double mu=1;
        double sum=0;
        for (int i=1;i<20;i++){
            sum+=zi/mu;
            double t = zi;
            zi+=mu;
            mu=t;
        }
        System.out.println(sum);

    }
}
