package d;

/* renamed from: d.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1549p implements O {
    public final /* synthetic */ C1551q alpha;

    public C1549p(C1551q c1551q) {
        this.alpha = c1551q;
    }

    @Override // d.O
    public final float alpha(float f5) {
        boolean z2;
        if (Float.isNaN(f5)) {
            return 0.0f;
        }
        C1551q c1551q = this.alpha;
        float floatValue = ((Number) c1551q.alpha.invoke(Float.valueOf(f5))).floatValue();
        androidx.compose.runtime.ax axVar = c1551q.echo;
        boolean z10 = false;
        if (floatValue > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        ((androidx.compose.runtime.t0) axVar).setValue(Boolean.valueOf(z2));
        androidx.compose.runtime.ax axVar2 = c1551q.foxtrot;
        if (floatValue < 0.0f) {
            z10 = true;
        }
        ((androidx.compose.runtime.t0) axVar2).setValue(Boolean.valueOf(z10));
        return floatValue;
    }
}
