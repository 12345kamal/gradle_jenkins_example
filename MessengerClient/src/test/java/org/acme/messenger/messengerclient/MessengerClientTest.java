package org.acme.messenger.messengerclient;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MessengerClientTest {
  @Test
  public void testMessageSend() {
    MessengerClient classUnderTest = new MessengerClient();
    assertNotNull("MessengerClient should be able to send a message", classUnderTest.sendMessage("My message"));
  }

  @Test
  public void testMessageReceive() {
    MessengerClient classUnderTest = new MessengerClient();
    assertNotNull("MessengerClient should be able to receive a message", classUnderTest.receiveMessage());
  }

}
