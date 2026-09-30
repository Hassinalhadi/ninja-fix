package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import bz.AbstractC0800z;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class D extends Lambda implements Xd.m {
    public final /* synthetic */ int alpha;
    public static final D purple = new D(3, 0);
    public static final D red = new D(3, 1);
    public static final D silver = new D(3, 2);
    public static final D teal = new D(3, 3);
    public static final D white = new D(3, 4);
    public static final D yellow = new D(3, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final D f1001c = new D(3, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final D f1002d = new D(3, 7);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object kilo;
        Object juliet;
        bz.f0 kilo2;
        bz.f0 kilo3;
        switch (this.alpha) {
            case 0:
                bz.V v4 = (bz.V) obj;
                ((Number) obj3).intValue();
                C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
                c0585q.purple(-1324481169);
                Object alpha = v4.alpha();
                C0.a aVar = C0.a.purple;
                if (alpha == aVar) {
                    kilo = new bz.G(0);
                } else if (v4.charlie() == aVar) {
                    kilo = new bz.G(100);
                } else {
                    kilo = AbstractC0779d.kilo(100, 0, null, 6);
                }
                c0585q.quebec(false);
                return kilo;
            case 1:
                bz.V v6 = (bz.V) obj;
                ((Number) obj3).intValue();
                C0585q c0585q2 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q2.purple(1373301606);
                Object alpha2 = v6.alpha();
                C0.a aVar2 = C0.a.purple;
                if (alpha2 == aVar2) {
                    juliet = AbstractC0779d.kilo(100, 0, null, 6);
                } else if (v6.charlie() == aVar2) {
                    juliet = new bz.G(100);
                } else {
                    juliet = AbstractC0779d.juliet(0.0f, null, 7);
                }
                c0585q2.quebec(false);
                return juliet;
            case 2:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    C0585q c0585q3 = (C0585q) interfaceC0581m;
                    if (c0585q3.bronze()) {
                        c0585q3.ochre();
                    }
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    C0585q c0585q4 = (C0585q) interfaceC0581m2;
                    if (c0585q4.bronze()) {
                        c0585q4.ochre();
                    }
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    C0585q c0585q5 = (C0585q) interfaceC0581m3;
                    if (c0585q5.bronze()) {
                        c0585q5.ochre();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                ((Number) obj3).intValue();
                C0585q c0585q6 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q6.purple(-1355418157);
                if (((bz.V) obj).bravo(Boolean.FALSE, Boolean.TRUE)) {
                    kilo2 = AbstractC0779d.kilo(30, 0, null, 6);
                } else {
                    kilo2 = AbstractC0779d.kilo(75, 0, null, 6);
                }
                c0585q6.quebec(false);
                return kilo2;
            case 6:
                ((Number) obj3).intValue();
                C0585q c0585q7 = (C0585q) ((InterfaceC0581m) obj2);
                c0585q7.purple(1033023423);
                if (((bz.V) obj).bravo(Boolean.FALSE, Boolean.TRUE)) {
                    kilo3 = AbstractC0779d.kilo(120, 0, AbstractC0800z.bravo, 2);
                } else {
                    kilo3 = AbstractC0779d.kilo(1, 74, null, 4);
                }
                c0585q7.quebec(false);
                return kilo3;
            default:
                q0.ar arVar = (q0.ar) obj;
                long j5 = ((Q0.a) obj3).alpha;
                int ochre = arVar.ochre(G1.alpha);
                int i4 = ochre * 2;
                AbstractC2367C victor = ((q0.ao) obj2).victor(Q0.b.india(0, i4, j5));
                int i5 = victor.purple - i4;
                return arVar.papa(victor.alpha, i5, kotlin.collections.t.alpha, new F1(victor, ochre));
        }
    }
}
