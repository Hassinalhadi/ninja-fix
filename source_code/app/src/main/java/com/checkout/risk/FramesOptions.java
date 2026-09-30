package com.checkout.risk;

import androidx.appcompat.widget.P0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/checkout/risk/FramesOptions;", "", "version", "", "productIdentifier", "correlationId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCorrelationId", "()Ljava/lang/String;", "getProductIdentifier", "getVersion", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FramesOptions {

    @NotNull
    private final String correlationId;

    @NotNull
    private final String productIdentifier;

    @NotNull
    private final String version;

    public FramesOptions(@NotNull String version, @NotNull String productIdentifier, @NotNull String correlationId) {
        Intrinsics.echo(version, "version");
        Intrinsics.echo(productIdentifier, "productIdentifier");
        Intrinsics.echo(correlationId, "correlationId");
        this.version = version;
        this.productIdentifier = productIdentifier;
        this.correlationId = correlationId;
    }

    public static /* synthetic */ FramesOptions copy$default(FramesOptions framesOptions, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = framesOptions.version;
        }
        if ((i4 & 2) != 0) {
            str2 = framesOptions.productIdentifier;
        }
        if ((i4 & 4) != 0) {
            str3 = framesOptions.correlationId;
        }
        return framesOptions.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    @NotNull
    public final FramesOptions copy(@NotNull String version, @NotNull String productIdentifier, @NotNull String correlationId) {
        Intrinsics.echo(version, "version");
        Intrinsics.echo(productIdentifier, "productIdentifier");
        Intrinsics.echo(correlationId, "correlationId");
        return new FramesOptions(version, productIdentifier, correlationId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FramesOptions)) {
            return false;
        }
        FramesOptions framesOptions = (FramesOptions) other;
        return Intrinsics.areEqual(this.version, framesOptions.version) && Intrinsics.areEqual(this.productIdentifier, framesOptions.productIdentifier) && Intrinsics.areEqual(this.correlationId, framesOptions.correlationId);
    }

    @NotNull
    public final String getCorrelationId() {
        return this.correlationId;
    }

    @NotNull
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.correlationId.hashCode() + AbstractC2327c.sierra(this.version.hashCode() * 31, 31, this.productIdentifier);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FramesOptions(version=");
        sb2.append(this.version);
        sb2.append(", productIdentifier=");
        sb2.append(this.productIdentifier);
        sb2.append(", correlationId=");
        return P0.fuchsia(sb2, this.correlationId, ')');
    }
}
