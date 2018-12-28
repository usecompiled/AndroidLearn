package com.zhongchen.pic.pictra


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

import com.zhongchen.pic.objects.Company
import com.zhongchen.pic.utils.CompanyAdapter

import java.util.ArrayList

class ListActivity : AppCompatActivity() {

    private val comlist = ArrayList<Company>()

    private val data = arrayOf("alipay", "google", "amazon")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        initCompany()
        val adapter = CompanyAdapter(
                this@ListActivity, R.layout.companies_list, comlist)
        val listView = findViewById<View>(R.id.list_view) as ListView
        listView.adapter = adapter
    }

    private fun initCompany() {
        for (i in 0..9) {
            val alipay = Company("Alipay", R.drawable.alipay)
            comlist.add(alipay)
            val amazon = Company("Amazon", R.drawable.google)
            comlist.add(amazon)
            val google = Company("Google", R.drawable.amazon)
            comlist.add(google)

        }
    }
}
