package thinkinginjava.chapterthree;

public class Nestedforloop {
    public static void main(String[] args) {
        int n = 50;
        for(int i = 2 ; i < n ; i++ ){
            boolean isPrime = true;
            for(int j = 2 ; j < i ; j++ ){
                if(i==1){
                    isPrime = false;
                    break;
                }
                if(i%j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(i + " is prime");
            }
            
        }
    }
}
