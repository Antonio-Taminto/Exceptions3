public class Main {
    public static void main(String[] args) {
        checkDivision(3,0);
    }
    public static void checkDivision(int dividend , int divisor){
        try {
            int result = dividend / divisor;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("non puoi dividere per 0");
        }

    }
}