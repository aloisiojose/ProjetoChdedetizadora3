
package com.projetos.projetochdedetizadora.dao;

import com.projetos.projetochdedetizadora.model.Cliente;
import org.hibernate.Session;


public class ClienteDao {
     public void salvar(Cliente cliente) {
    
         try {
             try (Session session = ConexaoBanco.getSessionFactory().openSession()) {
                 session.beginTransaction();
                 session.merge(cliente);
                 session.getTransaction().commit();
             }
            System.out.println("Registro gravado com sucesso");
             }catch (Exception erro) {
          System.out.println("Ocorreu o erro:" + erro); 
            } 
        }   
}
