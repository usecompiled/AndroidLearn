package com.zhongchen.pic.pictra;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.zhongchen.pic.objects.Company;
import com.zhongchen.pic.utils.CompanyAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private List<Company> comlist = new ArrayList<>();

    private String[] data = {"alipay","google","amazon",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initCompany();
        CompanyAdapter adapter = new CompanyAdapter(
                ListActivity.this,R.layout.companies_list,comlist);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initCompany() {
        for (int i = 0;i < 10;i++){
            Company alipay = new Company("Alipay",R.drawable.alipay);
            comlist.add(alipay);
            Company amazon = new Company("Amazon",R.drawable.google);
            comlist.add(amazon);
            Company google = new Company("Google",R.drawable.amazon);
            comlist.add(google);

        }
    }
}
