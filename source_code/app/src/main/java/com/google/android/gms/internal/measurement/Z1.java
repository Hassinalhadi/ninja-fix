package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Z1 {
    public static final Z1 foxtrot = new Z1(0, new int[0], new Object[0], false);
    public int alpha;
    public int[] bravo;
    public Object[] charlie;
    public int delta = -1;
    public boolean echo;

    public Z1(int i4, int[] iArr, Object[] objArr, boolean z2) {
        this.alpha = i4;
        this.bravo = iArr;
        this.charlie = objArr;
        this.echo = z2;
    }

    public static Z1 bravo() {
        return new Z1(0, new int[8], new Object[8], true);
    }

    public final int alpha() {
        int romeo;
        int bravo;
        int romeo2;
        int i4 = this.delta;
        if (i4 == -1) {
            int i5 = 0;
            for (int i10 = 0; i10 < this.alpha; i10++) {
                int i11 = this.bravo[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 5) {
                                    ((Integer) this.charlie[i10]).getClass();
                                    romeo2 = C1365q1.romeo(i12 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new zzml("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                int romeo3 = C1365q1.romeo(i12 << 3);
                                romeo = romeo3 + romeo3;
                                bravo = ((Z1) this.charlie[i10]).alpha();
                            }
                        } else {
                            int i14 = i12 << 3;
                            C1361p1 c1361p1 = (C1361p1) this.charlie[i10];
                            int romeo4 = C1365q1.romeo(i14);
                            int delta = c1361p1.delta();
                            i5 = ao.ad.gold(delta, delta, romeo4, i5);
                        }
                    } else {
                        ((Long) this.charlie[i10]).getClass();
                        romeo2 = C1365q1.romeo(i12 << 3) + 8;
                    }
                    i5 = romeo2 + i5;
                } else {
                    int i15 = i12 << 3;
                    long longValue = ((Long) this.charlie[i10]).longValue();
                    romeo = C1365q1.romeo(i15);
                    bravo = C1365q1.bravo(longValue);
                }
                i5 = bravo + romeo + i5;
            }
            this.delta = i5;
            return i5;
        }
        return i4;
    }

    public final void charlie(int i4, Object obj) {
        if (this.echo) {
            echo(this.alpha + 1);
            int[] iArr = this.bravo;
            int i5 = this.alpha;
            iArr[i5] = i4;
            this.charlie[i5] = obj;
            this.alpha = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void delta(J1 j12) {
        if (this.alpha != 0) {
            for (int i4 = 0; i4 < this.alpha; i4++) {
                int i5 = this.bravo[i4];
                Object obj = this.charlie[i4];
                int i10 = i5 & 7;
                int i11 = i5 >>> 3;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 5) {
                                    ((C1365q1) j12.alpha).echo(i11, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new zzml("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                ((C1365q1) j12.alpha).lima(i11, 3);
                                ((Z1) obj).delta(j12);
                                ((C1365q1) j12.alpha).lima(i11, 4);
                            }
                        } else {
                            ((C1365q1) j12.alpha).delta(i11, (C1361p1) obj);
                        }
                    } else {
                        ((C1365q1) j12.alpha).golf(i11, ((Long) obj).longValue());
                    }
                } else {
                    ((C1365q1) j12.alpha).oscar(i11, ((Long) obj).longValue());
                }
            }
        }
    }

    public final void echo(int i4) {
        int[] iArr = this.bravo;
        if (i4 > iArr.length) {
            int i5 = this.alpha;
            int i10 = (i5 / 2) + i5;
            if (i10 >= i4) {
                i4 = i10;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.bravo = Arrays.copyOf(iArr, i4);
            this.charlie = Arrays.copyOf(this.charlie, i4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z1)) {
            return false;
        }
        Z1 z12 = (Z1) obj;
        int i4 = this.alpha;
        if (i4 == z12.alpha) {
            int[] iArr = this.bravo;
            int[] iArr2 = z12.bravo;
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    if (iArr[i5] != iArr2[i5]) {
                        break;
                    }
                    i5++;
                } else {
                    Object[] objArr = this.charlie;
                    Object[] objArr2 = z12.charlie;
                    int i10 = this.alpha;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.alpha;
        int i5 = i4 + 527;
        int[] iArr = this.bravo;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i4; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i5 * 31) + i11) * 31;
        Object[] objArr = this.charlie;
        int i14 = this.alpha;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }
}
