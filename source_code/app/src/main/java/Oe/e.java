package Oe;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes2.dex */
public abstract class e implements Iterable {
    public static final u alpha = new u(new byte[0]);

    public static e alpha(Iterator it, int i4) {
        if (i4 == 1) {
            return (e) it.next();
        }
        int i5 = i4 >>> 1;
        return alpha(it, i5).bravo(alpha(it, i4 - i5));
    }

    public static d mike() {
        return new d();
    }

    public final e bravo(e eVar) {
        aa aaVar;
        int size = size();
        int size2 = eVar.size();
        if (size + size2 < 2147483647L) {
            int[] iArr = aa.f1881a;
            if (this instanceof aa) {
                aaVar = (aa) this;
            } else {
                aaVar = null;
            }
            if (eVar.size() == 0) {
                return this;
            }
            if (size() == 0) {
                return eVar;
            }
            int size3 = eVar.size() + size();
            if (size3 < 128) {
                int size4 = size();
                int size5 = eVar.size();
                byte[] bArr = new byte[size4 + size5];
                delta(0, 0, size4, bArr);
                eVar.delta(0, size4, size5, bArr);
                return new u(bArr);
            }
            if (aaVar != null) {
                e eVar2 = aaVar.silver;
                if (eVar.size() + eVar2.size() < 128) {
                    int size6 = eVar2.size();
                    int size7 = eVar.size();
                    byte[] bArr2 = new byte[size6 + size7];
                    eVar2.delta(0, 0, size6, bArr2);
                    eVar.delta(0, size6, size7, bArr2);
                    return new aa(aaVar.red, new u(bArr2));
                }
            }
            if (aaVar != null) {
                e eVar3 = aaVar.red;
                int india = eVar3.india();
                e eVar4 = aaVar.silver;
                if (india > eVar4.india()) {
                    if (aaVar.white > eVar.india()) {
                        return new aa(eVar3, new aa(eVar4, eVar));
                    }
                }
            }
            if (size3 >= aa.f1881a[Math.max(india(), eVar.india()) + 1]) {
                return new aa(this, eVar);
            }
            O7.j jVar = new O7.j(1);
            jVar.bravo(this);
            jVar.bravo(eVar);
            Stack stack = (Stack) jVar.purple;
            e eVar5 = (e) stack.pop();
            while (!stack.isEmpty()) {
                eVar5 = new aa((e) stack.pop(), eVar5);
            }
            return eVar5;
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void delta(int i4, int i5, int i10, byte[] bArr) {
        if (i4 >= 0) {
            if (i5 >= 0) {
                if (i10 >= 0) {
                    int i11 = i4 + i10;
                    if (i11 <= size()) {
                        int i12 = i5 + i10;
                        if (i12 <= bArr.length) {
                            if (i10 > 0) {
                                hotel(i4, i5, i10, bArr);
                                return;
                            }
                            return;
                        } else {
                            StringBuilder sb2 = new StringBuilder(34);
                            sb2.append("Target end offset < 0: ");
                            sb2.append(i12);
                            throw new IndexOutOfBoundsException(sb2.toString());
                        }
                    }
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Source end offset < 0: ");
                    sb3.append(i11);
                    throw new IndexOutOfBoundsException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(23);
                sb4.append("Length < 0: ");
                sb4.append(i10);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(30);
            sb5.append("Target offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder(30);
        sb6.append("Source offset < 0: ");
        sb6.append(i4);
        throw new IndexOutOfBoundsException(sb6.toString());
    }

    public abstract void hotel(int i4, int i5, int i10, byte[] bArr);

    public abstract int india();

    public abstract boolean kilo();

    public abstract boolean lima();

    public abstract int november(int i4, int i5, int i10);

    public abstract int oscar(int i4, int i5, int i10);

    public abstract int quebec();

    public abstract String romeo();

    public final String sierra() {
        try {
            return romeo();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract int size();

    public abstract void tango(OutputStream outputStream, int i4, int i5);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
