package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.appcompat.widget.P0;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1431z implements Iterable, Serializable {
    public static final C1430y purple = new C1430y(at.bravo);
    public int alpha = 0;

    static {
        int i4 = AbstractC1424s.alpha;
    }

    public static AbstractC1431z delta(Iterator it, int i4) {
        if (i4 > 0) {
            if (i4 == 1) {
                return (AbstractC1431z) it.next();
            }
            int i5 = i4 >>> 1;
            AbstractC1431z delta = delta(it, i5);
            AbstractC1431z delta2 = delta(it, i4 - i5);
            if (LottieConstants.IterateForever - delta.hotel() >= delta2.hotel()) {
                if (delta2.hotel() == 0) {
                    return delta;
                }
                if (delta.hotel() == 0) {
                    return delta2;
                }
                int hotel = delta2.hotel() + delta.hotel();
                if (hotel < 128) {
                    int hotel2 = delta.hotel();
                    int hotel3 = delta2.hotel();
                    int i10 = hotel2 + hotel3;
                    byte[] bArr = new byte[i10];
                    tango(0, hotel2, delta.hotel());
                    tango(0, hotel2, i10);
                    if (hotel2 > 0) {
                        delta.india(0, 0, hotel2, bArr);
                    }
                    tango(0, hotel3, delta2.hotel());
                    tango(hotel2, i10, i10);
                    if (hotel3 > 0) {
                        delta2.india(0, hotel2, hotel3, bArr);
                    }
                    return new C1430y(bArr);
                }
                if (delta instanceof L) {
                    L l10 = (L) delta;
                    AbstractC1431z abstractC1431z = l10.teal;
                    int hotel4 = delta2.hotel() + abstractC1431z.hotel();
                    AbstractC1431z abstractC1431z2 = l10.silver;
                    if (hotel4 < 128) {
                        int hotel5 = abstractC1431z.hotel();
                        int hotel6 = delta2.hotel();
                        int i11 = hotel5 + hotel6;
                        byte[] bArr2 = new byte[i11];
                        tango(0, hotel5, abstractC1431z.hotel());
                        tango(0, hotel5, i11);
                        if (hotel5 > 0) {
                            abstractC1431z.india(0, 0, hotel5, bArr2);
                        }
                        tango(0, hotel6, delta2.hotel());
                        tango(hotel5, i11, i11);
                        if (hotel6 > 0) {
                            delta2.india(0, hotel5, hotel6, bArr2);
                        }
                        return new L(abstractC1431z2, new C1430y(bArr2));
                    }
                    if (abstractC1431z2.kilo() > abstractC1431z.kilo() && l10.yellow > delta2.kilo()) {
                        return new L(abstractC1431z2, new L(abstractC1431z, delta2));
                    }
                }
                if (hotel >= L.yankee(Math.max(delta.kilo(), delta2.kilo()) + 1)) {
                    return new L(delta, delta2);
                }
                ax axVar = new ax(3);
                axVar.charlie(delta);
                axVar.charlie(delta2);
                ArrayDeque arrayDeque = (ArrayDeque) axVar.alpha;
                AbstractC1431z abstractC1431z3 = (AbstractC1431z) arrayDeque.pop();
                while (!arrayDeque.isEmpty()) {
                    abstractC1431z3 = new L((AbstractC1431z) arrayDeque.pop(), abstractC1431z3);
                }
                return abstractC1431z3;
            }
            throw new IllegalArgumentException(A0.z.juliet("ByteString would be too long: ", delta.hotel(), delta2.hotel(), "+"));
        }
        throw new IllegalArgumentException(av.q.delta(i4, "length (", ") must be >= 1"));
    }

    public static int tango(int i4, int i5, int i10) {
        int i11 = i5 - i4;
        if ((i4 | i5 | i11 | (i10 - i5)) < 0) {
            if (i4 >= 0) {
                if (i5 < i4) {
                    throw new IndexOutOfBoundsException(A0.z.juliet("Beginning index larger than ending index: ", i4, i5, ", "));
                }
                throw new IndexOutOfBoundsException(A0.z.juliet("End index: ", i5, i10, " >= "));
            }
            throw new IndexOutOfBoundsException(av.q.delta(i4, "Beginning index: ", " < 0"));
        }
        return i11;
    }

    public static C1430y victor(byte[] bArr, int i4, int i5) {
        tango(i4, i4 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new C1430y(bArr2);
    }

    public static AbstractC1431z whiskey(InputStream inputStream) {
        C1430y victor;
        ArrayList arrayList = new ArrayList();
        int i4 = Barcode.FORMAT_QR_CODE;
        while (true) {
            byte[] bArr = new byte[i4];
            int i5 = 0;
            while (i5 < i4) {
                int read = inputStream.read(bArr, i5, i4 - i5);
                if (read == -1) {
                    break;
                }
                i5 += read;
            }
            if (i5 == 0) {
                victor = null;
            } else {
                victor = victor(bArr, 0, i5);
            }
            if (victor == null) {
                break;
            }
            arrayList.add(victor);
            i4 = Math.min(i4 + i4, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return purple;
        }
        return delta(arrayList.iterator(), size);
    }

    public static void xray(int i4, int i5) {
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException(ao.ad.zulu(i4, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.z.juliet("Index > length: ", i4, i5, ", "));
        }
    }

    public abstract byte alpha(int i4);

    public abstract byte bravo(int i4);

    public final int hashCode() {
        int i4 = this.alpha;
        if (i4 == 0) {
            int hotel = hotel();
            i4 = mike(hotel, 0, hotel);
            if (i4 == 0) {
                i4 = 1;
            }
            this.alpha = i4;
        }
        return i4;
    }

    public abstract int hotel();

    public abstract void india(int i4, int i5, int i10, byte[] bArr);

    public abstract int kilo();

    public abstract boolean lima();

    public abstract int mike(int i4, int i5, int i10);

    public abstract int november(int i4, int i5, int i10);

    public abstract AbstractC1431z oscar(int i4, int i5);

    public abstract String quebec(Charset charset);

    public abstract void romeo(aa aaVar);

    public abstract boolean sierra();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int hotel = hotel();
        if (hotel() <= 50) {
            concat = AbstractC1426u.bravo(this);
        } else {
            concat = AbstractC1426u.bravo(oscar(0, 47)).concat("...");
        }
        return P0.gold(P0.green("<ByteString@", hexString, " size=", " contents=\"", hotel), concat, "\">");
    }

    @Override // java.lang.Iterable
    /* renamed from: uniform, reason: merged with bridge method [inline-methods] */
    public AbstractC1428w iterator() {
        return new C1427v(this);
    }
}
