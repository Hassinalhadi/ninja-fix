package a4;

import com.google.android.gms.measurement.internal.ar;

/* loaded from: classes3.dex */
public final class j {
    public final int alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final Object delta;

    public /* synthetic */ j(int i4, Object obj, boolean z2, boolean z10) {
        this.delta = obj;
        this.alpha = i4;
        this.bravo = z2;
        this.charlie = z10;
    }

    public void alpha(String str) {
        ((ar) this.delta).i0(this.alpha, this.bravo, this.charlie, str, null, null, null);
    }

    public void bravo(Object obj, String str) {
        ((ar) this.delta).i0(this.alpha, this.bravo, this.charlie, str, obj, null, null);
    }

    public void charlie(Object obj, Object obj2, String str) {
        ((ar) this.delta).i0(this.alpha, this.bravo, this.charlie, str, obj, obj2, null);
    }

    public void delta(String str, Object obj, Object obj2, Object obj3) {
        ((ar) this.delta).i0(this.alpha, this.bravo, this.charlie, str, obj, obj2, obj3);
    }
}
