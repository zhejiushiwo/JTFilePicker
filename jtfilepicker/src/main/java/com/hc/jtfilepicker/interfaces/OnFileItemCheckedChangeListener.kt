package com.hc.jtfilepicker.interfaces

import com.hc.jtfilepicker.FileBean

/**
 * Created by william on 2018/3/2.
 */
interface OnFileItemCheckedChangeListener {
    fun onFileItemCheckedChange(checked: Boolean, fileBean: FileBean)
}