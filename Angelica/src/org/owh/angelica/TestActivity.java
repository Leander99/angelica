package org.owh.angelica;

import org.owh.angelica.base.AngelicaApplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.scringo.Scringo;

public class TestActivity extends Activity {

	private Scringo scringo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
				
		Scringo.setAppId(AngelicaApplication.SCRINGO_APP_ID);
		scringo = new Scringo(this);
		scringo.init();		
		
		scringo.addSidebar();
		
		this.setTitleColor( getResources().getColor(R.color.titletextcolor) );		
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		scringo.onStart();
	}

	@Override
	protected void onStop() {
		super.onStop();
		scringo.onStop();
	}	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}
	
	public void goRegister(View btn) {
		Intent intent = new Intent(this, AngelicaRegisterActivity.class);
		startActivity(intent);
	}
}
