package bz;

/* loaded from: classes3.dex */
public final class ad implements ab {
    public final int alpha;
    public final InterfaceC0799y bravo;
    public final long charlie;
    public final long delta;

    public ad(int i4, int i5, InterfaceC0799y interfaceC0799y) {
        this.alpha = i4;
        this.bravo = interfaceC0799y;
        this.charlie = i4 * 1000000;
        this.delta = i5 * 1000000;
    }

    @Override // bz.InterfaceC0787l
    public final i0 alpha(g0 g0Var) {
        return new J2.n(this);
    }

    @Override // bz.ab
    public final long bravo(float f5, float f10, float f11) {
        return this.delta + this.charlie;
    }

    @Override // bz.ab
    public final float charlie(float f5, float f10, float f11, long j5) {
        long j6;
        long j7 = j5 - this.delta;
        if (j7 < 0) {
            j7 = 0;
        }
        long j10 = this.charlie;
        if (j7 > j10) {
            j6 = j10;
        } else {
            j6 = j7;
        }
        if (j6 == 0) {
            return f11;
        }
        return (echo(f5, f10, f11, j6) - echo(f5, f10, f11, j6 - 1000000)) * 1000.0f;
    }

    @Override // bz.ab
    public final float delta(float f5, float f10, float f11) {
        return charlie(f5, f10, f11, bravo(f5, f10, f11));
    }

    @Override // bz.ab
    public final float echo(float f5, float f10, float f11, long j5) {
        float f12;
        long j6 = j5 - this.delta;
        if (j6 < 0) {
            j6 = 0;
        }
        long j7 = this.charlie;
        if (j6 > j7) {
            j6 = j7;
        }
        if (this.alpha == 0) {
            f12 = 1.0f;
        } else {
            f12 = ((float) j6) / ((float) j7);
        }
        float bravo = this.bravo.bravo(f12);
        return (f10 * bravo) + ((1 - bravo) * f5);
    }
}
