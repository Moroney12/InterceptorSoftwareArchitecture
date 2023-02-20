/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interceptorcdplayer;

/**
 *
 * @author adam_
 */
//The PowerInterceptorImpl class represents the Concrete Interceptor.
//ConcreteInterceptor can be represented as a class that implements the Interceptor interface, which performs the actual interception.
public class ConcreteInterceptor implements Interceptor {

    public void execute(CdPlayerContext context) {
        if (context.getState() == CdPlayerState.ON) {
            System.out.println("Turning CD Player off");
            context.setState(CdPlayerState.OFF, null);
        } else {
            System.out.println("Turning CD Player on");
            context.setState(CdPlayerState.ON, context.getPlayingCD());
        }
    }
}
