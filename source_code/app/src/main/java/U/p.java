package U;

import A0.ac;
import A0.x;
import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.appcompat.widget.P0;
import bv.ah;
import bv.al;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s0.L;
import s6.D7;
import t0.W;

/* loaded from: classes3.dex */
public abstract class p {
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(ViewStructure viewStructure, A0.m mVar, AutofillId autofillId, String str, B0.b bVar) {
        int i4;
        char c3;
        long j5;
        long j6;
        long j7;
        C0.a aVar;
        A0.h hVar;
        D0.g gVar;
        d dVar;
        boolean z2;
        n nVar;
        Boolean bool;
        boolean z10;
        Integer num;
        List list;
        Integer valueOf;
        int i5;
        boolean z11;
        boolean z12;
        AutofillValue forText;
        String oscar;
        String[] charlie;
        boolean z13;
        String[] charlie2;
        al alVar;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        al alVar2;
        C0.a aVar2;
        A0.h hVar2;
        D0.g gVar2;
        int i10;
        ac acVar = x.alpha;
        ac acVar2 = A0.j.alpha;
        s0.al alVar3 = (s0.al) mVar;
        A0.k xray = alVar3.xray();
        int i11 = 8;
        boolean z14 = true;
        Integer num2 = 1;
        if (xray != null && (alVar2 = xray.alpha) != null) {
            j5 = 128;
            Object[] objArr5 = alVar2.bravo;
            Object[] objArr6 = alVar2.charlie;
            long[] jArr3 = alVar2.alpha;
            j6 = 255;
            int length = jArr3.length - 2;
            i4 = 2;
            c3 = 7;
            if (length >= 0) {
                int i12 = 0;
                dVar = null;
                z2 = false;
                aVar2 = null;
                nVar = null;
                bool = null;
                hVar2 = null;
                z10 = false;
                num = null;
                gVar2 = null;
                while (true) {
                    long j10 = jArr3[i12];
                    j7 = -9187201950435737472L;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr5[i15];
                                Object obj2 = objArr6[i15];
                                ac acVar3 = (ac) obj;
                                i10 = i11;
                                if (Intrinsics.areEqual(acVar3, x.romeo)) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    dVar = (d) obj2;
                                } else if (Intrinsics.areEqual(acVar3, x.alpha)) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) CollectionsKt.green((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (Intrinsics.areEqual(acVar3, x.quebec)) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    nVar = (n) obj2;
                                } else if (Intrinsics.areEqual(acVar3, x.blue)) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    gVar2 = (D0.g) obj2;
                                } else if (Intrinsics.areEqual(acVar3, x.kilo)) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.areEqual(acVar3, x.green)) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (Intrinsics.areEqual(acVar3, x.emerald)) {
                                    z10 = true;
                                } else if (Intrinsics.areEqual(acVar3, x.xray)) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    hVar2 = (A0.h) obj2;
                                } else if (Intrinsics.areEqual(acVar3, x.crimson)) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.areEqual(acVar3, x.cyan)) {
                                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar2 = (C0.a) obj2;
                                } else if (Intrinsics.areEqual(acVar3, A0.j.bravo)) {
                                    viewStructure.setClickable(true);
                                } else if (Intrinsics.areEqual(acVar3, A0.j.charlie)) {
                                    viewStructure.setLongClickable(true);
                                } else if (Intrinsics.areEqual(acVar3, A0.j.victor)) {
                                    viewStructure.setFocusable(true);
                                } else if (Intrinsics.areEqual(acVar3, A0.j.juliet)) {
                                    z2 = true;
                                }
                            } else {
                                i10 = i11;
                            }
                            j10 >>= i10;
                            i14++;
                            i11 = i10;
                            z14 = true;
                        }
                        if (i13 != i11) {
                            break;
                        }
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    i11 = 8;
                    z14 = true;
                }
            } else {
                j7 = -9187201950435737472L;
                dVar = null;
                z2 = false;
                aVar2 = null;
                nVar = null;
                bool = null;
                hVar2 = null;
                z10 = false;
                num = null;
                gVar2 = null;
            }
            aVar = aVar2;
            hVar = hVar2;
            gVar = gVar2;
        } else {
            i4 = 2;
            c3 = 7;
            j5 = 128;
            j6 = 255;
            j7 = -9187201950435737472L;
            aVar = null;
            hVar = null;
            gVar = null;
            dVar = null;
            z2 = false;
            nVar = null;
            bool = null;
            z10 = false;
            num = null;
        }
        A0.k xray2 = alVar3.xray();
        if (xray2 != null && xray2.red && !xray2.silver) {
            xray2 = xray2.alpha();
            ah ahVar = new ah(((J.e) ((J.b) alVar3.oscar()).purple).red);
            ahVar.hotel(alVar3.oscar());
            while (ahVar.echo()) {
                s0.al alVar4 = (s0.al) ((A0.m) ahVar.kilo(ahVar.bravo - 1));
                A0.k xray3 = alVar4.xray();
                if (xray3 != null && !xray3.red) {
                    xray2.delta(xray3);
                    if (!xray3.silver) {
                        ahVar.hotel(alVar4.oscar());
                    }
                }
            }
        }
        if (xray2 != null && (alVar = xray2.alpha) != null) {
            Object[] objArr7 = alVar.bravo;
            Object[] objArr8 = alVar.charlie;
            long[] jArr4 = alVar.alpha;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i16 = 0;
                list = null;
                while (true) {
                    long j11 = jArr4[i16];
                    if ((((~j11) << c3) & j11 & j7) != j7) {
                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j11 & j6) < j5) {
                                int i19 = (i16 << 3) + i18;
                                Object obj3 = objArr7[i19];
                                jArr2 = jArr4;
                                Object obj4 = objArr8[i19];
                                objArr3 = objArr7;
                                ac acVar4 = (ac) obj3;
                                objArr4 = objArr8;
                                if (Intrinsics.areEqual(acVar4, x.india)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.areEqual(acVar4, x.amber)) {
                                    Intrinsics.charlie(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr3 = objArr7;
                                objArr4 = objArr8;
                            }
                            j11 >>= 8;
                            i18++;
                            objArr7 = objArr3;
                            objArr8 = objArr4;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr7;
                        objArr2 = objArr8;
                        if (i17 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr7;
                        objArr2 = objArr8;
                    }
                    if (i16 == length2) {
                        break;
                    }
                    i16++;
                    objArr7 = objArr;
                    objArr8 = objArr2;
                    jArr4 = jArr;
                }
                valueOf = Integer.valueOf(alVar3.purple);
                if (alVar3.victor() == null) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    i5 = valueOf.intValue();
                } else {
                    i5 = -1;
                }
                viewStructure.setAutofillId(autofillId, i5);
                viewStructure.setId(i5, str, null, null);
                if (dVar == null && !z2) {
                    num2 = aVar == null ? Integer.valueOf(i4) : null;
                }
                if (num2 != null) {
                    viewStructure.setAutofillType(num2.intValue());
                }
                if (nVar != null && (charlie2 = D7.charlie(nVar)) != null) {
                    viewStructure.setAutofillHints(charlie2);
                }
                bVar.alpha.november(alVar3.purple, new o(0, viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                int i20 = 4;
                if (aVar == null) {
                    viewStructure.setCheckable(true);
                    if (aVar == C0.a.alpha) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    viewStructure.setChecked(z13);
                } else if (bool != null && (hVar == null || hVar.alpha != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                n.alpha.getClass();
                String str2 = (String) ArraysKt.fuchsia(D7.charlie(m.bravo));
                if (nVar == null && (charlie = D7.charlie(nVar)) != null && ArraysKt.whiskey(charlie, str2)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 && !z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    viewStructure.setDataIsSensitive(true);
                }
                if (!((L) alVar3.f13305x.foxtrot).I()) {
                    i20 = 0;
                }
                viewStructure.setVisibility(i20);
                if (list != null) {
                    int size = list.size();
                    String str3 = "";
                    for (int i21 = 0; i21 < size; i21++) {
                        str3 = P0.fuchsia(Q0.c.tango(str3), ((D0.g) list.get(i21)).purple, '\n');
                    }
                    viewStructure.setText(str3);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((J.b) alVar3.oscar()).isEmpty() && hVar != null && (oscar = W.oscar(hVar.alpha)) != null) {
                    viewStructure.setClassName(oscar);
                }
                if (!z2) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (Build.VERSION.SDK_INT >= 28 && num != null) {
                        viewStructure.setMaxTextLength(num.intValue());
                    }
                    if (gVar != null) {
                        forText = AutofillValue.forText(gVar.purple);
                        viewStructure.setAutofillValue(forText);
                    }
                    if (z12) {
                        viewStructure.setInputType(129);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        list = null;
        valueOf = Integer.valueOf(alVar3.purple);
        if (alVar3.victor() == null) {
        }
        if (valueOf == null) {
        }
        viewStructure.setAutofillId(autofillId, i5);
        viewStructure.setId(i5, str, null, null);
        if (dVar == null) {
            if (aVar == null) {
            }
        }
        if (num2 != null) {
        }
        if (nVar != null) {
            viewStructure.setAutofillHints(charlie2);
        }
        bVar.alpha.november(alVar3.purple, new o(0, viewStructure));
        if (bool != null) {
        }
        int i202 = 4;
        if (aVar == null) {
        }
        n.alpha.getClass();
        String str22 = (String) ArraysKt.fuchsia(D7.charlie(m.bravo));
        if (nVar == null) {
        }
        z11 = false;
        if (z10) {
        }
        z12 = true;
        if (z12) {
        }
        if (!((L) alVar3.f13305x.foxtrot).I()) {
        }
        viewStructure.setVisibility(i202);
        if (list != null) {
        }
        if (((J.b) alVar3.oscar()).isEmpty()) {
            viewStructure.setClassName(oscar);
        }
        if (!z2) {
        }
    }
}
