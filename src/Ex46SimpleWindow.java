import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;

public class Ex46SimpleWindow extends Application {
    @Override
    public void start(Stage stage){
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Difficult Window");
        stage.setScene(scene);
        stage.show();
    }

    public static void main( String[] args ) {
        launch(args);
    }
}
