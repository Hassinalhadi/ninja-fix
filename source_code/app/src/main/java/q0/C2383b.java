package q0;

import com.clevertap.android.sdk.Constants;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2383b extends kotlin.jvm.internal.i implements Xd.l {
    public static final C2383b alpha = new kotlin.jvm.internal.i(2, Zd.a.class, Constants.PRIORITY_MAX, "max(II)I", 1);

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
