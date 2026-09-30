package J;

import bv.ah;
import bv.al;
import bv.as;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final al alpha;

    public /* synthetic */ a(al alVar) {
        this.alpha = alVar;
    }

    public static final Object alpha(al alVar) {
        Object golf = alVar.golf(null);
        if (golf == null) {
            return null;
        }
        if (golf instanceof ah) {
            ah ahVar = (ah) golf;
            if (!ahVar.delta()) {
                int i4 = ahVar.bravo - 1;
                Object bravo = ahVar.bravo(i4);
                ahVar.kilo(i4);
                Intrinsics.charlie(bravo, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                if (ahVar.delta()) {
                    alVar.kilo(null);
                }
                if (ahVar.bravo == 1) {
                    alVar.mike(null, ahVar.alpha());
                }
                return bravo;
            }
            throw new NoSuchElementException("List is empty.");
        }
        alVar.kilo(null);
        return golf;
    }

    public static final ah bravo(al alVar) {
        if (alVar.india()) {
            ah ahVar = as.bravo;
            Intrinsics.charlie(ahVar, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return ahVar;
        }
        ah ahVar2 = new ah();
        Object[] objArr = alVar.charlie;
        long[] jArr = alVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i4 << 3) + i10];
                            if (obj instanceof ah) {
                                Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                ah elements = (ah) obj;
                                Intrinsics.echo(elements, "elements");
                                if (!elements.delta()) {
                                    int i11 = ahVar2.bravo + elements.bravo;
                                    Object[] objArr2 = ahVar2.alpha;
                                    if (objArr2.length < i11) {
                                        ahVar2.mike(i11, objArr2);
                                    }
                                    ArraysKt.yankee(ahVar2.bravo, 0, elements.bravo, elements.alpha, ahVar2.alpha);
                                    ahVar2.bravo += elements.bravo;
                                }
                            } else {
                                Intrinsics.charlie(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                ahVar2.golf(obj);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return ahVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!Intrinsics.areEqual(this.alpha, ((a) obj).alpha)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.alpha + ')';
    }
}
