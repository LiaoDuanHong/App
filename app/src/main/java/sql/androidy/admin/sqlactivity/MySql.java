package sql.androidy.admin.sqlactivity;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 2016/8/10.
 */
public class MySql extends SQLiteOpenHelper{
    public MySql(Context context, String name) {
        super(context, name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
      String createtable="create table tuser" +
              "(id integer primary key autoincrement,userName varchar(20),userPwd varchar(20))";
        sqLiteDatabase.execSQL(createtable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
