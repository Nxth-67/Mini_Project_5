public class Main extends javafx.application.Application {

    @Override
    public void start(javafx.stage.Stage stage) throws Exception {
        var view_main = getClass().getResource("scene_main/View_main.fxml");
        var controller_main = new scene_main.Controller();

        var loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(view_main);
        loader.setController(controller_main);

        var scene = new javafx.scene.Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
