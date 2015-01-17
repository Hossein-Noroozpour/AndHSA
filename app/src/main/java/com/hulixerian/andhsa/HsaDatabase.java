package com.hulixerian.andhsa;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
public class HsaDatabase
{
	private HsaDatabaseHelper dbHelper;
	private SQLiteDatabase database;
	public final static String SALE_AGENT_TABLE    = "HsaSaleAgent";
	public final static String ID_FIELD            = "id";
	public final static String FIRST_NAME_FIELD    = "first_name";
	public final static String LAST_NAME_FIELD     = "last_name";
	public final static String EMAIL_ADDRESS_FIELD = "email_address";
	public final static String BIRTH_DATE_FIELD    = "birth_date";
	public final static String PHONE_NUMBER_FIELD  = "phone_number";
	public final static String HOME_ADDRESS_FIELD  = "home_address";
	public final static String WORK_ADDRESS_FIELD  = "work_address";
	public final static String KEY_IV_AES_FIELD    = "key_iv_aes";
	public final static String SESSION_FIELD       = "session_key_iv";
	public final static String REGISTERED_FIELD    = "registered";
	public HsaDatabase(Context context)
	{
		dbHelper = new HsaDatabaseHelper(context);
		database = dbHelper.getWritableDatabase();
	}
	public long createRecords(String id, String name)
	{
//		ContentValues values = new ContentValues();
//		values.put(EMP_ID, id);
//		values.put(EMP_NAME, name);
//		return database.insert(EMP_TABLE, null, values);
		return 0;
	}
	public Cursor selectRecords()
	{
//		String[] cols = new String[] {EMP_ID, EMP_NAME};
//		Cursor mCursor = database.query(true, EMP_TABLE, cols, null, null, null, null, null, null);
//		if (mCursor != null) {
//			mCursor.moveToFirst();
//		}
//		return mCursor; // iterate to get each value.
		return null;
	}
}