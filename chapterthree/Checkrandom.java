package thinkinginjava.chapterthree;

public class Checkrandom {

    public static void main(String[] args) {
        int rVal2 = (int)(Math.random() * 10);
        System.out.println(rVal2);
        
        // excercise 1
        // for(int i = 0; i < 25; i ++){
        //     int rVal1 = (int)(Math.random()*10);
        //     if( rVal1 > rVal2){
        //         System.out.println(" value1 " + rVal1 + " > " + " value2 " +rVal2 );
        //     }else if(rVal1 < rVal2){
        //         System.out.println(" value1 " + rVal1 + " < " + " value2 " +rVal2 );
        //     }else{
        //         System.out.println(" value1 " + rVal1 + " = " + " value2 " +rVal2 );
        //     }
        // }

        // exercise 2
        int i = 5;
        while(true){
            int rVal1 = (int)(Math.random()*10);
            if( rVal1 > rVal2){
                System.out.println(" value1 " + rVal1 + " > " + " value2 " +rVal2 );
            }else if(rVal1 < rVal2){
                System.out.println(" value1 " + rVal1 + " < " + " value2 " +rVal2 );
            }else{
                System.out.println(" value1 " + rVal1 + " = " + " value2 " +rVal2 );
            }
            i++;
            if(i > 10){
                break;
            }
        }        
    }
}
