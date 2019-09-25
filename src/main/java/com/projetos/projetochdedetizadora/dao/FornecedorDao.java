
package com.projetos.projetochdedetizadora.dao;

import com.projetos.projetochdedetizadora.model.Fornecedor;
import org.hibernate.Session;


public class FornecedorDao {
      public boolean salvar(Fornecedor fornecedor) {
         try {
             try (Session session = ConexaoBanco.getSessionFactory().openSession()) {
                 session.beginTransaction();
                 session.merge(fornecedor);
                 session.getTransaction().commit();
             }
             System.out.println("Registro gravado com sucesso");
            }catch (Exception erro) {
          System.out.println("Ocorreu o erro:" + erro);
        }  
        return false;

    
}}
