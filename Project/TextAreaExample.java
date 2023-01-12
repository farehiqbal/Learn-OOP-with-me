package Project;

import javax.swing.*;

import Project.Inventory.Inventory;

public class TextAreaExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Text Area Example");
        // frame.setSize(400,1000);
        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(0);
        // frame.setResizable(false);


        // Create a new JPanel
        JPanel panel = new JPanel();

        Inventory inventory = new Inventory(10);
        // Create a new JTextArea with the text "Hello, World!"
        JTextArea textArea = new JTextArea();
        textArea.setSize(400,1000);
        textArea.setText(inventory.printMap());
        textArea.setEditable(false);

        // Add the text area to the panel
        // panel.add(textArea);

        // Add the panel to the frame
        frame.add(textArea);

        // Set the frame properties
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
