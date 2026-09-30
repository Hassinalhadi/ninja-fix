package Tf;

import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {
    public static final i alpha = new i();

    public static final boolean alpha(int i4, int i5, int i10, byte[] a6, byte[] b2) {
        Intrinsics.echo(a6, "a");
        Intrinsics.echo(b2, "b");
        for (int i11 = 0; i11 < i10; i11++) {
            if (a6[i11 + i4] != b2[i11 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static final aj bravo(ao aoVar) {
        Intrinsics.echo(aoVar, "<this>");
        return new aj(aoVar);
    }

    public static final ak charlie(ap apVar) {
        Intrinsics.echo(apVar, "<this>");
        return new ak(apVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [Tf.ap, Tf.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [Tf.ap, Tf.k, java.lang.Object] */
    public static void delta(long j5, k kVar, int i4, ArrayList arrayList, int i5, int i10, ArrayList arrayList2) {
        int i11;
        int i12;
        ArrayList arrayList3;
        long j6;
        int i13;
        int i14 = i4;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i5 < i10) {
            for (int i15 = i5; i15 < i10; i15++) {
                if (((n) arrayList4.get(i15)).delta() < i14) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            n nVar = (n) arrayList.get(i5);
            n nVar2 = (n) arrayList4.get(i10 - 1);
            if (i14 == nVar.delta()) {
                int intValue = ((Number) arrayList5.get(i5)).intValue();
                int i16 = i5 + 1;
                n nVar3 = (n) arrayList4.get(i16);
                i11 = i16;
                i12 = intValue;
                nVar = nVar3;
            } else {
                i11 = i5;
                i12 = -1;
            }
            if (nVar.india(i14) != nVar2.india(i14)) {
                int i17 = 1;
                for (int i18 = i11 + 1; i18 < i10; i18++) {
                    if (((n) arrayList4.get(i18 - 1)).india(i14) != ((n) arrayList4.get(i18)).india(i14)) {
                        i17++;
                    }
                }
                long j7 = 4;
                long j10 = (kVar.purple / j7) + j5 + 2 + (i17 * 2);
                kVar.white(i17);
                kVar.white(i12);
                for (int i19 = i11; i19 < i10; i19++) {
                    byte india = ((n) arrayList4.get(i19)).india(i14);
                    if (i19 == i11 || india != ((n) arrayList4.get(i19 - 1)).india(i14)) {
                        kVar.white(india & 255);
                    }
                }
                ?? obj = new Object();
                int i20 = i11;
                while (i20 < i10) {
                    byte india2 = ((n) arrayList4.get(i20)).india(i14);
                    int i21 = i20 + 1;
                    int i22 = i21;
                    while (true) {
                        if (i22 < i10) {
                            if (india2 != ((n) arrayList4.get(i22)).india(i14)) {
                                break;
                            } else {
                                i22++;
                            }
                        } else {
                            i22 = i10;
                            break;
                        }
                    }
                    if (i21 == i22 && i14 + 1 == ((n) arrayList4.get(i20)).delta()) {
                        kVar.white(((Number) arrayList5.get(i20)).intValue());
                        arrayList3 = arrayList5;
                        j6 = j10;
                        i13 = i22;
                    } else {
                        kVar.white(((int) ((obj.purple / j7) + j10)) * (-1));
                        arrayList3 = arrayList5;
                        j6 = j10;
                        i13 = i22;
                        delta(j6, obj, i14 + 1, arrayList, i20, i13, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j10 = j6;
                    i20 = i13;
                    arrayList5 = arrayList3;
                }
                kVar.f(obj);
                return;
            }
            int min = Math.min(nVar.delta(), nVar2.delta());
            int i23 = 0;
            for (int i24 = i14; i24 < min && nVar.india(i24) == nVar2.india(i24); i24++) {
                i23++;
            }
            long j11 = 4;
            long j12 = (kVar.purple / j11) + j5 + 2 + i23 + 1;
            kVar.white(-i23);
            kVar.white(i12);
            int i25 = i14 + i23;
            while (i14 < i25) {
                kVar.white(nVar.india(i14) & 255);
                i14++;
            }
            if (i11 + 1 == i10) {
                if (i25 == ((n) arrayList4.get(i11)).delta()) {
                    kVar.white(((Number) arrayList5.get(i11)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
            ?? obj2 = new Object();
            kVar.white(((int) ((obj2.purple / j11) + j12)) * (-1));
            delta(j12, obj2, i25, arrayList4, i11, i10, arrayList5);
            kVar.f(obj2);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final void echo(long j5, long j6, long j7) {
        if ((j6 | j7) >= 0 && j6 <= j5 && j5 - j6 >= j7) {
            return;
        }
        StringBuilder uniform = Q0.c.uniform("size=", j5, " offset=");
        uniform.append(j6);
        uniform.append(" byteCount=");
        uniform.append(j7);
        throw new ArrayIndexOutOfBoundsException(uniform.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [Tf.k, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ag foxtrot(n... nVarArr) {
        if (nVarArr.length == 0) {
            return new ag(new n[0], new int[]{0, -1});
        }
        ArrayList f5 = ArraysKt.f(nVarArr);
        kotlin.collections.p.quebec(f5);
        int size = f5.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(-1);
        }
        int length = nVarArr.length;
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            arrayList.set(CollectionsKt.black(f5, nVarArr[i5]), Integer.valueOf(i10));
            i5++;
            i10++;
        }
        if (((n) f5.get(0)).delta() > 0) {
            int i11 = 0;
            while (i11 < f5.size()) {
                n prefix = (n) f5.get(i11);
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < f5.size()) {
                    n nVar = (n) f5.get(i13);
                    nVar.getClass();
                    Intrinsics.echo(prefix, "prefix");
                    if (nVar.mike(0, prefix, prefix.delta())) {
                        if (nVar.delta() != prefix.delta()) {
                            if (((Number) arrayList.get(i13)).intValue() > ((Number) arrayList.get(i11)).intValue()) {
                                f5.remove(i13);
                                ((Number) arrayList.remove(i13)).intValue();
                            } else {
                                i13++;
                            }
                        } else {
                            throw new IllegalArgumentException(("duplicate option: " + nVar).toString());
                        }
                    }
                }
                i11 = i12;
            }
            ?? obj = new Object();
            delta(0L, obj, 0, f5, 0, f5.size(), arrayList);
            int i14 = (int) (obj.purple / 4);
            int[] iArr = new int[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                iArr[i15] = obj.readInt();
            }
            Object[] copyOf = Arrays.copyOf(nVarArr, nVarArr.length);
            Intrinsics.delta(copyOf, "copyOf(...)");
            return new ag((n[]) copyOf, iArr);
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public static final int golf(int i4) {
        return ((i4 & 255) << 24) | (((-16777216) & i4) >>> 24) | ((16711680 & i4) >>> 8) | ((65280 & i4) << 8);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Tf.as, java.lang.Object] */
    public static final e hotel(OutputStream outputStream) {
        Intrinsics.echo(outputStream, "<this>");
        return new e(outputStream, (as) new Object());
    }

    public static final ao india(Socket socket) {
        Intrinsics.echo(socket, "<this>");
        Uf.i iVar = new Uf.i(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.delta(outputStream, "getOutputStream(...)");
        return iVar.sink(new e(outputStream, iVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Tf.as, java.lang.Object] */
    public static final f juliet(InputStream inputStream) {
        Intrinsics.echo(inputStream, "<this>");
        return new f(inputStream, (as) new Object());
    }

    public static final ap kilo(Socket socket) {
        Intrinsics.echo(socket, "<this>");
        Uf.i iVar = new Uf.i(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.delta(inputStream, "getInputStream(...)");
        return iVar.source(new f(inputStream, iVar));
    }

    public static final String lima(byte b2) {
        char[] cArr = Uf.b.alpha;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String mike(int i4) {
        int i5 = 0;
        if (i4 == 0) {
            return ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        }
        char[] cArr = Uf.b.alpha;
        char[] cArr2 = {cArr[(i4 >> 28) & 15], cArr[(i4 >> 24) & 15], cArr[(i4 >> 20) & 15], cArr[(i4 >> 16) & 15], cArr[(i4 >> 12) & 15], cArr[(i4 >> 8) & 15], cArr[(i4 >> 4) & 15], cArr[i4 & 15]};
        while (i5 < 8 && cArr2[i5] == '0') {
            i5++;
        }
        return kotlin.text.r.echo(cArr2, i5, 8);
    }
}
