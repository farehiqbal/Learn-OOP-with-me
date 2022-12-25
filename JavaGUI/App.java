package JavaGUI;

import JavaGUI.SampleGUI.AdminFrame;

public class App {
    public static void main(String[] args) {
        SampleGUI gui = new SampleGUI();
        // SampleGUI.AdminFrame admin = gui;
        // gui.setVisible(false);
        SampleGUI.AdminFrame admin = gui.new AdminFrame();

    }
}
