package com.hulixerian.andhsa;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class HsaRegistrationFormActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hsa_registration_form);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_hsa_registration_form, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public void onSubmitClicked(View view) {
		String firstName = getStringInfo(R.id.first_name_edit_text, R.string.please_specify_your_first_name);
		if (firstName == null) return;
		String lastName = getStringInfo(R.id.last_name_edit_text, R.string.please_specify_your_last_name);
		if (lastName == null) return;
		String emailAddress = getStringInfo(R.id.email_address_edit_text, R.string.please_specify_your_email_address);
		if (emailAddress == null) return;
		if (!android.util.Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches()) {
			showMessage(R.string.please_specify_correct_email_address);
			return;
		}
		String birthDate = getStringInfo(R.id.birth_date_edit_text, R.string.please_specify_your_birth_date);
		if (birthDate == null) return;
		{
			String[] result = birthDate.split("-");
			if (result.length != 3) {
				showMessage(R.string.please_specify_correct_birth_date);
				return;
			}
			int year, mounth, day;
			try {
				year = Integer.parseInt(result[0]);
				mounth = Integer.parseInt(result[1]);
				day = Integer.parseInt(result[2]);
			} catch (NumberFormatException e) {
				showMessage(R.string.please_specify_correct_birth_date);
				return;
			}
			if(year < 1900 || year > 2010 || mounth < 1 || mounth > 12 || day < 1 || day > 31)
			{
				showMessage(R.string.please_specify_correct_birth_date);
				return;
			}
			birthDate = "" + year + "-" + mounth + "-" + day;
		}
		String phoneNumber = getStringInfo(R.id.phone_number_edit_text, R.string.please_specify_your_phone_number);
		if (phoneNumber == null) return;
		if (!Patterns.PHONE.matcher(phoneNumber).matches()) {
			showMessage(R.string.please_specify_correct_phone_number);
			return;
		}
		String homeAddress = getStringInfo(R.id.home_address_edit_text, R.string.please_specify_your_home_address);
		if (homeAddress == null) return;
		String workAddress = getStringInfo(R.id.work_address_edit_text, R.string.please_specify_your_work_address);
		if (workAddress == null) return;
		String username = getStringInfo(R.id.username_edit_text, R.string.please_specify_your_username);
		if (username == null) return;
		String password = getStringInfo(R.id.password_edit_text, R.string.please_specify_your_password);
		if (password == null) return;
		String passwordConfirm = getStringInfo(R.id.password_confirm_edit_text, R.string.please_specify_your_password_confirm);
		if (passwordConfirm == null) return;
	}

	private String getStringInfo(int editTextID, int errorStringID) {
		EditText editText = (EditText) findViewById(editTextID);
		String result = editText.getText().toString();
		if (result == null || result.length() == 0 || result.equals("")) {
			showMessage(errorStringID);
			return null;
		}
		return result;
	}

	private void showMessage(int stringID) {
//		final String EXTRA_MESSAGE = "com.hulixerian.andhsa.HsaRegistrationFormActivity.MESSAGE";
//		Intent intent = new Intent(this, HsaDisplayMessageActivity.class);
//		intent.putExtra(EXTRA_MESSAGE, msg);
//		startActivity(intent);
		AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
		alertBuilder.setTitle(R.string.form_entry_error_alert_title);
		alertBuilder.setMessage(getString(stringID));
		alertBuilder.setNeutralButton(R.string.ok, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		alertBuilder.create().show();
	}
}
