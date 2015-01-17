package com.hulixerian.andhsa;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class HsaDatabaseHelper extends SQLiteOpenHelper
{
	private static final String DATABASE_NAME = "HsaDatabase";
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_CREATE =
			"CREATE TABLE " + HsaDatabase.SALE_AGENT_TABLE +
					"(" +
					HsaDatabase.ID_FIELD + " INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
					HsaDatabase.FIRST_NAME_FIELD + " VARCHAR(255) NOT NULL CHARACTER SET UTF8, " +
					HsaDatabase.LAST_NAME_FIELD + " VARCHAR(255) NOT NULL CHARACTER SET UTF8, " +
					HsaDatabase.EMAIL_ADDRESS_FIELD + " VARCHAR(255) NOT NULL CHARACTER SET UTF8, " +
					HsaDatabase.BIRTH_DATE_FIELD + " DATE NOT NULL, " +
					HsaDatabase.PHONE_NUMBER_FIELD + " VARCHAR(16) NOT NULL CHARACTER SET UTF8, " +
					HsaDatabase.WORK_ADDRESS_FIELD + " VARCHAR(511) NOT NULL CHARACTER SET UTF8, " +
					HsaDatabase.HOME_ADDRESS_FIELD + " VARCHAR(511) NOT NULL CHARACTER SET UTF8, " +
					HsaDatabase.KEY_IV_AES_FIELD + " VARCHAR(128) NOT NULL CHARACTER SET UTF8, " +
					HsaDatabase.SESSION_FIELD + " VARCHAR(128) NOT NULL CHARACTER SET UTF8, " +
					HsaDatabase.REGISTERED_FIELD + " BOOLEAN NOT NULL" +
					");";
	public HsaDatabaseHelper(Context context)
	{
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase database)
	{
		database.execSQL(DATABASE_CREATE);
	}
	@Override
	public void onUpgrade(SQLiteDatabase database,int oldVersion,int newVersion)
	{
	}
}
