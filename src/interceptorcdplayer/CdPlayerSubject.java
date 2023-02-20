/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interceptorcdplayer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam_
 */
public class CdPlayerSubject {
    private CdPlayerState state;
    private String currentCD;
    private List<Observer> observers = new ArrayList<>();

    public CdPlayerState getState() {
        return state;
    }

    public void setState(CdPlayerState state, String cd) {
        this.state = state;
        this.currentCD = cd;
        notifyObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state, currentCD);
        }
    }
}
