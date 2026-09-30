package com.clevertap.android.sdk.network;

import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/clevertap/android/sdk/network/CompositeBatchListener;", "Lcom/clevertap/android/sdk/network/BatchListener;", "<init>", "()V", "listeners", "", "addListener", "", "listener", "removeListener", "onBatchSent", "batch", "Lorg/json/JSONArray;", RedirectionConstants.REDIRECT_SUCCESS_VALUE, "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompositeBatchListener implements BatchListener {

    @NotNull
    private final List<BatchListener> listeners = new ArrayList();

    public final void addListener(@NotNull BatchListener listener) {
        Intrinsics.echo(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // com.clevertap.android.sdk.network.BatchListener
    public void onBatchSent(@NotNull JSONArray batch, boolean success) {
        Intrinsics.echo(batch, "batch");
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((BatchListener) it.next()).onBatchSent(batch, success);
        }
    }

    public final void removeListener(@NotNull BatchListener listener) {
        Intrinsics.echo(listener, "listener");
        this.listeners.remove(listener);
    }
}
