/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interceptorcdplayer;

/**
 *
 * @author adam_
 */
public class InterceptorCdPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CdPlayerContext context = new CdPlayerContext();

        context.setState(CdPlayerState.OFF);
        System.out.println("CD Player is " + context.getState());

        context.setState(CdPlayerState.ON);
        System.out.println("CD Player is " + context.getState());
    }

}
