package y;

import bz.C0790o;
import bz.g0;
import pf.C2361k;

/* loaded from: classes3.dex */
public abstract class al {
    public static final C0790o alpha = new C0790o(Float.NaN, Float.NaN);
    public static final g0 bravo = new g0(new C2361k(28), new C2361k(29));
    public static final long charlie;
    public static final bz.I delta;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        charlie = floatToRawIntBits;
        delta = new bz.I(new Z.b(floatToRawIntBits));
    }
}
