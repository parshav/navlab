package com.pv.navigationlab

import androidx.compose.material.DrawerState

suspend fun DrawerState.toggle() {
    if (this.isOpen) this.close()
    else this.open()
}
