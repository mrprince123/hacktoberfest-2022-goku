// Most comman Java Patten

public class JavaPattern {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Reverse Order
        for (int k = 1; k <= 5; k++) {
            for (int l = 5; l >= k; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Same thing using the number
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

    }
}