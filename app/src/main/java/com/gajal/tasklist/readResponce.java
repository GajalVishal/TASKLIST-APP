package com.gajal.tasklist;

import java.util.List;

public class readResponce {
    String status;
    String message;
    List<rvmodal> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<rvmodal> getData() {
        return data;
    }

    public void setData(List<rvmodal> data) {
        this.data = data;
    }

    public readResponce(String status, String message, List<rvmodal> data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
