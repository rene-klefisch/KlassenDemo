package com.example.klassendemo

import android.util.Log

class Users(name : String, nickname : String, alter : Int) {

    private val nameNeu = name
    private val nicknameNeu = nickname
    private val alterNeu = alter
    var code = ""

    init {
        Log.i("Test", "PRIM Constructor ausgeführt!")
        code = "345325234123452"
    }

    constructor(name2Constructor: String) : this(name2Constructor, "", 0){
        Log.i("Test", "2. Constructor ausgeführt!")
        code = "Geheim!"
    }



    fun gibName() : String{
        return "Der User heißt: $nicknameNeu, sein echter Name ist: $nameNeu. Alter: ${gibAlter()} PW: $code"
    }

    private fun gibAlter() : Int{
        return alterNeu
    }
}