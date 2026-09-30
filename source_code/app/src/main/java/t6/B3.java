package t6;

/* loaded from: classes2.dex */
public abstract class B3 {
    public static void alpha(float f5, float f10, float f11) {
        if (f5 < f10) {
            if (f10 < f11) {
                return;
            } else {
                throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
            }
        }
        throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
    }

    public abstract void bravo(byte[] bArr, int i4, int i5);
}
