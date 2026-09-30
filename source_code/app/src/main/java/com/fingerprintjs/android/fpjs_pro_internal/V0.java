package com.fingerprintjs.android.fpjs_pro_internal;

import java.io.ByteArrayInputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterInputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2707l6;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()[B"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class V0 extends Lambda implements Function0<byte[]> {
    public final /* synthetic */ byte[] alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(byte[] bArr) {
        super(0);
        this.alpha = bArr;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final byte[] invoke() {
        DeflaterInputStream deflaterInputStream = new DeflaterInputStream(new ByteArrayInputStream(this.alpha), new Deflater(-1, true));
        try {
            byte[] foxtrot = AbstractC2707l6.foxtrot(deflaterInputStream);
            deflaterInputStream.close();
            return foxtrot;
        } finally {
        }
    }
}
