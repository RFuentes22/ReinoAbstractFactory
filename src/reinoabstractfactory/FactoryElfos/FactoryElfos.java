/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinoabstractfactory.FactoryElfos;
import reinoabstractfactory.FactoryOrcos.Orcos;
import reinoabstractfactory.AbstractFactory;
/**
 *
 * @author R.Fuentes
 */
public class  FactoryElfos implements AbstractFactory{
    @Override
    public Orcos getOrcos(String type) {
        return null;
    }

    @Override
    public Elfos getElfos(String type) {
        switch (type) {
            case "arquero":
                return new Arquero();
            case "mago":
                return new Mago();
            case "ReyElfo":
                return new ReyElfo();
        }
        return null;
    }
}