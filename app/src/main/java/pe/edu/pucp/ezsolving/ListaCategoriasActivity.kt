package pe.edu.pucp.ezsolving

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.SearchView
import pe.edu.pucp.ezsolving.databinding.ListaCategoriasBinding.inflate
import pe.edu.pucp.ezsolving.databinding.ListaCategoriasBinding

class ListaCategoriasActivity : AppCompatActivity() {
    lateinit var binding : ListaCategoriasBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(binding.root)

        val user = arrayOf("Algebra","Trigonometría","Circuitos eléctricos", "Com1","Com2","Campos Electromágneticos","Fund. Física","Mecánica","Estática",
        "Ing. de Redes Inalámbricas","Series y Transformadas","Ing. de Tráfico","SDN","Probabilidades","Cálculo Multivariable")

        val userAdapter : ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1,
            user
        )

        binding.userList1.adapter = userAdapter

        binding.searchView.setOnQueryTextListener(object  : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.searchView.clearFocus()
                if (user.contains(query)){

                    userAdapter.filter.filter(query)

                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                userAdapter.filter.filter(newText)
                return false
            }


        })

        binding.button.setOnClickListener{
            val intentPublic = Intent(this, FinalPublicacionActivity::class.java)
            startActivity(intentPublic)
        }

    }
}