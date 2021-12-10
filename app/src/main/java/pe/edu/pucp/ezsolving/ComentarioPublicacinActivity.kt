package pe.edu.pucp.ezsolving

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ComentarioPublicacinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        setContentView(R.layout.activity_comentario_publicacin)
    }
}