package akreatailshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Stack;
import javafx.scene.Parent;

public class Main extends Application {

    private static Stage primaryStage;
     private static Stack<String> history = new Stack<>();


    @Override
    public void start(Stage stage) {
        try {
            primaryStage = stage;

            loadScene("/Login/Login.fxml", "Login");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadScene(String fxmlPath, String title) {
        try {
            history.push(title);
            FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxmlPath));
            Scene scene = new Scene(loader.load());

            primaryStage.setTitle(title);
            primaryStage.setScene(scene);
            primaryStage.setMaximized(true); // optional
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public static void goBack() {
        try {
            if (history.size() > 1) {
                history.pop(); // remove current
                String previous = history.peek();

                Parent root = FXMLLoader.load(Main.class.getResource(previous));
                Stage stage = (Stage) Stage.getWindows().filtered(w -> w.isShowing()).get(0);

                stage.setScene(new Scene(root));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}