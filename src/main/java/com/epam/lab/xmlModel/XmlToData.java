package com.epam.lab.xmlModel;

import com.epam.lab.xmlModel.LoginData;
import com.epam.lab.xmlModel.LoginDataProp;
import com.epam.lab.xmlModel.MessageData;
import com.epam.lab.xmlModel.MessageDataProp;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XmlToData {
    public static List getMessageData() {
        List<MessageDataProp> list = null;
        try {

            File file = new File("src/main/resources/messageData.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(MessageData.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            MessageData messageData = (MessageData) jaxbUnmarshaller.unmarshal(file);

            list = messageData.getMessageDataProps();

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return list;
    }
}



