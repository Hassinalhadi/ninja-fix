package L1;

import K1.k;
import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class c extends K1.h implements Runnable {
    public final WeakReference alpha;
    public final WeakReference purple;

    public c(TextView textView, d dVar) {
        this.alpha = new WeakReference(textView);
        this.purple = new WeakReference(dVar);
    }

    @Override // K1.h
    public final void bravo() {
        Handler handler;
        TextView textView = (TextView) this.alpha.get();
        if (textView != null && (handler = textView.getHandler()) != null) {
            handler.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.alpha.get();
        InputFilter inputFilter = (InputFilter) this.purple.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        k alpha = k.alpha();
                        if (text == null) {
                            length = 0;
                        } else {
                            alpha.getClass();
                            length = text.length();
                        }
                        CharSequence golf = alpha.golf(0, length, 0, text);
                        if (text != golf) {
                            int selectionStart = Selection.getSelectionStart(golf);
                            int selectionEnd = Selection.getSelectionEnd(golf);
                            textView.setText(golf);
                            if (golf instanceof Spannable) {
                                Spannable spannable = (Spannable) golf;
                                if (selectionStart >= 0 && selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                                    return;
                                } else if (selectionStart >= 0) {
                                    Selection.setSelection(spannable, selectionStart);
                                    return;
                                } else {
                                    if (selectionEnd >= 0) {
                                        Selection.setSelection(spannable, selectionEnd);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
