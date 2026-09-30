package com.fingerprintjs.android.fpjs_pro_internal;

import java.io.ByteArrayInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2707l6;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "delta", "()[B"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class U0 extends Lambda implements Function0<byte[]> {
    public static int purple;
    public static int red;
    public final /* synthetic */ byte[] alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(byte[] bArr) {
        super(0);
        this.alpha = bArr;
    }

    public static int alpha() {
        int i4 = purple;
        int i5 = i4 % 5269945;
        purple = i4 + 1;
        if (i5 != 0) {
            return red;
        }
        int romeo = ao.ad.romeo();
        red = romeo;
        return romeo;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: delta, reason: merged with bridge method [inline-methods] */
    public final byte[] invoke() {
        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(this.alpha), new Inflater(true));
        try {
            byte[] foxtrot = AbstractC2707l6.foxtrot(inflaterInputStream);
            inflaterInputStream.close();
            return foxtrot;
        } finally {
        }
    }
}
