package com.checkout.components.card.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/checkout/components/card/model/RetryCardMataDataApiContext;", "", "", "wasRetried", "secondTimeRetryable", "<init>", "(ZZ)V", "component1", "()Z", "component2", Constants.COPY_TYPE, "(ZZ)Lcom/checkout/components/card/model/RetryCardMataDataApiContext;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getWasRetried", "b", "getSecondTimeRetryable", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RetryCardMataDataApiContext {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean wasRetried;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean secondTimeRetryable;

    public RetryCardMataDataApiContext(boolean z2, boolean z10) {
        this.wasRetried = z2;
        this.secondTimeRetryable = z10;
    }

    public static RetryCardMataDataApiContext copy$default(RetryCardMataDataApiContext retryCardMataDataApiContext, boolean z2, boolean z10, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = retryCardMataDataApiContext.wasRetried;
        }
        if ((i4 & 2) != 0) {
            z10 = retryCardMataDataApiContext.secondTimeRetryable;
        }
        retryCardMataDataApiContext.getClass();
        return new RetryCardMataDataApiContext(z2, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getWasRetried() {
        return this.wasRetried;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSecondTimeRetryable() {
        return this.secondTimeRetryable;
    }

    @NotNull
    public final RetryCardMataDataApiContext copy(boolean wasRetried, boolean secondTimeRetryable) {
        return new RetryCardMataDataApiContext(wasRetried, secondTimeRetryable);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetryCardMataDataApiContext)) {
            return false;
        }
        RetryCardMataDataApiContext retryCardMataDataApiContext = (RetryCardMataDataApiContext) other;
        return this.wasRetried == retryCardMataDataApiContext.wasRetried && this.secondTimeRetryable == retryCardMataDataApiContext.secondTimeRetryable;
    }

    public final boolean getSecondTimeRetryable() {
        return this.secondTimeRetryable;
    }

    public final boolean getWasRetried() {
        return this.wasRetried;
    }

    public final int hashCode() {
        int i4;
        int i5 = 1237;
        if (this.wasRetried) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = i4 * 31;
        if (this.secondTimeRetryable) {
            i5 = 1231;
        }
        return i5 + i10;
    }

    @NotNull
    public final String toString() {
        return "RetryCardMataDataApiContext(wasRetried=" + this.wasRetried + ", secondTimeRetryable=" + this.secondTimeRetryable + ")";
    }
}
