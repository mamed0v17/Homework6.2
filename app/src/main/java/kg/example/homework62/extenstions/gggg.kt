package kg.example.homework62.extenstions

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URL

fun View.load(url: URL){
    Glide.with(this).load(url).into(this as ImageView)
}