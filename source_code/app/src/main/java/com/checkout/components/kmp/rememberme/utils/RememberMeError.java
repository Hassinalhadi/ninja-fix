package com.checkout.components.kmp.rememberme.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/RememberMeError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;", "<init>", "(Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;)V", "getCode$rememberme_release", "()Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;", "component1", "component1$rememberme_release", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RememberMeError extends Exception {
    public static final int $stable = 8;

    @NotNull
    private final ErrorCode code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberMeError(@NotNull ErrorCode code) {
        super(code.getMessage());
        Intrinsics.echo(code, "code");
        this.code = code;
    }

    public static /* synthetic */ RememberMeError copy$default(RememberMeError rememberMeError, ErrorCode errorCode, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            errorCode = rememberMeError.code;
        }
        return rememberMeError.copy(errorCode);
    }

    @NotNull
    /* renamed from: component1$rememberme_release, reason: from getter */
    public final ErrorCode getCode() {
        return this.code;
    }

    @NotNull
    public final RememberMeError copy(@NotNull ErrorCode code) {
        Intrinsics.echo(code, "code");
        return new RememberMeError(code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RememberMeError) && this.code == ((RememberMeError) other).code;
    }

    @NotNull
    public final ErrorCode getCode$rememberme_release() {
        return this.code;
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "RememberMeError(code=" + this.code + ")";
    }
}
