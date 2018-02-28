package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class Controller {
    @FXML
    private BorderPane RubricPane, AssignmentsPane;

    //Sets the Assignments Page to disabled and invisible while setting the Rubric Page to visible and enabled
    public void showRubric(){
        RubricPane.setVisible(true);
        RubricPane.setDisable(false);
        AssignmentsPane.setVisible(false);
        AssignmentsPane.setDisable(true);
    }

    //Sets the Rubric Page to disabled and invisible while setting the Assignments Page to visible and enabled
    public void closeRubric(){
        RubricPane.setVisible(false);
        RubricPane.setDisable(true);
        AssignmentsPane.setVisible(true);
        AssignmentsPane.setDisable(false);
    }
}
