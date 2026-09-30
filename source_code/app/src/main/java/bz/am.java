package bz;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class am implements InterfaceC0798x {
    public final al alpha;

    public am(al alVar) {
        this.alpha = alVar;
    }

    @Override // bz.InterfaceC0798x, bz.InterfaceC0787l
    /* renamed from: foxtrot, reason: merged with bridge method [inline-methods] */
    public final bj.e alpha(g0 g0Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i4;
        al alVar = this.alpha;
        bv.aa aaVar = alVar.bravo;
        bv.z zVar = new bv.z(aaVar.echo + 2);
        bv.aa aaVar2 = new bv.aa(aaVar.echo);
        int[] iArr3 = aaVar.bravo;
        Object[] objArr3 = aaVar.charlie;
        long[] jArr = aaVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i5 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j5 & 255) < 128) {
                            int i13 = (i5 << 3) + i12;
                            int i14 = iArr3[i13];
                            i4 = i10;
                            ak akVar = (ak) objArr3[i13];
                            zVar.charlie(i14);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            aaVar2.hotel(i14, new n0((r) g0Var.alpha.invoke(akVar.alpha), akVar.bravo));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i4 = i10;
                        }
                        j5 >>= i4;
                        i12++;
                        iArr3 = iArr2;
                        i10 = i4;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i11 != i10) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!aaVar.alpha(0)) {
            int i15 = zVar.bravo;
            if (i15 >= 0) {
                zVar.delta(i15 + 1);
                int[] iArr4 = zVar.alpha;
                int i16 = zVar.bravo;
                if (i16 != 0) {
                    ArraysKt.zulu(1, 0, iArr4, iArr4, i16);
                }
                iArr4[0] = 0;
                zVar.bravo++;
            } else {
                bw.a.delta("Index must be between 0 and size");
                throw null;
            }
        }
        if (!aaVar.alpha(alVar.alpha)) {
            zVar.charlie(alVar.alpha);
        }
        int i17 = zVar.bravo;
        if (i17 != 0) {
            int[] iArr5 = zVar.alpha;
            Intrinsics.echo(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i17);
        }
        return new bj.e(zVar, aaVar2, alVar.alpha, AbstractC0800z.delta);
    }
}
