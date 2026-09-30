package s;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import u.InterfaceC3132f;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2532k implements Xd.o {
    public static final C2532k purple = new C2532k(0);
    public static final C2532k red = new C2532k(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C2532k(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.o
    public final Object golf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i4;
        boolean z2;
        int i5;
        boolean india;
        int i10;
        boolean india2;
        int i11;
        int i12;
        boolean z10;
        int i13;
        boolean india3;
        int i14;
        boolean india4;
        int i15;
        switch (this.alpha) {
            case 0:
                q.g gVar = (q.g) obj;
                InterfaceC3132f interfaceC3132f = (InterfaceC3132f) obj2;
                Function0 function0 = (Function0) obj3;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj4;
                int intValue = ((Number) obj5).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        india2 = ((C0585q) interfaceC0581m).golf(gVar);
                    } else {
                        india2 = ((C0585q) interfaceC0581m).india(gVar);
                    }
                    if (india2) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    i4 = i11 | intValue;
                } else {
                    i4 = intValue;
                }
                if ((intValue & 48) == 0) {
                    if ((intValue & 64) == 0) {
                        india = ((C0585q) interfaceC0581m).golf(interfaceC3132f);
                    } else {
                        india = ((C0585q) interfaceC0581m).india(interfaceC3132f);
                    }
                    if (india) {
                        i10 = 32;
                    } else {
                        i10 = 16;
                    }
                    i4 |= i10;
                }
                if ((intValue & 384) == 0) {
                    if (((C0585q) interfaceC0581m).india(function0)) {
                        i5 = Barcode.FORMAT_QR_CODE;
                    } else {
                        i5 = 128;
                    }
                    i4 |= i5;
                }
                if ((i4 & 1171) != 1170) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(i4 & 1, z2)) {
                    AbstractC2534m.charlie(gVar, interfaceC3132f, function0, c0585q, i4 & 1022);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                q.g gVar2 = (q.g) obj;
                InterfaceC3132f interfaceC3132f2 = (InterfaceC3132f) obj2;
                Function0 function02 = (Function0) obj3;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj4;
                int intValue2 = ((Number) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        india4 = ((C0585q) interfaceC0581m2).golf(gVar2);
                    } else {
                        india4 = ((C0585q) interfaceC0581m2).india(gVar2);
                    }
                    if (india4) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i12 = i15 | intValue2;
                } else {
                    i12 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if ((intValue2 & 64) == 0) {
                        india3 = ((C0585q) interfaceC0581m2).golf(interfaceC3132f2);
                    } else {
                        india3 = ((C0585q) interfaceC0581m2).india(interfaceC3132f2);
                    }
                    if (india3) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i12 |= i14;
                }
                if ((intValue2 & 384) == 0) {
                    if (((C0585q) interfaceC0581m2).india(function02)) {
                        i13 = Barcode.FORMAT_QR_CODE;
                    } else {
                        i13 = 128;
                    }
                    i12 |= i13;
                }
                if ((i12 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(i12 & 1, z10)) {
                    AbstractC2534m.charlie(gVar2, interfaceC3132f2, function02, c0585q2, i12 & 1022);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
