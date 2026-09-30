package A7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s extends i {
    @Override // A7.i
    public final int[] delta(int i4, int[] iArr) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = this.alpha;
            int[] iArr4 = i.charlie;
            System.arraycopy(iArr4, 0, r2, 0, iArr4.length);
            System.arraycopy(iArr3, 0, r2, iArr4.length, 8);
            int[] iArr5 = {0, 0, 0, 0, iArr5[12], iArr5[13], iArr5[14], iArr5[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            i.juliet(iArr5);
            int[] copyOf = Arrays.copyOf(iArr5, 8);
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            System.arraycopy(copyOf, 0, iArr2, iArr4.length, 8);
            iArr2[12] = i4;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // A7.i
    public final int golf() {
        return 24;
    }
}
