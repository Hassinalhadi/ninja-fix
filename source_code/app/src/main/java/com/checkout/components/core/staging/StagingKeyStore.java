package com.checkout.components.core.staging;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/core/staging/StagingKeyStore;", "", "", "", "keys", "", "recordKeys", "(Ljava/util/List;)V", "snapshot", "()Ljava/util/List;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StagingKeyStore {
    public static final int $stable = 0;

    @NotNull
    public static final StagingKeyStore INSTANCE = new StagingKeyStore();

    private StagingKeyStore() {
    }

    public final void recordKeys(@NotNull List<String> keys) {
        Intrinsics.echo(keys, "keys");
    }

    @NotNull
    public final List<String> snapshot() {
        return CollectionsKt.emptyList();
    }
}
