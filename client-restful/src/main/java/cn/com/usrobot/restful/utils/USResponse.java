package cn.com.usrobot.restful.utils;

import java.io.Serializable;

public class USResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    String result;

    String message;

    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public USResponse(){
        this.result = "success";
    }

    public USResponse(String result, String message, T object){
        this.result = result;
        this.message = message;
        this.data = object;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
