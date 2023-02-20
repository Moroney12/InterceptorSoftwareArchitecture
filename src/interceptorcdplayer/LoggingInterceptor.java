/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interceptorcdplayer;

/**
 *
 * @author adam_
 */
public class LoggingInterceptor implements Interceptor{
    public void execute(CdPlayerContext context) {
        System.out.println("Current state: " + context.getState() + ", Current CD: " + context.getPlayingCD());
    }
}
