

package scene_main;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button goto_input;

    @FXML
    private Button goto_output;

    @FXML
    private Label label_result;

    @FXML
    void on_input(ActionEvent event) throws IOException {

        var stage = (Stage) label_result.getScene().getWindow();
        
        var view_input = getClass().getResource("/scene_input/View.fxml");
        var controller_input = new scene_input.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_input);
        loader.setController(controller_input);

        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void on_output(ActionEvent event) throws IOException {
        var stage = (Stage) label_result.getScene().getWindow();
        
        var view_output = getClass().getResource("/scene_output/View.fxml");
        var controller_output = new scene_output.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_output);
        loader.setController(controller_output);

        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }

}
