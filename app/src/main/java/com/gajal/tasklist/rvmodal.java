package com.gajal.tasklist;

public class rvmodal {
    int id;
    String task;
String complete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public rvmodal(int id, String task, String complete) {
        this.id = id;
        this.task = task;
        this.complete = complete;
    }
}
