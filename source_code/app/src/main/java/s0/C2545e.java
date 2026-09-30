package s0;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2545e implements r0.f {
    public final /* synthetic */ int alpha;

    public static final int alpha(int i4, long j5) {
        int i5 = h0.bravo;
        return ((int) (j5 >> (i4 * 15))) & 32767;
    }

    public static long charlie(int i4, int i5, int i10, int i11) {
        return ((i5 & 32767) << 15) | (i4 & 32767) | ((i10 & 32767) << 30) | ((i11 & 32767) << 45) | Long.MIN_VALUE;
    }

    public int bravo() {
        switch (this.alpha) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }

    @Override // r0.f
    public Object coral(r0.g gVar) {
        return gVar.alpha.invoke();
    }
}
