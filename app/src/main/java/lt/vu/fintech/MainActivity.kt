package lt.vu.fintech

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import lt.vu.fintech.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    initContent()
                }
            }
        }
    }

    fun initContent()
    {
        setContentView(R.layout.mainlayout)
        prepareTextButton()
        prepareColourButton()
    }

    fun prepareTextButton()
    {
        findViewById<Button>(R.id.show_text_button)
            .setOnClickListener {
                val textView = findViewById<View>(R.id.appearing_text) as TextView
                textView.text = "Text appeared"
            }
    }

    fun prepareColourButton()
    {
        findViewById<Button>(R.id.change_colour_button)
            .setOnClickListener {
                val textView = findViewById<View>(R.id.appearing_text) as TextView
                textView.setTextColor(Color.RED)
            }
    }
}