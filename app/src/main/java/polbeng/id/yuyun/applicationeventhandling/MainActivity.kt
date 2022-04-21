package polbeng.id.yuyun.applicationeventhandling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // tekan tombol hanya sekali tidak ditahan
        btnDisplayMessage.setOnClickListener{
                Toast.makeText(applicationContext, "Hello Yuni", Toast.LENGTH_LONG).show()
        }

        // tekan tombol agak lama
        btnDisplayMessage.setOnLongClickListener {
            Snackbar.make(root_layout, "Long Click", Snackbar.LENGTH_LONG).show()
            true
        }
    }
}