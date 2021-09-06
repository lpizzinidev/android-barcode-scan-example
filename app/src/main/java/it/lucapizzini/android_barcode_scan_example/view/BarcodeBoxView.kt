package it.lucapizzini.android_barcode_scan_example.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class BarcodeBoxView(
    context: Context
) : View(context) {

    private val paint = Paint()

    private var mRect = RectF()

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val cornerRadius = 10f

        paint.style = Paint.Style.STROKE
        paint.color = Color.RED
        paint.strokeWidth = 5f

        canvas?.drawRoundRect(mRect, cornerRadius, cornerRadius, paint)
    }

    fun setRect(rect: RectF) {
        mRect = rect
        invalidate()
        requestLayout()
    }
}