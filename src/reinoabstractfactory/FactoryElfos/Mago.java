/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinoabstractfactory.FactoryElfos;

/**
 *
 * @author R.Fuentes
 */
public class Mago implements Elfos{
    @Override
    public void ataque() {
        System.out.println("Mago ataca");
    }
    
}