package com.example.bushramohamed.playmysong;

import android.app.IntentService;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;

import java.io.IOException;

/**
 * Created by bushramohamed on 2015-03-16.
 */
public class MyService extends IntentService {

    public MyService(String name){
        super(name);
    }
    public MyService(){super("MyService");}
    @Override
    protected void onHandleIntent(Intent intent){
        MediaPlayer mPlayer;
        mPlayer = new MediaPlayer();
        Uri myUri = Uri.parse("file:///sdcard/mySongs/allegro.mp3");
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mPlayer.setDataSource(getApplicationContext(), myUri);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mPlayer.start();
    }
}
