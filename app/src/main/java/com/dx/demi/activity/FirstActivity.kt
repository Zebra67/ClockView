package com.dx.demi.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log

import com.blankj.utilcode.util.LogUtils
import com.dx.demi.R
import kotlinx.android.synthetic.main.activity_first.*

/**
 * Created by demi on 2018/5/18.
 *
 */

class FirstActivity : Activity() {
    private val TAG = "Activity生命周期"
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "FirstActivity onCreate")
        setContentView(R.layout.activity_first)
        start.setOnClickListener{
            startActivity(Intent(this,TwoActivity::class.java))
        }
    }

    protected override fun onStart() {
        super.onStart()
        Log.i(TAG, "FirstActivity onStart")
    }


    protected override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "FirstActivity onRestoreInstanceState")
    }

    protected override fun onResume() {
        super.onResume()
        Log.i(TAG, "FirstActivity onResume")
    }

    protected override fun onPause() {
        super.onPause()
        Log.i(TAG, "FirstActivity onPause")
    }

    protected override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "FirstActivity onSaveInstanceState")
    }

    protected override fun onStop() {
        super.onStop()
        Log.i(TAG, "FirstActivity onStop")
    }

    protected override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "FirstActivity onDestroy")
    }
}
