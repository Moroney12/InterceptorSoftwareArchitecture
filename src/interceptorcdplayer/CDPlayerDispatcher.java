/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interceptorcdplayer;

/**
 *
 * @author adam_
 */
public class CdPlayerDispatcher {

    private Interceptor interceptor;

    public CdPlayerDispatcher(Interceptor powerInterceptor) {
        this.interceptor = powerInterceptor;
    }

    public void dispatch(CdPlayerContext context) {
        interceptor.execute(context);
    }
}
