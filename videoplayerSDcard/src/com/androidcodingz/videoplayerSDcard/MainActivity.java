package com.androidcodingz.videoplayerSDcard;
 


import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
 
public class MainActivity extends Activity {
  
 String SrcPath = "/sdcard/dhana.mp4";
 
 //you can place your own source path, as a folder in your Sdcard and save files in it like .mp4//
  
   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       VideoView myVideoView = (VideoView)findViewById(R.id.myvideoview);
       myVideoView.setVideoPath(SrcPath);
       myVideoView.setMediaController(new MediaController(this));
       myVideoView.requestFocus();
       myVideoView.start();
   }
}