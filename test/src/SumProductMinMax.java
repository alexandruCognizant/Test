import java.util.Scanner;

public class SumProductMinMax {
    public static void main(String[] args){
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Please enter 3 numbers ");
        Scanner userInput2 = new Scanner(System.in);
        Scanner userInput3 = new Scanner(System.in);

        int number1 = userInput1.nextInt();
        int number2 = userInput2.nextInt();
        int number3 = userInput3.nextInt();

        int sum = number1 + number2 + number3;

        int product = number1 * number2 * number3;



        int temp,size;
        int [] minMax = {number1,number2,number3};
        size = minMax.length;
        for (int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(minMax[i]>minMax[j]){
                    temp =minMax[i];
                    minMax[i] = minMax[j];
                    minMax[j] = temp;
                }
            }
        }

        System.out.println("The sum of the numbers is: "+ sum);
        System.out.println("The Product of the numbers is: "+ product);
        System.out.println("The maximum number is : " + minMax[size-1]);


    }
}
