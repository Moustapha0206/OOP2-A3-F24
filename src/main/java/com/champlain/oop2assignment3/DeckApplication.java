package com.champlain.oop2assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Launches the test application when executed.
 */
public class DeckApplication extends Application {
    /**
     * Initializes the main stage and sets up the user interface.
     *
     * @param pStage the primary stage for this application
     * @throws IOException if the FXML file cannot be loaded
     */
    @Override
    public void start(Stage pStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DeckApplication.class.getResource("deck-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 530, 340);
        pStage.setTitle("Hello!");
        pStage.setScene(scene);
        pStage.show();
    }

    /**
     * Main method executed on launch.
     * @param pArgs Additional program arguments. Not used.
     */
    public static void main(String[] pArgs) {
        Card card1 = new Card(Rank.ACE, Suit.HEARTS);
        Card card2 = new Card(Rank.ACE, Suit.HEARTS);


        if (card1.equals(card2)) {
            System.out.println("The cards are equal.");
        } else {
            System.out.println("the cards are not equal.");
        }

        launch();
    }
}