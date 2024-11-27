package com.example.projet5;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
   @FXML
   private StackedAreaChart<String, Number> StackedAreachart;
   @FXML
   private AreaChart<String, Number> areaChart; // Spécifiez explicitement les types génériques
   @FXML
   private BubbleChart<Number, Number> BUBBLECHART;

   @FXML
   private CategoryAxis x;

   @FXML
   private NumberAxis y;
   @Override
   public void initialize(URL location, ResourceBundle resources) {
      XYChart.Series<String, Number> series = new XYChart.Series<>();
      series.setName("Données");

      // Ajoutez des points de données à la série
      series.getData().add(new XYChart.Data<>("Lundi", 23));
      series.getData().add(new XYChart.Data<>("Mardi", 14));
      series.getData().add(new XYChart.Data<>("Mercredi", 15));
      series.getData().add(new XYChart.Data<>("Jeudi", 24));
      series.getData().add(new XYChart.Data<>("Vendredi", 34));

      // Ajoutez la série au graphique
      areaChart.getData().add(series);

      XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
      series1.setName("Dataset 1");
      series1.getData().add(new XYChart.Data<>(5, 5, 1)); // (X, Y, radius)
      series1.getData().add(new XYChart.Data<>(10, 10, 2));
      series1.getData().add(new XYChart.Data<>(15, 5, 3));

      XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
      series2.setName("Dataset 2");
      series2.getData().add(new XYChart.Data<>(5, 15, 1.5));
      series2.getData().add(new XYChart.Data<>(10, 20, 2.5));
      series2.getData().add(new XYChart.Data<>(15, 10, 3.5));

      // Ajouter les séries au graphe
      BUBBLECHART.getData().addAll(series1, series2);



   }
}