import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardwidth = 750;
        int boardHeight = 250;

        JFrame frame = new JFrame("Chrome Dinosaur");
        //frame.setVisible(true);
        frame.setSize(boardwidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChromeDinosaur chromeDinosaur = new ChromeDinosaur();
        frame.add(chromeDinosaur);
        frame.pack();
        chromeDinosaur.requestFocus();
        frame.setVisible(true);

    }
}