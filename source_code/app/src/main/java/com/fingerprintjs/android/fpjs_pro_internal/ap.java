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
final class ap extends Lambda implements Function0<ContentResolver> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ Context alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(Context context) {
        super(0);
        this.alpha = context;
    }

    @NotNull
    public final ContentResolver alpha() {
        int i4 = red;
        int i5 = (i4 & 97) + (i4 | 97);
        purple = i5 % 128;
        int i10 = i5 % 2;
        ContentResolver contentResolver = this.alpha.getContentResolver();
        Intrinsics.checkNotNull(contentResolver);
        if (i10 == 0) {
            int i11 = purple;
            red = ((i11 ^ 35) + ((i11 & 35) << 1)) % 128;
            return contentResolver;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ ContentResolver invoke() {
        red = (purple + 49) % 128;
        ContentResolver alpha = alpha();
        int i4 = purple;
        int i5 = (i4 ^ 97) + ((i4 & 97) << 1);
        red = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 72 / 0;
        }
        return alpha;
    }
}
