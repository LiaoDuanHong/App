package sql.androidy.admin.sqlactivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2016/8/10.
 */
public class SqlUtil {
    private MySql mySql;
    private SQLiteDatabase sqLiteDatabase = mySql.getWritableDatabase();

    public SqlUtil(Context context) {
        mySql = new MySql(context, "Tuser.db");
    }

    public void save(Users users) {
        sqLiteDatabase.execSQL("insert into tuser(userName,userPwd) value(?,?)",
                new Object[]{users.getUserName(), users.getUserPwd()});
        sqLiteDatabase.close();
    }

    public void delete(Integer id) {
        sqLiteDatabase.execSQL("delete from tuser where id=?", new Object[]{id});
        sqLiteDatabase.close();
    }

    public void upDate(Users users) {
        sqLiteDatabase.execSQL("update tuser set userName=?,userPwd=?",
                new Object[]{users.getUserName(), users.getUserPwd()});
        sqLiteDatabase.close();
    }

    public Users selectOne(Integer id) {
        Users users = null;
        Cursor cursor = sqLiteDatabase.rawQuery
                ("select * from tuser where id=?", new String[]{id.toString()});
        if (cursor.moveToFirst()) {
            int userId = cursor.getInt(cursor.getColumnIndex("id"));
            String userName = cursor.getString(cursor.getColumnIndex("userName"));
            String userPwd = cursor.getString(cursor.getColumnIndex("userPwd"));
            users = new Users(userName, userPwd);
            users.setId(userId);
        }
        sqLiteDatabase.close();
        return users;
    }

    public List<Users> selectALL(Integer id) {
        List<Users> users = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.rawQuery
                ("select * from tuser", null);
        Users temp = null;
        while (cursor.moveToLast()) {
            int userId = cursor.getInt(cursor.getColumnIndex("id"));
            String userName = cursor.getString(cursor.getColumnIndex("userName"));
            String userPwd = cursor.getString(cursor.getColumnIndex("userPwd"));
            temp = new Users(userName, userPwd);
            temp.setId(userId);
        }
        sqLiteDatabase.close();
        return users;
    }
}
