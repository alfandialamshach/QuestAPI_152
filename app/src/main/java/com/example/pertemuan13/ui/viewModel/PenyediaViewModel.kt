package com.example.pertemuan13.ui.viewModel

import DetailMhsViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan13.MahasiswaApplications

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer { HomeViewModel(AplikasiMahasiswa().container.mahasiswaRepository) }
        initializer { InsertViewModel(AplikasiMahasiswa().container.mahasiswaRepository) }
        initializer { DetailMhsViewModel(createSavedStateHandle(),AplikasiMahasiswa().container.mahasiswaRepository) }
        initializer { UpdateMhsViewModel(createSavedStateHandle(),AplikasiMahasiswa().container.mahasiswaRepository) }
    }

    fun CreationExtras.AplikasiMahasiswa():MahasiswaApplications =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as MahasiswaApplications)
}