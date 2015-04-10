package com.sunhz.coloralphacalculator

import android.app.Activity
import android.os.Bundle
import android.text.InputType
import android.text.TextUtils
import android.widget.TextView
import kotlinx.android.anko.*

/**
 * 计算ARGB颜色值的app
 * Created by Spencer on 15/4/10.
 */


open class MainActivity : Activity() {


    protected override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState);

        verticalLayout({
            padding = dip(16)

            var result: String? = null;

            val percentage = inputField("颜色透明度百分比:");

            val resultView = getResultView("");

            button("计算") {
                textSize = 20f
                onClick {
                    result = calculate(percentage.text.toString())
                    if (!TextUtils.isEmpty(result)) {
                        percentage.editableText!!.clear()
                        resultView.setText("结果:" + result as CharSequence)
                    }
                }
            }.layoutParams {
                topMargin = dip(8)
                width = matchParent
            }
        })
    }

    fun _LinearLayout.inputField(name: String): TextView {
        textView("$name") {
            textSize = 18f
        }.layoutParams { verticalMargin = dip(4) }
        return editText() {
            setInputType(InputType.TYPE_CLASS_NUMBER)
        }
    }

    fun _LinearLayout.getResultView(result: String): TextView {
        return textView() {
            textSize = 18f
        }.layoutParams { verticalMargin = dip(8) }
    }


    fun calculate(percentage: String): String {
        // kotlin方式
        //        var temp: Int = Integer.parseInt(percentage)
        //
        //        if (temp > 100) temp = 100
        //        else if (temp < 0) temp = 0
        //
        //        return Integer.toHexString(temp * 255 / 100).toUpperCase()

        // 调用java代码方式
        return Calculator.calculator(percentage)
    }

}