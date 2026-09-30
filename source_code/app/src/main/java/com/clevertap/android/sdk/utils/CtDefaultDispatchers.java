package com.clevertap.android.sdk.utils;

import Af.n;
import Cf.d;
import Cf.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import vf.AbstractC3220y;
import vf.ao;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/clevertap/android/sdk/utils/CtDefaultDispatchers;", "Lcom/clevertap/android/sdk/utils/DispatcherProvider;", "<init>", "()V", "Lvf/y;", "io", "()Lvf/y;", "main", "processing", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CtDefaultDispatchers implements DispatcherProvider {
    @Override // com.clevertap.android.sdk.utils.DispatcherProvider
    @NotNull
    public AbstractC3220y io() {
        e eVar = ao.alpha;
        return d.purple;
    }

    @Override // com.clevertap.android.sdk.utils.DispatcherProvider
    @NotNull
    public AbstractC3220y main() {
        e eVar = ao.alpha;
        return n.alpha;
    }

    @Override // com.clevertap.android.sdk.utils.DispatcherProvider
    @NotNull
    public AbstractC3220y processing() {
        return ao.bravo;
    }
}
