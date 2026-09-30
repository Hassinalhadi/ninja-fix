package q0;

import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import p0.AbstractC2264a;

/* loaded from: classes3.dex */
public final class y implements ar, InterfaceC2402u {
    public final /* synthetic */ InterfaceC2402u alpha;
    public final Q0.n purple;

    public y(InterfaceC2402u interfaceC2402u, Q0.n nVar) {
        this.alpha = interfaceC2402u;
        this.purple = nVar;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.alpha.alpha();
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return this.alpha.beige(f5);
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return this.alpha.crimson(i4);
    }

    @Override // q0.InterfaceC2402u
    public final Q0.n getLayoutDirection() {
        return this.purple;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return this.alpha.gold(f5);
    }

    @Override // Q0.d
    public final float indigo() {
        return this.alpha.indigo();
    }

    @Override // q0.InterfaceC2402u
    public final boolean ivory() {
        return this.alpha.ivory();
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return this.alpha.lavender(f5);
    }

    @Override // Q0.d
    public final long mike(long j5) {
        return this.alpha.mike(j5);
    }

    @Override // Q0.d
    public final int ochre(float f5) {
        return this.alpha.ochre(f5);
    }

    @Override // q0.ar
    public final aq papa(int i4, int i5, Map map, Function1 function1) {
        return purple(i4, i5, map, null, function1);
    }

    @Override // q0.ar
    public final aq purple(int i4, int i5, Map map, B2.ap apVar, Function1 function1) {
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if ((i4 & ShapeBuilder.DEFAULT_SHAPE_COLOR) != 0 || ((-16777216) & i5) != 0) {
            AbstractC2264a.bravo("Size(" + i4 + " x " + i5 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new x(i4, i5, map, apVar);
    }

    @Override // Q0.d
    public final float quebec(long j5) {
        return this.alpha.quebec(j5);
    }

    @Override // Q0.d
    public final long red(long j5) {
        return this.alpha.red(j5);
    }

    @Override // Q0.d
    public final float teal(long j5) {
        return this.alpha.teal(j5);
    }
}
