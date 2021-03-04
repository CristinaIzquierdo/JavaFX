import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;

 

public class PasswordOlvidadaController{

    public void actionBack(ActionEvent ae) throws IOException {
		App app = new App();
		app.changeScene("Login.fxml");
	}
	
	public void actionResetPassword(ActionEvent ae) throws IOException {
        App app = new App();
		app.changeScene("Login.fxml");
	}

	
    
}
