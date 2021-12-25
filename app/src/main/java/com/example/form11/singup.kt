package com.example.appsignup

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.form11.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [singup.newInstance] factory method to
 * create an instance of this fragment.
 */
class singup : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_singup, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)


        val checkbox = view.findViewById<CheckBox>(R.id.check)
        val btnsub = view.findViewById<Button>(R.id.btnsub)
        val txtemail = view.findViewById<EditText>(R.id.txtemail)
        val txtpass = view.findViewById<EditText>(R.id.txtpass)
        val txttpass = view.findViewById<EditText>(R.id.txttpass)
        val txtphone = view.findViewById<EditText>(R.id.txtphone)
        val txtaddress = view.findViewById<EditText>(R.id.txtaddress)
        var txt = view.findViewById<TextView>(R.id.txt)
        val txtname = view.findViewById<EditText>(R.id.txtfirst)
        val txtlname = view.findViewById<EditText>(R.id.txtfirst2)
        val txtzipcode = view.findViewById<EditText>(R.id.txtzipcod)
        var rbman = view.findViewById<RadioButton>(R.id.radioBtmard)
        var rbwoman = view.findViewById<RadioButton>(R.id.radioBtzan)
        val date = view.findViewById<Spinner>(R.id.Date)
        val month = view.findViewById<Spinner>(R.id.Month)
        val year = view.findViewById<Spinner>(R.id.Year)
        val rgro = view.findViewById<RadioGroup>(R.id.radioGroup)

        var ddt = ""
        var mon = ""
        var yyr = ""
        var ppm = ""
        var ppy = ""
        var ppd = ""

        var list_date = arrayOf("روز تولد", "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30")
        var adapter1 = ArrayAdapter<String>(requireContext(), android.R.layout.simple_spinner_item, list_date)
        date.adapter=adapter1

        var list_month = arrayOf("ماه تولد", "January","Febuary","March","April","May","June","July","August","September","October","November","December")
        var adapter2 = ArrayAdapter<String>(requireContext(), android.R.layout.simple_spinner_item, list_month)
        month.adapter=adapter2

        var list_year = arrayOf("سال تولد", "2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990")
        var adapter3 = ArrayAdapter<String>(requireContext(), android.R.layout.simple_spinner_item, list_year)
        year.adapter=adapter3



        date.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                ddt = position.toString()
                val text: String = parent?.getItemAtPosition(position).toString()
                ppd = text

            }
            override fun onNothingSelected(parent: AdapterView<*>) {
                // Code to perform some action when nothing is selected
            }
        }

        month.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                ppm = position.toString()
                val text: String = parent?.getItemAtPosition(position).toString()
                mon = text

            }
            override fun onNothingSelected(parent: AdapterView<*>) {
                // Code to perform some action when nothing is selected
            }
        }

        year.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                ppy = position.toString()
                val text: String = parent?.getItemAtPosition(position).toString()
                yyr = text

            }
            override fun onNothingSelected(parent: AdapterView<*>) {
                // Code to perform some action when nothing is selected
            }
        }



        val bundle: Bundle = Bundle()

        btnsub.setOnClickListener {

            var a: Boolean
            var b: Boolean
            var e: Boolean
            var g: Boolean
            var d: Boolean

            a = false
            b = false
            e = false
            g = false
            d = false

                if (txtemail.text.toString().equals("") || txtpass.text.toString().equals("") || txttpass.text.toString().equals("") || txtphone.text.toString().equals("") || txtaddress.text.toString().equals("") || txtname.text.toString().equals("") || txtlname.text.toString().equals("") || txtzipcode.text.toString().equals("") || ddt == "0" || ppm == "0" || ppy == "0") {
                    Toast.makeText(requireContext(), "اطلاعات را به صورت کامل وارد کنید", Toast.LENGTH_SHORT).show()
                    b = true

                }

                if (!txtpass.getText().toString().equals(txttpass.getText().toString())) {
                    Toast.makeText(requireContext(), "رمز عبور را تایید کنید", Toast.LENGTH_SHORT).show()
                    e = true

                }

                if (txtphone.text.toString().startsWith("09")) {
                    g = true
                }

                if (g != true) {
                    Toast.makeText(requireContext(), "شماره را به صورت صحیح وارد کنید", Toast.LENGTH_LONG).show()
                }

                if (checkbox.isChecked) {
                    a = true
                }

                if (a != true) {
                    Toast.makeText(requireContext(), "قبول قوانین و مقررات الزامیست!", Toast.LENGTH_LONG).show()
                }

                if (rbman.isChecked || rbwoman.isChecked){
                    d = true
                }

                if (d != true){
                    Toast.makeText(requireContext(), "جنسیت خود را انتخاب کنید", Toast.LENGTH_LONG).show()
                }

            txt.text = a.toString() + g.toString() + b.toString() + e.toString() + d.toString()

                if (txt.text.toString() == "truetruefalsefalsetrue") {

                    var mot = ""
                    val selectedOption: Int = rgro!!.checkedRadioButtonId
                    rbman = view.findViewById(selectedOption)

                    bundle.putString("info", txtemail.text.toString())
                    bundle.putString("info2", txtpass.text.toString())
                    bundle.putString("info3", txtphone.text.toString())
                    bundle.putString("info4", txtaddress.text.toString())
                    bundle.putString("name", txtname.text.toString())
                    bundle.putString("lname", txtlname.text.toString())
                    bundle.putString("zipcode", txtzipcode.text.toString())
                    bundle.putString("date", ppd)
                    bundle.putString("month", mon)
                    bundle.putString("year", yyr)
                    bundle.putString("inforb", rbman.text.toString())
                    mot += rbman.text
                    Toast.makeText(requireContext(), "خوش امدید", Toast.LENGTH_SHORT).show()
                    navController.navigate(R.id.action_singup_to_showinfo, bundle)
                }



        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment singup.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            singup().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}