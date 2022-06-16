package com.wkq.vipimageview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wkq.vipimageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var i: Float = 10f
    private var angle = 30

    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    fun click(view: View) {
        when (view.id) {
            R.id.bt1 -> {
                binding!!.iiv.bigCircleImageView.setImageResource(R.mipmap.guojia)
            }
            R.id.bt2 -> {
                binding!!.iiv.setRadiusScale(0.2f)
            }
            R.id.bt3 -> {
                //增加边框
                binding!!.iiv.setBorderWidth(50)
                binding!!.iiv.setBorderColor(R.color.purple_200)
            }
            R.id.bt4 -> {
                //增加进度条，没按一次加10,以及改变的角度
                //增加进度条，没按一次加10,以及改变的角度
                binding!!.iiv.setIsprogress(true)
                binding!!.iiv.setProgressColor(R.color.teal_200)
                i = 1 + 10f
                binding!!.iiv.setProgress(i)
            }
            R.id.bt5 -> {
                binding!!.iiv.getSmallCircleImageView().setImageResource(R.mipmap.vip)
            }
            R.id.bt6 -> {
                angle += 7
                binding!!.iiv.setAngle(angle)
            }
        }
    }
}