package org.sumon.retrofitwithretry;

import java.util.List;

public class CommonResponse<T> {
    private boolean error;
    private String msg;
    private List<T> item;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getItem() {
        return item;
    }

    public void setItem(List<T> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "CommonResponse{" +
                "error=" + error +
                ", msg='" + msg + '\'' +
                ", item=" + item +
                '}';
    }
}
