package com.example.appsignup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.form11.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [showinfo.newInstance] factory method to
 * create an instance of this fragment.
 */
class showinfo : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var info:String=""
    private var info2:String=""
    private var info3:String=""
    private var info4:String=""
    private var inforb:String=""
    private var name:String=""
    private var lname:String=""
    private var zipcode:String=""
    private var date:String=""
    private var month:String=""
    private var year:String=""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        info=requireArguments().getString("info").toString()
        info2=requireArguments().getString("info2").toString()
        info3=requireArguments().getString("info3").toString()
        info4=requireArguments().getString("info4").toString()
        inforb=requireArguments().getString("inforb").toString()
        name=requireArguments().getString("name").toString()
        lname=requireArguments().getString("lname").toString()
        zipcode=requireArguments().getString("zipcode").toString()
        date=requireArguments().getString("date").toString()
        month=requireArguments().getString("month").toString()
        year=requireArguments().getString("year").toString()



    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_showinfo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var txt1 = view.findViewById<TextView>(R.id.txt1)
        var txt2 = view.findViewById<TextView>(R.id.txt2)
        var txt3 = view.findViewById<TextView>(R.id.txt3)
        var txt4 = view.findViewById<TextView>(R.id.txt4)
        var txt5 = view.findViewById<TextView>(R.id.txt5)
        var txt6 = view.findViewById<TextView>(R.id.txt6)
        var txt7 = view.findViewById<TextView>(R.id.txt7)
        var txtdata = view.findViewById<TextView>(R.id.txtdata)
        var txtmonth = view.findViewById<TextView>(R.id.txtmonth)
        var txtyear = view.findViewById<TextView>(R.id.txtyear)
        var txt9 = view.findViewById<TextView>(R.id.txt9)


        txt1.text = info
        txt2.text = info2
        txt3.text = info3
        txt4.text = info4
        txt9.text = inforb
        txt5.text = name
        txt6.text = lname
        txt7.text = zipcode

        txtdata.text = date
        txtmonth.text = month
        txtyear.text = year

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment showinfo.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            showinfo().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}