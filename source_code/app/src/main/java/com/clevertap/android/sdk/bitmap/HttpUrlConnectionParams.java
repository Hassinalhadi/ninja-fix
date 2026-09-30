package com.clevertap.android.sdk.bitmap;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BG\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JG\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/clevertap/android/sdk/bitmap/HttpUrlConnectionParams;", "", "connectTimeout", "", "readTimeout", "useCaches", "", "doInput", "requestMap", "", "", "<init>", "(IIZZLjava/util/Map;)V", "getConnectTimeout", "()I", "setConnectTimeout", "(I)V", "getReadTimeout", "setReadTimeout", "getUseCaches", "()Z", "setUseCaches", "(Z)V", "getDoInput", "setDoInput", "getRequestMap", "()Ljava/util/Map;", "setRequestMap", "(Ljava/util/Map;)V", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HttpUrlConnectionParams {
    private int connectTimeout;
    private boolean doInput;
    private int readTimeout;

    @NotNull
    private Map<String, String> requestMap;
    private boolean useCaches;

    public HttpUrlConnectionParams() {
        this(0, 0, false, false, null, 31, null);
    }

    public static /* synthetic */ HttpUrlConnectionParams copy$default(HttpUrlConnectionParams httpUrlConnectionParams, int i4, int i5, boolean z2, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = httpUrlConnectionParams.connectTimeout;
        }
        if ((i10 & 2) != 0) {
            i5 = httpUrlConnectionParams.readTimeout;
        }
        if ((i10 & 4) != 0) {
            z2 = httpUrlConnectionParams.useCaches;
        }
        if ((i10 & 8) != 0) {
            z10 = httpUrlConnectionParams.doInput;
        }
        if ((i10 & 16) != 0) {
            map = httpUrlConnectionParams.requestMap;
        }
        Map map2 = map;
        boolean z11 = z2;
        return httpUrlConnectionParams.copy(i4, i5, z11, z10, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* renamed from: component2, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseCaches() {
        return this.useCaches;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDoInput() {
        return this.doInput;
    }

    @NotNull
    public final Map<String, String> component5() {
        return this.requestMap;
    }

    @NotNull
    public final HttpUrlConnectionParams copy(int connectTimeout, int readTimeout, boolean useCaches, boolean doInput, @NotNull Map<String, String> requestMap) {
        Intrinsics.echo(requestMap, "requestMap");
        return new HttpUrlConnectionParams(connectTimeout, readTimeout, useCaches, doInput, requestMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpUrlConnectionParams)) {
            return false;
        }
        HttpUrlConnectionParams httpUrlConnectionParams = (HttpUrlConnectionParams) other;
        return this.connectTimeout == httpUrlConnectionParams.connectTimeout && this.readTimeout == httpUrlConnectionParams.readTimeout && this.useCaches == httpUrlConnectionParams.useCaches && this.doInput == httpUrlConnectionParams.doInput && Intrinsics.areEqual(this.requestMap, httpUrlConnectionParams.requestMap);
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final boolean getDoInput() {
        return this.doInput;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    public final Map<String, String> getRequestMap() {
        return this.requestMap;
    }

    public final boolean getUseCaches() {
        return this.useCaches;
    }

    public int hashCode() {
        int i4;
        int i5 = ((this.connectTimeout * 31) + this.readTimeout) * 31;
        int i10 = 1237;
        if (this.useCaches) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i5 + i4) * 31;
        if (this.doInput) {
            i10 = 1231;
        }
        return this.requestMap.hashCode() + ((i11 + i10) * 31);
    }

    public final void setConnectTimeout(int i4) {
        this.connectTimeout = i4;
    }

    public final void setDoInput(boolean z2) {
        this.doInput = z2;
    }

    public final void setReadTimeout(int i4) {
        this.readTimeout = i4;
    }

    public final void setRequestMap(@NotNull Map<String, String> map) {
        Intrinsics.echo(map, "<set-?>");
        this.requestMap = map;
    }

    public final void setUseCaches(boolean z2) {
        this.useCaches = z2;
    }

    @NotNull
    public String toString() {
        return "HttpUrlConnectionParams(connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", useCaches=" + this.useCaches + ", doInput=" + this.doInput + ", requestMap=" + this.requestMap + ')';
    }

    public HttpUrlConnectionParams(int i4) {
        this(i4, 0, false, false, null, 30, null);
    }

    public HttpUrlConnectionParams(int i4, int i5) {
        this(i4, i5, false, false, null, 28, null);
    }

    public HttpUrlConnectionParams(int i4, int i5, boolean z2) {
        this(i4, i5, z2, false, null, 24, null);
    }

    public HttpUrlConnectionParams(int i4, int i5, boolean z2, boolean z10) {
        this(i4, i5, z2, z10, null, 16, null);
    }

    public HttpUrlConnectionParams(int i4, int i5, boolean z2, boolean z10, @NotNull Map<String, String> requestMap) {
        Intrinsics.echo(requestMap, "requestMap");
        this.connectTimeout = i4;
        this.readTimeout = i5;
        this.useCaches = z2;
        this.doInput = z10;
        this.requestMap = requestMap;
    }

    public /* synthetic */ HttpUrlConnectionParams(int i4, int i5, boolean z2, boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i4, (i10 & 2) != 0 ? 0 : i5, (i10 & 4) != 0 ? false : z2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? t.alpha : map);
    }
}
