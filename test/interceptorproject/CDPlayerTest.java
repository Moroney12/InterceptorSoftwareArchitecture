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
    CdPlayerContext context = new CdPlayerContext();
    Interceptor powerInterceptor = new ConcreteInterceptor();
    CdPlayerDispatcher dispatcher = new CdPlayerDispatcher(powerInterceptor);

    context.setState(CdPlayerState.OFF);
    dispatcher.dispatch(context);
    assertEquals(CdPlayerState.ON, context.getState());

    context.setState(CdPlayerState.ON);
    dispatcher.dispatch(context);
    assertEquals(CdPlayerState.OFF, context.getState());
  }

}