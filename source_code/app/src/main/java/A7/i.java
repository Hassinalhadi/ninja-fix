package A7;

import bd.AbstractC0754g;
import com.airbnb.lottie.compose.LottieConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public abstract class i implements n {
    public static final int[] charlie = kilo(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    public final int[] alpha;
    public final int bravo;

    public i(int i4, byte[] bArr) {
        if (bArr.length == 32) {
            this.alpha = kilo(bArr);
            this.bravo = i4;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public static void india(int i4, int i5, int i10, int i11, int[] iArr) {
        int i12 = iArr[i4] + iArr[i5];
        iArr[i4] = i12;
        int i13 = i12 ^ iArr[i11];
        int i14 = (i13 >>> (-16)) | (i13 << 16);
        iArr[i11] = i14;
        int i15 = iArr[i10] + i14;
        iArr[i10] = i15;
        int i16 = iArr[i5] ^ i15;
        int i17 = (i16 >>> (-12)) | (i16 << 12);
        iArr[i5] = i17;
        int i18 = iArr[i4] + i17;
        iArr[i4] = i18;
        int i19 = iArr[i11] ^ i18;
        int i20 = (i19 >>> (-8)) | (i19 << 8);
        iArr[i11] = i20;
        int i21 = iArr[i10] + i20;
        iArr[i10] = i21;
        int i22 = iArr[i5] ^ i21;
        iArr[i5] = (i22 >>> (-7)) | (i22 << 7);
    }

    public static void juliet(int[] iArr) {
        for (int i4 = 0; i4 < 10; i4++) {
            india(0, 4, 8, 12, iArr);
            india(1, 5, 9, 13, iArr);
            india(2, 6, 10, 14, iArr);
            india(3, 7, 11, 15, iArr);
            india(0, 5, 10, 15, iArr);
            india(1, 6, 11, 12, iArr);
            india(2, 7, 8, 13, iArr);
            india(3, 4, 9, 14, iArr);
        }
    }

    public static int[] kilo(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // A7.n
    public final byte[] alpha(byte[] bArr) {
        if (bArr.length <= LottieConstants.IterateForever - golf()) {
            ByteBuffer allocate = ByteBuffer.allocate(golf() + bArr.length);
            foxtrot(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // A7.n
    public final byte[] bravo(byte[] bArr) {
        return echo(ByteBuffer.wrap(bArr));
    }

    public final ByteBuffer charlie(int i4, byte[] bArr) {
        int[] delta = delta(i4, kilo(bArr));
        int[] iArr = (int[]) delta.clone();
        juliet(iArr);
        for (int i5 = 0; i5 < delta.length; i5++) {
            delta[i5] = delta[i5] + iArr[i5];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(delta, 0, 16);
        return order;
    }

    public abstract int[] delta(int i4, int[] iArr);

    public final byte[] echo(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= golf()) {
            byte[] bArr = new byte[golf()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            hotel(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void foxtrot(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - golf() >= bArr.length) {
            byte[] alpha = q.alpha(golf());
            byteBuffer.put(alpha);
            hotel(alpha, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public abstract int golf();

    public final void hotel(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i4 = remaining / 64;
        int i5 = i4 + 1;
        for (int i10 = 0; i10 < i5; i10++) {
            ByteBuffer charlie2 = charlie(this.bravo + i10, bArr);
            if (i10 == i4) {
                AbstractC0754g.charlie(byteBuffer, byteBuffer2, charlie2, remaining % 64);
            } else {
                AbstractC0754g.charlie(byteBuffer, byteBuffer2, charlie2, 64);
            }
        }
    }
}
