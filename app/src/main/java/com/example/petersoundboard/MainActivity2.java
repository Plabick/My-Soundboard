package com.example.petersoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button fantastic, awesome, absolutely, dang, no, sigh, well, maybe, think, handsome,
            tall, prettyGreat, unknown1, crocs, unknown2, velocity, facts, unknown3;

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

        unknown1 = this.findViewById(R.id.unknown1);
        unknown2 = this.findViewById(R.id.unknown2);
        unknown3 = this.findViewById(R.id.soylent);


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
        unknown1.setOnClickListener(this);
        unknown2.setOnClickListener(this);
        unknown3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int uri =  R.raw.beep;

        String message = "ButtonID Not Found";
        if (v.getId() == fantastic.getId()) {
             uri = R.raw.fantastic1;
            message = "fantastic!";
        } else if (v.getId() == awesome.getId()) {
            message = "awesome!";
           uri = R.raw.awesome1;
        } else if (v.getId() == dang.getId()) {
            message = "dang it!";
        } else if (v.getId() == absolutely.getId()) {
            message = "absolutely";
            uri = R.raw.absolutly1;
        } else if (v.getId() == no.getId()) {
            message = "no";
        } else if (v.getId() == sigh.getId()) {
            message = "sigh";
        } else if (v.getId() == well.getId()) {
            message = "well";
        } else if (v.getId() == maybe.getId()) {
            message = "maybe";
        } else if (v.getId() == think.getId()) {
            message = "I'll think about it";
        } else if (v.getId() == handsome.getId()) {
            message = "That's correct, I'm extremely handsome";
        } else if (v.getId() == tall.getId()) {
            message = "I'm in the 51st percentile for height";
        } else if (v.getId() == prettyGreat.getId()) {
            message = "I Know, I know, I'm Pretty Great";
        } else if (v.getId() == velocity.getId()) {
            message = "Air Resistance Increases with the square of velocity";
        } else if (v.getId() == crocs.getId()) {
            message = "Shoes of Champions";
        } else if (v.getId() == facts.getId()) {
            message = "Facts And Logic";
        } else if (v.getId() == unknown1.getId()) {
            message = "unknown1";
        } else if (v.getId() == unknown2.getId()) {
            message = "unknown2";
        } else if (v.getId() == unknown3.getId()) {
            message = "unknown3";
        }
        MediaPlayer mediaPlayer = MediaPlayer.create(this.getApplicationContext(),uri);
        mediaPlayer.start();

        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.show();


    }
}