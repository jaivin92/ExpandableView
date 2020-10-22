package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView listview;
    ExpandableListAdapter adapter;
    List<String> headlist;
    HashMap<String, List<String>> detailview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ExpandableListView) findViewById(R.id.expandable_list_View);
        detailview = Data.getData();
        headlist = new ArrayList<String>(detailview.keySet());
        adapter = new Adapter(this, headlist, detailview);
        listview.setAdapter(adapter);

        listview.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        headlist.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        listview.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        headlist.get(groupPosition) + " List Collapsed.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        listview.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                Toast.makeText(
                        getApplicationContext(),
                        headlist.get(groupPosition)
                                + " -> "
                                + detailview.get(
                                headlist.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT
                ).show();

                return false;
            }
        });
    }
}