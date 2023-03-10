/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interceptorcdplayer;

/**
 *
 * @author adam_
 */
//The Interceptor interface represents the Interceptor.
//Interceptor can be represented as an interface in the program, which defines the interception behavior for events.
public interface Interceptor {

    void execute(CdPlayerContext context);
}
