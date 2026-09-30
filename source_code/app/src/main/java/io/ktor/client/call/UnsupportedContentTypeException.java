package io.ktor.client.call;

import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import vd.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/call/UnsupportedContentTypeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lvd/e;", Constants.KEY_CONTENT, "<init>", "(Lvd/e;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnsupportedContentTypeException extends IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UnsupportedContentTypeException(@NotNull e content) {
        super(j.mike(u.alpha, content.getClass(), r0));
        Intrinsics.echo(content, "content");
        StringBuilder sb2 = new StringBuilder("Failed to write body: ");
    }
}
