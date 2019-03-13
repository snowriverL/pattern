package com.snowriver.prototype.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {

    public float h = 200;
    public float d = 20;

    public void big() {
        this.h *= 5;
        this.d *= 5;
    }

    public void smalll() {
        this.h /= 5;
        this.d /= 5;
    }

}