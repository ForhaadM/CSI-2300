import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    private Button[][] board;
    private boolean playerX;

    @Override
    public void start(Stage primaryStage) {
        board = new Button[5][5];
        playerX = true;

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Button button = new Button();
                button.setPrefSize(80, 80);
                button.setOnAction(event -> {
                    if (button.getText().isEmpty()) {
                        if (playerX) {
                            button.setText("X");
                        } else {
                            button.setText("O");
                        }
                        playerX = !playerX;
                        checkWinner();
                    }
                });
                board[i][j] = button;
                root.add(button, j, i);
            }
        }

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    private void checkWinner() {
        String winner = "";

        // check rows
        for (int i = 0; i < 5; i++) {
            if (!board[i][0].getText().isEmpty()
                    && board[i][0].getText().equals(board[i][1].getText())
                    && board[i][1].getText().equals(board[i][2].getText())
                    && board[i][2].getText().equals(board[i][3].getText())
                    && board[i][3].getText().equals(board[i][4].getText())) {
                winner = board[i][0].getText();
            }
        }

        // check columns
        for (int i = 0; i < 5; i++) {
            if (!board[0][i].getText().isEmpty()
                    && board[0][i].getText().equals(board[1][i].getText())
                    && board[1][i].getText().equals(board[2][i].getText())
                    && board[2][i].getText().equals(board[3][i].getText())
                    && board[3][i].getText().equals(board[4][i].getText())) {
                winner = board[0][i].getText();
            }
        }

        // check diagonals
        if (!board[0][0].getText().isEmpty()
                && board[0][0].getText().equals(board[1][1].getText())
                && board[1][1].getText().equals(board[2][2].getText())
                && board[2][2].getText().equals(board[3][3].getText())
                && board[3][3].getText().equals(board[4][4].getText())) {
            winner = board[0][0].getText();
        }

        if (!board[0][4].getText().isEmpty()
                && board[0][4].getText().equals(board[1][3].getText())
                && board[1][3].getText().equals(board[2][2].getText())
                && board[2][2].getText().equals(board[3][1].getText())) {
                    winner = board[0][0].getText();
                }


            }
        }

   