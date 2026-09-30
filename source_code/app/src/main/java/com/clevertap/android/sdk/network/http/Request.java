package com.clevertap.android.sdk.network.http;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/clevertap/android/sdk/network/http/Request;", "", Constants.KEY_URL, "Landroid/net/Uri;", "headers", "", "", "body", "<init>", "(Landroid/net/Uri;Ljava/util/Map;Ljava/lang/String;)V", "getUrl", "()Landroid/net/Uri;", "getHeaders", "()Ljava/util/Map;", "getBody", "()Ljava/lang/String;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Request {

    @Nullable
    private final String body;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final Uri url;

    public Request(@NotNull Uri url, @NotNull Map<String, String> headers, @Nullable String str) {
        Intrinsics.echo(url, "url");
        Intrinsics.echo(headers, "headers");
        this.url = url;
        this.headers = headers;
        this.body = str;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Uri getUrl() {
        return this.url;
    }
}
