package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1489g extends AbstractC1490h {
    public final byte[] silver;

    public C1489g(byte[] bArr) {
        this.alpha = 0;
        bArr.getClass();
        this.silver = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1490h
    public byte alpha(int i4) {
        return this.silver[i4];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof AbstractC1490h) && size() == ((AbstractC1490h) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof C1489g) {
                        C1489g c1489g = (C1489g) obj;
                        int i4 = this.alpha;
                        int i5 = c1489g.alpha;
                        if (i4 == 0 || i5 == 0 || i4 == i5) {
                            int size = size();
                            if (size <= c1489g.size()) {
                                if (size <= c1489g.size()) {
                                    int lima = lima() + size;
                                    int lima2 = lima();
                                    int lima3 = c1489g.lima();
                                    while (lima2 < lima) {
                                        if (this.silver[lima2] != c1489g.silver[lima3]) {
                                            return false;
                                        }
                                        lima2++;
                                        lima3++;
                                    }
                                    return true;
                                }
                                StringBuilder sierra = Q0.c.sierra(size, "Ran off end of other: 0, ", ", ");
                                sierra.append(c1489g.size());
                                throw new IllegalArgumentException(sierra.toString());
                            }
                            throw new IllegalArgumentException("Length too large: " + size + size());
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1490h
    public void hotel(int i4, byte[] bArr) {
        System.arraycopy(this.silver, 0, bArr, 0, i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1490h
    public byte india(int i4) {
        return this.silver[i4];
    }

    public int lima() {
        return 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1490h
    public int size() {
        return this.silver.length;
    }
}
