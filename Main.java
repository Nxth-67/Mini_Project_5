
import java.io.IOException;
import java.net.URL;


public class Main extends javafx.application.Application {

        public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(javafx.stage.Stage stage) throws IOException {
        var view_main = getClass().getResource("/scene_main/View.fxml");
        var controller_main = new scene_main.Controller();

        var loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(view_main);
        loader.setController(controller_main);

        var scene = new javafx.scene.Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }ss
    
}
