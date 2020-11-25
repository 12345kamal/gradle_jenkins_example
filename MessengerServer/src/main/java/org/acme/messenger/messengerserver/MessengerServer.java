package org.acme.messenger.messengerserver;

import java.time.Clock;

public class MessengerServer {

    public String startServer() {
        Clock clock = Clock.systemUTC();
        return "Let every man be master of his time. " + clock.toString();
    }

    public String stopServer() {
        Clock clock = Clock.systemUTC();
        return "Defer no time, delays have dangerous ends. " + clock.toString();
    }

    public static void main(String[] args) {
        MessengerServer server = new MessengerServer();
        System.out.println(server.startServer());
        System.out.println(server.stopServer());
    }
}
