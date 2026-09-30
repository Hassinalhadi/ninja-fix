package s6;

import a0.C0366t;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import g0.C1725e;
import g0.C1726f;
import g0.C1730j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2620c0 {
    public static C1726f alpha;

    public static byte[] alpha(ArrayDeque arrayDeque, int i4) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i4) {
            return bArr;
        }
        int length = i4 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i4);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i4 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final C1726f bravo() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = g0.ah.alpha;
        a0.au auVar = new a0.au(C0366t.bravo);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g0.n(7.41f, 15.41f));
        arrayList.add(new g0.m(12.0f, 10.83f));
        arrayList.add(new g0.u(4.59f, 4.58f));
        arrayList.add(new g0.m(18.0f, 14.0f));
        arrayList.add(new g0.u(-6.0f, -6.0f));
        arrayList.add(new g0.u(-6.0f, 6.0f));
        arrayList.add(C1730j.charlie);
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", arrayList);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    public static byte[] charlie(com.google.firebase.messaging.d dVar) {
        int i4;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i5 = 0;
        while (i5 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i5);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = dVar.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return alpha(arrayDeque, i5);
                }
                i10 += read;
                i5 += read;
            }
            long j5 = min;
            if (min < 4096) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            long j6 = j5 * i4;
            if (j6 > 2147483647L) {
                min = LottieConstants.IterateForever;
            } else if (j6 < -2147483648L) {
                min = RecyclerView.UNDEFINED_DURATION;
            } else {
                min = (int) j6;
            }
        }
        if (dVar.read() == -1) {
            return alpha(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
