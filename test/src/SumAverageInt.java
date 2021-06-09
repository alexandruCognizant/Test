public class SumAverageInt {
    public static void main(String[] args){
        long sum =0;
        for(int i=0; i<=100; i++){
            sum = sum + i;

        }
        System.out.println("The sum is: " +sum);
        float avarage = sum/100;
        System.out.println("The avarage of the previous sum is: " + avarage);
    }

}
