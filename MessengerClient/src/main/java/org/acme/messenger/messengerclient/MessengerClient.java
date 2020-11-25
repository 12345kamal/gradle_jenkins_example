package org.acme.messenger.messengerclient;

public class MessengerClient {
    public String sendMessage(String msg) {
        return "And all things change them to the contrary.";
    }

    public String receiveMessage() {
        return "There is a time in the affairs of men, Which, taken at the flood, leads on to fortune.";
    }

    public static void main(String[] args) {
        MessengerClient client = new MessengerClient();
        System.out.println(client.sendMessage("Send me please"));
        System.out.println(client.receiveMessage());
    }
}
