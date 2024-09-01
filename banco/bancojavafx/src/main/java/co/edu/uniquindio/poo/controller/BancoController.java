package co.edu.uniquindio.poo.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BancoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField txCodigo;

    @FXML
    private TextField txDescripcion;

    @FXML
    private TextField txEstado;

    @FXML
    private TextField txFecha;

    @FXML
    private TextField txValor;

    @FXML
    void aceptarTransaccion(ActionEvent event) {
        System.out.println("Transaccion aceptad");

    }

    @FXML
    void cancelarTransaccion(ActionEvent event) {
        System.out.println("Transaccion cancelada");

    }

    @FXML
    void initialize() {
        

    }

}