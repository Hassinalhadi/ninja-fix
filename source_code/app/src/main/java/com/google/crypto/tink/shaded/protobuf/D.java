package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class D {
    public static final D foxtrot = new D(0, new int[0], new Object[0], false);
    public int alpha;
    public int[] bravo;
    public Object[] charlie;
    public int delta = -1;
    public boolean echo;

    public D(int i4, int[] iArr, Object[] objArr, boolean z2) {
        this.alpha = i4;
        this.bravo = iArr;
        this.charlie = objArr;
        this.echo = z2;
    }

    public static D bravo() {
        return new D(0, new int[8], new Object[8], true);
    }

    public final int alpha() {
        int coral;
        int cyan;
        int beige;
        int i4 = this.delta;
        if (i4 != -1) {
            return i4;
        }
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
                                beige = C1494l.azure(i12);
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                            }
                        } else {
                            coral = C1494l.coral(i12) * 2;
                            cyan = ((D) this.charlie[i10]).alpha();
                        }
                    } else {
                        beige = C1494l.zulu(i12, (AbstractC1490h) this.charlie[i10]);
                    }
                } else {
                    ((Long) this.charlie[i10]).getClass();
                    beige = C1494l.beige(i12);
                }
                i5 = beige + i5;
            } else {
                long longValue = ((Long) this.charlie[i10]).longValue();
                coral = C1494l.coral(i12);
                cyan = C1494l.cyan(longValue);
            }
            i5 = cyan + coral + i5;
        }
        this.delta = i5;
        return i5;
    }

    public final void charlie(int i4, Object obj) {
        int i5;
        if (this.echo) {
            int i10 = this.alpha;
            int[] iArr = this.bravo;
            if (i10 == iArr.length) {
                if (i10 < 4) {
                    i5 = 8;
                } else {
                    i5 = i10 >> 1;
                }
                int i11 = i10 + i5;
                this.bravo = Arrays.copyOf(iArr, i11);
                this.charlie = Arrays.copyOf(this.charlie, i11);
            }
            int[] iArr2 = this.bravo;
            int i12 = this.alpha;
            iArr2[i12] = i4;
            this.charlie[i12] = obj;
            this.alpha = i12 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void delta(C1495m c1495m) {
        if (this.alpha != 0) {
            c1495m.getClass();
            for (int i4 = 0; i4 < this.alpha; i4++) {
                int i5 = this.bravo[i4];
                Object obj = this.charlie[i4];
                int i10 = i5 >>> 3;
                int i11 = i5 & 7;
                C1494l c1494l = (C1494l) c1495m.alpha;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 5) {
                                    c1494l.gold(i10, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                                }
                            } else {
                                c1494l.jade(i10, 3);
                                ((D) obj).delta(c1495m);
                                c1494l.jade(i10, 4);
                            }
                        } else {
                            c1495m.alpha(i10, (AbstractC1490h) obj);
                        }
                    } else {
                        c1494l.green(i10, ((Long) obj).longValue());
                    }
                } else {
                    c1494l.lime(i10, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        int i4 = this.alpha;
        if (i4 == d4.alpha) {
            int[] iArr = this.bravo;
            int[] iArr2 = d4.bravo;
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    if (iArr[i5] != iArr2[i5]) {
                        break;
                    }
                    i5++;
                } else {
                    Object[] objArr = this.charlie;
                    Object[] objArr2 = d4.charlie;
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
        int i5 = (527 + i4) * 31;
        int[] iArr = this.bravo;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i4; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i5 + i11) * 31;
        Object[] objArr = this.charlie;
        int i14 = this.alpha;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }
}
