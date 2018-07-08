/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragaman;

import java.util.Scanner;

/**
 *
 * @author zhuang001
 */
public class Ragaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        char[] chars=sc.nextLine().toCharArray();
        char[] wcChars = sc.nextLine().toCharArray();
        
        if (wcChars.length != chars.length) {
            System.out.println("N");
            return;
        }
        
        for (char c:wcChars) { 
            if (c=='*') continue;
            boolean found=false;
            for (int i=0;i<chars.length;i++) {
                if (chars[i]==c) {
                    chars[i]=0;
                    found=true;
                    break;
                }
            }
            if (!found) {
                System.out.println("N");
                return;
            }
        } 
        System.out.print("A");
    }
    
}
