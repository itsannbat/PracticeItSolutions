public class factorial {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
