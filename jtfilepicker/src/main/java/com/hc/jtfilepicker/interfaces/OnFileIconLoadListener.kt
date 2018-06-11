package com.hc.jtfilepicker.interfaces

import android.widget.ImageView
import com.hc.jtfilepicker.FileBean

/**
 * Created by william on 2018/3/2.
 */
interface OnFileIconLoadListener {
    fun fileIconLoad(iv: ImageView, fileBean: FileBean)
}