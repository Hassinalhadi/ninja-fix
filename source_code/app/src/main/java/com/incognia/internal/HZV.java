package com.incognia.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.UUID;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.a;

/* loaded from: classes2.dex */
public final class HZV extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh f8849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HZV(vh vhVar) {
        super(0);
        this.f8849b = vhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = vh.sVU + ':' + this.f8849b.f11564b + ':' + this.f8849b.f11563W;
        Charset charset = a.alpha;
        byte[] bytes = str.getBytes(charset);
        byte[] bArr = {(byte) 16226662, (byte) 6486, (byte) 2159, (byte) 130348153, (byte) 502699334, (byte) 6233, (byte) 18278, (byte) 459345, (byte) 581, (byte) 199246, (byte) 20577, (byte) 811830324, (byte) 1336651, (byte) 4208, (byte) 3297113, (byte) 117353};
        t9 t9Var = new t9();
        t9Var.b(UUID.randomUUID().toString().getBytes(charset));
        byte[] copyOfRange = ArraysKt.copyOfRange(t9Var.b(), 0, 16);
        byte[] W5 = new F(bArr, copyOfRange, null).W(bytes);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(copyOfRange);
            byteArrayOutputStream.write(W5);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(copyOfRange, (byte) 0);
            return StringsKt.b(cT.f9(11, byteArray)).toString();
        } catch (IOException e) {
            throw new SecurityException(e);
        }
    }
}
