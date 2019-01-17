package com.rubyke.jetpack.ui.activity.vm

class MainViewModel: BaseViewModel(){

    lateinit var message:String

    override fun initData() {
        message = "321"
    }

}
