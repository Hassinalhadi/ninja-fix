package A7;

/* loaded from: classes2.dex */
public final class h extends i {
    @Override // A7.i
    public final int[] delta(int i4, int[] iArr) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            int[] iArr3 = this.alpha;
            int[] iArr4 = i.charlie;
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
            iArr2[12] = i4;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // A7.i
    public final int golf() {
        return 12;
    }
}
