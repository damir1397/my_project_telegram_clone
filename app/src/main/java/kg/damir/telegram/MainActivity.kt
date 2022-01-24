package kg.damir.telegram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kg.damir.telegram.databinding.ActivityMainBinding
import kg.damir.telegram.ui.ChatsFragment
import kg.damir.telegram.ui.objects.AppDrawer

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mToolbar: androidx.appcompat.widget.Toolbar

    private lateinit var appDrawer: AppDrawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }


    private fun initFunc() {
        setSupportActionBar(mToolbar)
        appDrawer.create()
        supportFragmentManager.beginTransaction().replace(R.id.dataContainer,ChatsFragment()).commit()
    }

    private fun initFields() {
        mToolbar = binding.mainToolbar
        appDrawer = AppDrawer(this, mToolbar)
    }

}