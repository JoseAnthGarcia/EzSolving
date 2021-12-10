package pe.edu.pucp.ezsolving

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.pucp.ezsolving.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btFtPublicar.setOnClickListener {
            val intentPublic = Intent(this, EmpezarPublicacionActivity::class.java)
            startActivity(intentPublic)
        }

        binding.btPublish.setOnClickListener{
            val intentPublic = Intent(this, EmpezarPublicacionActivity::class.java)
            startActivity(intentPublic)
        }

        binding.btCmt1.setOnClickListener{
            val intentContent = Intent(this, ComentarioPublicacinActivity::class.java)
            startActivity(intentContent)
        }
    }
}