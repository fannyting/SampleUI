package com.example.sampleui_ding;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends Activity {

	private TextView textview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_message);
		
		String text = getIntent().getStringExtra("text");
		textview = (TextView) findViewById(R.id.message);
		textview.setText(text);
	}

	}
