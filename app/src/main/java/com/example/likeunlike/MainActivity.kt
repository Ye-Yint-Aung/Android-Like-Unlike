package com.example.likeunlike


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var text: TextView;
    private lateinit var btnLike: Button;
    private lateinit var btnUnLike: Button;
    private lateinit var likeImage: ImageView;
    private lateinit var unLikeImage: ImageView;
    private var count: Int = 1500;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLike = findViewById(R.id.btnLike)
        btnUnLike = findViewById(R.id.btnUnlike)
        text = findViewById(R.id.text)
        likeImage = findViewById(R.id.likeImage)
        unLikeImage = findViewById(R.id.unlikeImage)
        updateUI();
    }

    private fun updateUI() {
        btnLike.setOnClickListener(this)
        btnUnLike.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v!!.id == R.id.btnLike) {
            /*Toast.makeText(this, "Like Button", Toast.LENGTH_LONG).show()*/
            count++
            text.text = "$count : people like this."
            likeImage.isVisible = true
            unLikeImage.isVisible = false
        } else {
            /*Toast.makeText(this, "UnLike Button", Toast.LENGTH_LONG).show()*/
            count--
            text.text = "$count : people like this."
            likeImage.isVisible = false
            unLikeImage.isVisible = true
        }
    }

}

