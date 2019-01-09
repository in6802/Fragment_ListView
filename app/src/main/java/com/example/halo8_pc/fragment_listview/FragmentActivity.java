package com.example.halo8_pc.fragment_listview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FragmentActivity extends Fragment {


    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //listView
        View view = inflater.inflate(R.layout.fragment, null);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, LIST_MENU);
        //ArrayAdapter adapter = new ArrayAdapter(getActivity(), R.layout.list_item, LIST_MENU);

        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String strText = (String) parent.getItemAtPosition(position);
//
//                //TextView itemTitle = (TextView) view.findViewById(R.id.tvTitle);
//                //itemTitle.setText(strText);
//            }
//        });

        return inflater.inflate(R.layout.fragment, container, false);
    }
}
