/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JFrame;

/**
 *
 * @author RCR
 */
public class AuthView {
    private static boolean isAutenticado = false;
//    private static boolean isAuthInsert = false;
//    private static boolean isAuthRemove = false;
//    private static boolean isAuthUpdate = false;
//    private static boolean isAuthSelect = false;
//    
        
    public static boolean isAutenticado() {
        return isAutenticado;
    }
    
    public static void changeAutenticado() {
        if(isAutenticado) {
            isAutenticado = false;
        } else {
            isAutenticado = true;
        }           
    }
    
    public AuthView() {
    
    }
    
    public static void authenticator(JFrame view) {
           if(isAutenticado) {
               view.setVisible(true);
           } else {
               System.out.println("Not authenticated.");

           }
    }
}
