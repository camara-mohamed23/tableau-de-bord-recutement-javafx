package com.example.projet1;



import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController  implements Initializable {

    @FXML
    private BarChart<?, ?> barchart;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        XYChart.Series setl = new XYChart.Series<>();
        setl.getData().add(new XYChart.Data<>("camara", 123));
        setl.getData().add(new XYChart.Data<>("ISSA", 20));
        setl.getData().add(new XYChart.Data<>("SAMBA", 33));
        setl.getData().add(new XYChart.Data<>("MOHAMED", 133));
        barchart.getData().addAll(setl);
    }
}








