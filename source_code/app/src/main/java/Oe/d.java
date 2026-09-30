package Oe;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d extends OutputStream {
    public static final byte[] white = new byte[0];
    public int red;
    public int teal;
    public final int alpha = 128;
    public final ArrayList purple = new ArrayList();
    public byte[] silver = new byte[128];

    public final void charlie(int i4) {
        this.purple.add(new u(this.silver));
        int length = this.red + this.silver.length;
        this.red = length;
        this.silver = new byte[Math.max(this.alpha, Math.max(i4, length >>> 1))];
        this.teal = 0;
    }

    public final void echo() {
        int i4 = this.teal;
        byte[] bArr = this.silver;
        int length = bArr.length;
        ArrayList arrayList = this.purple;
        if (i4 < length) {
            if (i4 > 0) {
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i4));
                arrayList.add(new u(bArr2));
            }
        } else {
            arrayList.add(new u(this.silver));
            this.silver = white;
        }
        this.red += this.teal;
        this.teal = 0;
    }

    public final synchronized e foxtrot() {
        boolean z2;
        e alpha;
        echo();
        ArrayList arrayList = this.purple;
        if (arrayList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((e) it.next());
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            alpha = e.alpha;
        } else {
            alpha = e.alpha(arrayList.iterator(), arrayList.size());
        }
        return alpha;
    }

    public final String toString() {
        int i4;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i4 = this.red + this.teal;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i4));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i4) {
        try {
            if (this.teal == this.silver.length) {
                charlie(1);
            }
            byte[] bArr = this.silver;
            int i5 = this.teal;
            this.teal = i5 + 1;
            bArr[i5] = (byte) i4;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i4, int i5) {
        try {
            byte[] bArr2 = this.silver;
            int length = bArr2.length;
            int i10 = this.teal;
            if (i5 <= length - i10) {
                System.arraycopy(bArr, i4, bArr2, i10, i5);
                this.teal += i5;
            } else {
                int length2 = bArr2.length - i10;
                System.arraycopy(bArr, i4, bArr2, i10, length2);
                int i11 = i5 - length2;
                charlie(i11);
                System.arraycopy(bArr, i4 + length2, this.silver, 0, i11);
                this.teal = i11;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
