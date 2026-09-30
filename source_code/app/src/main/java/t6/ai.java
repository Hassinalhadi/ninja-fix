package t6;

/* loaded from: classes2.dex */
public abstract class ai {
    public static final /* synthetic */ int alpha = 0;

    public static void alpha(int i4, Object[] objArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(ao.ad.zulu(i5, "at index "));
            }
        }
    }
}
