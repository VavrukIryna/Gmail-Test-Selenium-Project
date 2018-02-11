package com.epam.lab.xmlModel;

import com.epam.lab.xmlModel.LoginDataProp;
import com.epam.lab.xmlModel.LoginData;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {
    public static List getData() {
        List<LoginDataProp> list = null;
        try {

            File file = new File("src/main/resources/loginData.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(LoginData.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            LoginData que = (LoginData) jaxbUnmarshaller.unmarshal(file);

            list = que.getLoginDataProps();

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return list;
    }
}



