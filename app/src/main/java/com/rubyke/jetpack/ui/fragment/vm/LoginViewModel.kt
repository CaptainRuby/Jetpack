package com.rubyke.jetpack.ui.fragment.vm

import com.rubyke.jetpack.ui.activity.vm.BaseViewModel

class LoginViewModel: BaseViewModel(){

    lateinit var message:String

    override fun initData() {
        message = "login"
    }

}
