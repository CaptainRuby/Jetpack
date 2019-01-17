package com.rubyke.jetpack.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.rubyke.jetpack.ui.activity.vm.MainViewModel
import com.rubyke.jetpack.R
import com.rubyke.jetpack.databinding.MainActivityBinding
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : BaseActivity<MainActivityBinding, MainViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView(MainViewModel::class.java, R.layout.main_activity)
    }

    override fun initData() {

    }

    override fun initView() {
        tv.text = viewModel.message
    }

    val onClick = View.OnClickListener {
        AddActivity.start(this,"haha")
    }
}
