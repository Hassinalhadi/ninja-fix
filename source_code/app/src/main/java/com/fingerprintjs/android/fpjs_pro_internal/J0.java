package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import fe.C1715g;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class J0 extends Lambda implements Function0<Integer> {
    public final /* synthetic */ C1715g alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C1715g c1715g, String str) {
        super(0);
        this.alpha = c1715g;
        this.purple = str;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final Integer invoke() {
        int i4;
        C1715g c1715g = this.alpha;
        if (!c1715g.isEmpty()) {
            MessageDigest messageDigest = MessageDigest.getInstance(P28427.M1.echo.vD14832N6715());
            Intrinsics.checkNotNull(messageDigest);
            byte[] digest = messageDigest.digest(this.purple.getBytes(kotlin.text.a.alpha));
            Intrinsics.checkNotNull(digest);
            Intrinsics.echo(digest, "<this>");
            int i5 = 0;
            int i10 = 0;
            for (byte b2 : digest) {
                i10 += b2;
            }
            if (c1715g.isEmpty()) {
                i4 = 0;
            } else {
                i4 = (c1715g.purple - c1715g.alpha) + 1;
            }
            int i11 = i10 % i4;
            if (i11 != 0) {
                if ((((i10 ^ i4) >> 31) | 1) > 0) {
                    i5 = i11;
                } else {
                    i5 = i11 + i4;
                }
            }
            return Integer.valueOf(i5 + c1715g.alpha);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
