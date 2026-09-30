package Q7;

/* loaded from: classes2.dex */
public final class f implements k {
    public static final g8.d red = new g8.d(7);
    public final Object alpha;
    public Object purple;

    public f(U7.c cVar) {
        this.alpha = cVar;
        this.purple = red;
    }

    @Override // Q7.k
    public void alpha(j jVar, int i4) {
        int[] iArr = (int[]) this.purple;
        try {
            jVar.read((byte[]) this.alpha, iArr[0], i4);
            iArr[0] = iArr[0] + i4;
        } finally {
            jVar.close();
        }
    }

    public f(int[] iArr, byte[] bArr) {
        this.alpha = bArr;
        this.purple = iArr;
    }
}
