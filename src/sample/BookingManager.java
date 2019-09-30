package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingManager {


    public static void BookingScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    BookingManager.class.getResource("Screen2.fxml")
            );
            Main.getCurrentScene().setRoot((Parent) loader.load());

        } catch (IOException ex) {
            Logger.getLogger(BookingManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void MainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    BookingManager.class.getResource("sample.fxml")
            );
            Main.getCurrentScene().setRoot((Parent) loader.load());




        } catch (IOException ex) {
            Logger.getLogger(BookingManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
