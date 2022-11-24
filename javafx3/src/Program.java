import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Program extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
               
    }
    public static void main(String[] args) throws Exception{
        launch(args); 
    }
}
