package com.example.imagesspa;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("NewApi")
public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	Button int1;
	Button int2;
	Button int3;
	TextView textOut;
	private OnClickListener mytest = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			textOut.setText("Yes" + v.getId());
			
		}
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		final ImageView sap = (ImageView)findViewById(R.id.sappshow);
		final Button butpress = (Button)findViewById(R.id.button1);
		textOut = (TextView)findViewById(R.id.magic);
		int1 = (Button)findViewById(R.id.button2);
		int2 = (Button)findViewById(R.id.button3);
		int3 = (Button)findViewById(R.id.button4);
		int3.setOnClickListener(mytest);
		int1.setOnClickListener(this);
		int2.setOnClickListener(this);
		 	butpress.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//sap.setImageResource(R.drawable.sapphire);
					
				textOut.setText("You saw magic" + v.getId());	
				}
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) 
		{
		int callerId = v.getId();
		switch(callerId){
			case R.id.button2:
				textOut.setText("Button pressed with with button id 2" +callerId);
				break;
			case R.id.button3:
				textOut.setText("Button pressed with with button id 3" +callerId);
				break;
			default:
			textOut.setText("wtf");
				break;
		
		}
		
	}
}
