package com.checkout.components.interfaces.error.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/error/model/OperationsError;", "Lcom/checkout/components/interfaces/error/model/BaseOperationsError;", "", "errorCode", Constants.KEY_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getErrorCode", "()Ljava/lang/String;", "c", "getMessage", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class OperationsError extends BaseOperationsError {
    public static final int $stable = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String errorCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationsError(@NotNull String errorCode, @NotNull String message) {
        super(message);
        Intrinsics.echo(errorCode, "errorCode");
        Intrinsics.echo(message, "message");
        this.errorCode = errorCode;
        this.message = message;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Override // com.checkout.components.interfaces.error.model.BaseOperationsError, java.lang.Throwable
    @NotNull
    /* renamed from: getMessage */
    public final String getCom.clevertap.android.sdk.Constants.KEY_MESSAGE java.lang.String() {
        return this.message;
    }
}
