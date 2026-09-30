package t6;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import y.C3382v;
import y.C3383w;
import y.EnumC3370j;
import y.InterfaceC3369i;

/* renamed from: t6.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3042p3 implements androidx.core.widget.g {
    public static final C3383w alpha(R3.s sVar, InterfaceC3369i interfaceC3369i) {
        boolean z2;
        if (sVar.echo() == EnumC3370j.alpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        I.al alVar = (I.al) sVar.silver;
        return new C3383w(charlie(alVar, z2, true, interfaceC3369i), charlie(alVar, z2, false, interfaceC3369i), z2);
    }

    public static final C3382v bravo(final R3.s sVar, final I.al alVar, C3382v c3382v) {
        final int i4;
        final int i5;
        EnumC3370j enumC3370j;
        boolean z2;
        boolean z10 = sVar.purple;
        int i10 = alVar.charlie;
        int i11 = alVar.bravo;
        if (z10) {
            i4 = i11;
        } else {
            i4 = i10;
        }
        kotlin.i iVar = kotlin.i.purple;
        final Lazy alpha = LazyKt.alpha(iVar, new Ec.aw(alVar, i4, 4));
        if (z10) {
            i5 = i10;
        } else {
            i5 = i11;
        }
        Lazy alpha2 = LazyKt.alpha(iVar, new Function0() { // from class: y.aa
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z11;
                int intValue = ((Number) alpha.getValue()).intValue();
                R3.s sVar2 = sVar;
                if (sVar2.echo() == EnumC3370j.alpha) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                I.al alVar2 = I.al.this;
                D0.ak akVar = (D0.ak) alVar2.echo;
                int i12 = i4;
                long india = akVar.india(i12);
                int i13 = D0.am.charlie;
                int i14 = (int) (india >> 32);
                D0.o oVar = akVar.bravo;
                int delta = oVar.delta(i14);
                int i15 = oVar.foxtrot;
                if (delta != intValue) {
                    if (intValue >= i15) {
                        i14 = akVar.foxtrot(i15 - 1);
                    } else {
                        i14 = akVar.foxtrot(intValue);
                    }
                }
                int i16 = (int) (india & 4294967295L);
                if (oVar.delta(i16) != intValue) {
                    if (intValue >= i15) {
                        i16 = oVar.charlie(i15 - 1, false);
                    } else {
                        i16 = oVar.charlie(intValue, false);
                    }
                }
                int i17 = i5;
                if (i14 == i17) {
                    return alVar2.bravo(i16);
                }
                if (i16 == i17) {
                    return alVar2.bravo(i14);
                }
                if (!(sVar2.purple ^ z11) ? i12 >= i14 : i12 > i16) {
                    i14 = i16;
                }
                return alVar2.bravo(i14);
            }
        });
        if (1 != c3382v.charlie) {
            return (C3382v) alpha2.getValue();
        }
        int i12 = alVar.delta;
        if (i4 == i12) {
            return c3382v;
        }
        D0.ak akVar = (D0.ak) alVar.echo;
        if (((Number) alpha.getValue()).intValue() != akVar.bravo.delta(i12)) {
            return (C3382v) alpha2.getValue();
        }
        int i13 = c3382v.bravo;
        long india = akVar.india(i13);
        if (i12 != -1) {
            if (i4 != i12) {
                if (i11 < i10) {
                    enumC3370j = EnumC3370j.purple;
                } else if (i11 > i10) {
                    enumC3370j = EnumC3370j.alpha;
                } else {
                    enumC3370j = EnumC3370j.red;
                }
                if (enumC3370j == EnumC3370j.alpha) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(z10 ^ z2)) {
                }
            }
            return alVar.bravo(i4);
        }
        int i14 = D0.am.charlie;
        if (i13 != ((int) (india >> 32)) && i13 != ((int) (4294967295L & india))) {
            return alVar.bravo(i4);
        }
        return (C3382v) alpha2.getValue();
    }

    public static final C3382v charlie(I.al alVar, boolean z2, boolean z10, InterfaceC3369i interfaceC3369i) {
        int i4;
        long j5;
        if (z10) {
            i4 = alVar.bravo;
        } else {
            i4 = alVar.charlie;
        }
        long alpha = interfaceC3369i.alpha(alVar, i4);
        if (z2 ^ z10) {
            int i5 = D0.am.charlie;
            j5 = alpha >> 32;
        } else {
            int i10 = D0.am.charlie;
            j5 = 4294967295L & alpha;
        }
        return alVar.bravo((int) j5);
    }

    public static final C3382v delta(C3382v c3382v, I.al alVar, int i4) {
        return new C3382v(((D0.ak) alVar.echo).alpha(i4), i4, c3382v.charlie);
    }
}
