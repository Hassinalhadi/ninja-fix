package Oe;

import androidx.appcompat.widget.P0;
import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class u extends e {
    public final byte[] purple;
    public int red = 0;

    public u(byte[] bArr) {
        this.purple = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e) || size() != ((e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof u) {
            return uniform((u) obj, 0, size());
        }
        if (obj instanceof aa) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(P0.gold(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public final int hashCode() {
        int i4 = this.red;
        if (i4 == 0) {
            int size = size();
            i4 = november(size, 0, size);
            if (i4 == 0) {
                i4 = 1;
            }
            this.red = i4;
        }
        return i4;
    }

    @Override // Oe.e
    public void hotel(int i4, int i5, int i10, byte[] bArr) {
        System.arraycopy(this.purple, i4, bArr, i5, i10);
    }

    @Override // Oe.e
    public final int india() {
        return 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new t(this);
    }

    @Override // Oe.e
    public final boolean kilo() {
        return true;
    }

    @Override // Oe.e
    public final boolean lima() {
        byte[] bArr = this.purple;
        if (ae.charlie(bArr, 0, bArr.length) != 0) {
            return false;
        }
        return true;
    }

    @Override // Oe.e
    public final int november(int i4, int i5, int i10) {
        for (int i11 = i5; i11 < i5 + i10; i11++) {
            i4 = (i4 * 31) + this.purple[i11];
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // Oe.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int oscar(int i4, int i5, int i10) {
        byte b2;
        int i11;
        int i12;
        int i13 = i10 + i5;
        byte[] bArr = this.purple;
        if (i4 != 0) {
            if (i5 >= i13) {
                return i4;
            }
            byte b4 = (byte) i4;
            if (b4 < -32) {
                if (b4 >= -62) {
                    i12 = i5 + 1;
                }
                return -1;
            }
            if (b4 < -16) {
                byte b6 = (byte) (~(i4 >> 8));
                if (b6 == 0) {
                    int i14 = i5 + 1;
                    byte b10 = bArr[i5];
                    if (i14 >= i13) {
                        return ae.alpha(b4, b10);
                    }
                    i5 = i14;
                    b6 = b10;
                }
                if (b6 <= -65 && ((b4 != -32 || b6 >= -96) && (b4 != -19 || b6 < -96))) {
                    i12 = i5 + 1;
                }
            } else {
                byte b11 = (byte) (~(i4 >> 8));
                if (b11 == 0) {
                    i11 = i5 + 1;
                    b11 = bArr[i5];
                    if (i11 >= i13) {
                        return ae.alpha(b4, b11);
                    }
                    b2 = 0;
                } else {
                    b2 = (byte) (i4 >> 16);
                    i11 = i5;
                }
                if (b2 == 0) {
                    int i15 = i11 + 1;
                    byte b12 = bArr[i11];
                    if (i15 >= i13) {
                        if (b4 > -12 || b11 > -65 || b12 > -65) {
                            return -1;
                        }
                        return (b12 << 16) ^ ((b11 << 8) ^ b4);
                    }
                    b2 = b12;
                    i11 = i15;
                }
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b4 << 28)) >> 30) == 0 && b2 <= -65) {
                        i5 = i11 + 1;
                    }
                }
            }
            return -1;
        }
        return ae.charlie(bArr, i5, i13);
    }

    @Override // Oe.e
    public final int quebec() {
        return this.red;
    }

    @Override // Oe.e
    public final String romeo() {
        byte[] bArr = this.purple;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // Oe.e
    public int size() {
        return this.purple.length;
    }

    @Override // Oe.e
    public final void tango(OutputStream outputStream, int i4, int i5) {
        outputStream.write(this.purple, i4, i5);
    }

    public final boolean uniform(u uVar, int i4, int i5) {
        byte[] bArr = uVar.purple;
        int length = bArr.length;
        byte[] bArr2 = this.purple;
        if (i5 <= length) {
            int i10 = i4 + i5;
            int length2 = bArr.length;
            byte[] bArr3 = uVar.purple;
            if (i10 <= length2) {
                int i11 = 0;
                while (i11 < i5) {
                    if (bArr2[i11] != bArr3[i4]) {
                        return false;
                    }
                    i11++;
                    i4++;
                }
                return true;
            }
            int length3 = bArr3.length;
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i4);
            sb2.append(", ");
            sb2.append(i5);
            sb2.append(", ");
            sb2.append(length3);
            throw new IllegalArgumentException(sb2.toString());
        }
        int length4 = bArr2.length;
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i5);
        sb3.append(length4);
        throw new IllegalArgumentException(sb3.toString());
    }
}
