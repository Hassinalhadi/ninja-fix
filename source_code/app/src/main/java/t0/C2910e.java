package t0;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2910e extends K3.b {
    public static C2910e silver;

    @Override // K3.b
    public final int[] foxtrot(int i4) {
        int length = november().length();
        if (length > 0 && i4 < length) {
            if (i4 < 0) {
                i4 = 0;
            }
            while (i4 < length && november().charAt(i4) == '\n' && (november().charAt(i4) == '\n' || (i4 != 0 && november().charAt(i4 - 1) != '\n'))) {
                i4++;
            }
            if (i4 >= length) {
                return null;
            }
            int i5 = i4 + 1;
            while (i5 < length && !zulu(i5)) {
                i5++;
            }
            return juliet(i4, i5);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // K3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] tango(int i4) {
        int length = november().length();
        if (length > 0 && i4 > 0) {
            if (i4 > length) {
                i4 = length;
            }
            while (i4 > 0 && november().charAt(i4 - 1) == '\n' && !zulu(i4)) {
                i4--;
            }
            int i5 = i4 - 1;
            while (i5 > 0 && (november().charAt(i5) == '\n' || (i5 != 0 && november().charAt(i5 - 1) != '\n'))) {
                i5--;
            }
            return juliet(i5, i4);
        }
        return null;
    }

    public final boolean zulu(int i4) {
        if (i4 > 0 && november().charAt(i4 - 1) != '\n') {
            if (i4 == november().length() || november().charAt(i4) == '\n') {
                return true;
            }
            return false;
        }
        return false;
    }
}
