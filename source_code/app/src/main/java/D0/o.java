package D0;

import a0.AbstractC0362p;
import a0.C0363q;
import a0.InterfaceC0364r;
import a0.ar;
import a0.au;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;

/* loaded from: classes3.dex */
public final class o {
    public final B9.ab alpha;
    public final int bravo;
    public final boolean charlie;
    public final float delta;
    public final float echo;
    public final int foxtrot;
    public final ArrayList golf;
    public final ArrayList hotel;

    public o(B9.ab abVar, long j5, int i4, int i5) {
        boolean z2;
        Z.c cVar;
        int i10;
        int golf;
        int i11;
        this.alpha = abVar;
        this.bravo = i4;
        if (Q0.a.juliet(j5) != 0 || Q0.a.india(j5) != 0) {
            J0.a.alpha("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) abVar.teal;
        int size = arrayList2.size();
        float f5 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            r rVar = (r) arrayList2.get(i12);
            L0.d dVar = rVar.alpha;
            int hotel = Q0.a.hotel(j5);
            if (Q0.a.charlie(j5)) {
                i10 = i12;
                golf = Q0.a.golf(j5) - ((int) Math.ceil(f5));
                if (golf < 0) {
                    golf = 0;
                }
            } else {
                i10 = i12;
                golf = Q0.a.golf(j5);
            }
            a aVar = new a(dVar, this.bravo - i13, i5, Q0.b.bravo(hotel, golf, 5));
            float bravo = aVar.bravo() + f5;
            E0.r rVar2 = aVar.delta;
            int i14 = i13 + rVar2.golf;
            arrayList.add(new q(aVar, rVar.bravo, rVar.charlie, i13, i14, f5, bravo));
            if (!rVar2.delta) {
                if (i14 == this.bravo) {
                    i11 = i10;
                    if (i11 != CollectionsKt.ivory((ArrayList) this.alpha.teal)) {
                    }
                } else {
                    i11 = i10;
                }
                i12 = i11 + 1;
                i13 = i14;
                f5 = bravo;
            }
            z2 = true;
            i13 = i14;
            f5 = bravo;
            break;
        }
        z2 = false;
        this.echo = f5;
        this.foxtrot = i13;
        this.charlie = z2;
        this.hotel = arrayList;
        this.delta = Q0.a.hotel(j5);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            q qVar = (q) arrayList.get(i15);
            List list = qVar.alpha.foxtrot;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i16 = 0; i16 < size3; i16++) {
                Z.c cVar2 = (Z.c) list.get(i16);
                if (cVar2 != null) {
                    cVar = qVar.alpha(cVar2);
                } else {
                    cVar = null;
                }
                arrayList4.add(cVar);
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.alpha.white).size()) {
            int size4 = ((List) this.alpha.white).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i17 = 0; i17 < size4; i17++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.a(arrayList3, arrayList5);
        }
        this.golf = arrayList3;
    }

    public static void india(o oVar, InterfaceC0364r interfaceC0364r, long j5, ar arVar, O0.l lVar, c0.e eVar) {
        interfaceC0364r.golf();
        ArrayList arrayList = oVar.hotel;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            q qVar = (q) arrayList.get(i4);
            qVar.alpha.foxtrot(interfaceC0364r, j5, arVar, lVar, eVar);
            interfaceC0364r.mike(0.0f, qVar.alpha.bravo());
        }
        interfaceC0364r.november();
    }

    public static void juliet(o oVar, InterfaceC0364r interfaceC0364r, AbstractC0362p abstractC0362p, float f5, ar arVar, O0.l lVar, c0.e eVar) {
        interfaceC0364r.golf();
        ArrayList arrayList = oVar.hotel;
        if (arrayList.size() <= 1) {
            L0.k.alpha(oVar, interfaceC0364r, abstractC0362p, f5, arVar, lVar, eVar);
        } else if (abstractC0362p instanceof au) {
            L0.k.alpha(oVar, interfaceC0364r, abstractC0362p, f5, arVar, lVar, eVar);
        } else if (abstractC0362p instanceof a0.aq) {
            int size = arrayList.size();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i4 = 0; i4 < size; i4++) {
                q qVar = (q) arrayList.get(i4);
                f11 += qVar.alpha.bravo();
                f10 = Math.max(f10, qVar.alpha.delta());
            }
            Shader bravo = ((a0.aq) abstractC0362p).bravo((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
            Matrix matrix = new Matrix();
            bravo.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                q qVar2 = (q) arrayList.get(i5);
                qVar2.alpha.golf(interfaceC0364r, new C0363q(bravo), f5, arVar, lVar, eVar);
                a aVar = qVar2.alpha;
                interfaceC0364r.mike(0.0f, aVar.bravo());
                matrix.setTranslate(0.0f, -aVar.bravo());
                bravo.setLocalMatrix(matrix);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        interfaceC0364r.november();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.r, java.lang.Object] */
    public final void alpha(long j5, float[] fArr) {
        kilo(am.foxtrot(j5));
        lima(am.echo(j5));
        ?? obj = new Object();
        obj.alpha = 0;
        ae.golf(this.hotel, j5, new n(j5, fArr, (kotlin.jvm.internal.s) obj, (kotlin.jvm.internal.r) new Object()));
    }

    public final float bravo(int i4) {
        mike(i4);
        ArrayList arrayList = this.hotel;
        q qVar = (q) arrayList.get(ae.echo(i4, arrayList));
        a aVar = qVar.alpha;
        return aVar.delta.echo(i4 - qVar.delta) + qVar.foxtrot;
    }

    public final int charlie(int i4, boolean z2) {
        int foxtrot;
        mike(i4);
        ArrayList arrayList = this.hotel;
        q qVar = (q) arrayList.get(ae.echo(i4, arrayList));
        a aVar = qVar.alpha;
        int i5 = i4 - qVar.delta;
        E0.r rVar = aVar.delta;
        if (z2) {
            Layout layout = rVar.foxtrot;
            E0.q qVar2 = E0.s.alpha;
            if (layout.getEllipsisCount(i5) > 0 && rVar.bravo == TextUtils.TruncateAt.END) {
                foxtrot = layout.getEllipsisStart(i5) + layout.getLineStart(i5);
            } else {
                B9.ab charlie = rVar.charlie();
                Layout layout2 = (Layout) charlie.purple;
                foxtrot = charlie.gray(layout2.getLineEnd(i5), layout2.getLineStart(i5));
            }
        } else {
            foxtrot = rVar.foxtrot(i5);
        }
        return foxtrot + qVar.bravo;
    }

    public final int delta(int i4) {
        int delta;
        int length = ((g) this.alpha.purple).purple.length();
        ArrayList arrayList = this.hotel;
        if (i4 >= length) {
            delta = CollectionsKt.ivory(arrayList);
        } else if (i4 < 0) {
            delta = 0;
        } else {
            delta = ae.delta(i4, arrayList);
        }
        q qVar = (q) arrayList.get(delta);
        a aVar = qVar.alpha;
        return aVar.delta.foxtrot.getLineForOffset(qVar.delta(i4)) + qVar.delta;
    }

    public final int echo(float f5) {
        ArrayList arrayList = this.hotel;
        q qVar = (q) arrayList.get(ae.foxtrot(arrayList, f5));
        int i4 = qVar.charlie - qVar.bravo;
        int i5 = qVar.delta;
        if (i4 == 0) {
            return i5;
        }
        float f10 = f5 - qVar.foxtrot;
        E0.r rVar = qVar.alpha.delta;
        return rVar.foxtrot.getLineForVertical(((int) f10) - rVar.hotel) + i5;
    }

    public final float foxtrot(int i4) {
        mike(i4);
        ArrayList arrayList = this.hotel;
        q qVar = (q) arrayList.get(ae.echo(i4, arrayList));
        a aVar = qVar.alpha;
        return aVar.delta.golf(i4 - qVar.delta) + qVar.foxtrot;
    }

    public final int golf(long j5) {
        ArrayList arrayList = this.hotel;
        int i4 = (int) (j5 & 4294967295L);
        q qVar = (q) arrayList.get(ae.foxtrot(arrayList, Float.intBitsToFloat(i4)));
        int i5 = qVar.charlie;
        int i10 = qVar.bravo;
        if (i5 - i10 == 0) {
            return i10;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i4) - qVar.foxtrot;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        a aVar = qVar.alpha;
        int intBitsToFloat3 = (int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
        E0.r rVar = aVar.delta;
        int i11 = intBitsToFloat3 - rVar.hotel;
        Layout layout = rVar.foxtrot;
        int lineForVertical = layout.getLineForVertical(i11);
        return layout.getOffsetForHorizontal(lineForVertical, (rVar.bravo(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i10;
    }

    public final long hotel(Z.c cVar, int i4, A8.a aVar) {
        long j5;
        long j6;
        ArrayList arrayList = this.hotel;
        int foxtrot = ae.foxtrot(arrayList, cVar.bravo);
        float f5 = ((q) arrayList.get(foxtrot)).golf;
        float f10 = cVar.delta;
        if (f5 < f10 && foxtrot != CollectionsKt.ivory(arrayList)) {
            int foxtrot2 = ae.foxtrot(arrayList, f10);
            long j7 = am.bravo;
            while (true) {
                j5 = am.bravo;
                if (!am.bravo(j7, j5) || foxtrot > foxtrot2) {
                    break;
                }
                q qVar = (q) arrayList.get(foxtrot);
                j7 = qVar.bravo(qVar.alpha.charlie(qVar.charlie(cVar), i4, aVar), true);
                foxtrot++;
            }
            if (am.bravo(j7, j5)) {
                return j5;
            }
            while (true) {
                j6 = am.bravo;
                if (!am.bravo(j5, j6) || foxtrot > foxtrot2) {
                    break;
                }
                q qVar2 = (q) arrayList.get(foxtrot2);
                j5 = qVar2.bravo(qVar2.alpha.charlie(qVar2.charlie(cVar), i4, aVar), true);
                foxtrot2--;
            }
            if (am.bravo(j5, j6)) {
                return j7;
            }
            return ae.bravo((int) (j7 >> 32), (int) (4294967295L & j5));
        }
        q qVar3 = (q) arrayList.get(foxtrot);
        return qVar3.bravo(qVar3.alpha.charlie(qVar3.charlie(cVar), i4, aVar), true);
    }

    public final void kilo(int i4) {
        boolean z2 = false;
        B9.ab abVar = this.alpha;
        if (i4 >= 0 && i4 < ((g) abVar.purple).purple.length()) {
            z2 = true;
        }
        if (!z2) {
            StringBuilder sierra = Q0.c.sierra(i4, "offset(", ") is out of bounds [0, ");
            sierra.append(((g) abVar.purple).purple.length());
            sierra.append(')');
            J0.a.alpha(sierra.toString());
        }
    }

    public final void lima(int i4) {
        boolean z2 = false;
        B9.ab abVar = this.alpha;
        if (i4 >= 0 && i4 <= ((g) abVar.purple).purple.length()) {
            z2 = true;
        }
        if (!z2) {
            StringBuilder sierra = Q0.c.sierra(i4, "offset(", ") is out of bounds [0, ");
            sierra.append(((g) abVar.purple).purple.length());
            sierra.append(']');
            J0.a.alpha(sierra.toString());
        }
    }

    public final void mike(int i4) {
        boolean z2 = false;
        int i5 = this.foxtrot;
        if (i4 >= 0 && i4 < i5) {
            z2 = true;
        }
        if (!z2) {
            J0.a.alpha("lineIndex(" + i4 + ") is out of bounds [0, " + i5 + ')');
        }
    }
}
