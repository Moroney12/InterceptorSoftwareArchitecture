/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interceptorcdplayer;

/**
 *
 * @author adam_
 */
//The CDPlayerDispatcher class represents the Dispatcher.
//CdPlayerDispatcher can be represented as a class, 
//that is responsible for managing the execution flow of the program and coordinating the interaction between the interceptors and context objects
public class CdPlayerDispatcher {

    private Interceptor interceptor;

    public CdPlayerDispatcher(Interceptor powerInterceptor) {
        this.interceptor = powerInterceptor;
    }

    public void dispatch(CdPlayerContext context) {
        interceptor.execute(context);
    }
}
