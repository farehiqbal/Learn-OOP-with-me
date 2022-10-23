package AssignmentOne;

import java.util.ArrayList;

public class Telephone {
    
    private String model;
    private String color;
    private String ram;
    private String rom;
    private String phoneNO;
    private String cost;
    

    private ArrayList<String> callsMade = new ArrayList <String>();
    private ArrayList<String> callsReceived = new ArrayList <String>();

    private ArrayList<String> messagesSent = new ArrayList <String>();
    private ArrayList<String> messagesReceived = new ArrayList <String>();

    private boolean isDualSim;
   

    public Telephone(String model, String color, String ram, String rom, String phoneNO, String cost,
            ArrayList<String> callsMade, ArrayList<String> callsReceived, ArrayList<String> messagesSent,
            ArrayList<String> messagesReceived, boolean isDualSim) {

        this.model = model;
        this.color = color;
        this.ram = ram;
        this.rom = rom;
        this.phoneNO = phoneNO;
        this.cost = cost;
        this.callsMade = callsMade;
        this.callsReceived = callsReceived;
        this.messagesSent = messagesSent;
        this.messagesReceived = messagesReceived;
        this.isDualSim = isDualSim;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public String getCost() {
        return cost;
    }

    public ArrayList<String> getCallsMade() {
        return callsMade;
    }

    public ArrayList<String> getCallsReceived() {
        return callsReceived;
    }

    public ArrayList<String> getMessagesSent() {
        return messagesSent;
    }

    public ArrayList<String> getMessagesReceived() {
        return messagesReceived;
    }

    public boolean isDualSim() {
        return isDualSim;
    }

    public void makeCall(String telNum){}

    public void receiveCall(String telNum){}

    public void sendMessage(String message){}

    public void receiveMessage(String message){}

    

}
