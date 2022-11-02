package xo.xo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button aa;

    @FXML
    private Button ab;

    @FXML
    private Button ac;

    @FXML
    private Button ba;

    @FXML
    private Button bb;

    @FXML
    private Button bc;

    @FXML
    private Button ca;

    @FXML
    private Button cb;

    @FXML
    private Button cc;

    @FXML
    private Button clear;

    @FXML
    private Text winner;

    @FXML
    private Text winnerField;

    private int progress;

    @FXML
    void initialize() {

        clear.setOnAction(actionEvent -> {
            fieldClear();
            progress=0;

        });
// Симметричная логика для 9 кнопок...
        aa.setOnAction(actionEvent -> {
            if (aa.getText().equals("")){
                if (progress % 2 == 0) {
                    aa.setText("X");
                } else aa.setText("O");
                progress++;
                if (winnerCheck(aa)){
                    winnerField.setText(aa.getText());
                    winner.setText("ПОБЕДИТЕЛЬ");
                    gameStop();
                }else if (progress==9) winner.setText("НИЧЬЯ");
            }
        });

        ab.setOnAction(actionEvent -> {
            if (ab.getText().equals("")){
                if (progress % 2 == 0) {
                    ab.setText("X");
                } else ab.setText("O");
                progress++;
                if (winnerCheck(ab)){
                    winnerField.setText(ab.getText());
                    winner.setText("ПОБЕДИТЕЛЬ");
                    gameStop();
                }else if (progress==9) winner.setText("НИЧЬЯ");
            }
        });

        ac.setOnAction(actionEvent -> {
            if (ac.getText().equals("")){
                if (progress % 2 == 0) {
                    ac.setText("X");
                } else ac.setText("O");
                progress++;
                if (winnerCheck(ac)){
                    winnerField.setText(ac.getText());
                    winner.setText("ПОБЕДИТЕЛЬ");
                    gameStop();
                }else if (progress==9) winner.setText("НИЧЬЯ");
            }
        });

        ba.setOnAction(actionEvent -> {
            if (ba.getText().equals("")){
                if (progress % 2 == 0) {
                    ba.setText("X");
                } else ba.setText("O");
                progress++;
                if (winnerCheck(ba)){
                    winnerField.setText(ba.getText());
                    winner.setText("ПОБЕДИТЕЛЬ");
                    gameStop();
                }else if (progress==9) winner.setText("НИЧЬЯ");
            }
        });

        bb.setOnAction(actionEvent -> {
            if (bb.getText().equals("")){
                if (progress % 2 == 0) {
                    bb.setText("X");
                } else bb.setText("O");
                progress++;
                if (winnerCheck(bb)){
                    winnerField.setText(bb.getText());
                    winner.setText("ПОБЕДИТЕЛЬ");
                    gameStop();
                }else if (progress==9) winner.setText("НИЧЬЯ");
            }
        });

        bc.setOnAction(actionEvent -> {
            if (bc.getText().equals("")){
                if (progress % 2 == 0) {
                    bc.setText("X");
                } else bc.setText("O");
                progress++;
                if (winnerCheck(bc)){
                    winnerField.setText(bc.getText());
                    winner.setText("ПОБЕДИТЕЛЬ");
                    gameStop();
                }else if (progress==9) winner.setText("НИЧЬЯ");
            }
        });

        ca.setOnAction(actionEvent -> {
            if (ca.getText().equals("")){
                if (progress % 2 == 0) {
                    ca.setText("X");
                } else ca.setText("O");
                progress++;
                if (winnerCheck(ca)){
                    winnerField.setText(ca.getText());
                    winner.setText("ПОБЕДИТЕЛЬ");
                    gameStop();
                }else if (progress==9) winner.setText("НИЧЬЯ");
            }
        });

        cb.setOnAction(actionEvent -> {
            if (cb.getText().equals("")){
                if (progress % 2 == 0) {
                    cb.setText("X");
                } else cb.setText("O");
                progress++;
                if (winnerCheck(cb)){
                    winnerField.setText(cb.getText());
                    winner.setText("ПОБЕДИТЕЛЬ");
                    gameStop();
                }else if (progress==9) winner.setText("НИЧЬЯ");
            }
        });

        cc.setOnAction(actionEvent -> {
            if (cc.getText().equals("")){
                if (progress % 2 == 0) {
                    cc.setText("X");
                } else cc.setText("O");
                progress++;
                if (winnerCheck(cc)){
                    winnerField.setText(cc.getText());
                    winner.setText("ПОБЕДИТЕЛЬ");
                    gameStop();
                }else if (progress==9) winner.setText("НИЧЬЯ");
            }
        });
    }

// Заполняем поле пустыми элементами и удаляем объявление предыдущего победителя
    private void fieldClear(){
        aa.setText("");
        ab.setText("");
        ac.setText("");
        ba.setText("");
        bb.setText("");
        bc.setText("");
        ca.setText("");
        cb.setText("");
        cc.setText("");
        winner.setText("");
        winnerField.setText("");
    }
// Для завершения игры при выявлении победителя если остались поля с пустыми элементами - ставим туда символ табуляции (пробела)
    private void gameStop(){
        if (aa.getText().equals("")){
            aa.setText(" ");
        }
        if (ab.getText().equals("")){
            ab.setText(" ");
        }
        if (ac.getText().equals("")){
            ac.setText(" ");
        }
        if (ba.getText().equals("")){
            ba.setText(" ");
        }
        if (bb.getText().equals("")){
            bb.setText(" ");
        }
        if (bc.getText().equals("")){
            bc.setText(" ");
        }
        if (ca.getText().equals("")){
            ca.setText(" ");
        }
        if (cb.getText().equals("")){
            cb.setText(" ");
        }
        if (cc.getText().equals("")){
            cc.setText(" ");
        }
    }

// Проверяем, не стал ли победителем игрок, сделавший ход
    private boolean winnerCheck(Button button){
// Проверяем значения по горизонталям
        if (aa.getText().equals(button.getText()) && ab.getText().equals(button.getText()) && ac.getText().equals(button.getText())){
            return true;}
        if (ba.getText().equals(button.getText()) && bb.getText().equals(button.getText()) && bc.getText().equals(button.getText())){
            return true;}
        if (ca.getText().equals(button.getText()) && cb.getText().equals(button.getText()) && cc.getText().equals(button.getText())){
            return true;}

// Проверяем значения по вертикалям
        if (aa.getText().equals(button.getText()) && ba.getText().equals(button.getText()) && ca.getText().equals(button.getText())){
            return true;}
        if (ab.getText().equals(button.getText()) && bb.getText().equals(button.getText()) && cb.getText().equals(button.getText())){
            return true;}
        if (ac.getText().equals(button.getText()) && bc.getText().equals(button.getText()) && cc.getText().equals(button.getText())){
            return true;}

// Проверяем значения по диагоналям
        if (aa.getText().equals(button.getText()) && bb.getText().equals(button.getText()) && cc.getText().equals(button.getText())){
            return true;}
        if (ac.getText().equals(button.getText()) && bb.getText().equals(button.getText()) && ca.getText().equals(button.getText())){
            return true;}
// Проверки на победителя не пройдены - возвращяем false
        return false;
    }

}
