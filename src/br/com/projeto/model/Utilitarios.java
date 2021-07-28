
package br.com.projeto.model;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class Utilitarios {
    
    //metodo de limpar campos
    public void limpaTela(JPanel container){
        Component components[] = container.getComponents();
        for(Component component: components){
            if (component instanceof JTextField){
                ((JTextField)component).setText(null);
            }
        }
        
    }
    
}
