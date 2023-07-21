package sg.edu.rp.c346.id22011117.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<ToDoItem> alToDoItem;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listViewToDo);
        alToDoItem = new ArrayList<>();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2020, 8, 1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2020, 8, 2);

        ToDoItem item1 = new ToDoItem("Go for movie", calendar1);
        ToDoItem item2 = new ToDoItem("Go for haircut", calendar2);

        alToDoItem.add(item1);
        alToDoItem.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, alToDoItem);
        lv.setAdapter(adapter);

    }
}