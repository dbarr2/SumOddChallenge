public class SumOdd {

    public static void main(String[] args) {

        System.out.println("Result of sumOdd is: " + sumOdd(-1, 8)); //Expected outcome ==> -1
        System.out.println("Result of sumOdd is: " + sumOdd(1, 11)); //Expected outcome ==> 36
        System.out.println("Result of sumOdd is: " + sumOdd(1, 100)); //Expected outcome ==> 2500

    }

    //Check to see if the value isOdd
    public static boolean isOdd(int val) {

        if (val < 0) {
            return false;
        }
        return val % 2 != 0;
    }

    //Method to add all values that are odd from the specified start and end
    public static int sumOdd(int start, int end) {
        int sum = 0;

        if(start < 0 || end < 0) {
            return -1;
        }

        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;

    }

}
