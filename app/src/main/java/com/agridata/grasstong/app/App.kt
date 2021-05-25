package com.agridata.grasstong.app

import android.app.Application
import com.win.lib_base.utils.BaseContext

/**
 * @ProjectName : GrassTong
 * @Author :
 * @Time : 2021/5/25 14:06
 * @Description :
 */
class App :Application() {

    override fun onCreate() {
        super.onCreate()
        BaseContext.instance.init(this)
    }
}