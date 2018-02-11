package com.epam.lab.xmlModel;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginData {


    private List<LoginDataProp> loginDataProps;

    public LoginData() {
    }

    public LoginData(List<LoginDataProp> loginDataProps) {
        super();
        this.loginDataProps = loginDataProps;
    }


    @XmlElement
    public List<LoginDataProp> getLoginDataProps() {
        return loginDataProps;
    }

    public void setLoginDataProps(List<LoginDataProp> loginDataProps) {
        this.loginDataProps = loginDataProps;
    }
}