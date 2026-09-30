package bd;

import com.airbnb.lottie.compose.LottieConstants;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: bd.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0754g {
    public static volatile ScheduledExecutorServiceC0750c alpha;

    public static byte[] alpha(byte[]... bArr) {
        int i4 = 0;
        for (byte[] bArr2 : bArr) {
            if (i4 <= LottieConstants.IterateForever - bArr2.length) {
                i4 += bArr2.length;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i4];
        int i5 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i5, bArr4.length);
            i5 += bArr4.length;
        }
        return bArr3;
    }

    public static final boolean bravo(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            i4 |= bArr[i5] ^ bArr2[i5];
        }
        if (i4 != 0) {
            return false;
        }
        return true;
    }

    public static final void charlie(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i4) {
        if (i4 >= 0 && byteBuffer2.remaining() >= i4 && byteBuffer3.remaining() >= i4 && byteBuffer.remaining() >= i4) {
            for (int i5 = 0; i5 < i4; i5++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] delta(int i4, int i5, int i10, byte[] bArr, byte[] bArr2) {
        if (i10 >= 0 && bArr.length - i10 >= i4 && bArr2.length - i10 >= i5) {
            byte[] bArr3 = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr3[i11] = (byte) (bArr[i11 + i4] ^ bArr2[i11 + i5]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] echo(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return delta(0, 0, bArr.length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static int foxtrot(int i4) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i5 = 0; i5 < 6; i5++) {
            int i10 = iArr[i5];
            int i11 = i10 - 1;
            if (i10 != 0) {
                if (i11 == i4) {
                    return i10;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
