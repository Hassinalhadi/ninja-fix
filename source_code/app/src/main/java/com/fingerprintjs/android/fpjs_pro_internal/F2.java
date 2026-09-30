package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class F2 extends Lambda implements Function0<Integer> {
    public static int purple = 0;
    public static int red = 0;
    public static int silver = 0;
    public static int teal = 1;
    public final /* synthetic */ sB6055 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(sB6055 sb6055) {
        super(0);
        this.alpha = sb6055;
    }

    public static int vD14832N6715() {
        int i4 = purple;
        int i5 = i4 % 9064616;
        purple = i4 + 1;
        if (i5 != 0) {
            return red;
        }
        int i10 = (int) Runtime.getRuntime().totalMemory();
        red = i10;
        return i10;
    }

    @NotNull
    public final Integer alpha() {
        int i4 = silver;
        teal = ((i4 ^ 41) + ((i4 & 41) << 1)) % 128;
        int i5 = sB6055.charlie + 39;
        int i10 = i5 % 128;
        sB6055.delta = i10;
        int i11 = i5 % 2;
        sB6055 sb6055 = this.alpha;
        if (i11 != 0) {
            ContentResolver contentResolver = sb6055.alpha;
            int i12 = i10 + 33;
            sB6055.charlie = i12 % 128;
            if (i12 % 2 == 0) {
                Intrinsics.checkNotNull(contentResolver);
                Integer valueOf = Integer.valueOf(Settings.Global.getInt(contentResolver, "auto_time_zone"));
                int i13 = teal + 79;
                silver = i13 % 128;
                if (i13 % 2 == 0) {
                    return valueOf;
                }
                throw null;
            }
            throw null;
        }
        ContentResolver contentResolver2 = sb6055.alpha;
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Integer invoke() {
        int i4 = silver;
        teal = ((i4 ^ 105) + ((i4 & 105) << 1)) % 128;
        Integer alpha = alpha();
        int i5 = teal;
        int i10 = (i5 & 99) + (i5 | 99);
        silver = i10 % 128;
        if (i10 % 2 == 0) {
            return alpha;
        }
        throw null;
    }
}
