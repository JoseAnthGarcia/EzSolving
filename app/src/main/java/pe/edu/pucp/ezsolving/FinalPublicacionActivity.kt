package pe.edu.pucp.ezsolving

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.pucp.ezsolving.databinding.ActivityMainBinding
import pe.edu.pucp.ezsolving.databinding.FinalPublicacionBinding

class FinalPublicacionActivity : AppCompatActivity() {
    private lateinit var binding: FinalPublicacionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        binding = FinalPublicacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btHome.setOnClickListener{
            val intentHome = Intent(this, MainActivity::class.java)
            startActivity(intentHome)
        }
    }
}