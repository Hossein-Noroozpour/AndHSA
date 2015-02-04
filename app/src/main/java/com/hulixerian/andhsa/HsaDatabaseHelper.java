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
					HsaDatabase.KEY_IV_AES_FIELD + " , " +
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
