package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.gameBoard.GameBoard;
import sample.squares.square.SquareException;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
       // primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }


    public static void main(String[] args) throws SquareException, Exception {
        GameBoard gameBoard = new GameBoard();
        System.out.println("Хотите ли вы загрузить игры(YES) или нет(Press ENTER)");
        String line=new Scanner(System.in).nextLine();
        if (line.contains("YES")){
            gameBoard.readJsonFromFile();
        } else {
        gameBoard.createAllPleyer();}
        launch(args);
    }
}
