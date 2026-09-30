package androidx.compose.runtime;

import com.google.android.gms.internal.measurement.C1298c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Z implements InterfaceC0566c {
    public final bv.z alpha = new bv.z();
    public final bv.ah purple = new bv.ah();
    public final Object red;

    public Z(Object obj) {
        this.red = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0017. Please report as an issue. */
    public final void alpha(C1298c c1298c, B9.r rVar) {
        Exception exc;
        bv.z zVar = this.alpha;
        int i4 = zVar.bravo;
        bv.ah ahVar = new bv.ah();
        int i5 = 0;
        int i10 = 0;
        while (true) {
            bv.ah ahVar2 = this.purple;
            if (i5 < i4) {
                int i11 = i5 + 1;
                try {
                    try {
                        switch (zVar.alpha(i5)) {
                            case 0:
                                c1298c.kilo();
                                i5 = i11;
                            case 1:
                                int i12 = i10 + 1;
                                c1298c.charlie(ahVar2.bravo(i10));
                                i10 = i12;
                                i5 = i11;
                            case 2:
                                int i13 = i5 + 2;
                                i5 += 3;
                                c1298c.india(zVar.alpha(i11), zVar.alpha(i13));
                            case 3:
                                int i14 = i5 + 2;
                                try {
                                    int i15 = i5 + 3;
                                    try {
                                        i5 += 4;
                                        c1298c.golf(zVar.alpha(i11), zVar.alpha(i14), zVar.alpha(i15));
                                    } catch (Exception e) {
                                        exc = e;
                                        i5 = i15;
                                        break;
                                    }
                                } catch (Exception e4) {
                                    exc = e4;
                                    i5 = i14;
                                    break;
                                }
                            case 4:
                                c1298c.papa();
                                i5 = i11;
                            case 5:
                                i5 += 2;
                                int i16 = i10 + 1;
                                c1298c.bravo(zVar.alpha(i11), ahVar2.bravo(i10));
                                i10 = i16;
                            case 6:
                                i5 += 2;
                                try {
                                    zVar.alpha(i11);
                                    int i17 = i10 + 1;
                                    i10 = i17;
                                } catch (Exception e5) {
                                    exc = e5;
                                    break;
                                }
                            case 7:
                                int i18 = i10 + 1;
                                Object bravo = ahVar2.bravo(i10);
                                Intrinsics.charlie(bravo, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                                kotlin.jvm.internal.x.echo(2, bravo);
                                i10 += 2;
                                ((Xd.l) bravo).invoke(c1298c.romeo(), ahVar2.bravo(i18));
                                i5 = i11;
                            case 8:
                                Object obj = c1298c.red;
                                if (obj instanceof InterfaceC0578j) {
                                    InterfaceC0578j interfaceC0578j = (InterfaceC0578j) obj;
                                    if (((J.e) rVar.foxtrot).lima(interfaceC0578j)) {
                                        interfaceC0578j.bravo();
                                    }
                                }
                                ahVar.golf(obj);
                                c1298c.echo();
                                i5 = i11;
                            default:
                                i5 = i11;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        i5 = i11;
                    }
                } catch (Throwable th) {
                    c1298c.mike();
                    throw th;
                }
            } else {
                if (i10 != ahVar2.bravo) {
                    r.charlie("Applier operation size mismatch");
                }
                ahVar2.india();
                zVar.bravo = 0;
                c1298c.mike();
                return;
            }
            exc = e5;
            throw new ComposePausableCompositionException(ahVar2, ahVar, zVar, i5, exc);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public final void bravo(int i4, Object obj) {
        bv.z zVar = this.alpha;
        zVar.charlie(5);
        zVar.charlie(i4);
        this.purple.golf(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public final void charlie(Object obj) {
        this.alpha.charlie(1);
        this.purple.golf(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public final void echo() {
        this.alpha.charlie(8);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public final void golf(int i4, int i5, int i10) {
        bv.z zVar = this.alpha;
        zVar.charlie(3);
        zVar.charlie(i4);
        zVar.charlie(i5);
        zVar.charlie(i10);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public final void india(int i4, int i5) {
        bv.z zVar = this.alpha;
        zVar.charlie(2);
        zVar.charlie(i4);
        zVar.charlie(i5);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public final void kilo() {
        this.alpha.charlie(0);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public final void lima(int i4, Object obj) {
        bv.z zVar = this.alpha;
        zVar.charlie(6);
        zVar.charlie(i4);
        this.purple.golf(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public final /* synthetic */ void mike() {
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public final void november(Object obj, Xd.l lVar) {
        this.alpha.charlie(7);
        bv.ah ahVar = this.purple;
        ahVar.golf(lVar);
        ahVar.golf(obj);
    }
}
