package com.web.testtask.data.model


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PreviewGif(
    var height: String ="",
    var size: String ="",
    var url: String ="",
    var width: String =""
): Parcelable