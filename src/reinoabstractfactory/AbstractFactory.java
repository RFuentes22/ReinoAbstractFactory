/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinoabstractfactory;
import reinoabstractfactory.FactoryElfos.Elfos;
import reinoabstractfactory.FactoryOrcos.Orcos;
/**
 *
 * @author R.Fuentes
 */

    public interface AbstractFactory {
    Orcos getOrcos(String type);
    Elfos getElfos(String type);
}

