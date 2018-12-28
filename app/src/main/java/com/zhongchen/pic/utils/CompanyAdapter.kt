package com.zhongchen.pic.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

import com.zhongchen.pic.objects.Company
import com.zhongchen.pic.pictra.R

    class CompanyAdapter(context: Context, private val resourceId: Int, coms: List<Company>) : ArrayAdapter<Any>(context, resourceId, coms) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val company = getItem(position) as Company
        val view: View
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(resourceId, parent, false)
        } else {
            view = convertView
        }
        val comImage = view.findViewById<View>(R.id.company_image) as ImageView
        val comText = view.findViewById<View>(R.id.company_name) as TextView

        comImage.setImageResource(company.imageid)
        comText.text = company.name
        return view
    }
}
