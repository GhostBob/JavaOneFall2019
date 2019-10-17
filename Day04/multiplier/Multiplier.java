
package multiplier;

public class Multiplier {
    
    int value;
    
    public Multiplier() {
        this.value = 1;
    }

    public Multiplier(int value) {
        this.value = value;
    }
    
    public static void main(String[] args) {
        int a = Multiplier.multiply(3, 7);
        double b = Multiplier.multiply(6.0, 1.3, 22.2, 18);
        int c = Multiplier.multiply(1, 2, 3, a);
        int d = Multiplier.multiply(2, 3, 4, 5, 6, 7, 8);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        Multiplier multy = new Multiplier(7);
        Multiplier byThrees = new Multiplier(3);
        int e = multy.multiply(2);
        System.out.println(e);
        int f = byThrees.multiply(3);
        System.out.println(f);
        int g = multiply(multy.value, 14, 82);
        System.out.println(g);
    }
    
    public int multiply(int a) {
        return this.value * a;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static int multiply(int a, int b, int c) {
        return multiply(a, multiply(b, c));
    }
    
    public static int multiply(int a, int b, int c, int d) {
        return a * b * multiply(c, d);
    }
    
    public static int multiply(int a, int b, int c, int d, int ... e) {
        for (int aNum : e) {
            a = a * aNum;
        }
        return a * b * c * d;
    }
    
    public static double multiply(double ... a) {
        int total = 1;
        for (double aNum : a) {
            total *= aNum;
        }
        return total;
    }
}
