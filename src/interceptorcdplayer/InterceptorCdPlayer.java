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
        CdPlayerSubject subject = new CdPlayerSubject();
        ConcreteInterceptor powerInterceptor = new ConcreteInterceptor();
        LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
        CdPlayerDispatcher dispatcher = new CdPlayerDispatcher(powerInterceptor,loggingInterceptor);      
        CdPlayerContext context = new CdPlayerContext(subject);

        context.setState(CdPlayerState.OFF, null);
        dispatcher.dispatch(context);
        System.out.println("CD Player is " + context.getState());

        context.setPlayingCD("U2");
        context.setState(CdPlayerState.ON, context.getPlayingCD());
        dispatcher.dispatch(context);
        System.out.println("CD Player is " + context.getState());
    }

}
