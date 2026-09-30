package com.checkout.components.core.network.model.request;

import av.q;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/core/network/model/request/InternalPlatform;", "", "", "name", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/core/network/model/request/InternalPlatform;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getVersion", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InternalPlatform {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String version;

    public InternalPlatform(@NotNull String name, @NotNull String version) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(version, "version");
        this.name = name;
        this.version = version;
    }

    public static /* synthetic */ InternalPlatform copy$default(InternalPlatform internalPlatform, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = internalPlatform.name;
        }
        if ((i4 & 2) != 0) {
            str2 = internalPlatform.version;
        }
        return internalPlatform.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final InternalPlatform copy(@NotNull String name, @NotNull String version) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(version, "version");
        return new InternalPlatform(name, version);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalPlatform)) {
            return false;
        }
        InternalPlatform internalPlatform = (InternalPlatform) other;
        return Intrinsics.areEqual(this.name, internalPlatform.name) && Intrinsics.areEqual(this.version, internalPlatform.version);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        return this.version.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return q.golf("InternalPlatform(name=", this.name, ", version=", this.version, ")");
    }
}
