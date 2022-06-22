package com.wkq.vipimageview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wkq.vipimageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var i: Float = 10f
    private var angle = 30
    private var bl = 0.1f

    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding!!.vip.bigCircleImageView.setImageResource(R.mipmap.test)
        binding!!.vip.setRadiusScale(bl)
    }

    fun click(view: View) {
        when (view.id) {
            R.id.bt1 -> {
                //设置文字
                binding!!.vip.setText("VIP")
                binding!!.vip.setTextColor(R.color.white)
            }
            R.id.bt2 -> {
                // 大图小图缩小比例
                bl+=0.1f
                binding!!.vip.setRadiusScale(bl)
            }
            R.id.bt3 -> {
                //增加边框
                binding!!.vip.setBorderWidth(30)
                binding!!.vip.setBorderColor(R.color.purple_200)
            }
            R.id.bt4 -> {
                //增加进度条，没按一次加10,以及改变的角度
                binding!!.vip.setIsprogress(true)
                binding!!.vip.setProgressColor(R.color.teal_200)
                i = i + 30f
                binding!!.vip.setProgress(i)
            }
            R.id.bt5 -> {
                //设置小图标
                binding!!.vip.getSmallCircleImageView().setImageResource(R.mipmap.new_vip)
            }
            R.id.bt6 -> {
                //设置圆形进度
                angle += 7
                binding!!.vip.setAngle(angle)
            }
        }
    }
}