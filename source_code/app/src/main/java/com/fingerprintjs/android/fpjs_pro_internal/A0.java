package com.fingerprintjs.android.fpjs_pro_internal;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class A0 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ az alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ byte[] red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(az azVar, String str, byte[] bArr) {
        super(0);
        this.alpha = azVar;
        this.purple = str;
        this.red = bArr;
    }

    public final void alpha() {
        az azVar = this.alpha;
        String str = azVar.alpha;
        Intrinsics.checkNotNull(str);
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder beige = ao.ad.beige(azVar.alpha, "/");
        beige.append(this.purple);
        File file2 = new File(beige.toString());
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FilesKt.mike(file2, this.red);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        alpha();
        return Unit.INSTANCE;
    }
}
