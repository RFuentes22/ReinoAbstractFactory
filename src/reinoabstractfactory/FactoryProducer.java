/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinoabstractfactory;
import reinoabstractfactory.FactoryElfos.FactoryElfos;
import reinoabstractfactory.FactoryOrcos.FactoryOrcos;
/**
 *
 * @author R.Fuentes
 */
public class FactoryProducer {
  public static AbstractFactory getFactory(String type) {
      switch (type){
          case "elfos":
              return new FactoryElfos();
          case "orcos":
              return new FactoryOrcos();
      }
      return null;
  }
}
