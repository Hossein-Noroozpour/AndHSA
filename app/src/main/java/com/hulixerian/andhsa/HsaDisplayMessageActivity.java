package com.hulixerian.andhsa;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class HsaDisplayMessageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		Intent intent = getIntent();
		String message = intent.getStringExtra(HsaSaleActivity.EXTRA_MESSAGE);
		TextView textView = (TextView) findViewById(R.id.message_text);
		textView.setText(message);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}
}
