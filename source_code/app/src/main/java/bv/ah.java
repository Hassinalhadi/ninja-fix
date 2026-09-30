package bv;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ah extends ar {
    public J.b charlie;

    public ah(int i4) {
        Object[] objArr;
        if (i4 == 0) {
            objArr = as.alpha;
        } else {
            objArr = new Object[i4];
        }
        this.alpha = objArr;
    }

    public final void golf(Object obj) {
        int i4 = this.bravo + 1;
        Object[] objArr = this.alpha;
        if (objArr.length < i4) {
            mike(i4, objArr);
        }
        Object[] objArr2 = this.alpha;
        int i5 = this.bravo;
        objArr2[i5] = obj;
        this.bravo = i5 + 1;
    }

    public final void hotel(List list) {
        if (!list.isEmpty()) {
            int i4 = this.bravo;
            int size = list.size() + i4;
            Object[] objArr = this.alpha;
            if (objArr.length < size) {
                mike(size, objArr);
            }
            Object[] objArr2 = this.alpha;
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                objArr2[i5 + i4] = list.get(i5);
            }
            this.bravo = list.size() + this.bravo;
        }
    }

    public final void india() {
        ArraysKt.coral(0, this.bravo, null, this.alpha);
        this.bravo = 0;
    }

    public final boolean juliet(Object obj) {
        int charlie = charlie(obj);
        if (charlie >= 0) {
            kilo(charlie);
            return true;
        }
        return false;
    }

    public final Object kilo(int i4) {
        int i5;
        if (i4 >= 0 && i4 < (i5 = this.bravo)) {
            Object[] objArr = this.alpha;
            Object obj = objArr[i4];
            if (i4 != i5 - 1) {
                ArraysKt.yankee(i4, i4 + 1, i5, objArr, objArr);
            }
            int i10 = this.bravo - 1;
            this.bravo = i10;
            objArr[i10] = null;
            return obj;
        }
        foxtrot(i4);
        throw null;
    }

    public final void lima(int i4, int i5) {
        int i10;
        if (i4 >= 0 && i4 <= (i10 = this.bravo) && i5 >= 0 && i5 <= i10) {
            if (i5 >= i4) {
                if (i5 != i4) {
                    if (i5 < i10) {
                        Object[] objArr = this.alpha;
                        ArraysKt.yankee(i4, i5, i10, objArr, objArr);
                    }
                    int i11 = this.bravo;
                    int i12 = i11 - (i5 - i4);
                    ArraysKt.coral(i12, i11, null, this.alpha);
                    this.bravo = i12;
                    return;
                }
                return;
            }
            bw.a.charlie("Start (" + i4 + ") is more than end (" + i5 + ')');
            throw null;
        }
        StringBuilder hotel = av.q.hotel(i4, i5, "Start (", ") and end (", ") must be in 0..");
        hotel.append(this.bravo);
        bw.a.delta(hotel.toString());
        throw null;
    }

    public final void mike(int i4, Object[] oldContent) {
        Intrinsics.echo(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i4, (length * 3) / 2)];
        ArraysKt.yankee(0, 0, length, oldContent, objArr);
        this.alpha = objArr;
    }

    public /* synthetic */ ah() {
        this(16);
    }
}
