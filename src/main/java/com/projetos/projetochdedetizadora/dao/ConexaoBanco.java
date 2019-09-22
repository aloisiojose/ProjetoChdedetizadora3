package com.projetos.projetochdedetizadora.dao;

import com.projetos.projetochdedetizadora.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConexaoBanco {
    private static SessionFactory conexao = null;
    private static Configuration configuracao;
    
    private static SessionFactory buildSessionFactory(){
        //---> CRIAR OBJETO PARA ARMAZENAR AS CONFIGURAÇOES DE CONEXÃO
        configuracao = new Configuration().configure();
        
        //---> CONFIGURANDO USUARIO E SENHA PARA ACESSO AO BD
        configuracao.setProperty("hibernate.connection.username", "root");
        configuracao.setProperty("hibernate.connection.password", "");
        
        //---> INDICANDO O MAPEAMENTO DAS CLASSES
        //String caminhoPacote = "com.projetos.controleestoqueloja.model";
        configuracao.addPackage("com.projetos.projetochdedetizadora.model").addAnnotatedClass(Cidade.class);
        configuracao.addPackage("com.projetos.projetochdedetizadora.model").addAnnotatedClass(Cliente.class);
        configuracao.addPackage("com.projetos.projetochdedetizadora.model").addAnnotatedClass(Fornecedor.class);
        configuracao.addPackage("com.projetos.projetochdedetizadora.model").addAnnotatedClass(Funcionario.class);
        configuracao.addPackage("com.projetos.projetochdedetizadora.model").addAnnotatedClass(OrdemServico.class);
        configuracao.addPackage("com.projetos.projetochdedetizadora.model").addAnnotatedClass(Produto.class);
        configuracao.addPackage("com.projetos.projetochdedetizadora.model").addAnnotatedClass(Usuario.class);

        
        //---> SESSIONFACTORY RECEBE A CONSTRUÇÃO DA SESSÃO DE CONEXÃO COM BANCO DE DADOS
        conexao = configuracao.buildSessionFactory();

        return conexao;
    }
    
    public static SessionFactory getSessionFactory(){
        //verifica se há uma conexão
        if(conexao == null){
            conexao = buildSessionFactory();
        }
        return conexao;
    }    
}
