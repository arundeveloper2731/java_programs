/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserSession;

/**
 *
 * @author Arun Ak
 */
public class Main {
    public static void main(String[] args) {
        UserSession session1 = UserSession.getInstance();
        session1.setUser("Ak");

        UserSession session2 = UserSession.getInstance();
        session2.showUser();

        System.out.println(session1 == session2);
    }
         
}
