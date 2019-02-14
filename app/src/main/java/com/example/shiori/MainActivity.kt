package com.example.shiori

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.Button
import android.widget.TextView
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //値を格納する変数
        var value: Int = 0

    /*    計算結果をクリアするかどうかを判断するためのフラグ
          trueの時に数字ボタンが押されたとき計算結果をクリアする

          例えば"=”が押されたときフラグをtrueにして、そのあと数字ボタンが押されたときにはクリアしたい
    */
        var clear : Boolean = false

        /*
            計算するタイミングを判別するフラグ
            +-×÷が連続して押されたときはfalseのまま
         */
        var calc : Boolean = false

        //演算子を記録しておく変数
        //nullの可能性あり
        var operator : String? = null

        //数字ボタン一覧
        val button0 : Button = findViewById(R.id.button0)
        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)

        /* 計算ボタン */
        val buttonAdd : Button = findViewById(R.id.buttonA)
        val buttonMul : Button = findViewById(R.id.buttonM)
        val buttonSub : Button = findViewById(R.id.buttonS)
        val buttonDiv : Button = findViewById(R.id.buttonD)

        /* 実行ボタン */
        val buttonEqual:Button = findViewById(R.id.buttonE)

        /* クリアボタン */
        val buttonClear : Button = findViewById(R.id.buttonClear)

        //Backボタン
        val buttonBack : Button = findViewById(R.id.buttonClearBack)

        /* 表示テキスト */
        val textArea : TextView = findViewById(R.id.display)



    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }



}
