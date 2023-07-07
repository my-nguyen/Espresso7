package com.nguyen.espresso7

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View

/**
 * An [Activity] that gets a text string from the user and displays it back when the user
 * clicks on one of the two buttons. The first one shows it in the same activity and the second
 * one opens another activity and displays the message.
 */
class MainActivity : Activity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("http://developer.android.com")
        startActivity(intent)
    }
}