package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Label lblInvierno,lblVerano,lblPrimavera,lblOtono;
    @FXML
    ImageView imgPrimavera, imgOtono, imgVerano, imgInvierno, diasemana,fondo, imagenNino;
    @FXML
    TextField txtNombre;
    @FXML
    Button btnJugarEstaciones, btnJugarDias;

    public int valor = 5;


    public void evtEstaciones(ActionEvent evt) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Estaciones.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Estaciones");
            stage.initModality(Modality.NONE);
            stage.setScene(new Scene(root1, 600, 750));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void evtDiasSemana(ActionEvent evt) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DiasSemana.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Dias de la Semana");
            stage.setScene(new Scene(root1,600,400));
            stage.show();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }


    public void evtPrimavera (MouseEvent evt){
            valor = 0;
            JOptionPane.showMessageDialog(null,"ESTA SELECCIONADA!!!!");
    }
    public void evtOtono (MouseEvent evt){
        valor = 1;
        JOptionPane.showMessageDialog(null,"ESTA SELECCIONADA!!!!");
    }
    public void evtVerano (MouseEvent evt){
        valor = 2;
        JOptionPane.showMessageDialog(null,"ESTA SELECCIONADA!!!!");
    }
    public void evtInviernoImagen (MouseEvent evt){
        valor = 3;
        JOptionPane.showMessageDialog(null,"ESTA SELECCIONADA!!!!");
    }
    public void evtInvierno (MouseEvent evt){
        if(valor == 0) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(valor == 1) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(valor == 2) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(valor == 3) {
            JOptionPane.showMessageDialog(null, "ES CORRECTO."+"\nFELICITACIONES!!", "GRANDIOSO", JOptionPane.INFORMATION_MESSAGE);
            lblInvierno.setVisible(false);
            imgInvierno.setVisible(false);
            valor = 5;
        }else{
            JOptionPane.showMessageDialog(null,"SELECCIONA UNA IMAGEN","ATENCION",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void evtOtonoLabel (MouseEvent evt){
        if(valor == 0) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(valor == 1) {
            JOptionPane.showMessageDialog(null, "ES CORRECTO" + "\nFELICITACIONES", "GRANDIOSOS", JOptionPane.INFORMATION_MESSAGE);
            lblOtono.setVisible(false);
            imgOtono.setVisible(false);
            valor = 5;
        }else if(valor == 2) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(valor == 3) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"SELECCIONA UNA IMAGEN","ATENCION",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void evtVeranoLabel (MouseEvent evt){
        if(valor == 0) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(valor == 1) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(valor == 2) {
            JOptionPane.showMessageDialog(null, "ES CORRECTO" + "\nFELICITACIONES!!!", "GRANDIOSO", JOptionPane.INFORMATION_MESSAGE);
            lblVerano.setVisible(false);
            imgVerano.setVisible(false);
            valor = 5;
        }else if(valor == 3) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"SELECCIONA UNA IMAGEN","ATENCION",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void evtPrimaveraLabel (MouseEvent evt){
        if(valor == 0) {
            JOptionPane.showMessageDialog(null, "ES CORRECTO" + "\nFELICITACIONES", "GRANDIOSO", JOptionPane.INFORMATION_MESSAGE);
            lblPrimavera.setVisible(false);
            imgPrimavera.setVisible(false);
            valor = 5;
        }else if(valor == 1) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(valor == 2) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if(valor == 3) {
            JOptionPane.showMessageDialog(null, "ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"SELECCIONA UNA IMAGEN","ATENCION",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void evtdia (ActionEvent evt){
        diasemana.setRotate(diasemana.getRotate() + 35);
    }



    public void evtFotoLogin(KeyEvent evt){
        if(evt.getCode() == KeyCode.ENTER){
            if(txtNombre.getText().equals("Jorge Pizarro"));
            Image img = new Image("imagenes/Esau Grageda Barajas.jpeg");
            imagenNino.setImage(img);


        }
    }
    public void evtImageNino(MouseEvent evt){
        btnJugarEstaciones.setDisable(false);
        btnJugarDias.setDisable(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*btnJugarEstaciones.setDisable(true);
        btnJugarDias.setDisable(true);*/
    }
}
