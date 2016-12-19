/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primo2;

/**
 *
 * @author dfernandezrivas
 */
public class Primo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int med = i / 2;
            boolean alto = false;
            while (med > 1) {
                int mod = i % med;
                med--;
                if (mod == 0) {
                    System.out.println(i + " NO ES PRIMO.");
                    alto = true;
                    break;
                }
            }
            if (med == 1 && alto == false) {
                System.out.println(i + " SI ES PRIMO.");
            }
        }
    }

}
    
    

