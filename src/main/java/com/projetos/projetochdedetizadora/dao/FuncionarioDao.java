
package com.projetos.projetochdedetizadora.dao;

import com.projetos.projetochdedetizadora.model.Funcionario;
import org.hibernate.Session;


public class FuncionarioDao {
      public boolean salvar(Funcionario funcionario) {
         try {
             try (Session session = ConexaoBanco.getSessionFactory().openSession()) {
                 session.beginTransaction();
                 session.merge(funcionario);
                 session.getTransaction().commit();
             }
             System.out.println("Registro gravado com sucesso");
            }catch (Exception erro) {
          System.out.println("Ocorreu o erro:" + erro);
        }  
        return false;
    
}}
