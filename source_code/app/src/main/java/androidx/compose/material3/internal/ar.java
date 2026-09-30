package androidx.compose.material3.internal;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import bz.AbstractC0800z;
import bz.V;
import bz.f0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ar extends Lambda implements Xd.m {
    public static final ar purple = new ar(3, 0);
    public static final ar red = new ar(3, 1);
    public static final ar silver = new ar(3, 2);
    public static final ar teal = new ar(3, 3);
    public static final ar white = new ar(3, 4);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object f0Var;
        switch (this.alpha) {
            case 0:
                ((Number) obj3).intValue();
                C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
                c0585q.purple(-543659263);
                f0 kilo = AbstractC0779d.kilo(150, 0, null, 6);
                c0585q.quebec(false);
                return kilo;
            case 1:
                ((Number) obj3).intValue();
                C0585q c0585q2 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q2.purple(1276209157);
                f0 kilo2 = AbstractC0779d.kilo(150, 0, null, 6);
                c0585q2.quebec(false);
                return kilo2;
            case 2:
                ((Number) obj3).intValue();
                C0585q c0585q3 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q3.purple(1528582156);
                f0 kilo3 = AbstractC0779d.kilo(150, 0, null, 6);
                c0585q3.quebec(false);
                return kilo3;
            case 3:
                V v4 = (V) obj;
                ((Number) obj3).intValue();
                C0585q c0585q4 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q4.purple(-1154662212);
                z zVar = z.alpha;
                z zVar2 = z.purple;
                if (v4.bravo(zVar, zVar2)) {
                    f0Var = AbstractC0779d.kilo(67, 0, AbstractC0800z.delta, 2);
                } else if (!v4.bravo(zVar2, zVar) && !v4.bravo(z.red, zVar2)) {
                    f0Var = AbstractC0779d.juliet(0.0f, null, 7);
                } else {
                    f0Var = new f0(83, 67, AbstractC0800z.delta);
                }
                c0585q4.quebec(false);
                return f0Var;
            default:
                ((Number) obj3).intValue();
                C0585q c0585q5 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q5.purple(-1868044898);
                f0 kilo4 = AbstractC0779d.kilo(150, 0, null, 6);
                c0585q5.quebec(false);
                return kilo4;
        }
    }
}
