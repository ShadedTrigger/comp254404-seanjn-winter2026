public class RecursiveProduct {
    /** Returns the product of given positive integers m and n. */
    public static int GetProduct(int m, int n) {
        // Check they are both positive
        if (m <= 0 || n <= 0)
            throw new IllegalArgumentException("Arguments m and n must be positive.");
        // No more adding, return the running total
        if (n == 1)
            return m;
        // Add up the running total n times
        else
            return m + GetProduct(m, n-1);
    }

    public static void main(String[] args) {
        System.out.println("Product of 12 and 12: " + GetProduct(12, 12));
        System.out.println("Product of 5 and 7: " + GetProduct(5, 7));
        System.out.println("Product of 4 and 3: " + GetProduct(4, 3));
        System.out.println("Product of 1521 and 425: " + GetProduct(1521, 425));
        System.out.println("Product of 1521 and 425: " + GetProduct(1521, 425));
    }
}
