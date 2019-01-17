package com.rubyke.jetpack.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.rubyke.jetpack.ui.activity.vm.AddViewModel
import com.rubyke.jetpack.R
import com.rubyke.jetpack.databinding.AddActivityBinding
import com.rubyke.jetpack.ui.fragment.LoginFragment
import kotlinx.android.synthetic.main.add_activity.*

class AddActivity : BaseActivity<AddActivityBinding, AddViewModel>() {

    private lateinit var message: String

    companion object {

        const val KEY_MESSAGE:String = "KEY_MESSAGE"

        @JvmStatic
        fun start(context: Context,message:String){
            val intent = Intent(context,AddActivity::class.java)
            intent.putExtra(KEY_MESSAGE,message)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView(AddViewModel::class.java, R.layout.add_activity)
    }

    override fun initData() {
        message = intent.getStringExtra(KEY_MESSAGE)
    }

    override fun initView() {
        supportFragmentManager.beginTransaction().add(R.id.container,LoginFragment.newInstance(message), null).commit()
    }

}
