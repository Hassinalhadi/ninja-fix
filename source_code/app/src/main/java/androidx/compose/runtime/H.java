package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class H {
    public final ArrayList alpha;
    public final int bravo;
    public int charlie;
    public final ArrayList delta;
    public final bv.aa echo;
    public final Lazy foxtrot;

    public H(int i4, ArrayList arrayList) {
        this.alpha = arrayList;
        this.bravo = i4;
        if (i4 < 0) {
            J.alpha("Invalid start index");
        }
        this.delta = new ArrayList();
        bv.aa aaVar = new bv.aa();
        int size = arrayList.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            ap apVar = (ap) this.alpha.get(i10);
            int i11 = apVar.charlie;
            int i12 = apVar.delta;
            aaVar.hotel(i11, new ai(i10, i5, i12));
            i5 += i12;
        }
        this.echo = aaVar;
        this.foxtrot = LazyKt.lazy(new G(0, this));
    }

    public final boolean alpha(int i4, int i5) {
        int i10;
        bv.aa aaVar = this.echo;
        ai aiVar = (ai) aaVar.bravo(i4);
        if (aiVar == null) {
            return false;
        }
        int i11 = aiVar.bravo;
        int i12 = i5 - aiVar.charlie;
        aiVar.charlie = i5;
        if (i12 != 0) {
            Object[] objArr = aaVar.charlie;
            long[] jArr = aaVar.alpha;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j5 = jArr[i13];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j5) < 128) {
                                ai aiVar2 = (ai) objArr[(i13 << 3) + i15];
                                if (aiVar2.bravo >= i11 && !Intrinsics.areEqual(aiVar2, aiVar) && (i10 = aiVar2.bravo + i12) >= 0) {
                                    aiVar2.bravo = i10;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i14 != 8) {
                            return true;
                        }
                    }
                    if (i13 != length) {
                        i13++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
