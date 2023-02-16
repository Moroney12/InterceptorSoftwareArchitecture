/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interceptorcdplayer;

/**
 *
 * @author adam_
 */
public class CdPlayerContext {

    private CdPlayerState state;

    public CdPlayerState getState() {
        return state;
    }

    public void setState(CdPlayerState state) {
        this.state = state;
    }
}
