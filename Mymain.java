package com.example.demo1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class connect4 extends Application {
   private Controller controller;
   @Override
   public void start(Stage stage) throws IOException {
      FXMLLoader loader = new FXMLLoader(connect4.class.getResource("hello-view.fxml"));
      GridPane rootGridPane = loader.load();
      controller = loader.getController();
      controller.createPlayground();
      MenuBar menubar=createMenu();
      menubar.prefWidthProperty().bind(stage.widthProperty());
      Pane menuPane= (Pane) rootGridPane.getChildren().get(0);
      menuPane.getChildren().add(menubar);
      Scene scene=new Scene(rootGridPane);
      stage.setScene(scene);
      stage.setTitle("Connect Four");
      stage.setResizable(false);
      stage.show();

   }
   private MenuBar createMenu(){
      Menu fileMenu=new Menu("File");
      MenuItem newGame=new MenuItem("New Game");
      newGame.setOnAction(actionEvent -> controller.resetGame());
      MenuItem resetGame=new MenuItem("Reset Game");
      resetGame.setOnAction(actionEvent -> controller.resetGame());
      SeparatorMenuItem spm=new SeparatorMenuItem();
      MenuItem exitGame=new MenuItem("Exit Game");
      exitGame.setOnAction(actionEvent ->{
         Platform.exit();
         System.exit(0);
      });
      fileMenu.getItems().addAll(newGame,resetGame,spm,exitGame);
      Menu helpMenu=new Menu("Help");
      MenuItem aboutGame=new MenuItem("About Connect4");
      aboutGame.setOnAction(actionEvent -> aboutConnect4());
      SeparatorMenuItem s=new SeparatorMenuItem();
      MenuItem aboutMe=new MenuItem("About Developer");
      aboutMe.setOnAction(actionEvent -> aboutMe());
      helpMenu.getItems().addAll(aboutGame,s,aboutMe);
      MenuBar menuBar=new MenuBar();
      menuBar.getMenus().addAll(fileMenu,helpMenu);
      return menuBar;
   }

   private void aboutMe() {
      Alert a = new Alert(Alert.AlertType.INFORMATION);
      a.setTitle("About the Developer");
      a.setHeaderText("Vedanth");
      a.setContentText("I love games so I keep creating games. Connect 4 is one of it");
      a.show();
   }

   private void aboutConnect4() {
      Alert alert=new Alert(Alert.AlertType.INFORMATION);
      alert.setTitle("About Connect4 Game");
      alert.setHeaderText("How to play?");
      alert.setContentText("Connect Four is a two-player connection game in which the players first choose a color and then take turns dropping colored discs from the top into a seven-column, six-row vertically suspended grid."+" The pieces fall straight down, occupying the next available space within the column."+" The objective of the game is to be the first to form a horizontal, vertical, or diagonal line of four of one's own discs."+" Connect Four is a solved game."+" The first player can always win by playing the right moves.");
      alert.show();
   }

   public static void main(String[] args) {
      launch();
   }
   }
