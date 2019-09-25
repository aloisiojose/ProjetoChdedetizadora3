
package com.projetos.projetochdedetizadora.dao;

import com.projetos.projetochdedetizadora.model.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class ClienteDao {
    
    public void salvar(Cliente cliente) {
        try {
            Session session = ConexaoBanco.getSessionFactory().openSession();
            session.beginTransaction();
            session.merge(cliente);
            session.getTransaction().commit();
            System.out.println("Registro gravado com sucesso");
        }catch (HibernateException erro) {
            System.out.println("Ocorreu o erro:" + erro); 
        } 
    } 
     public void excluir(Cliente cliente) {
        try {
            Session session = ConexaoBanco.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(cliente);
            session.getTransaction().commit();
            session.close();
            System.out.println("Registro foi excluído com sucesso!");
        } catch (HibernateException erro) {
            System.out.println("Ocorreu o erro: " + erro);
        }
    }
}
