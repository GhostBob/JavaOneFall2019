package javaapplication124;

public class JavaApplication124 {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,66,82,101,123,321};
        int[] array2 = {2,3,4,5,6,7,8};
        
        int[] ret1 = doubleIt(array1);
        int[] ret2 = doubleIt(array2);
        
        printIt(ret1);
        printIt(ret2);
    }
    
    public static int[] doubleIt(int[] a) {
        int[] b = new int[a.length];
        for(int i=0; i<a.length;++i) {
            b[i] = a[i] * 2;
        }
        return b;
    }
    
    public static void printIt(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println("\n");
    }
    
}
