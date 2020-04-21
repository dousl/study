package com.dousl.learn.boot2.temp;

public class TInterfaceInvokeLog {
    private String infCode;

    private String infConsumer;

    private String infProvider;

    private String reqPerson;

    private String reqTime;

    private String reqBody;

    private String respTime;

    private String respCode;

    private String respDesc;

    private String respBody;

    private String respException;

    public String getInfCode() {
        return infCode;
    }

    public void setInfCode(String infCode) {
        this.infCode = infCode == null ? null : infCode.trim();
    }

    public String getInfConsumer() {
        return infConsumer;
    }

    public void setInfConsumer(String infConsumer) {
        this.infConsumer = infConsumer == null ? null : infConsumer.trim();
    }

    public String getInfProvider() {
        return infProvider;
    }

    public void setInfProvider(String infProvider) {
        this.infProvider = infProvider == null ? null : infProvider.trim();
    }

    public String getReqPerson() {
        return reqPerson;
    }

    public void setReqPerson(String reqPerson) {
        this.reqPerson = reqPerson == null ? null : reqPerson.trim();
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime == null ? null : reqTime.trim();
    }

    public String getReqBody() {
        return reqBody;
    }

    public void setReqBody(String reqBody) {
        this.reqBody = reqBody == null ? null : reqBody.trim();
    }

    public String getRespTime() {
        return respTime;
    }

    public void setRespTime(String respTime) {
        this.respTime = respTime == null ? null : respTime.trim();
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode == null ? null : respCode.trim();
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc == null ? null : respDesc.trim();
    }

    public String getRespBody() {
        return respBody;
    }

    public void setRespBody(String respBody) {
        this.respBody = respBody == null ? null : respBody.trim();
    }

    public String getRespException() {
        return respException;
    }

    public void setRespException(String respException) {
        this.respException = respException == null ? null : respException.trim();
    }
}