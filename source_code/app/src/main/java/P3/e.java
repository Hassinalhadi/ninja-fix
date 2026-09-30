package P3;

import Y3.l;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class e implements V3.e {
    public final int alpha;
    public final int purple;
    public U3.c red;
    public final Handler silver;
    public final int teal;
    public final long white;
    public Bitmap yellow;

    public e(Handler handler, int i4, long j5) {
        if (l.india(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION)) {
            this.alpha = RecyclerView.UNDEFINED_DURATION;
            this.purple = RecyclerView.UNDEFINED_DURATION;
            this.silver = handler;
            this.teal = i4;
            this.white = j5;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // R3.i
    public final void alpha() {
    }

    @Override // R3.i
    public final void bravo() {
    }

    @Override // R3.i
    public final void charlie() {
    }

    @Override // V3.e
    public final void delta(U3.h hVar) {
    }

    @Override // V3.e
    public final void echo(U3.c cVar) {
        this.red = cVar;
    }

    @Override // V3.e
    public final void golf(Object obj) {
        this.yellow = (Bitmap) obj;
        Handler handler = this.silver;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.white);
    }

    @Override // V3.e
    public final void juliet(Drawable drawable) {
    }

    @Override // V3.e
    public final void kilo(Drawable drawable) {
    }

    @Override // V3.e
    public final U3.c lima() {
        return this.red;
    }

    @Override // V3.e
    public final void mike(Drawable drawable) {
        this.yellow = null;
    }

    @Override // V3.e
    public final void november(U3.h hVar) {
        hVar.kilo(this.alpha, this.purple);
    }
}
