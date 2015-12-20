package com.rayan.course;


import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.fest.assertions.api.Assertions.*;

/**
 * Created by saeed on 12/20/15.
 */
public class MessageManagerTest {

    private static MessageManager messageManager;

    @BeforeClass
    public static void init(){
        messageManager = new MessageManager();
    }

    @Test
    public void getHelloMessage_gettingMessage_returnHelloMessage(){
//        assertEquals("Hello message", messageManager.getHelloMessage());
        assertThat(messageManager.getHelloMessage()).isEqualTo("Hello message");
    }
}
