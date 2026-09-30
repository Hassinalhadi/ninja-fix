package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1340k1 implements O1 {
    protected int zza;

    public static void bravo(Iterable iterable, List list) {
        Charset charset = E1.alpha;
        iterable.getClass();
        if (iterable instanceof G1) {
            List zza = ((G1) iterable).zza();
            if (list == null) {
                list.size();
                Iterator it = zza.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (!(next instanceof C1361p1)) {
                        if (next instanceof byte[]) {
                            byte[] bArr = (byte[]) next;
                            C1361p1.india(bArr, 0, bArr.length);
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                return;
            }
            throw new ClassCastException();
        }
        if (!(iterable instanceof T1)) {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof V1) {
                    V1 v1 = (V1) list;
                    int i4 = ((V1) list).red + size;
                    int length = v1.purple.length;
                    if (i4 > length) {
                        if (length != 0) {
                            while (length < i4) {
                                length = Math.max(((length * 3) / 2) + 1, 10);
                            }
                            v1.purple = Arrays.copyOf(v1.purple, length);
                        } else {
                            v1.purple = new Object[Math.max(i4, 10)];
                        }
                    }
                }
            }
            int size2 = list.size();
            if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
                List list2 = (List) iterable;
                int size3 = list2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Object obj = list2.get(i5);
                    if (obj != null) {
                        list.add(obj);
                    } else {
                        AbstractC1388w1.alpha(size2, list);
                        throw null;
                    }
                }
                return;
            }
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    AbstractC1388w1.alpha(size2, list);
                    throw null;
                }
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    public abstract int alpha(X1 x12);

    public final byte[] charlie() {
        try {
            AbstractC1392x1 abstractC1392x1 = (AbstractC1392x1) this;
            int delta = abstractC1392x1.delta();
            byte[] bArr = new byte[delta];
            C1365q1 c1365q1 = new C1365q1(delta, bArr);
            X1 alpha = U1.charlie.alpha(abstractC1392x1.getClass());
            J1 j12 = c1365q1.delta;
            if (j12 == null) {
                j12 = new J1(c1365q1);
            }
            alpha.echo(abstractC1392x1, j12);
            if (delta - c1365q1.golf == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(ao.ad.gray("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
