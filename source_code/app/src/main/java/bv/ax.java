package bv;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ax implements Cloneable {
    public /* synthetic */ boolean alpha;
    public /* synthetic */ int[] purple;
    public /* synthetic */ Object[] red;
    public /* synthetic */ int silver;

    public ax(int i4) {
        int i5;
        int i10 = 4;
        while (true) {
            i5 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i5 = i11;
                break;
            }
            i10++;
        }
        int i12 = i5 / 4;
        this.purple = new int[i12];
        this.red = new Object[i12];
    }

    public final void alpha(int i4, Object obj) {
        int i5 = this.silver;
        if (i5 != 0 && i4 <= this.purple[i5 - 1]) {
            foxtrot(i4, obj);
            return;
        }
        if (this.alpha && i5 >= this.purple.length) {
            v.alpha(this);
        }
        int i10 = this.silver;
        if (i10 >= this.purple.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] copyOf = Arrays.copyOf(this.purple, i14);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.purple = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.red, i14);
            Intrinsics.delta(copyOf2, "copyOf(...)");
            this.red = copyOf2;
        }
        this.purple[i10] = i4;
        this.red[i10] = obj;
        this.silver = i10 + 1;
    }

    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final ax clone() {
        Object clone = super.clone();
        Intrinsics.charlie(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        ax axVar = (ax) clone;
        axVar.purple = (int[]) this.purple.clone();
        axVar.red = (Object[]) this.red.clone();
        return axVar;
    }

    public final boolean charlie(int i4) {
        if (this.alpha) {
            v.alpha(this);
        }
        if (bw.a.alpha(this.silver, i4, this.purple) >= 0) {
            return true;
        }
        return false;
    }

    public final Object delta(int i4) {
        Object obj;
        int alpha = bw.a.alpha(this.silver, i4, this.purple);
        if (alpha >= 0 && (obj = this.red[alpha]) != v.charlie) {
            return obj;
        }
        return null;
    }

    public final int echo(int i4) {
        if (this.alpha) {
            v.alpha(this);
        }
        return this.purple[i4];
    }

    public final void foxtrot(int i4, Object obj) {
        int alpha = bw.a.alpha(this.silver, i4, this.purple);
        if (alpha >= 0) {
            this.red[alpha] = obj;
            return;
        }
        int i5 = ~alpha;
        int i10 = this.silver;
        if (i5 < i10) {
            Object[] objArr = this.red;
            if (objArr[i5] == v.charlie) {
                this.purple[i5] = i4;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.alpha && i10 >= this.purple.length) {
            v.alpha(this);
            i5 = ~bw.a.alpha(this.silver, i4, this.purple);
        }
        int i11 = this.silver;
        if (i11 >= this.purple.length) {
            int i12 = (i11 + 1) * 4;
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
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.purple, i15);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.purple = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.red, i15);
            Intrinsics.delta(copyOf2, "copyOf(...)");
            this.red = copyOf2;
        }
        int i16 = this.silver;
        if (i16 - i5 != 0) {
            int[] iArr = this.purple;
            int i17 = i5 + 1;
            ArraysKt.zulu(i17, i5, iArr, iArr, i16);
            Object[] objArr2 = this.red;
            ArraysKt.yankee(i17, i5, this.silver, objArr2, objArr2);
        }
        this.purple[i5] = i4;
        this.red[i5] = obj;
        this.silver++;
    }

    public final int golf() {
        if (this.alpha) {
            v.alpha(this);
        }
        return this.silver;
    }

    public final Object hotel(int i4) {
        if (this.alpha) {
            v.alpha(this);
        }
        Object[] objArr = this.red;
        if (i4 < objArr.length) {
            return objArr[i4];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (golf() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.silver * 28);
        sb2.append('{');
        int i4 = this.silver;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb2.append(", ");
            }
            sb2.append(echo(i5));
            sb2.append('=');
            Object hotel = hotel(i5);
            if (hotel != this) {
                sb2.append(hotel);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
