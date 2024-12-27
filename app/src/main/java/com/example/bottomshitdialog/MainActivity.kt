package com.example.bottomshitdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomshitdialog.databinding.ActivityMainBinding
import com.example.bottomshitdialog.databinding.BottomShitDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(){
            val dialog = BottomSheetDialog(this)
            val view = BottomShitDialogBinding.inflate(layoutInflater)
           view.btnDismis.setOnClickListener(){
               dialog.dismiss()
           }
            dialog.setContentView(view.root)
            dialog.show()
        }
    }
}