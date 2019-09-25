
package com.projetos.projetochdedetizadora.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import static com.projetos.projetochdedetizadora.controller.TelaPrincipalController.icone;
import static com.projetos.projetochdedetizadora.controller.TelaPrincipalController.titulo;
import com.projetos.projetochdedetizadora.dao.CidadeDao;
import com.projetos.projetochdedetizadora.model.Cidade;
import com.projetos.projetochdedetizadora.util.UF;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class CidadeController implements Initializable, ICadastro {

    @FXML private HBox hbTopo;
    @FXML private ImageView imgViewTitulo;
    @FXML private Label lblTitulo;
    @FXML private HBox hbBase;
    @FXML private Button btnNovo;
    @FXML private Button btnSalvar;
    @FXML private Button btnExcluir;
    @FXML private TableView<Cidade> tableView;
    @FXML private JFXTextField tfId;
    @FXML private JFXTextField tfPesquisar;
    @FXML private CheckBox chAtivo;
    @FXML private JFXTextField tfCep;
    @FXML private JFXTextField tfDescricao;
    @FXML private JFXComboBox<String> cbUf;
    
    //variáveis para uso "interno" da classe
    private CidadeDao dao = new CidadeDao();
    private Cidade objetoSelecionado = new Cidade();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //-----> Configuração da barra de título do form
        lblTitulo.setText("CADASTRO DE "+ toUpperCase(titulo));
        Image img = new Image(icone);
        imgViewTitulo.setImage(img);
        
        //----> CARREGAMENTO DO COMBOBOX UF
        cbUf.setItems(UF.gerarUF());

    }    

    @FXML
    private void novoRegistro(ActionEvent event) {
    }

    @FXML
    private void salvarRegistro(ActionEvent event) {
        Cidade objeto = new Cidade();
        
        //testa se o objeto não está vazio
        if (objetoSelecionado != null) {
            objeto.setId(objetoSelecionado.getId());
        }
        
        //capturando os dados dos componentes da tela
        objeto.setDescricao(tfDescricao.getText());
        objeto.setCep(Long.parseLong(tfCep.getText()));
        objeto.setUf(cbUf.getValue()); //valor do combobox
        
        if (chAtivo.isSelected()){
            objeto.setStatus(true);
        } else {
            objeto.setStatus(false);
        }
        
        //verifica o retorno do método salvar.
        dao.salvar(objeto);
        
        atualizarTabela();
        limparCamposFormulario();
    }

    @FXML
    private void excluirRegistro(ActionEvent event) {
    }

    @Override
    public void criarColunasTabela() {
    }

    @Override
    public void atualizarTabela() {
    }

    @Override
    public void setCamposFormulario() {
    }

    @Override
    public void limparCamposFormulario() {
    }
}
