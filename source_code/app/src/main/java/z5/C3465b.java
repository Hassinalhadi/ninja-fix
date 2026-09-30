package z5;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: z5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3465b extends Lambda implements Function0 {
    public static final C3465b alpha = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
