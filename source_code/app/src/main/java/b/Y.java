package b;

import android.widget.Magnifier;

/* loaded from: classes3.dex */
public class Y implements W {
    public final Magnifier alpha;

    public Y(Magnifier magnifier) {
        this.alpha = magnifier;
    }

    @Override // b.W
    public void alpha(long j5, long j6) {
        this.alpha.show(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
    }

    public final void bravo() {
        this.alpha.dismiss();
    }

    public final long charlie() {
        return (this.alpha.getHeight() & 4294967295L) | (this.alpha.getWidth() << 32);
    }

    public final void delta() {
        this.alpha.update();
    }
}
