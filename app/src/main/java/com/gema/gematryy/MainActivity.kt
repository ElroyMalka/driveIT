package com.gema.gematryy

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.*
import com.google.android.gms.ads.appopen.AppOpenAd.load
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.lang.System.load
import java.util.*

class MainActivity: AppCompatActivity() {
    lateinit var mAdView : AdView
    private var mInterstitialAd: InterstitialAd? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)//ca-app-pub-9707014388778446/1415540369
        // var x= findViewById<TextView>(R.id.textView3)

        var adRequestf = AdRequest.Builder().build()
         var TAG = "MainActivity"


        //InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest, object : InterstitialAdLoadCallback() {
            InterstitialAd.load(this,"ca-app-pub-9707014388778446/1164632619", adRequest, object : InterstitialAdLoadCallback() {


            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.d(TAG, adError?.message)
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                Log.d(TAG, "Ad was loaded.")
                mInterstitialAd = interstitialAd
            }
        })
        mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
            override fun onAdDismissedFullScreenContent() {
                Log.d(TAG, "Ad was dismissed.")
            }

            override fun onAdFailedToShowFullScreenContent(adError: AdError?) {
                Log.d(TAG, "Ad failed to show.")
            }

            override fun onAdShowedFullScreenContent() {
                Log.d(TAG, "Ad showed fullscreen content.")
                mInterstitialAd = null
            }
        }


        val day = Calendar.getInstance().get(Calendar.DATE)
        val M = Calendar.getInstance().get(Calendar.MONTH)
        val H = M + 1
        val y = Calendar.getInstance().get(Calendar.YEAR)
        // x.text=("todays date is $day.$H.$y")
        // var jdate= findViewById<TextView>(R.id.textView4)
        val dateh = y + 3760
        val hd = dateh.toString()
        val hey = "ה"
        val taf = "ת"
        val kuf = "ק"
        val res = "ר"
        val shin = "ש"
        val a = "א"
        val b = "ב"
        val g = "ג"
        val d1 = "ד"
        val v = "ו"
        val z = "ז"
        val het = "ח"
        val tet = "ט"
        val yud = "י"
        val caf = "כ"
        val l = "ל"
        val m = "מ"
        val n = "נ"
        val samech = "ס"
        val ain = "ע"
        val p = "פ"
        val tz = "צ"
        val jj = "jj"
        val tk = "תק"
        val tr = "תר"
        val ts = "תש"
        val tt = "תת"
        val ttk = "תתק"
        val nul = ""

        var frst1 = hd.firstOrNull().toString().toInt()
        //jdate.text= "the hebrew year is $hd and $frst1 and $hey "

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.")
            }

            val cdate = findViewById<TextView>(R.id.editTextNumber2)
            val checkifint = findViewById<TextView>(R.id.editTextNumber2).text
            var boolean = isInteger(checkifint)
            if (checkifint.length>4)
            {boolean = false}
            if (!boolean) {
                Toast.makeText(this, "הכנס שנה לועזית", Toast.LENGTH_SHORT).show()
            } else {
                val yjdate = cdate.text.toString().toInt() + 3760
                val jdatef = findViewById<TextView>(R.id.textView5)
                val difference = y - cdate.text.toString().toInt()
                val d = difference.toString()
                val dateatthetime = yjdate.toString()

                fun MI(int: String): String {
                    var j = int.firstOrNull().toString().toInt()
                    if (j == 5)
                        return hey
                    if (j == 4)
                        return d1
                    if (j == 3)
                        return g
                    if (j == 2)
                        return b
                    if (j == 1)
                        return a
                    if (j == 6)
                        return v
                    if (j == 7)
                        return z
                    if (j == 8)
                        return het
                    if (j == 9)
                        return tet
                    else
                        return nul
                }

                fun check(x: Int): String {
                    if (x == 100)
                        return kuf
                    if (x == 200)
                        return res
                    if (x == 300)
                        return shin
                    if (x == 400)
                        return taf
                    if (x == 500)
                        return tk
                    if (x == 600)
                        return tr
                    if (x == 700)
                        return ts
                    if (x == 800)
                        return tt
                    if (x == 900)
                        return ttk
                    if (x == 10)
                        return yud
                    if (x == 20)
                        return caf
                    if (x == 30)
                        return l
                    if (x == 40)
                        return m
                    if (x == 50)
                        return n
                    if (x == 60)
                        return samech
                    if (x == 70)
                        return ain
                    if (x == 80)
                        return p
                    if (x == 90)
                        return tz
                    if (x == 1)
                        return a
                    if (x == 2)
                        return b
                    if (x == 3)
                        return g
                    if (x == 4)
                        return d1
                    if (x == 5)
                        return hey
                    if (x == 6)
                        return v
                    if (x == 7)
                        return z
                    if (x == 8)
                        return het
                    if (x == 9)
                        return tet
                    else return nul
                }

                val ThGe = MI(dateatthetime)
                val geo11 = dateatthetime[1]
                val geo111 = geo11.toString().toInt() * 100
                val geo1 = check(geo111)
                val geo22 = dateatthetime[2].toString().toInt() * 10
                val geo2 = check(geo22)
                val geo333 = dateatthetime[3].toString().toInt()
                val geo3 = check(geo333)

                if (dateatthetime.toInt() >= 10000)
                { Toast.makeText(this, "הכנס שנה לועזית מתחת 6240", Toast.LENGTH_SHORT).show()
                jdatef.text = "---"}
                else
                { jdatef.text = " $ThGe'$geo1$geo2$geo3 " }
            }
        }

        fun geoT(x: String): Int {
            if (x == "א")
                return 1000
            if (x == "ב")
                return 2000
            if (x == "ד")
                return 4000
            if (x == "ה")
                return 5000
            if (x == "ו")
                return 6000
            if (x == "ז")
                return 7000
            if (x == "ח")
                return 8000
            if (x == "ט")
                return 9000
            if (x == "ג")
                return 3000
            else return 777
        }

        fun geoH(x: String): Int {
            if (x == "ק")
                return 100
            if (x == "ר")
                return 200
            if (x == "ש")
                return 300
            if (x == "ת")
                return 400
            if (x == "י")
                return 10
            if (x == "כ")
                return 20
            if (x == "ל")
                return 30
            if (x == "מ")
                return 40
            if (x == "נ")
                return 50
            if (x == "ס")
                return 60
            if (x == "ע")
                return 70
            if (x == "פ")
                return 80
            if (x == "צ")
                return 90
            if (x == "א")
                return 1
            if (x == "ב")
                return 2
            if (x == "ג")
                return 3
            if (x == "ד")
                return 4
            if (x == "ה")
                return 5
            if (x == "ו")
                return 6
            if (x == "ז")
                return 7
            if (x == "ח")
                return 8
            if (x == "ט")
                return 9
            else return 12
        }

        val btn12 = findViewById<Button>(R.id.button2)
        btn12.setOnClickListener {
            val nn = findViewById<TextView>(R.id.editTextTextPersonName)
            val checkifstring=nn.text
            var boolhebrow=textContainsArabic(checkifstring.toString())
            if (checkifstring.length>6)
                boolhebrow = false
            if (!boolhebrow){
                Toast.makeText(this, "הכנס שנה עברית", Toast.LENGTH_SHORT).show()
            }
            else{
            val yb = nn.text.toString()
            val first = yb[0].toString()
            var final1 = 0
            for (i in 1 until yb.length) {
                val sam = yb[i].toString()
                val sam1 = geoH(sam)

                final1 += sam1

            }


            val thga = geoT(first)
            val end = final1 + thga - 3760
            var check = yb[0]
            val CYEAR = findViewById<TextView>(R.id.textView6)
                if (thga == 777)
                { Toast.makeText(this, "הכנס שנה עברית מתחת לאלף י'", Toast.LENGTH_SHORT).show()}
                else
                { CYEAR.text = "$end " }
        }


    }
        }
    }
    fun isInteger(str: CharSequence): Boolean {
        if (str == null) {
            return false
        }
        val length = str.length
        if (length == 0) {
            return false
        }
        var i = 0
        if (str[0] == '-') {
            if (length == 1) {
                return false
            }
            i = 1
        }
        while (i < length) {
            val c = str[i]
            if (c < '0' || c > '9') {
                return false
            }
            i++
        }
        return true
    }
    fun textContainsArabic(text: String): Boolean {
        for (charac in text.toCharArray()) {
            if (Character.UnicodeBlock.of(charac) === Character.UnicodeBlock.HEBREW) {
                return true
            }
        }
        return false
    }
