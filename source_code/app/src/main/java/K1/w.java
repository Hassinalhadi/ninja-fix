package K1;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class w implements TextWatcher, SpanWatcher {
    public final Object alpha;
    public final AtomicInteger purple = new AtomicInteger(0);

    public w(Object obj) {
        this.alpha = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.alpha).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        ((TextWatcher) this.alpha).beforeTextChanged(charSequence, i4, i5, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i4, int i5) {
        if (this.purple.get() > 0 && (obj instanceof z)) {
            return;
        }
        ((SpanWatcher) this.alpha).onSpanAdded(spannable, obj, i4, i5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i4, int i5, int i10, int i11) {
        int i12;
        int i13;
        if (this.purple.get() > 0 && (obj instanceof z)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i4 > i5) {
                i4 = 0;
            }
            if (i10 > i11) {
                i12 = i4;
                i13 = 0;
                ((SpanWatcher) this.alpha).onSpanChanged(spannable, obj, i12, i5, i13, i11);
            }
        }
        i12 = i4;
        i13 = i10;
        ((SpanWatcher) this.alpha).onSpanChanged(spannable, obj, i12, i5, i13, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i4, int i5) {
        if (this.purple.get() > 0 && (obj instanceof z)) {
            return;
        }
        ((SpanWatcher) this.alpha).onSpanRemoved(spannable, obj, i4, i5);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        ((TextWatcher) this.alpha).onTextChanged(charSequence, i4, i5, i10);
    }
}
