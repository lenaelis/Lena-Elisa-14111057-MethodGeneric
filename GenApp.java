/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class GenApp {
    private static <T> void printArray(T[] a) {
        for (Objet o : a) {
            System.out.println(o);
        }
    }
    public static void main (String[] Args) {
        Integer iArr[] = new Integer[3];
        iArr [0] = 10;
        iArr [1] = 20;
        iArr [2] = 30;
        printArray(iArr);
        
        String sArr[] = new String[3];
        sArr[0]= "Sepuluh";
        sArr[1]= "Dua Puluh";
        sArr[2]= "Tiga Puluh";
        printArray(sArr);
        
        Character cArr[] = new Character[3];
        cArr[0] = 'X';
        cArr[1] = 'Y';
        cArr[2] = 'Z';
        printArray(cArr);
        
        Boolean bArr[]= new Boolean[3];
        bArr[0] = true;
        bArr[1] = true;
        bArr[2] = false;
        printArray(bArr);
        
        Double dArr[] = new Double[3];
        dArr[0] = 1.23;
        dArr[1] = 4.56;
        dArr[2] = 7.89;
        printArray(dArr);
        
    }
    
    
}
