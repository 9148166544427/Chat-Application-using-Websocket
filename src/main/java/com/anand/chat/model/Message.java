package com.anand.chat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Message {

    private String SenderName;
    private String RecieverName;
    private String Message;
    private String Date;
    private Status status;


}
