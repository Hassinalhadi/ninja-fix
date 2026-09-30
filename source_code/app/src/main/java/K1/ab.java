package K1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes3.dex */
public final class ab implements Spannable {
    public boolean alpha = false;
    public Spannable purple;

    public ab(Spannable spannable) {
        this.purple = spannable;
    }

    public final void alpha() {
        g7.f fVar;
        Spannable spannable = this.purple;
        if (!this.alpha) {
            if (Build.VERSION.SDK_INT < 28) {
                fVar = new g7.f(5);
            } else {
                fVar = new g7.f(5);
            }
            if (fVar.hotel(spannable)) {
                this.purple = new SpannableString(spannable);
            }
        }
        this.alpha = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.purple.charAt(i4);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.purple.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.purple.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.purple.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.purple.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.purple.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i4, int i5, Class cls) {
        return this.purple.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.purple.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i4, int i5, Class cls) {
        return this.purple.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        alpha();
        this.purple.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i4, int i5, int i10) {
        alpha();
        this.purple.setSpan(obj, i4, i5, i10);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        return this.purple.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.purple.toString();
    }
}
