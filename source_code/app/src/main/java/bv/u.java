package bv;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements Cloneable {
    public /* synthetic */ boolean alpha;
    public /* synthetic */ long[] purple;
    public /* synthetic */ Object[] red;
    public /* synthetic */ int silver;

    public u(int i4) {
        if (i4 == 0) {
            this.purple = bw.a.bravo;
            this.red = bw.a.charlie;
            return;
        }
        int i5 = i4 * 8;
        int i10 = 4;
        while (true) {
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (i5 <= i11) {
                i5 = i11;
                break;
            }
            i10++;
        }
        int i12 = i5 / 8;
        this.purple = new long[i12];
        this.red = new Object[i12];
    }

    public final void alpha(long j5, Long l10) {
        int i4 = this.silver;
        if (i4 != 0 && j5 <= this.purple[i4 - 1]) {
            hotel(j5, l10);
            return;
        }
        if (this.alpha) {
            long[] jArr = this.purple;
            if (i4 >= jArr.length) {
                Object[] objArr = this.red;
                int i5 = 0;
                for (int i10 = 0; i10 < i4; i10++) {
                    Object obj = objArr[i10];
                    if (obj != v.alpha) {
                        if (i10 != i5) {
                            jArr[i5] = jArr[i10];
                            objArr[i5] = obj;
                            objArr[i10] = null;
                        }
                        i5++;
                    }
                }
                this.alpha = false;
                this.silver = i5;
            }
        }
        int i11 = this.silver;
        if (i11 >= this.purple.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] copyOf = Arrays.copyOf(this.purple, i15);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.purple = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.red, i15);
            Intrinsics.delta(copyOf2, "copyOf(...)");
            this.red = copyOf2;
        }
        this.purple[i11] = j5;
        this.red[i11] = l10;
        this.silver = i11 + 1;
    }

    public final void bravo() {
        int i4 = this.silver;
        Object[] objArr = this.red;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.silver = 0;
        this.alpha = false;
    }

    /* renamed from: charlie, reason: merged with bridge method [inline-methods] */
    public final u clone() {
        Object clone = super.clone();
        Intrinsics.charlie(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        u uVar = (u) clone;
        uVar.purple = (long[]) this.purple.clone();
        uVar.red = (Object[]) this.red.clone();
        return uVar;
    }

    public final Object delta(long j5) {
        Object obj;
        int bravo = bw.a.bravo(this.purple, this.silver, j5);
        if (bravo >= 0 && (obj = this.red[bravo]) != v.alpha) {
            return obj;
        }
        return null;
    }

    public final Object echo(long j5) {
        Object obj;
        int bravo = bw.a.bravo(this.purple, this.silver, j5);
        if (bravo < 0 || (obj = this.red[bravo]) == v.alpha) {
            return -1L;
        }
        return obj;
    }

    public final int foxtrot(long j5) {
        if (this.alpha) {
            int i4 = this.silver;
            long[] jArr = this.purple;
            Object[] objArr = this.red;
            int i5 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                Object obj = objArr[i10];
                if (obj != v.alpha) {
                    if (i10 != i5) {
                        jArr[i5] = jArr[i10];
                        objArr[i5] = obj;
                        objArr[i10] = null;
                    }
                    i5++;
                }
            }
            this.alpha = false;
            this.silver = i5;
        }
        return bw.a.bravo(this.purple, this.silver, j5);
    }

    public final long golf(int i4) {
        boolean z2;
        if (i4 >= 0 && i4 < this.silver) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.alpha) {
                int i5 = this.silver;
                long[] jArr = this.purple;
                Object[] objArr = this.red;
                int i10 = 0;
                for (int i11 = 0; i11 < i5; i11++) {
                    Object obj = objArr[i11];
                    if (obj != v.alpha) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.alpha = false;
                this.silver = i10;
            }
            return this.purple[i4];
        }
        bw.a.charlie("Expected index to be within 0..size()-1, but was " + i4);
        throw null;
    }

    public final void hotel(long j5, Object obj) {
        int bravo = bw.a.bravo(this.purple, this.silver, j5);
        if (bravo >= 0) {
            this.red[bravo] = obj;
            return;
        }
        int i4 = ~bravo;
        int i5 = this.silver;
        Object obj2 = v.alpha;
        if (i4 < i5) {
            Object[] objArr = this.red;
            if (objArr[i4] == obj2) {
                this.purple[i4] = j5;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.alpha) {
            long[] jArr = this.purple;
            if (i5 >= jArr.length) {
                Object[] objArr2 = this.red;
                int i10 = 0;
                for (int i11 = 0; i11 < i5; i11++) {
                    Object obj3 = objArr2[i11];
                    if (obj3 != obj2) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr2[i10] = obj3;
                            objArr2[i11] = null;
                        }
                        i10++;
                    }
                }
                this.alpha = false;
                this.silver = i10;
                i4 = ~bw.a.bravo(this.purple, i10, j5);
            }
        }
        int i12 = this.silver;
        if (i12 >= this.purple.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] copyOf = Arrays.copyOf(this.purple, i16);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.purple = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.red, i16);
            Intrinsics.delta(copyOf2, "copyOf(...)");
            this.red = copyOf2;
        }
        int i17 = this.silver;
        if (i17 - i4 != 0) {
            long[] jArr2 = this.purple;
            int i18 = i4 + 1;
            ArraysKt.azure(jArr2, jArr2, i18, i4, i17);
            Object[] objArr3 = this.red;
            ArraysKt.yankee(i18, i4, this.silver, objArr3, objArr3);
        }
        this.purple[i4] = j5;
        this.red[i4] = obj;
        this.silver++;
    }

    public final void india(long j5) {
        int bravo = bw.a.bravo(this.purple, this.silver, j5);
        if (bravo >= 0) {
            Object[] objArr = this.red;
            Object obj = objArr[bravo];
            Object obj2 = v.alpha;
            if (obj != obj2) {
                objArr[bravo] = obj2;
                this.alpha = true;
            }
        }
    }

    public final int juliet() {
        if (this.alpha) {
            int i4 = this.silver;
            long[] jArr = this.purple;
            Object[] objArr = this.red;
            int i5 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                Object obj = objArr[i10];
                if (obj != v.alpha) {
                    if (i10 != i5) {
                        jArr[i5] = jArr[i10];
                        objArr[i5] = obj;
                        objArr[i10] = null;
                    }
                    i5++;
                }
            }
            this.alpha = false;
            this.silver = i5;
        }
        return this.silver;
    }

    public final Object kilo(int i4) {
        boolean z2;
        if (i4 >= 0 && i4 < this.silver) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.alpha) {
                int i5 = this.silver;
                long[] jArr = this.purple;
                Object[] objArr = this.red;
                int i10 = 0;
                for (int i11 = 0; i11 < i5; i11++) {
                    Object obj = objArr[i11];
                    if (obj != v.alpha) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.alpha = false;
                this.silver = i10;
            }
            return this.red[i4];
        }
        bw.a.charlie("Expected index to be within 0..size()-1, but was " + i4);
        throw null;
    }

    public final String toString() {
        if (juliet() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.silver * 28);
        sb2.append('{');
        int i4 = this.silver;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb2.append(", ");
            }
            sb2.append(golf(i5));
            sb2.append('=');
            Object kilo = kilo(i5);
            if (kilo != sb2) {
                sb2.append(kilo);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ u(Object obj) {
        this(10);
    }
}
