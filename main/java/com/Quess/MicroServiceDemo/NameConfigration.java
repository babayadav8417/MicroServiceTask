package com.Quess.MicroServiceDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microservicedemo")
public class NameConfigration {
    public NameConfigration(){

    }
    private float MaxNo;
    private float MinNo;

    public float getMaxNo() {
        return MaxNo;
    }

    public float getMinNo() {
        return MinNo;
    }

    public void setMinNo(float minNo) {
        MinNo = minNo;
    }

    public void setMaxNo(float maxNo) {
        MaxNo = maxNo;
    }

    public NameConfigration(float num1, float num2){
       this.MaxNo=num1;
       this.MinNo=num2;
    }
}
