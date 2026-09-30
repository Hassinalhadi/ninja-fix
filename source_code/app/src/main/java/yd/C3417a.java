package yd;

import com.clevertap.android.sdk.Constants;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import s6.Z4;

/* renamed from: yd.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3417a {
    public final byte[] alpha;
    public final byte[] bravo;
    public final byte[] charlie;

    public C3417a(Charset charset) {
        Intrinsics.echo(charset, "charset");
        this.alpha = Z4.charlie(Constants.AES_PREFIX, charset);
        this.bravo = Z4.charlie(Constants.AES_SUFFIX, charset);
        this.charlie = Z4.charlie(Constants.SEPARATOR_COMMA, charset);
    }
}
