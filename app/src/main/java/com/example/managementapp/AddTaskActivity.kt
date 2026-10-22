package com.example.managementapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.managementapp.databinding.ActivityAddTaskBinding

class AddTaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAddTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengambil data dari form saat tombol simpan diklik
        binding.tombolSave.setOnClickListener {
            val mapel = binding.editMapel.text.toString().trim()
            val judulTugas = binding.editJudulTugas.text.toString().trim()
            val deskripsi = binding.editDeskripsi.text.toString().trim()

            if (mapel.isEmpty() || judulTugas.isEmpty()) {
                Toast.makeText(this, "Mata Pelajaran dan judul wajib diisi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Tugas $judulTugas telah ditambahkan", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}
