/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interceptorcdplayer;

/**
 *
 * @author adam_
 */
public interface Observer {
    void update(CdPlayerState state, String currentCD);
}
