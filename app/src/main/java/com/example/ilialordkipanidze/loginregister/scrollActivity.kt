package com.example.signup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_scroll_view.*

class ScrollViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)
        init()
    }

    private fun init(){

        Picasso.get().load("https://www.oxforduniversityimages.com/images/rotate/Image_Spring_17_4.gif").placeholder(R.mipmap.fa_image).into(imageView1)
        Picasso.get().load("https://cdn.vox-cdn.com/thumbor/USPKT0Vcmjkcx_7kb-lBLnuJ1Is=/983x935:2424x2667/1200x800/filters:focal(1351x1042:1991x1682)/cdn.vox-cdn.com/uploads/chorus_image/image/60034597/GettyImages_971886594.0.jpg").placeholder(R.mipmap.fa_image).into(imageView2)
        Picasso.get().load("https://i.dailymail.co.uk/i/pix/2016/11/02/15/39FD647300000578-0-image-a-15_1478101071773.jpg").placeholder(R.mipmap.fa_image).into(imageView3)
        Picasso.get().load("https://www.esa.int/var/esa/storage/images/esa_multimedia/images/2017/11/autumn_fireball/17255671-1-eng-GB/Autumn_fireball_node_full_image_2.jpg").placeholder(R.mipmap.fa_image).into(imageView4)
        Picasso.get().load("https://img.purch.com/rc/696x392/aHR0cDovL3d3dy5zcGFjZS5jb20vaW1hZ2VzL2kvMDAwLzAxMi84NTAvb3JpZ2luYWwvTWFuZ2FpYS1taWxreS13YXkuanBn").placeholder(R.mipmap.fa_image).into(imageView5)

    }
}