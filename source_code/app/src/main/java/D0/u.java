package D0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class u {
    public static final long alpha;
    public static final /* synthetic */ int bravo = 0;

    static {
        Q0.q[] qVarArr = Q0.p.bravo;
        alpha = Q0.p.charlie;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0024, code lost:
    
        if (r1 == r18.alpha) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final t alpha(t tVar, int i4, int i5, long j5, O0.q qVar, v vVar, O0.i iVar, int i10, int i11, O0.s sVar) {
        long j6;
        int i12 = i4;
        int i13 = i5;
        long j7 = j5;
        O0.q qVar2 = qVar;
        v vVar2 = vVar;
        O0.i iVar2 = iVar;
        int i14 = i10;
        int i15 = i11;
        O0.s sVar2 = sVar;
        if (i12 == Integer.MIN_VALUE) {
            j6 = 0;
        } else {
            j6 = 0;
        }
        Q0.q[] qVarArr = Q0.p.bravo;
        if (((j7 & 1095216660480L) == j6 || Q0.p.alpha(j7, tVar.charlie)) && ((qVar2 == null || Intrinsics.areEqual(qVar2, tVar.delta)) && ((i13 == Integer.MIN_VALUE || i13 == tVar.bravo) && ((vVar2 == null || Intrinsics.areEqual(vVar2, tVar.echo)) && ((iVar2 == null || Intrinsics.areEqual(iVar2, tVar.foxtrot)) && ((i14 == 0 || i14 == tVar.golf) && ((i15 == Integer.MIN_VALUE || i15 == tVar.hotel) && (sVar2 == null || Intrinsics.areEqual(sVar2, tVar.india))))))))) {
            return tVar;
        }
        Q0.q[] qVarArr2 = Q0.p.bravo;
        if ((j7 & 1095216660480L) == j6) {
            j7 = tVar.charlie;
        }
        if (qVar2 == null) {
            qVar2 = tVar.delta;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = tVar.alpha;
        }
        if (i13 == Integer.MIN_VALUE) {
            i13 = tVar.bravo;
        }
        v vVar3 = tVar.echo;
        if (vVar3 != null && vVar2 == null) {
            vVar2 = vVar3;
        }
        if (iVar2 == null) {
            iVar2 = tVar.foxtrot;
        }
        if (i14 == 0) {
            i14 = tVar.golf;
        }
        if (i15 == Integer.MIN_VALUE) {
            i15 = tVar.hotel;
        }
        if (sVar2 == null) {
            sVar2 = tVar.india;
        }
        return new t(i12, i13, j7, qVar2, vVar2, iVar2, i14, i15, sVar2);
    }
}
