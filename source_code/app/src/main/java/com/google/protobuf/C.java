package com.google.protobuf;

/* loaded from: classes2.dex */
public final class C {
    public static final C foxtrot = new C(0, new int[0], new Object[0], false);
    public int alpha;
    public int[] bravo;
    public Object[] charlie;
    public int delta = -1;
    public boolean echo;

    public C(int i4, int[] iArr, Object[] objArr, boolean z2) {
        this.alpha = i4;
        this.bravo = iArr;
        this.charlie = objArr;
        this.echo = z2;
    }

    public final int alpha() {
        int hotel;
        int juliet;
        int hotel2;
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
                                hotel2 = C1503f.hotel(i12) + 4;
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                            }
                        } else {
                            hotel = C1503f.hotel(i12) * 2;
                            juliet = ((C) this.charlie[i10]).alpha();
                        }
                    } else {
                        hotel2 = C1503f.delta(i12, (C1502e) this.charlie[i10]);
                    }
                } else {
                    ((Long) this.charlie[i10]).getClass();
                    hotel2 = C1503f.hotel(i12) + 8;
                }
                i5 = hotel2 + i5;
            } else {
                long longValue = ((Long) this.charlie[i10]).longValue();
                hotel = C1503f.hotel(i12);
                juliet = C1503f.juliet(longValue);
            }
            i5 = juliet + hotel + i5;
        }
        this.delta = i5;
        return i5;
    }

    public final void bravo(ac acVar) {
        if (this.alpha != 0) {
            acVar.getClass();
            for (int i4 = 0; i4 < this.alpha; i4++) {
                int i5 = this.bravo[i4];
                Object obj = this.charlie[i4];
                int i10 = i5 >>> 3;
                int i11 = i5 & 7;
                C1503f c1503f = (C1503f) acVar.alpha;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 5) {
                                    c1503f.november(i10, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                                }
                            } else {
                                c1503f.tango(i10, 3);
                                ((C) obj).bravo(acVar);
                                c1503f.tango(i10, 4);
                            }
                        } else {
                            c1503f.tango(i10, 2);
                            c1503f.mike((C1502e) obj);
                        }
                    } else {
                        c1503f.papa(i10, ((Long) obj).longValue());
                    }
                } else {
                    c1503f.victor(i10, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        int i4 = this.alpha;
        if (i4 == c3.alpha) {
            int[] iArr = this.bravo;
            int[] iArr2 = c3.bravo;
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    if (iArr[i5] != iArr2[i5]) {
                        break;
                    }
                    i5++;
                } else {
                    Object[] objArr = this.charlie;
                    Object[] objArr2 = c3.charlie;
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
