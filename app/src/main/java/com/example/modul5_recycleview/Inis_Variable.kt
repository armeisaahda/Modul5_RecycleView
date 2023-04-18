package com.example.modul5_recycleview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Inis_Variable(
    val fotomhs: Int = 0,
    val namamhs : String,
    val Nimmhs : String,
    val Telpmhs : String
) : Parcelable


