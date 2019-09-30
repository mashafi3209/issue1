//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Controller { ObservableList<String> typeList = FXCollections.observableArrayList("AI", "VI");
    @FXML
    private Tab tab1;
    @FXML
    private Button button1;
    @FXML
    private TextField textfield1;
    @FXML
    private TextArea textarea1;
    @FXML
    private Tab tab2;
    @FXML
    private Tab tab3;
    @FXML
    private ComboBox<String> combo1;

    public Controller() {
    }
    @FXML
    public void initialize() {
        combo1.getItems().addAll("AU", "VI" , "AM" , "VM");
        combo1.setValue("Type");





    }


    @FXML
    private Button sub2Button;
    @FXML
    private DatePicker date2;

    @FXML
    private DatePicker date1;

    @FXML
    void nextPageAction(ActionEvent event) {
        BookingManager.BookingScreen();
        /*LocalDate start = date1.getValue();
        LocalDate end = date2.getValue();*/










    }

    @FXML
    void oneButtonOnePress(ActionEvent event) {
        try {
            Databasemanager pm = new Databasemanager();
            String xValue;
            int yValue = 0;


            xValue = combo1.getValue();
            yValue = Integer.parseInt(textarea1.getText());
            pm.selectAll1(xValue, yValue);
            /*pm.selectAll1("x",2 );*/
            System.out.println("21222"+ xValue);


        } catch (SQLException var4) {
            var4.printStackTrace();
        }

    }
}
