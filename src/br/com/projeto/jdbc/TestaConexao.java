package br.com.projeto.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class TestaConexao {
    
    public static void main(String[] args) {
        
        try {
            
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Ops aconteceu um erro" + erro);
            
        }
        
    }
    
}
