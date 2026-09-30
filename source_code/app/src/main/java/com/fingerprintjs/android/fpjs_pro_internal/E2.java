package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class E2 extends Lambda implements Function1<SafeWithTimeoutProContext, String> {
    public static final E2 alpha = new Lambda(1);
    public static int purple = 0;
    public static int red = 1;

    public E2() {
        super(1);
    }

    @NotNull
    public final String alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = red;
        purple = ((i4 & 29) + (i4 | 29)) % 128;
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNull(timeZone);
        String id2 = timeZone.getID();
        Intrinsics.checkNotNull(id2);
        purple = (red + 33) % 128;
        return id2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = purple;
        red = ((i4 ^ 69) + ((i4 & 69) << 1)) % 128;
        String alpha2 = alpha(safeWithTimeoutProContext);
        purple = (red + 115) % 128;
        return alpha2;
    }
}
