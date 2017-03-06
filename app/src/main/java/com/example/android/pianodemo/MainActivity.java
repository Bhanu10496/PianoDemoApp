package com.example.android.pianodemo;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    static int loop = 1,x=0;
    MediaPlayer m;
    int flag = 0;
    static Button b, bs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText e = (EditText) findViewById(R.id.notes);
        b = (Button) findViewById(R.id.play);
        bs = (Button) findViewById(R.id.stop);
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m.stop();
                flag = 1;
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 0;
                final String s = e.getText().toString();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int l = s.length();
                        int i;
                        for (i = 0; i < l; i++) {
                            if (flag == 1)
                                break;
                            if ((s.charAt(i) == 'a' || s.charAt(i) == 'A') && s.charAt(i + 1) == '1') {
                                i++;
                                m = MediaPlayer.create(MainActivity.this, R.raw.a1);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }

                            } else if ((s.charAt(i) == 'b' || s.charAt(i) == 'B') && s.charAt(i + 1) == '1') {
                                i++;
                                m = MediaPlayer.create(MainActivity.this, R.raw.b1);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'c' || s.charAt(i) == 'C') && s.charAt(i + 1) == '1') {
                                i++;
                                m = MediaPlayer.create(MainActivity.this, R.raw.c1);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'c' || s.charAt(i) == 'C') && s.charAt(i + 1) == '2') {
                                i++;
                                m = MediaPlayer.create(MainActivity.this, R.raw.c2);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'd' || s.charAt(i) == 'D') && s.charAt(i + 1) == '1') {
                                i++;
                                m = MediaPlayer.create(MainActivity.this, R.raw.d1);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'e' || s.charAt(i) == 'E') && s.charAt(i + 1) == '1') {
                                i++;
                                m = MediaPlayer.create(MainActivity.this, R.raw.e1);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'f' || s.charAt(i) == 'F') && s.charAt(i + 1) == '1') {
                                i++;
                                m = MediaPlayer.create(MainActivity.this, R.raw.f1);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'g' || s.charAt(i) == 'G') && s.charAt(i + 1) == '1') {
                                i++;
                                m = MediaPlayer.create(MainActivity.this, R.raw.g1);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'a' || s.charAt(i) == 'A') && s.charAt(i + 1) == '1' && (s.charAt(i + 2) == 's' || s.charAt(i) == 'S')) {
                                i = i + 2;
                                m = MediaPlayer.create(MainActivity.this, R.raw.a1s);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'c' || s.charAt(i) == 'C') && s.charAt(i + 1) == '1' && (s.charAt(i + 2) == 's' || s.charAt(i) == 'S')) {
                                i = i + 2;
                                m = MediaPlayer.create(MainActivity.this, R.raw.c1s);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'd' || s.charAt(i) == 'D') && s.charAt(i + 1) == '1' && (s.charAt(i + 2) == 's' || s.charAt(i) == 'S')) {
                                i = i + 2;
                                m = MediaPlayer.create(MainActivity.this, R.raw.d1s);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'f' || s.charAt(i) == 'F') && s.charAt(i + 1) == '1' && (s.charAt(i + 2) == 's' || s.charAt(i) == 'S')) {
                                i = i + 2;
                                m = MediaPlayer.create(MainActivity.this, R.raw.f1s);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if ((s.charAt(i) == 'g' || s.charAt(i) == 'G') && s.charAt(i + 1) == '1' && (s.charAt(i + 2) == 's' || s.charAt(i) == 'S')) {
                                i = i + 2;
                                m = MediaPlayer.create(MainActivity.this, R.raw.g1s);
                                m.setAudioStreamType(AudioManager.STREAM_MUSIC);
                                m.start();
                                while (m.isPlaying()) {
                                }
                            } else if (s.charAt(i) == '.') {
                                try {
                                    Thread.sleep(50);
                                } catch (Exception e) {
                                    Log.e("main", "error");
                                }
                            }
                            if (i == l - 1) {
                                m.release();
                                x = 1;
                            }
                        }
                    }
                }).start();
            }
        });
    }
}
