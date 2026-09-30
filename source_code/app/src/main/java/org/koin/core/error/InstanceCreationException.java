package org.koin.core.error;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/koin/core/error/InstanceCreationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.KEY_MSG, "", "parent", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "koin-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InstanceCreationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceCreationException(@NotNull String msg, @NotNull Exception parent) {
        super(msg, parent);
        Intrinsics.echo(msg, "msg");
        Intrinsics.echo(parent, "parent");
    }
}
