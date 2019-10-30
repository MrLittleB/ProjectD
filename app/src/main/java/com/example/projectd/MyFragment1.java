package com.example.projectd;



import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import java.util.ArrayList;

public class MyFragment1 extends Fragment implements AdapterView.OnItemClickListener {
    private ListView list_news;
    private FragmentManager fManager;
    private ArrayList<Data> datas;


    public MyFragment1(FragmentManager fManager) {
        this.fManager = fManager;

        datas = new ArrayList<Data>();
        for (int i = 1; i <= 20; i++) {
            Data data = new Data("新闻标题" + i, i + "~新闻内容~~~~~~~~");
            datas.add(data);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_newlist, container, false);
        list_news = (ListView) view.findViewById(R.id.list_news);
        MyAdapter myAdapter = new MyAdapter(datas, getActivity());//适配器初始化
        list_news.setAdapter(myAdapter);
        list_news.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent1 = new Intent(getActivity(), NewsMainActivity.class);
        startActivity(intent1);
        getActivity().overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
    }



}