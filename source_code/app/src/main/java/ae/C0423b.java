package ae;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ae.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0423b {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final int delta;

    public C0423b(BackEvent backEvent) {
        Intrinsics.echo(backEvent, "backEvent");
        float romeo = AbstractC0422a.romeo(backEvent);
        float sierra = AbstractC0422a.sierra(backEvent);
        float lima = AbstractC0422a.lima(backEvent);
        int quebec = AbstractC0422a.quebec(backEvent);
        this.alpha = romeo;
        this.bravo = sierra;
        this.charlie = lima;
        this.delta = quebec;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.alpha);
        sb2.append(", touchY=");
        sb2.append(this.bravo);
        sb2.append(", progress=");
        sb2.append(this.charlie);
        sb2.append(", swipeEdge=");
        return Q0.c.quebec(sb2, this.delta, '}');
    }
}
