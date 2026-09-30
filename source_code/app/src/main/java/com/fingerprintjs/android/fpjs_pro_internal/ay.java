package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class ay extends Lambda implements Function0<String> {
    public static final ay alpha = new Lambda(0);
    public static int purple = 0;
    public static int red = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.ay, kotlin.jvm.internal.Lambda] */
    static {
        if ((((1 | 41) << 1) - (1 ^ 41)) % 2 != 0) {
            int i4 = 57 / 0;
        }
    }

    public ay() {
        super(0);
    }

    @NotNull
    public final String alpha() {
        String obj = StringsKt.b(new String(FilesKt.india(new File(P28427.J5.echo.vD14832N6715())), kotlin.text.a.alpha)).toString();
        int i4 = purple + 99;
        red = i4 % 128;
        if (i4 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i4 = red;
        purple = (((i4 | 39) << 1) - (i4 ^ 39)) % 128;
        String alpha2 = alpha();
        red = (purple + 125) % 128;
        return alpha2;
    }
}
