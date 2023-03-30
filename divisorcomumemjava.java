public class MDC {
    public static int calcularMDC(int a, int b) {
        
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int mdc = calcularMDC(a, b);
        System.out.println("O MDC de " + a + " e " + b + " é " + mdc);
    }
}
