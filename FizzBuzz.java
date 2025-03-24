public class FizzBuzz{
    public static void main (String[] args){
        for (int i = 1; i<=100; i++){
            //divisible by 3 and 5
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            //divisible by 3
            else if(i%3==0){
                System.out.println("Fizz");
            }
            //divisible by 5
            else if (i%5==0){
                System.out.println("Buzz");
            }
            //divisible by neither
            else{
                System.out.println(i);
            }
        }

    }
}