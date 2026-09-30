package d;

import androidx.compose.foundation.gestures.FlingCancellationException;

/* renamed from: d.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1538j0 implements O {
    public final /* synthetic */ C1548o0 alpha;
    public final /* synthetic */ C1542l0 bravo;

    public C1538j0(C1548o0 c1548o0, C1542l0 c1542l0) {
        this.alpha = c1548o0;
        this.bravo = c1542l0;
    }

    @Override // d.O
    public final float alpha(float f5) {
        C1548o0 c1548o0 = this.alpha;
        boolean booleanValue = ((Boolean) c1548o0.hotel.invoke()).booleanValue();
        if (Math.abs(f5) == 0.0f || booleanValue) {
            return c1548o0.delta(c1548o0.golf(this.bravo.alpha(2, c1548o0.echo(c1548o0.hotel(f5)))));
        }
        throw new FlingCancellationException();
    }
}
