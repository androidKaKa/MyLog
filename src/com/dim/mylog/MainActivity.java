package com.dim.mylog;

import org.apache.http.cookie.ClientCookie;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity  implements OnClickListener {

	private Button btnLI;
	private Button btnLD;
	private Button btnLE;
	private String TAG="TAG-->>";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MyLog.setLogLevel(3);
		
		btnLI=(Button)findViewById(R.id.btnLI);
		btnLD=(Button)findViewById(R.id.btnLD);
		btnLE=(Button)findViewById(R.id.btnLE);
		btnLI.setOnClickListener(this);
		btnLD.setOnClickListener(this);
		btnLE.setOnClickListener(this);
		
	}

	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.btnLI:
			MyLog.setLogLevel(3);
			MyLog.MyLogV(TAG, "log V");
			MyLog.MyLogD(TAG, "log D"); 
			MyLog.MyLogI(TAG, "log I"); 
			MyLog.MyLogW(TAG, "log W");
			MyLog.MyLogE(TAG, "log E");	
			break;
		case R.id.btnLD:
			MyLog.setLogLevel(2);
			MyLog.MyLogV(TAG, "log V");
			MyLog.MyLogD(TAG, "log D"); 
			MyLog.MyLogI(TAG, "log I"); 
			MyLog.MyLogW(TAG, "log W");
			MyLog.MyLogE(TAG, "log E");	
			break;
		case R.id.btnLE:
			MyLog.setLogLevel(5);
			MyLog.MyLogV(TAG, "log V");
			MyLog.MyLogD(TAG, "log D"); 
			MyLog.MyLogI(TAG, "log I"); 
			MyLog.MyLogW(TAG, "log W");
			MyLog.MyLogE(TAG, "log E");	
			break;
		}
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
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


}
