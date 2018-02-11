package com.epam.lab.xmlModel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class MessageData {


    private List<MessageDataProp> messageDataProps;

    public MessageData() {
    }

    public MessageData(List<MessageDataProp> messageDataProps) {
        super();
        this.messageDataProps = messageDataProps;
    }


    @XmlElement
    public List<MessageDataProp> getMessageDataProps() {
        return messageDataProps;
    }

    public void setMessageDataProps(List<MessageDataProp> messageDataProps) {
        this.messageDataProps = messageDataProps;
    }

}