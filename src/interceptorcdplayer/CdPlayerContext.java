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
//CdPlayerContext can be represented as an object 
//that contains information about the state of the program and provides context for the interceptors to operate in.
public class CdPlayerContext implements Observer {
    private CdPlayerSubject subject;
    private String playingCD;

    
    public CdPlayerContext(CdPlayerSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public CdPlayerState getState() {
        return subject.getState();
    }

    public String getPlayingCD() {
        return playingCD;
    }

    public void setPlayingCD(String playingCD) {
        this.playingCD = playingCD;
    }
    
    public void setState(CdPlayerState state, String cd) {
        subject.setState(state, cd);
    }

    @Override
    public void update(CdPlayerState state, String playingCD) {
        System.out.println("CD Player state changed to " + state);
        if (playingCD != null) {
            System.out.println("Now playing CD: " + playingCD);
        }
    }
}

