package com.checkout.components.interfaces.model.paymentsession;

import androidx.appcompat.widget.P0;
import av.q;
import com.checkout.components.interfaces.b;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/Merchant;", "", "", Constants.KEY_ID, "name", "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/paymentsession/Merchant;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getName", "c", "getOrigin", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Merchant {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String origin;

    public Merchant(@NotNull String id2, @NotNull String name, @NotNull String origin) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(origin, "origin");
        this.id = id2;
        this.name = name;
        this.origin = origin;
    }

    public static /* synthetic */ Merchant copy$default(Merchant merchant, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = merchant.id;
        }
        if ((i4 & 2) != 0) {
            str2 = merchant.name;
        }
        if ((i4 & 4) != 0) {
            str3 = merchant.origin;
        }
        return merchant.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    public final Merchant copy(@NotNull String id2, @NotNull String name, @NotNull String origin) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(origin, "origin");
        return new Merchant(id2, name, origin);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Merchant)) {
            return false;
        }
        Merchant merchant = (Merchant) other;
        return Intrinsics.areEqual(this.id, merchant.id) && Intrinsics.areEqual(this.name, merchant.name) && Intrinsics.areEqual(this.origin, merchant.origin);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getOrigin() {
        return this.origin;
    }

    public final int hashCode() {
        return this.origin.hashCode() + b.a(this.name, this.id.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        return P0.gold(q.india("Merchant(id=", str, ", name=", str2, ", origin="), this.origin, ")");
    }
}
