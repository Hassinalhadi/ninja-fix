package com.fingerprintjs.android.fpjs_pro_internal;

import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/N14263A23323;", "", "Ljava/io/FileNotFoundException;", "alpha", "()Lcom/fingerprintjs/android/fpjs_pro_internal/N14263A23323;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class B0 extends Lambda implements Function0<N14263A23323<? extends byte[], ? extends FileNotFoundException>> {
    public final /* synthetic */ az alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(az azVar, String str) {
        super(0);
        this.alpha = azVar;
        this.purple = str;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final N14263A23323<byte[], FileNotFoundException> invoke() {
        String str = this.alpha.alpha;
        Intrinsics.checkNotNull(str);
        File file = new File(str + "/" + this.purple);
        if (!file.exists()) {
            return new setTopP6481(new FileNotFoundException());
        }
        return new component8(FilesKt.india(file));
    }
}
