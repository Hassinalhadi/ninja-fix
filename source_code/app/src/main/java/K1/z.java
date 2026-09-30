package K1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import s6.T7;

/* loaded from: classes3.dex */
public final class z extends ReplacementSpan {
    public final y purple;
    public TextPaint teal;
    public final Paint.FontMetricsInt alpha = new Paint.FontMetricsInt();
    public short red = -1;
    public float silver = 1.0f;

    public z(y yVar) {
        T7.foxtrot(yVar, "rasterizer cannot be null");
        this.purple = yVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f5, int i10, int i11, int i12, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i4, i5, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.teal;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.teal = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f5, i10, f5 + this.red, i12, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        k.alpha().getClass();
        float f10 = i11;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        y yVar = this.purple;
        com.google.firebase.messaging.o oVar = yVar.bravo;
        Typeface typeface = (Typeface) oVar.delta;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) oVar.bravo, yVar.alpha * 2, 2, f5, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        short s3;
        Paint.FontMetricsInt fontMetricsInt2 = this.alpha;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        y yVar = this.purple;
        androidx.emoji2.text.flatbuffer.a bravo = yVar.bravo();
        int alpha = bravo.alpha(14);
        short s9 = 0;
        if (alpha != 0) {
            s3 = ((ByteBuffer) bravo.silver).getShort(alpha + bravo.alpha);
        } else {
            s3 = 0;
        }
        this.silver = abs / s3;
        androidx.emoji2.text.flatbuffer.a bravo2 = yVar.bravo();
        int alpha2 = bravo2.alpha(14);
        if (alpha2 != 0) {
            ((ByteBuffer) bravo2.silver).getShort(alpha2 + bravo2.alpha);
        }
        androidx.emoji2.text.flatbuffer.a bravo3 = yVar.bravo();
        int alpha3 = bravo3.alpha(12);
        if (alpha3 != 0) {
            s9 = ((ByteBuffer) bravo3.silver).getShort(alpha3 + bravo3.alpha);
        }
        short s10 = (short) (s9 * this.silver);
        this.red = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
