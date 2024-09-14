package com.kravchenkovadim.chapter_9_task_21;

import android.util.Log;

public class Puma extends Cat {

    private String pumaHelloText;

    public Puma(){
        name = "Puma";
        pumaHelloText = "I'm a cool cat!";
        age = 3;
    }

    private String createPumaTalkText(){
      String pumaInfo;
      pumaInfo = pumaHelloText + "My age " + String.valueOf(this.age)+ " and " +
              "my name is " + this.name;
      return pumaInfo;
    }

    public void talk(){
        Log.d("puma1", createPumaTalkText());
    }


}
