package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.LocationManager;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class T1 extends Lambda implements Function1<SafeWithTimeoutProContext, List<? extends String>> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ U1 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(U1 u12) {
        super(1);
        this.alpha = u12;
    }

    @NotNull
    public final List<String> alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = red;
        purple = (((i4 | 99) << 1) - (i4 ^ 99)) % 128;
        LocationManager charlie = U1.charlie(this.alpha);
        Intrinsics.checkNotNull(charlie);
        List<String> allProviders = charlie.getAllProviders();
        Intrinsics.checkNotNull(allProviders);
        ArrayList emerald = CollectionsKt.emerald(allProviders);
        int i5 = red;
        purple = ((i5 & 69) + (i5 | 69)) % 128;
        return emerald;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ List<? extends String> invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = red;
        purple = ((i4 & 45) + (i4 | 45)) % 128;
        List<String> alpha = alpha(safeWithTimeoutProContext);
        red = (purple + 83) % 128;
        return alpha;
    }
}
