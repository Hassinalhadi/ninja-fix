package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import s6.AbstractC2662g6;

/* loaded from: classes3.dex */
public final class ab {
    public final TextView alpha;
    public final D8.c bravo;

    public ab(TextView textView) {
        this.alpha = textView;
        this.bravo = new D8.c(textView);
    }

    public final void alpha(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.alpha.getContext().obtainStyledAttributes(attributeSet, aj.a.india, i4, 0);
        try {
            boolean z2 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z2 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            charlie(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void bravo(boolean z2) {
        ((AbstractC2662g6) this.bravo.purple).delta(z2);
    }

    public final void charlie(boolean z2) {
        ((AbstractC2662g6) this.bravo.purple).echo(z2);
    }
}
