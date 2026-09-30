package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import i1.AbstractC1881b;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class ay extends AbstractC1881b {
    public final /* synthetic */ int hotel;
    public final /* synthetic */ int india;
    public final /* synthetic */ WeakReference juliet;
    public final /* synthetic */ D kilo;

    public ay(D d4, int i4, int i5, WeakReference weakReference) {
        this.kilo = d4;
        this.hotel = i4;
        this.india = i5;
        this.juliet = weakReference;
    }

    @Override // i1.AbstractC1881b
    public final void india(int i4) {
    }

    @Override // i1.AbstractC1881b
    public final void juliet(Typeface typeface) {
        int i4;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 28 && (i4 = this.hotel) != -1) {
            if ((this.india & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            typeface = C.alpha(typeface, i4, z2);
        }
        D d4 = this.kilo;
        if (d4.mike) {
            d4.lima = typeface;
            TextView textView = (TextView) this.juliet.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new D2.i(d4.juliet, 1, textView, typeface));
                } else {
                    textView.setTypeface(typeface, d4.juliet);
                }
            }
        }
    }
}
