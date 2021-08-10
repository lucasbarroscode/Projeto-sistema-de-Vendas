package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class FuncionariosDAO {
   
    //CONEXAO
    private Connection con;
    
    public FuncionariosDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    //METODO CADASTRAR FUNCIONARIO
    public void cadastrarFuncionarios(Funcionarios obj){
        
        try {
            
            //Criar Comando sql
            String sql = "insert into tb_funcionarios(nome,rg,cpf,email,senha,cargo,nivel_acesso,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                        + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            //Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());
            
            //Executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com Sucesso!");
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Funcionario" + erro);
            
        }
         
    }
    
    
    
}
