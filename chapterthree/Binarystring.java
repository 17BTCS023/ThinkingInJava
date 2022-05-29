package thinkinginjava.chapterthree;

public class Binarystring {

    public static void main(String[] args) {
        int i = +5;
        int j = -5;
        int value = 0;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));

        // Bitwise OR 
        value = 10 | 11 ;
        System.out.println(Integer.toBinaryString(value));
        //   1010
        // | 1011
        //--------
        //   1011

        // Bitwise AND
        value = 10 & 11;
        System.out.println(Integer.toBinaryString(value));
        //   1010
        // & 1011
        //----------
        //   1010

        // Bitwise NOT
        value = ~5;
        System.out.println("Negavtive value of 5: " + Integer.toBinaryString(value));
        //  ~ 0101
        // ---------
        // 1111010

        value = ~ (-5);
        System.out.println(Integer.toBinaryString(value));
        //  ~ 111010
        //         1
        // ---------
        //    000101
        //         1
        //----------
        // 
        // Bitwise XOR 
        value = 6 ^ 5;
        System.out.println(Integer.toBinaryString(value));
        //   110
        // ^ 101
        //-----------
        //   011



    }
    
}
