package com.checkout.components.interfaces.model.paymentsession;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/Links;", "", "Lcom/checkout/components/interfaces/model/paymentsession/Self;", "self", "<init>", "(Lcom/checkout/components/interfaces/model/paymentsession/Self;)V", "component1", "()Lcom/checkout/components/interfaces/model/paymentsession/Self;", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/paymentsession/Self;)Lcom/checkout/components/interfaces/model/paymentsession/Links;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/paymentsession/Self;", "getSelf", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Links {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Self self;

    public Links(@NotNull Self self) {
        Intrinsics.echo(self, "self");
        this.self = self;
    }

    public static Links copy$default(Links links, Self self, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            self = links.self;
        }
        links.getClass();
        Intrinsics.echo(self, "self");
        return new Links(self);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Self getSelf() {
        return this.self;
    }

    @NotNull
    public final Links copy(@NotNull Self self) {
        Intrinsics.echo(self, "self");
        return new Links(self);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Links) && Intrinsics.areEqual(this.self, ((Links) other).self);
    }

    @NotNull
    public final Self getSelf() {
        return this.self;
    }

    public final int hashCode() {
        return this.self.hashCode();
    }

    @NotNull
    public final String toString() {
        return "Links(self=" + this.self + ")";
    }
}
