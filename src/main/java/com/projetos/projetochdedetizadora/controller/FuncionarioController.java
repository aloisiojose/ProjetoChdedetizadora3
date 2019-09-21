/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetos.projetochdedetizadora.controller;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Silvia Manso
 */
public class FuncionarioController implements Initializable {

    @FXML
    private HBox hbTopo;
    @FXML
    private ImageView imgViewTitulo;
    @FXML
    private HBox hbBase;
    @FXML
    private Button btnNovo;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnExcluir;
    @FXML
    private TableView<?> tableView;
    @FXML
    private JFXTextField tfId;
    @FXML
    private JFXTextField tfDescricao;
    @FXML
    private JFXTextField tfPesquisar;
    @FXML
    private CheckBox chAtivo;
    @FXML
    private JFXTextField tfFuncao;
    @FXML
    private JFXTextField tfStatus;
    @FXML
    private Label lbFuncionario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void novoRegistro(ActionEvent event) {
    }

    @FXML
    private void salvarRegistro(MouseEvent event) {
    }

    @FXML
    private void salvarRegistro(ActionEvent event) {
    }

    @FXML
    private void excluirRegistro(ActionEvent event) {
    }
    public static void main(String[] args) {
        
    }  
     
 }

