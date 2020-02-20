/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;
/**
 *
 * @author paul.kline
 */
import com.pauliankline.floopyconnector.Floopy;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

Floopy floop = new Floopy(new ConcreteController()); 
//replace ConcreteController with your controller.
floop.begin(6); //6 being the number of heroes.

    }
    
}
