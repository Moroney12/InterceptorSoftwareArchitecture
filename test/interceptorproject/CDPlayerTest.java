/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package interceptorproject;

import interceptorcdplayer.CdPlayerDispatcher;
import interceptorcdplayer.CdPlayerState;
import interceptorcdplayer.ConcreteInterceptor;
import interceptorcdplayer.Interceptor;
import interceptorcdplayer.CdPlayerContext;
import interceptorcdplayer.CdPlayerSubject;
import interceptorcdplayer.LoggingInterceptor;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author adam_
 */
//This test verifies that the CD player can be turned on and off successfully.
public class CDPlayerTest {

    @Test
    public void testOnOffButtons() {
        CdPlayerSubject subject = new CdPlayerSubject();
        Interceptor powerInterceptor = new ConcreteInterceptor();
        LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
        CdPlayerDispatcher dispatcher = new CdPlayerDispatcher(powerInterceptor, loggingInterceptor);
        CdPlayerContext context = new CdPlayerContext(subject);

        context.setState(CdPlayerState.OFF, null);
        dispatcher.dispatch(context);
        assertEquals(CdPlayerState.ON, context.getState());
        assertEquals(null, context.getPlayingCD());

        context.setState(CdPlayerState.ON, null);
        dispatcher.dispatch(context);
        assertEquals(CdPlayerState.OFF, context.getState());
        assertEquals(null, context.getPlayingCD());
    }

}
