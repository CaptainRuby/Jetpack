package com.rubyke.jetpack.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rubyke.jetpack.R
import com.rubyke.jetpack.databinding.LoginFragmentBinding
import com.rubyke.jetpack.ui.fragment.vm.LoginViewModel
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : BaseFragment<LoginFragmentBinding, LoginViewModel>() {

    private lateinit var message: String

    companion object {

        const val KEY_MESSAGE:String = "KEY_MESSAGE"

        fun newInstance(message:String):LoginFragment{
            val args: Bundle = Bundle()
            args.putString(KEY_MESSAGE, message)
            val fragment = LoginFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return setView(LoginViewModel::class.java, inflater, container, R.layout.login_fragment).root
    }

    override fun initData() {
        message = arguments?.getString(KEY_MESSAGE)?:"null"
    }

    override fun initView() {
        tv.text = message
    }
}