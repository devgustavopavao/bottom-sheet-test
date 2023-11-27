package com.devgusta.bottom_sheet_test.utils

import android.app.Activity
import com.devgusta.bottom_sheet_test.R
import com.devgusta.bottom_sheet_test.databinding.BottomSheetItemBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

fun Activity.initBottomSheet(
    textDialog: Int? = null,
    btnAccept: Int? = null,
    msg: Int,
    onClick: () -> Unit = {}
){
    val bottomSheet = BottomSheetDialog(this, R.style.BottomSheet)
    val binding: BottomSheetItemBinding =
        BottomSheetItemBinding.inflate(layoutInflater,null,false)

    binding.textTitle.text = getText(textDialog ?: R.string.text_warning)
    binding.btnAccept.text = getText(btnAccept ?: R.string.btn_accept)
    binding.textMsg.text = getText(msg)
    binding.btnAccept.setOnClickListener{
        onClick()
        bottomSheet.dismiss()
    }
    bottomSheet.setContentView(binding.root)
    bottomSheet.show()
}