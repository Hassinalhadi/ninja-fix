package d;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1519a implements InterfaceC1523c {
    public final /* synthetic */ int bravo;

    public /* synthetic */ C1519a(int i4) {
        this.bravo = i4;
    }

    @Override // d.InterfaceC1523c
    public final float alpha(float f5, float f10, float f11) {
        boolean z2;
        switch (this.bravo) {
            case 0:
                InterfaceC1523c.alpha.getClass();
                float f12 = f10 + f5;
                if ((f5 >= 0.0f && f12 <= f11) || (f5 < 0.0f && f12 > f11)) {
                    return 0.0f;
                }
                float f13 = f12 - f11;
                if (Math.abs(f5) >= Math.abs(f13)) {
                    return f13;
                }
                return f5;
            default:
                float abs = Math.abs((f10 + f5) - f5);
                if (abs <= f11) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                float f14 = (0.3f * f11) - (0.0f * abs);
                float f15 = f11 - f14;
                if (z2 && f15 < abs) {
                    f14 = f11 - abs;
                }
                return f5 - f14;
        }
    }

    @Override // d.InterfaceC1523c
    public final bz.I bravo() {
        switch (this.bravo) {
            case 0:
                InterfaceC1523c.alpha.getClass();
                return C1521b.bravo;
            default:
                InterfaceC1523c.alpha.getClass();
                return C1521b.bravo;
        }
    }
}
