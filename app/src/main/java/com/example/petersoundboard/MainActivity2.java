package com.example.petersoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button fantastic, awesome, absolutely, dang, no, sigh, well, maybe, think, handsome,
            tall, prettyGreat, endsInY, crocs, sucks, velocity, facts, techSupport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //--------Instantiate Buttons
        awesome = this.findViewById(R.id.awesome);
        fantastic = this.findViewById(R.id.fantastic);
        absolutely = this.findViewById(R.id.absolutely);
        dang = this.findViewById(R.id.dang);
        no = this.findViewById(R.id.no);
        sigh = this.findViewById(R.id.sigh);
        well = this.findViewById(R.id.well);
        maybe = this.findViewById(R.id.maybe);
        think = this.findViewById(R.id.thinkAboutIt);
        handsome = this.findViewById(R.id.handsome);
        tall = this.findViewById(R.id.tall); //51st percentile
        prettyGreat = this.findViewById(R.id.wish); //I know, I know, im pretty great
        velocity = this.findViewById(R.id.velocity);
        crocs = this.findViewById(R.id.portrait); //Crocs are the shoes of champions
        facts = this.findViewById(R.id.facts);

        endsInY = this.findViewById(R.id.everyDay);
        sucks = this.findViewById(R.id.sucks);
        techSupport = this.findViewById(R.id.techSupport);


        //-----------------Set Event Listener-------------------
        fantastic.setOnClickListener(this);
        awesome.setOnClickListener(this);
        absolutely.setOnClickListener(this);
        dang.setOnClickListener(this);
        no.setOnClickListener(this);
        sigh.setOnClickListener(this);
        well.setOnClickListener(this);
        maybe.setOnClickListener(this);
        think.setOnClickListener(this);
        handsome.setOnClickListener(this);
        tall.setOnClickListener(this);
        prettyGreat.setOnClickListener(this);
        velocity.setOnClickListener(this);
        crocs.setOnClickListener(this);
        facts.setOnClickListener(this);
        endsInY.setOnClickListener(this);
        sucks.setOnClickListener(this);
        techSupport.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int uri =  R.raw.beep;

        String message = "ButtonID Not Found";
        if (v.getId() == fantastic.getId()) {
             uri = R.raw.fantastic2;
            message = "fantastic!";
        } else if (v.getId() == awesome.getId()) {
            message = "awesome!";
           uri = R.raw.awesome2;
        } else if (v.getId() == dang.getId()) {
            uri = R.raw.dang;
            message = "dang it!";
        } else if (v.getId() == absolutely.getId()) {
            message = "absolutely";
            uri = R.raw.absolutly2;
        } else if (v.getId() == no.getId()) {
            message = "no";
            uri = R.raw.no;
        } else if (v.getId() == sigh.getId()) {
            uri = R.raw.sigh;
            message = "sigh";
        } else if (v.getId() == well.getId()) {
            uri = R.raw.well;
            message = "well";
        } else if (v.getId() == maybe.getId()) {
            uri = R.raw.maybe;
            message = "maybe";
        } else if (v.getId() == think.getId()) {
            uri = R.raw.think;
            message = "I'll think about it";
        } else if (v.getId() == handsome.getId()) {
            uri = R.raw.handsome;
            message = "That's correct, I'm extremely handsome";
        } else if (v.getId() == tall.getId()) {
            uri = R.raw.tall;
            message = "I'm in the 51st percentile for height";
        } else if (v.getId() == prettyGreat.getId()) {
            uri = R.raw.great;
            message = "I Know, I know, I'm Pretty Great";
        } else if (v.getId() == velocity.getId()) {
            uri = R.raw.velocity;
            message = "Air Resistance Increases with the square of velocity";
        } else if (v.getId() == crocs.getId()) {
            uri = R.raw.crocs;
            message = "Shoes of Champions";
        } else if (v.getId() == facts.getId()) {
            uri = R.raw.facts;
            message = "Facts And Logic";
        } else if (v.getId() == endsInY.getId()) {
            message = "ends in y";
            uri = R.raw.ends;
        } else if (v.getId() == sucks.getId()) {
            uri = R.raw.sucks;
            message = "sucks to suck";
        } else if (v.getId() == techSupport.getId()) {
            uri = R.raw.restart;
            message = "unknown3";
        }
        MediaPlayer mediaPlayer = MediaPlayer.create(this.getApplicationContext(),uri);
        mediaPlayer.start();

        //Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
       // toast.show();


    }
}