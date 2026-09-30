package S;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import pf.C2359i;
import s6.AbstractC2770s7;

/* loaded from: classes3.dex */
public final class l implements Iterable, Yd.a {
    public static final l teal = new l(0, 0, 0, null);
    public final long alpha;
    public final long purple;
    public final long red;
    public final long[] silver;

    public l(long j5, long j6, long j7, long[] jArr) {
        this.alpha = j5;
        this.purple = j6;
        this.red = j7;
        this.silver = jArr;
    }

    public final l alpha(l lVar) {
        l lVar2;
        long[] jArr;
        l lVar3 = teal;
        if (lVar == lVar3) {
            return this;
        }
        if (this == lVar3) {
            return lVar3;
        }
        long j5 = lVar.red;
        long j6 = this.red;
        long[] jArr2 = lVar.silver;
        long j7 = lVar.purple;
        long j10 = lVar.alpha;
        if (j5 == j6 && jArr2 == (jArr = this.silver)) {
            return new l(this.alpha & (~j10), (~j7) & this.purple, j6, jArr);
        }
        if (jArr2 != null) {
            lVar2 = this;
            for (long j11 : jArr2) {
                lVar2 = lVar2.bravo(j11);
            }
        } else {
            lVar2 = this;
        }
        long j12 = 0;
        long j13 = lVar.red;
        if (j7 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((j7 & (1 << i4)) != 0) {
                    lVar2 = lVar2.bravo(i4 + j13);
                }
            }
        }
        if (j10 != 0) {
            int i5 = 0;
            while (i5 < 64) {
                if (((1 << i5) & j10) != j12) {
                    lVar2 = lVar2.bravo(i5 + j13 + 64);
                }
                i5++;
                j12 = 0;
            }
        }
        return lVar2;
    }

    public final l bravo(long j5) {
        long[] jArr;
        int alpha;
        long[] jArr2;
        long j6 = j5 - this.red;
        long j7 = 0;
        if (Intrinsics.hotel(j6, j7) >= 0 && Intrinsics.hotel(j6, 64) < 0) {
            long j10 = 1 << ((int) j6);
            long j11 = this.purple;
            if ((j11 & j10) != 0) {
                return new l(this.alpha, j11 & (~j10), this.red, this.silver);
            }
        } else if (Intrinsics.hotel(j6, 64) >= 0 && Intrinsics.hotel(j6, 128) < 0) {
            long j12 = 1 << (((int) j6) - 64);
            long j13 = this.alpha;
            if ((j13 & j12) != 0) {
                return new l(j13 & (~j12), this.purple, this.red, this.silver);
            }
        } else if (Intrinsics.hotel(j6, j7) < 0 && (jArr = this.silver) != null && (alpha = u.alpha(jArr, j5)) >= 0) {
            int length = jArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i4];
                if (alpha > 0) {
                    ArraysKt.azure(jArr, jArr3, 0, 0, alpha);
                }
                if (alpha < i4) {
                    ArraysKt.azure(jArr, jArr3, alpha, alpha + 1, length);
                }
                jArr2 = jArr3;
            }
            return new l(this.alpha, this.purple, this.red, jArr2);
        }
        return this;
    }

    public final boolean delta(long j5) {
        long[] jArr;
        long j6 = j5 - this.red;
        long j7 = 0;
        if (Intrinsics.hotel(j6, j7) >= 0 && Intrinsics.hotel(j6, 64) < 0) {
            if (((1 << ((int) j6)) & this.purple) == 0) {
                return false;
            }
            return true;
        }
        if (Intrinsics.hotel(j6, 64) >= 0 && Intrinsics.hotel(j6, 128) < 0) {
            if (((1 << (((int) j6) - 64)) & this.alpha) == 0) {
                return false;
            }
            return true;
        }
        if (Intrinsics.hotel(j6, j7) > 0 || (jArr = this.silver) == null || u.alpha(jArr, j5) < 0) {
            return false;
        }
        return true;
    }

    public final l hotel(l lVar) {
        long j5;
        l lVar2;
        l lVar3 = lVar;
        l lVar4 = teal;
        if (lVar3 == lVar4) {
            return this;
        }
        if (this == lVar4) {
            return lVar3;
        }
        long j6 = lVar3.red;
        long j7 = this.red;
        long j10 = this.purple;
        long j11 = this.alpha;
        long[] jArr = lVar3.silver;
        long j12 = lVar3.purple;
        long j13 = lVar3.alpha;
        if (j6 == j7) {
            long[] jArr2 = this.silver;
            j5 = j10;
            if (jArr == jArr2) {
                return new l(j11 | j13, j5 | j12, j7, jArr2);
            }
        } else {
            j5 = j10;
        }
        int i4 = 0;
        long[] jArr3 = this.silver;
        if (jArr3 == null) {
            if (jArr3 != null) {
                for (long j14 : jArr3) {
                    lVar3 = lVar3.india(j14);
                }
            }
            long j15 = this.red;
            if (j5 != 0) {
                for (int i5 = 0; i5 < 64; i5++) {
                    if (((1 << i5) & j5) != 0) {
                        lVar3 = lVar3.india(i5 + j15);
                    }
                }
            }
            if (j11 != 0) {
                while (i4 < 64) {
                    if (((1 << i4) & j11) != 0) {
                        lVar3 = lVar3.india(i4 + j15 + 64);
                    }
                    i4++;
                }
            }
            return lVar3;
        }
        if (jArr != null) {
            lVar2 = this;
            for (long j16 : jArr) {
                lVar2 = lVar2.india(j16);
            }
        } else {
            lVar2 = this;
        }
        long j17 = lVar3.red;
        if (j12 != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j12) != 0) {
                    lVar2 = lVar2.india(i10 + j17);
                }
            }
        }
        if (j13 != 0) {
            while (i4 < 64) {
                if (((1 << i4) & j13) != 0) {
                    lVar2 = lVar2.india(i4 + j17 + 64);
                }
                i4++;
            }
        }
        return lVar2;
    }

    public final l india(long j5) {
        int i4;
        long j6;
        int i5;
        int i10;
        long j7;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i11;
        long j11 = this.red;
        long j12 = j5 - j11;
        long j13 = 0;
        int hotel = Intrinsics.hotel(j12, j13);
        long j14 = this.purple;
        if (hotel >= 0) {
            i4 = 0;
            j6 = j13;
            if (Intrinsics.hotel(j12, 64) < 0) {
                long j15 = 1 << ((int) j12);
                if ((j14 & j15) == 0) {
                    return new l(this.alpha, j14 | j15, this.red, this.silver);
                }
                return this;
            }
        } else {
            i4 = 0;
            j6 = j13;
        }
        long j16 = 64;
        int hotel2 = Intrinsics.hotel(j12, j16);
        int i12 = i4;
        long j17 = j14;
        long j18 = this.alpha;
        if (hotel2 >= 0) {
            i5 = i12;
            if (Intrinsics.hotel(j12, 128) < 0) {
                long j19 = 1 << (((int) j12) - 64);
                if ((j18 & j19) == 0) {
                    return new l(j18 | j19, this.purple, this.red, this.silver);
                }
                return this;
            }
        } else {
            i5 = i12;
        }
        long j20 = 128;
        int hotel3 = Intrinsics.hotel(j12, j20);
        long[] jArr3 = this.silver;
        if (hotel3 >= 0) {
            if (!delta(j5)) {
                long j21 = 1;
                long j22 = ((j5 + j21) / j16) * j16;
                int i13 = 1;
                if (Intrinsics.hotel(j22, j6) < 0) {
                    j22 = (Long.MAX_VALUE - j20) + j21;
                }
                long j23 = j18;
                long j24 = j11;
                O7.j jVar = null;
                while (true) {
                    if (Intrinsics.hotel(j24, j22) < 0) {
                        if (j17 != 0) {
                            if (jVar == null) {
                                jVar = new O7.j(jArr3);
                            }
                            int i14 = i5;
                            while (i14 < 64) {
                                if ((j17 & (1 << i14)) != 0) {
                                    i11 = i13;
                                    ((bv.ac) jVar.purple).alpha(i14 + j24);
                                } else {
                                    i11 = i13;
                                }
                                i14 += i11;
                                i13 = i11;
                            }
                        }
                        i10 = i13;
                        if (j23 == 0) {
                            j7 = j22;
                            j10 = 0;
                            break;
                        }
                        j24 += j16;
                        i13 = i10;
                        j17 = j23;
                        j23 = 0;
                    } else {
                        i10 = i13;
                        j7 = j24;
                        j10 = j17;
                        break;
                    }
                }
                if (jVar != null) {
                    bv.ac acVar = (bv.ac) jVar.purple;
                    int i15 = acVar.bravo;
                    if (i15 == 0) {
                        jArr2 = null;
                    } else {
                        jArr2 = new long[i15];
                        long[] jArr4 = acVar.alpha;
                        for (int i16 = i5; i16 < i15; i16 += i10) {
                            jArr2[i16] = jArr4[i16];
                        }
                    }
                    if (jArr2 != null) {
                        jArr = jArr2;
                        return new l(j23, j10, j7, jArr).india(j5);
                    }
                }
                jArr = jArr3;
                return new l(j23, j10, j7, jArr).india(j5);
            }
        } else {
            if (jArr3 == null) {
                long[] jArr5 = new long[1];
                jArr5[i5] = j5;
                return new l(this.alpha, this.purple, this.red, jArr5);
            }
            int alpha = u.alpha(jArr3, j5);
            if (alpha < 0) {
                int i17 = -(alpha + 1);
                int length = jArr3.length;
                long[] jArr6 = new long[length + 1];
                int i18 = i5;
                ArraysKt.azure(jArr3, jArr6, i18, i18, i17);
                ArraysKt.azure(jArr3, jArr6, i17 + 1, i17, length);
                jArr6[i17] = j5;
                return new l(this.alpha, this.purple, this.red, jArr6);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC2770s7.bravo(new k(this, null));
    }

    public final String toString() {
        int collectionSizeOrDefault;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(this, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = iterator();
        while (true) {
            C2359i c2359i = (C2359i) it;
            if (!c2359i.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) c2359i.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = arrayList.get(i5);
            boolean z2 = true;
            i4++;
            if (i4 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null) {
                z2 = obj instanceof CharSequence;
            }
            if (z2) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
