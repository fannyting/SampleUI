package com.example.sampleui_ding;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	//宣告edittext 及button. 要先import
	private EditText editText;
	private Button button;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//findviewbyid 取得宣告變數的實體
		editText = (EditText) findViewById(R.id.editText1);
		
		//設定變數的屬性 
		// setHint 顯示提示文字
		editText.setHint("Type Somthing...");
		
		button = (Button) findViewById(R.id.button1);
		// setText 設定button上的文字
		button.setText("Send");
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
                   String text = editText.getText().toString();
                   Log.d("debug","[button1] " + text);
                   editText.getText().clear();
				
			}
		});		
	}
		
		 public void submit2(View view) {
			 		sendMessage();    	
	}
		 public void sendMessage(){
			    String text = editText.getText().toString();
		 		editText.getText().clear();
		 		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
		 }
		 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
