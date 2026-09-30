package com.clevertap.android.sdk.network.api;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/clevertap/android/sdk/network/api/SendQueueRequestBody;", "", "queueHeader", "Lorg/json/JSONObject;", "queue", "Lorg/json/JSONArray;", "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONArray;)V", "getQueueHeader", "()Lorg/json/JSONObject;", "getQueue", "()Lorg/json/JSONArray;", "toString", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SendQueueRequestBody {

    @NotNull
    private final JSONArray queue;

    @Nullable
    private final JSONObject queueHeader;

    public SendQueueRequestBody(@Nullable JSONObject jSONObject, @NotNull JSONArray queue) {
        Intrinsics.echo(queue, "queue");
        this.queueHeader = jSONObject;
        this.queue = queue;
    }

    @NotNull
    public final JSONArray getQueue() {
        return this.queue;
    }

    @Nullable
    public final JSONObject getQueueHeader() {
        return this.queueHeader;
    }

    @NotNull
    public String toString() {
        if (this.queueHeader == null) {
            String jSONArray = this.queue.toString();
            Intrinsics.checkNotNull(jSONArray);
            return jSONArray;
        }
        StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
        sb2.append(this.queueHeader);
        sb2.append(',');
        String jSONArray2 = this.queue.toString();
        Intrinsics.delta(jSONArray2, "toString(...)");
        String substring = jSONArray2.substring(1);
        Intrinsics.delta(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }
}
