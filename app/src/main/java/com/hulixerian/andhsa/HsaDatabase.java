package com.hulixerian.andhsa;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class HsaDatabase {
	public final static String[] TABLES = {
			"HsaSaleAgent",
			"HsaItems",
			"HsaCustomers",
			"HsaExternalFees"
	};
	public final static String[][][] FIELDS = {
			{
					{
							"id", "INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY"
					},
					{
							"first_name", "VARCHAR(255) NOT NULL CHARACTER SET UTF8"
					},
					{
							"last_name", "VARCHAR(255) NOT NULL CHARACTER SET UTF8"
					},
					{
							"email_address", "VARCHAR(255) NOT NULL CHARACTER SET UTF8"
					},
					{
							"birth_date", "DATE NOT NULL"
					},
					{
							"phone_number", "VARCHAR(16) NOT NULL CHARACTER SET UTF8"
					},
					{
							"home_address", "VARCHAR(511) NOT NULL CHARACTER SET UTF8"
					},
					{
							"work_address", "VARCHAR(511) NOT NULL CHARACTER SET UTF8"
					},
					{
							"key_iv_aes", "VARCHAR(128) NOT NULL CHARACTER SET UTF8"
					},
					{
							"session_key_iv", "VARCHAR(128) NOT NULL CHARACTER SET UTF8"
					},
					{
							"registered", "BOOLEAN NOT NULL"
					},
					{
							"username", "VARCHAR(128) NOT NULL CHARACTER SET UTF8"
					},
					{
							"password", "VARCHAR(128) NOT NULL CHARACTER SET UTF8"
					},
					{
							"logged_in", "BOOLEAN NOT NULL"
					}
			}};
	private HsaDatabaseHelper dbHelper;
	private SQLiteDatabase database;

	public HsaDatabase(Context context) {
		dbHelper = new HsaDatabaseHelper(context);
		database = dbHelper.getWritableDatabase();
	}

	public long createRecords(String id, String name) {
//		ContentValues values = new ContentValues();
//		values.put(EMP_ID, id);
//		values.put(EMP_NAME, name);
//		return database.insert(EMP_TABLE, null, values);
		return 0;
	}

	public Cursor selectRecords() {
//		String[] cols = new String[] {EMP_ID, EMP_NAME};
//		Cursor mCursor = database.query(true, EMP_TABLE, cols, null, null, null, null, null, null);
//		if (mCursor != null) {
//			mCursor.moveToFirst();
//		}
//		return mCursor; // iterate to get each value.
		return null;
	}
}