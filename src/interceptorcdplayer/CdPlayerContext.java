/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interceptorcdplayer;

/**
 *
 * @author adam_
 */
//The CDPlayerContext class represents the Context Object.
//This can be represented as an object, for example, CdPlayerContext, 
//that contains information about the state of the program and provides context for the interceptors to operate in.
public class CdPlayerContext {

    private CdPlayerState state;

    public CdPlayerState getState() {
        return state;
    }

    public void setState(CdPlayerState state) {
        this.state = state;
    }
}
