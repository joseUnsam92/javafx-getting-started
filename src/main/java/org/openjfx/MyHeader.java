package org.openjfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class MyHeader extends VBox {
    public MyHeader() {getChildren().add(buildMyHeader());}

    public buildMyHeader() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("my_header"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch(IOException exception)
    }
}
