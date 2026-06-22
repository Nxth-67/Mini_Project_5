

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
    void on_input(ActionEvent event) {

    }

    @FXML
    void on_output(ActionEvent event) throws IOException {
        var stage = (Stage) label_result.getScene().getWindow();
        
        var view_ouptut = getClass().getResource("scene_output/View_output.fxml");
        var controller_output = new scene_output.Controller();



        var loader = new FXMLLoader();
        loader.setLocation(view_ouptut);
        loader.setController(controller_output);

        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }

}
