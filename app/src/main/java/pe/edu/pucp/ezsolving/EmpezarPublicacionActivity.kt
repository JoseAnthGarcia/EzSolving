package pe.edu.pucp.ezsolving

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.pucp.ezsolving.databinding.ActivityMainBinding
import pe.edu.pucp.ezsolving.databinding.EmpezarPublicacionBinding

class EmpezarPublicacionActivity : AppCompatActivity() {
    private lateinit var binding: EmpezarPublicacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        binding = EmpezarPublicacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val intentCategory = Intent(this, ListaCategoriasActivity::class.java)
            startActivity(intentCategory)
        }

        binding.button2.setOnClickListener{
            val intentReturn = Intent(this, MainActivity::class.java)
            startActivity(intentReturn)
        }
    }
}