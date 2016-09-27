package sql.androidy.admin.sqlactivity;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class SqlActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText userName, userPwd;
    private ListView lv_magress;
    private int[] btns_id = {R.id.btn_insert, R.id.btn_delete, R.id.btn_update, R.id.btn_selectnoe,
            R.id.btn_selectall, R.id.btn_finish};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);
        initdata();
        initView();
        lisnerView();
    }

    private void initdata() {

    }

    private void initView() {
        userName = (EditText) this.findViewById(R.id.userName);
        userPwd = (EditText) this.findViewById(R.id.userPwd);
        lv_magress = (ListView) this.findViewById(R.id.lv_mangess);
    }

    private void lisnerView() {
        for (int id : btns_id
                ) {
            findViewById(id).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {

    }
}
