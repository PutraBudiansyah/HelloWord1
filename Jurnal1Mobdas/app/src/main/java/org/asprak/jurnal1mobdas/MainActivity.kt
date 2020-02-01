package org.asprak.jurnal1mobdas

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    var counter : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Update First View
        Update(R.string.kucing1,R.drawable.chinchilla)
        // Update View when the button is pressed
        findViewById<Button>(R.id.next).setOnClickListener {
            counter = (counter + 1) % 6
            when(counter) {
                0 -> {
                    Update(R.string.kucing1,R.drawable.chinchilla)
                }
                1 -> {
                    Update(R.string.kucing2,R.drawable.burmese)
                }
                2 -> {
                    Update(R.string.kucing3,R.drawable.mainecoon)
                }
                3 -> {
                    Update(R.string.kucing4,R.drawable.african)
                }
                4 -> {
                    Update(R.string.kucing5,R.drawable.tortoiseshell)
                }
                5 -> {
                    Update(R.string.kucing6,R.drawable.calico)
                }
            }
        }
    }
    //Update Method
    fun Update(idtitle : Int , idImage : Int){
        findViewById<ImageView>(R.id.image_cat).setImageResource(idImage)
        findViewById<TextView>(R.id.title_cat).setText(idtitle)
    }
}
