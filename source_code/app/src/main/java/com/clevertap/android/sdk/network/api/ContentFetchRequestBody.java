package com.clevertap.android.sdk.network.api;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/clevertap/android/sdk/network/api/ContentFetchRequestBody;", "", "header", "Lorg/json/JSONObject;", "items", "Lorg/json/JSONArray;", "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONArray;)V", "getHeader", "()Lorg/json/JSONObject;", "getItems", "()Lorg/json/JSONArray;", "toString", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentFetchRequestBody {

    @NotNull
    private final JSONObject header;

    @NotNull
    private final JSONArray items;

    public ContentFetchRequestBody(@NotNull JSONObject header, @NotNull JSONArray items) {
        Intrinsics.echo(header, "header");
        Intrinsics.echo(items, "items");
        this.header = header;
        this.items = items;
    }

    @NotNull
    public final JSONObject getHeader() {
        return this.header;
    }

    @NotNull
    public final JSONArray getItems() {
        return this.items;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
        sb2.append(this.header);
        sb2.append(',');
        String jSONArray = this.items.toString();
        Intrinsics.delta(jSONArray, "toString(...)");
        String substring = jSONArray.substring(1);
        Intrinsics.delta(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }
}
