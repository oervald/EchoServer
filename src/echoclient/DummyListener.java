/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package echoclient;

/**
 *
 * @author Henrik
 */
public class DummyListener implements EchoListener {
    @Override
    public void messageArrived(String m){
        System.out.println("DummyListener says: " + m);
    }
    
}
