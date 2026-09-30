package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.provider.Settings;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1281y0 extends Lambda implements Function0<String> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ C1285z0 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1281y0(C1285z0 c1285z0) {
        super(0);
        this.alpha = c1285z0;
    }

    @NotNull
    public final String alpha() {
        int i4 = purple;
        int i5 = ((i4 | 107) << 1) - (i4 ^ 107);
        red = i5 % 128;
        int i10 = i5 % 2;
        C1285z0 c1285z0 = this.alpha;
        if (i10 != 0) {
            int i11 = C1285z0.charlie;
            int i12 = (i11 & 3) + (i11 | 3);
            C1285z0.bravo = i12 % 128;
            int i13 = i12 % 2;
            ContentResolver contentResolver = c1285z0.alpha;
            if (i13 == 0) {
                Intrinsics.checkNotNull(contentResolver);
                String string = Settings.Global.getString(contentResolver, P28427.C1093m5.echo.vD14832N6715());
                Intrinsics.checkNotNull(string);
                return string;
            }
            throw null;
        }
        int i14 = C1285z0.charlie;
        int i15 = (i14 & 3) + (i14 | 3);
        C1285z0.bravo = i15 % 128;
        int i16 = i15 % 2;
        ContentResolver contentResolver2 = c1285z0.alpha;
        if (i16 == 0) {
            Intrinsics.checkNotNull(contentResolver2);
            Intrinsics.checkNotNull(Settings.Global.getString(contentResolver2, P28427.C1093m5.echo.vD14832N6715()));
            throw null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i4 = red;
        purple = (((i4 | 43) << 1) - (i4 ^ 43)) % 128;
        String alpha = alpha();
        purple = (red + 25) % 128;
        return alpha;
    }
}
