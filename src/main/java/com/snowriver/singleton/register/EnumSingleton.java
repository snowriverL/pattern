package com.snowriver.singleton.register;

public enum EnumSingleton {

    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object obj) {
        this.data = obj;
    }
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
