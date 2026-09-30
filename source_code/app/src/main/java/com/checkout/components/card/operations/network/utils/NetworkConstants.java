package com.checkout.components.card.operations.network.utils;

import com.clevertap.android.sdk.network.api.CtApi;
import kotlin.Metadata;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/card/operations/network/utils/NetworkConstants;", "", "Lokhttp3/MediaType;", "a", "Lokhttp3/MediaType;", "getJsonMediaType", "()Lokhttp3/MediaType;", "jsonMediaType", "b", "getContentTypeValue", "contentTypeValue", "", "CARD", "Ljava/lang/String;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkConstants {
    public static final int $stable;

    @NotNull
    public static final String CARD = "card";

    @NotNull
    public static final NetworkConstants INSTANCE = new NetworkConstants();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final MediaType jsonMediaType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final MediaType contentTypeValue;

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        jsonMediaType = companion.get(CtApi.DEFAULT_CONTENT_TYPE);
        contentTypeValue = companion.get("application/json");
        $stable = 8;
    }

    private NetworkConstants() {
    }

    @NotNull
    public final MediaType getContentTypeValue() {
        return contentTypeValue;
    }

    @NotNull
    public final MediaType getJsonMediaType() {
        return jsonMediaType;
    }
}
