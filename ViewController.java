
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.fxml.Initializable;

public class ViewController implements Initializable {

    @FXML
    private Button Button_Buy;

    @FXML
    private Label Label_Total;

    @FXML
    private Spinner<Integer> Spinner_Camera;

    @FXML
    private Spinner<Integer> Spinner_Iphone;

    @FXML
    private Spinner<Integer> Spinner_Samsung;

    @FXML
    private Spinner<Integer> Spinner_Smartwatch;

    @FXML
    void Button_Buy_action(ActionEvent event) {
        double quantityCamera = Spinner_Camera.getValue();
        double quantityIphone = Spinner_Iphone.getValue();
        double quantitySamsung = Spinner_Samsung.getValue();
        double quantitySmartwatch = Spinner_Smartwatch.getValue();

        double priceCamera = 3500.0;
        double priceIphone = 2000.0;
        double priceSamsung = 1900.0;
        double priceSmartwatch = 900.0;

        double total = quantityCamera * priceCamera + quantityIphone * priceIphone +
                quantitySamsung * priceSamsung + quantitySmartwatch * priceSmartwatch;

        Label_Total.setText("Total: " + total + "$");
    }

    @Override
    public void initialize(URL url, ResourceBundle resource) {
        Spinner_Camera.setValueFactory(
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));

        Spinner_Iphone.setValueFactory(
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));

        Spinner_Samsung.setValueFactory(
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));

        Spinner_Smartwatch.setValueFactory(
        new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
    }
}
