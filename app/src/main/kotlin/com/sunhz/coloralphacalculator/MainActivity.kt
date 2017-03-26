package com.sunhz.coloralphacalculator

import android.app.Activity
import android.os.Bundle
import android.text.InputFilter
import android.text.InputType
import android.text.TextUtils
import org.jetbrains.anko.*

/**
 * Main Activity
 * Created by Spencer on 15/4/10.
 */
open class MainActivity : Activity() {

    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)

        verticalLayout {
            padding = dip(16)

            var calculatorResult: String

            val etPercentage = editText {
                hint = context.resources.getString(R.string.hint_transparent_color_percentage)
                textSize = 15f
                inputType = InputType.TYPE_CLASS_NUMBER
                filters = arrayOf(InputFilter.LengthFilter(3))
            }

            val tvResult = textView {
                textSize = 18f
            }.lparams {
                verticalMargin = dip(8)
            }

            button("Calculator") {
                textSize = 20f

                setOnClickListener {
                    calculatorResult = etPercentage.text.toString()

                    if (TextUtils.isEmpty(calculatorResult)) {
                        calculatorResult = "no result."
                    } else {
                        calculatorResult = calculate(calculatorResult)
                    }

                    etPercentage.editableText!!.clear()
                    tvResult.text = String.format("result:%s", calculatorResult)
                }
            }.lparams {
                topMargin = dip(8)
                width = matchParent
            }
        }
    }

    fun calculate(percentage: String): String {
        var value = Integer.parseInt(percentage)

        // Kotlin
//        if (value > 100) {
//            value = 100
//        } else if (value < 0) {
//            value = 0
//        }
//
//        val result = value * 255 / 100
//        return Integer.toHexString(result).toUpperCase()

        // Java
        return Calculator.calculator(value)
    }
}