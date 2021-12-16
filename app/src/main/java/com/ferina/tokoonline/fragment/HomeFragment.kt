package com.ferina.tokoonline.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager

import com.ferina.tokoonline.R
import com.ferina.tokoonline.adapter.AdapterProduk
import com.ferina.tokoonline.adapter.AdapterSlider
import com.ferina.tokoonline.model.Produk
import java.util.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var vpSlider :ViewPager
    lateinit var rvProduk :RecyclerView
    lateinit var rvTerlaris :RecyclerView
    lateinit var rvRamen :RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view:View = inflater.inflate(R.layout.fragment_home,container,false)
        vpSlider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvTerlaris = view.findViewById(R.id.rv_terlaris)
        rvRamen = view.findViewById(R.id.rv_ramen)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        rvTerlaris.adapter = AdapterProduk(arrTerlaris)
        rvTerlaris.layoutManager = layoutManager2

        rvRamen.adapter = AdapterProduk(arrRamen)
        rvRamen.layoutManager = layoutManager3

        return view
    }

    val arrProduk: ArrayList<Produk> get(){
        val arr =ArrayList<Produk>()
        val p1= Produk()
        p1.nama = "Ramen"
        p1.harga = "Rp.20.000"
        p1.gambar =R.drawable.slider3

        val p2= Produk()
        p2.nama = "Omurice"
        p2.harga = "Rp.15.000"
        p2.gambar =R.drawable.slider3

        val p3= Produk()
        p3.nama = "Sate Jepang"
        p3.harga = "Rp.25.000"
        p3.gambar =R.drawable.slider3

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)



        return arr

    }

    val arrTerlaris: ArrayList<Produk> get(){
        val arr =ArrayList<Produk>()
        val p1= Produk()
        p1.nama = "Ramen"
        p1.harga = "Rp.20.000"
        p1.gambar =R.drawable.slider3

        val p2= Produk()
        p2.nama = "Omurice"
        p2.harga = "Rp.15.000"
        p2.gambar =R.drawable.slider3

        val p3= Produk()
        p3.nama = "Sate Jepang"
        p3.harga = "Rp.25.000"
        p3.gambar =R.drawable.slider3

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)



        return arr

    }

    val arrRamen: ArrayList<Produk> get(){
        val arr =ArrayList<Produk>()
        val p1= Produk()
        p1.nama = "Ramen"
        p1.harga = "Rp.20.000"
        p1.gambar =R.drawable.slider3

        val p2= Produk()
        p2.nama = "Omurice"
        p2.harga = "Rp.15.000"
        p2.gambar =R.drawable.slider3

        val p3= Produk()
        p3.nama = "Sate Jepang"
        p3.harga = "Rp.25.000"
        p3.gambar =R.drawable.slider3

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)



        return arr

    }


}
