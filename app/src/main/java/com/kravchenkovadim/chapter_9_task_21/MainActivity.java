package com.kravchenkovadim.chapter_9_task_21;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        myCat = new Cat(4, "Puma");

        myCat.talk();

        Cat murzik = new Cat(2, "Murza");

        murzik.talk();
        murzik.breathe();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.numberOfLegs = 4;
        Log.i("numberOfLeg", String.valueOf(glasha.numberOfLegs));
        glasha.talk();

        Puma puma = new Puma();
        puma.breathe();
        puma.talk();
        puma.name = "Leo";
        puma.isAlive = true;
        Log.i("breathe", String.valueOf(puma.isAlive));
        Log.i("breathe", "My name is " +
                puma.name + " and " + puma.breathe());



    }
}