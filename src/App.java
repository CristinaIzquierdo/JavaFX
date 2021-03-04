import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import uml.Client;

public class App extends Application {

	private static Stage stg;

    // Used to pass data between scenes
    public static Object data;

    public static ArrayList<Client> clientes = new ArrayList<Client>(
            Arrays.asList(
			new Client(0, "Cristina", "Izquierdo Gallego", "976976985", "cristina@gmail.com"),
			new Client(1, "Mario", "Sanchez", "456487878", "mario@gmail.com"),
            new Client(2, "Sara", "Marqués Solas", "123456789", "saramarques@gmail.com")
	));


    @Override
    public void start(Stage primaryStage){
        try {
            
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

			Scene scene = new Scene(root);	
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			scene.setFill(Color.TRANSPARENT);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
			e.printStackTrace();
        }

    }


    public Stage getStg() {
		return stg;
	}

    
	public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
        data = null;

    }

    public void changeScene(String fxml, Object data) throws IOException {
		this.data = data;
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

  
	public static void main(String[] args) {
		launch(args);
	}
}
    

