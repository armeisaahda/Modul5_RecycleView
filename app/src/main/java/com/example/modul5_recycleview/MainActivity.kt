package com.example.modul5_recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(
        Inis_Variable(
            R.drawable. wanda,
            namamhs = "Wanda",
            Nimmhs = "0001",
            Telpmhs = "084123"
            ),
        Inis_Variable(
            R.drawable. xavier,
            namamhs = "Xavier",
            Nimmhs = "0002",
            Telpmhs = "082432"
        ),
        Inis_Variable(
            R.drawable. emmajpg,
            namamhs = "Emma",
            Nimmhs = "0003",
            Telpmhs = "081234"
        ),
        Inis_Variable(
            R.drawable. nadlyne,
            namamhs = "Nadlyne",
            Nimmhs = "0004",
            Telpmhs = "081456"
        ),
        Inis_Variable(
            R.drawable. aurora,
            namamhs = "Aurora",
            Nimmhs = "0005",
            Telpmhs = "0812365"
        ),
        Inis_Variable(
            R.drawable. dalmi,
            namamhs = "Dalmi",
            Nimmhs = "0006",
            Telpmhs = "0823522"
        ),
        Inis_Variable(
            R.drawable. ariana,
            namamhs = "Ariana",
            Nimmhs = "0007",
            Telpmhs = "0881293"
        )

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

//        ShowListMahasiswa()
        ShowCardMahasiswa()
        ShowGridMahasiswa()
    }

    private fun ShowGridMahasiswa() {
        val adapter = Grid_MahasiswaAdapter(grid_mhs = Datamahasiswa){
        }
        val recyclerView =
            findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
            recyclerView.layoutManager = GridLayoutManager (this, 2)
            recyclerView.adapter = Grid_MahasiswaAdapter (Datamahasiswa) {
        }
    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = Card_MahasiswaAdapter(this, Datamahasiswa) {}
        recyclerView.adapter = adapter
    }

    private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter= List_MahasiswaAdapter(this, Datamahasiswa){

        }
    }
}