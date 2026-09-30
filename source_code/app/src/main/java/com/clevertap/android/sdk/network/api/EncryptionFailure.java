package com.clevertap.android.sdk.network.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/clevertap/android/sdk/network/api/EncryptionFailure;", "Lcom/clevertap/android/sdk/network/api/EncryptionResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EncryptionFailure extends EncryptionResult {

    @NotNull
    public static final EncryptionFailure INSTANCE = new EncryptionFailure();

    private EncryptionFailure() {
        super(null);
    }

    public boolean equals(@Nullable Object other) {
        return this == other || (other instanceof EncryptionFailure);
    }

    public int hashCode() {
        return 574025025;
    }

    @NotNull
    public String toString() {
        return "EncryptionFailure";
    }
}
