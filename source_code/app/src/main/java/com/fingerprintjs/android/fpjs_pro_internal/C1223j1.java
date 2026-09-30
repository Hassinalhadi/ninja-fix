package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1223j1 extends Lambda implements Function0<String> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ C1227k1 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223j1(C1227k1 c1227k1) {
        super(0);
        this.alpha = c1227k1;
    }

    @NotNull
    public final String alpha() {
        red = (purple + 17) % 128;
        int i4 = C1227k1.bravo;
        C1227k1.charlie = (i4 + 87) % 128;
        ContentResolver contentResolver = this.alpha.alpha;
        int i5 = (i4 ^ 5) + ((i4 & 5) << 1);
        C1227k1.charlie = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNull(contentResolver);
            String string = Settings.Secure.getString(contentResolver, "android_id");
            Intrinsics.checkNotNull(string);
            red = (purple + 63) % 128;
            return string;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i4 = red;
        purple = (((i4 | 107) << 1) - (i4 ^ 107)) % 128;
        String alpha = alpha();
        int i5 = red;
        purple = ((i5 ^ 71) + ((i5 & 71) << 1)) % 128;
        return alpha;
    }
}
