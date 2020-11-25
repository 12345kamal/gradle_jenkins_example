package org.acme.messenger.messageformat;

import java.lang.Math;

public class MessageFormat {
    public int getMessageID(int seed) {

        return (int)(Math.random() * seed + 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(new MessageFormat().getMessageID(i));
        }
    }
}
