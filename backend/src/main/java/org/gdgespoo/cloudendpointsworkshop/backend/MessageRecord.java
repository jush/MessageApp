package org.gdgespoo.cloudendpointsworkshop.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * The Objectify object model for messages we are persisting
 */
@Entity
public class MessageRecord {
    @Id
    Long id;

    @Index
    private String message;

    public MessageRecord() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
