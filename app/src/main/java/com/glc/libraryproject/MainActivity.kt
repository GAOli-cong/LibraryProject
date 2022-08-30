package com.glc.libraryproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.glc.glccode.GlcCodeUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //使用jitpack 引入的依赖中的求和方法
       val num=GlcCodeUtils.add(1,1)
        Log.d("MainActivity", "1加1求和：$num")
        Toast.makeText(application, "1加1求和：$num", Toast.LENGTH_SHORT).show()
    }
}