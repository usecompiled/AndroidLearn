package com.zhongchen.pic.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhongchen.pic.objects.Company;
import com.zhongchen.pic.pictra.R;

import java.util.List;

public class CompanyAdapter extends ArrayAdapter {

    private  int resourceId;

    public CompanyAdapter(Context context, int textViewResouceId, List<Company> coms){
        super(context,textViewResouceId,coms);
        resourceId = textViewResouceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Company company = (Company) getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        }else {
            view = convertView;
        }
        ImageView comImage = (ImageView)view.findViewById(R.id.company_image);
        TextView comText = (TextView)view.findViewById(R.id.company_name);

        comImage.setImageResource(company.getImageid());
        comText.setText(company.getName());
        return view;
    }
}
