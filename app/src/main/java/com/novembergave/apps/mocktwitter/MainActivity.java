package com.novembergave.apps.mocktwitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<TweetObject> dummyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dummyList = generateDummyList();
        setUpRecyclerView();
    }

    private List<TweetObject> generateDummyList() {
        List<TweetObject> list = new ArrayList<>();
        list.add(new TweetObject("Account1", "@Account1", true, 1501947272135L, 1, "Hi"));
        list.add(new TweetObject("Account2", "@Account2", true, 1501947371284L, 10, "This"));
        list.add(new TweetObject("Account3", "@Account3", true, 1501947386210L, 15, "Is"));
        list.add(new TweetObject("Account4", "@Account4", true, 1501947394716L, 22, "My"));
        list.add(new TweetObject("Account5", "@Account5", true, 1501947404848L, 36, "Message"));
        list.add(new TweetObject("Account6", "@Account6", true, 1501947416733L, 45, "How"));
        list.add(new TweetObject("Account7", "@Account7", true, 1501947424178L, 46, "Are"));
        list.add(new TweetObject("Account8", "@Account8", true, 1501947432990L, 55, "You?"));
        return list;
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        TweetAdapter adapter = new TweetAdapter(dummyList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }


}
