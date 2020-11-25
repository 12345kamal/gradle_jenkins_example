package org.acme.messenger.messageformat;

import static org.junit.Assert.*; 
import org.junit.Test;


public class MessageFormatTest {
  @Test
  public void testMessageFormatHasID() {
    MessageFormat classUnderTest = new MessageFormat();
    assertNotNull("MessageFormat should have an ID", classUnderTest.getMessageID(0));
  }
}
