package com.example.gameui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.scene.layout.Priority.ALWAYS;

public class GameUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();

        Image bgImage = new Image(GameUI.class.getResource("background.jpg").toString()); // Replace with your image file name
        ImageView bgView = new ImageView(bgImage);
        bgView.fitWidthProperty().bind(root.widthProperty());
        bgView.fitHeightProperty().bind(root.heightProperty());
        root.setCenter(bgView);

        HBox top = new HBox();
        top.setPadding(new Insets(10, 10, 10, 10));
        top.setSpacing(10);

        Label gameTitle = new Label("House Game");
        gameTitle.setStyle("-fx-font-size: 24; -fx-font-weight: bold; -fx-text-fill: black;");
        top.getChildren().add(gameTitle);
        HBox.setMargin(gameTitle, new Insets(0, 0, 0, 10));
        gameTitle.setAlignment( Pos.CENTER_LEFT);

        HBox menuBar = new HBox(20);
        menuBar.setAlignment(Pos.CENTER);

        Button menuButton = new Button("Menu");
        menuButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
        menuButton.setFont(Font.font(String.valueOf(FontWeight.NORMAL),16));
        Button docsButton = new Button("Docs");
        docsButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
        docsButton.setFont(Font.font(String.valueOf(FontWeight.NORMAL),16));
        Button whitepaperButton = new Button("Whitepaper");
        whitepaperButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");
        whitepaperButton.setFont(Font.font(String.valueOf(FontWeight.NORMAL),16));
        menuBar.getChildren().addAll(menuButton, docsButton, whitepaperButton);
        top.getChildren().add(menuBar);
        HBox.setHgrow(menuBar, ALWAYS);
        menuBar.setAlignment( Pos.CENTER);

        HBox socialMedia = new HBox(10);
        socialMedia.setAlignment(Pos.CENTER);

        Image fbImage = new Image(GameUI.class.getResource("facebook.png").toString());
        ImageView fbView = new ImageView(fbImage);
        fbView.setFitWidth(32);
        fbView.setFitHeight(32);
        fbView.setOnMouseClicked(e -> System.out.println("Facebook"));

        Image twImage = new Image(GameUI.class.getResource("twitter.png").toString());
        ImageView twView = new ImageView(twImage);
        twView.setFitWidth(32);
        twView.setFitHeight(32);
        twView.setOnMouseClicked(e -> System.out.println("Twitter"));

        Image igImage = new Image(GameUI.class.getResource("instagram.png").toString());
        ImageView igView = new ImageView(igImage);
        igView.setFitWidth(32);
        igView.setFitHeight(32);
        igView.setOnMouseClicked(e -> System.out.println("Instagram"));
        socialMedia.getChildren().addAll(fbView, twView, igView);

        top.getChildren().add(socialMedia);
        HBox.setMargin(socialMedia, new Insets(0, 10, 0, 0));
        socialMedia.setAlignment( Pos.CENTER_RIGHT);

        root.setTop(top);

        Text message = new Text("Welcome to my Game World!");
        message.setFont(Font.font("Arial", FontWeight.BOLD, 28));
        message.setStyle("-fx-fill: black;");
        message.setTranslateY(150);
        message.setTranslateX(50);
        root.getChildren().add(message);

        Text message1 = new Text("This is my first game!");
        message1.setFont(Font.font("Arial", FontWeight.NORMAL, 24));
        message1.setStyle("-fx-fill: black;");
        message1.setTranslateY(190);
        message1.setTranslateX(50);
        root.getChildren().add(message1);

        Button playButton = new Button("Play Game");
        playButton.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        playButton.setTranslateY(230);
        playButton.setTranslateX(110);

        FlowPane buttonContainer = new FlowPane(playButton);
        buttonContainer.setAlignment(Pos.CENTER);
        buttonContainer.setPadding(new Insets(10));
        root.getChildren().add(buttonContainer);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("House Game");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
