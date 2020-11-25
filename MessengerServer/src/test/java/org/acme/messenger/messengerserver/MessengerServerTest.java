package org.acme.messenger.messengerserver;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MessengerServerTest {

  @Test
  public void testStartServer() {
    MessengerServer classUnderTest = new MessengerServer();
    assertNotNull("Server should start", classUnderTest.startServer());
  }

  @Test
  public void testStopServer() {
    MessengerServer classUnderTest = new MessengerServer();
    assertNotNull("Server should stop", classUnderTest.stopServer());
  }

}
