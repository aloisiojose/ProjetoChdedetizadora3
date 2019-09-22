package com.projetos.projetochdedetizadora.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TelaPrincipalController implements Initializable {

    @FXML private HBox hb_top;
    @FXML private MenuBar barraDeMenu;
    @FXML private Menu menuCadastro;
    @FXML private MenuItem menuItemCidades;
    @FXML private MenuItem menuItemClientes;
    @FXML private MenuItem menuItemFornecedores;
    @FXML private MenuItem menuItemFuncionarios;
    @FXML private MenuItem menuItemProdutos;
    @FXML private MenuItem menuItemUsuarios;
    @FXML private MenuItem menuItemSair;
    @FXML private Menu menuOrdemServico;
    @FXML private MenuItem menuItemGerenciarOs;
    @FXML private Menu menuRelatorios;
    @FXML private MenuItem menuItemClientesGeral;
    @FXML private MenuItem menuItemClientesEndTelefone;
    @FXML private Menu menuSobre;
    @FXML private MenuItem menuItemSistema;
    @FXML private HBox hb_bottom;

        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //INSERINDO ÍCONES NOS MENUS.
        menuItemCidades.setGraphic(new ImageView("/icons/icon_cidade32.png"));
        menuItemClientes.setGraphic(new ImageView("/icons/icon_clientes32.png"));
        menuItemFornecedores.setGraphic(new ImageView("/icons/icon_forn32.png"));
        menuItemFuncionarios.setGraphic(new ImageView("/icons/icon_func32.png"));
        menuItemProdutos.setGraphic(new ImageView("/icons/icon_produto32.png"));
        menuItemUsuarios.setGraphic(new ImageView("/icons/icon_user48.png"));
        menuItemSair.setGraphic(new ImageView("/icons/icon_sair32.png"));
        
        menuItemGerenciarOs.setGraphic(new ImageView("/icons/icon_ordemServico32.png"));
        
        menuItemClientesGeral.setGraphic(new ImageView("/icons/icon_relatorio32.png"));
        menuItemClientesEndTelefone.setGraphic(new ImageView("/icons/icon_relatorio32.png"));
        
        menuItemSistema.setGraphic(new ImageView("/icons/icon_info32.png"));
    }    

    @FXML
    private void acessarCidades(ActionEvent event) {
        abrirFormulario("Cidade_view");
    }

    @FXML
    private void acessarClientes(ActionEvent event) {
        abrirFormulario("Cliente_view");
    }

    @FXML
    private void acessarFornecedores(ActionEvent event) {
        abrirFormulario("Fornecedor_view");
    }

    @FXML
    private void acessarFuncionarios(ActionEvent event) {
        abrirFormulario("Funcionario_view");
    }

    @FXML
    private void acessarProdutos(ActionEvent event) {
         abrirFormulario("Produto_view");
    }

    @FXML
    private void acessarUsuarios(ActionEvent event) {
        abrirFormulario("Usuario_view");
    }

    @FXML
    private void acessarSair(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

    @FXML
    private void acessarGerenciarOs(ActionEvent event) {
        abrirFormulario("OrdemDeServico_view");
    }

    @FXML
    private void acessarRelClientesGeral(ActionEvent event) {
    }

    @FXML
    private void acessarRelClientesEndTelefone(ActionEvent event) {
    }

    @FXML
    private void acessarSistema(ActionEvent event) {
    }
    
    public void abrirFormulario(String formulario) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/"+formulario+".fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            
            stage.setTitle("Formulario");
            stage.setResizable(false);
            stage.initStyle(StageStyle.UTILITY); //Simplifica a tela do formúlario, deixando apenas o btn x no titulo
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException ex) {
             System.out.println("Erro:" + ex);
        }
    }
}
