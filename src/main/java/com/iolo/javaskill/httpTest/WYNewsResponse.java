package com.iolo.javaskill.httpTest;

import java.util.Date;
import java.util.List;

/**
 * @author Fengxinxin
 * @date 2019-06-19
 */
public class WYNewsResponse {

    private int code;

    private String message;

    private List<Result> result;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public List<Result> getResult() {
        return result;
    }

    public class Result {

        private String path;

        private String image;

        private String title;

        private Date passtime;

        public void setPath(String path) {
            this.path = path;
        }

        public String getPath() {
            return path;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImage() {
            return image;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setPasstime(Date passtime) {
            this.passtime = passtime;
        }

        public Date getPasstime() {
            return passtime;
        }

    }

}

