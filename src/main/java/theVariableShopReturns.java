public class theVariableShopReturns {
    public static void main(String[] args) {

        byte smallNumber = 127;
        short largerNumber = 32767;
        int evenLargerNumber = 2147483647;
        long evenLargererNumber = 9223372036854775807L;
        float decimalNumber = 3.14F;
        double moreDecimalNumbers = 3.14;
        boolean trueOrFalse = false;
        char letter = 'A';
        String letters = "A string of characters";

        smallNumber = 100;
        largerNumber = 30000;
        evenLargerNumber = 2000000000;
        evenLargererNumber = 9000000000000L;
        decimalNumber = 3.99F;
        moreDecimalNumbers = 3.99;
        trueOrFalse = true;
        letter = 'B';
        letters = "A longer string of characters.";

        System.out.println(smallNumber);
        System.out.println(largerNumber);
        System.out.println(evenLargerNumber);
        System.out.println(evenLargererNumber);
        System.out.println(decimalNumber);
        System.out.println(moreDecimalNumbers);
        System.out.println(trueOrFalse);
        System.out.println(letter);
        System.out.println(letters);
    }
}
