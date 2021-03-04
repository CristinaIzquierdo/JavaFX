import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    public LoginController() {

    }

    @FXML
    private Button closeButton;

    @FXML
    private Button loguearse;

    @FXML
    private Label olvidarPass;

    @FXML
    private TextField nombreUsuario;

    @FXML
    private PasswordField constrasenya;


    @FXML
    public void loguearUsuario(ActionEvent event) throws IOException {
        loguearCorrecto();
    }


    @FXML
    private void closeButtonAction(){
      
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
        
    }


    @FXML
    private void olvidadaPassAction(ActionEvent event) throws IOException{
      
        App app = new App();
    	app.changeScene("PasswordOlvidada.fxml");
        app.getStg().setTitle("Olvidé la contraseña"); 
    }

    @FXML
    private void loguearCorrecto() throws IOException {
        App app = new App();

        if (nombreUsuario.getText().toString().equals("Cristina") && constrasenya.getText().toString().equals("cristina")) {
                    
           app.changeScene("Principal.fxml");
        }
    }
   
    
}
