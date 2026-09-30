package com.checkout.components.interfaces.error.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/interfaces/error/model/BaseOperationsError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", Constants.KEY_MESSAGE, "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BaseOperationsError extends Exception {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOperationsError(@NotNull String message) {
        super(message);
        Intrinsics.echo(message, "message");
        this.message = message;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
