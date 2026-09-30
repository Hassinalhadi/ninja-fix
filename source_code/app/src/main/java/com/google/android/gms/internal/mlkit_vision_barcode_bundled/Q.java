package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Q {
    public static final Q foxtrot = new Q(0, new int[0], new Object[0], false);
    public int alpha;
    public int[] bravo;
    public Object[] charlie;
    public int delta = -1;
    public boolean echo;

    public Q(int i4, int[] iArr, Object[] objArr, boolean z2) {
        this.alpha = i4;
        this.bravo = iArr;
        this.charlie = objArr;
        this.echo = z2;
    }

    public static Q bravo() {
        return new Q(0, new int[8], new Object[8], true);
    }

    public final int alpha() {
        int romeo;
        int sierra;
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
                                    romeo2 = aa.romeo(i12 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new zzeq("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                int romeo3 = aa.romeo(i12 << 3);
                                romeo = romeo3 + romeo3;
                                sierra = ((Q) this.charlie[i10]).alpha();
                            }
                        } else {
                            int i14 = i12 << 3;
                            AbstractC1431z abstractC1431z = (AbstractC1431z) this.charlie[i10];
                            int romeo4 = aa.romeo(i14);
                            int hotel = abstractC1431z.hotel();
                            i5 = ao.ad.green(hotel, hotel, romeo4, i5);
                        }
                    } else {
                        ((Long) this.charlie[i10]).getClass();
                        romeo2 = aa.romeo(i12 << 3) + 8;
                    }
                    i5 = romeo2 + i5;
                } else {
                    int i15 = i12 << 3;
                    long longValue = ((Long) this.charlie[i10]).longValue();
                    romeo = aa.romeo(i15);
                    sierra = aa.sierra(longValue);
                }
                i5 = sierra + romeo + i5;
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

    public final void delta(ax axVar) {
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
                                    ((aa) axVar.alpha).whiskey(i11, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new zzeq("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                ((aa) axVar.alpha).black(i11, 3);
                                ((Q) obj).delta(axVar);
                                ((aa) axVar.alpha).black(i11, 4);
                            }
                        } else {
                            ((aa) axVar.alpha).victor(i11, (AbstractC1431z) obj);
                        }
                    } else {
                        ((aa) axVar.alpha).yankee(i11, ((Long) obj).longValue());
                    }
                } else {
                    ((aa) axVar.alpha).coral(i11, ((Long) obj).longValue());
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
        if (obj == null || !(obj instanceof Q)) {
            return false;
        }
        Q q4 = (Q) obj;
        int i4 = this.alpha;
        if (i4 == q4.alpha) {
            int[] iArr = this.bravo;
            int[] iArr2 = q4.bravo;
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    if (iArr[i5] != iArr2[i5]) {
                        break;
                    }
                    i5++;
                } else {
                    Object[] objArr = this.charlie;
                    Object[] objArr2 = q4.charlie;
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
