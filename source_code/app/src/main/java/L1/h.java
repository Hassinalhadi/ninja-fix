package L1;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class h extends K1.h implements Runnable {
    public final WeakReference alpha;

    public h(EditText editText) {
        this.alpha = new WeakReference(editText);
    }

    @Override // K1.h
    public final void bravo() {
        Handler handler;
        EditText editText = (EditText) this.alpha.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.alpha((EditText) this.alpha.get(), 1);
    }
}
