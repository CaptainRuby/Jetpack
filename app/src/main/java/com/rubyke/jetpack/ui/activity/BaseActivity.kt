package com.rubyke.jetpack.ui.activity

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import com.rubyke.jetpack.BR
import com.rubyke.jetpack.ui.activity.vm.BaseViewModel

abstract class BaseActivity<B:ViewDataBinding,V: BaseViewModel>:AppCompatActivity(){

    lateinit var viewModel:V

    fun setView(clazz: Class<V>,layoutId:Int){
        this.viewModel = ViewModelProviders.of(this).get(clazz)
        val binding = DataBindingUtil.setContentView<B>(this,layoutId)
        binding.setVariable(BR.window,this)
        initData()
        viewModel.initData()
        initView()
    }

    abstract fun initData()

    abstract fun initView()
}