package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/ContentResolver;", "alpha", "()Landroid/content/ContentResolver;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class ao extends Lambda implements Function0<ContentResolver> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ Context alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(Context context) {
        super(0);
        this.alpha = context;
    }

    @NotNull
    public final ContentResolver alpha() {
        int i4 = red;
        purple = ((i4 ^ 49) + ((i4 & 49) << 1)) % 128;
        ContentResolver contentResolver = this.alpha.getContentResolver();
        Intrinsics.checkNotNull(contentResolver);
        int i5 = purple;
        int i10 = (i5 ^ 53) + ((i5 & 53) << 1);
        red = i10 % 128;
        if (i10 % 2 != 0) {
            return contentResolver;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ ContentResolver invoke() {
        int i4 = red;
        purple = ((i4 & 87) + (i4 | 87)) % 128;
        ContentResolver alpha = alpha();
        purple = (red + 21) % 128;
        return alpha;
    }
}
