package com.example.a215024test;

import android.app.Activity;
        import android.os.Bundle;
        import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
        import android.view.MenuItem;
        import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
        import android.widget.Toast;

import androidx.annotation.NonNull;

public class MenuNavigation extends Activity {
    private static final int SCLLO = 1;// 新建文件菜单标识
    private static final int CLASS = 2;// 打开文件菜单标识
    private static final int NAME = 3;// 保存文件菜单标识
    private static final int ID =4; // 退出应用菜单标识

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menunavigation);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1,SCLLO,1,"河工大");
        menu.add(1,CLASS,2,"软件211");
        menu.add(1,NAME,3,"牛子墨");
        menu.add(1,ID,4,"215024");
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case SCLLO:
                Toast.makeText(this, "【学校】选项被点击", Toast.LENGTH_SHORT).show();
                break;
            case CLASS:
                Toast.makeText(this, "【班级】选项被点击", Toast.LENGTH_SHORT).show();
                break;
            case NAME:
                Toast.makeText(this, "【姓名】选项被点击", Toast.LENGTH_SHORT).show();
                break;
            case ID:
                Toast.makeText(this, "【学号】选项被点击", Toast.LENGTH_SHORT).show();
                break;
        }
        return  true;
    }
}