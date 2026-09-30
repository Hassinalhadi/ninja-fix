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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/Total;", "", "", "label", Constants.KEY_TYPE, "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/paymentsession/Total;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLabel", "b", "getType", "c", "getAmount", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Total {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String amount;

    public Total(@NotNull String label, @NotNull String type, @NotNull String amount) {
        Intrinsics.echo(label, "label");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(amount, "amount");
        this.label = label;
        this.type = type;
        this.amount = amount;
    }

    public static /* synthetic */ Total copy$default(Total total, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = total.label;
        }
        if ((i4 & 2) != 0) {
            str2 = total.type;
        }
        if ((i4 & 4) != 0) {
            str3 = total.amount;
        }
        return total.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final Total copy(@NotNull String label, @NotNull String type, @NotNull String amount) {
        Intrinsics.echo(label, "label");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(amount, "amount");
        return new Total(label, type, amount);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Total)) {
            return false;
        }
        Total total = (Total) other;
        return Intrinsics.areEqual(this.label, total.label) && Intrinsics.areEqual(this.type, total.type) && Intrinsics.areEqual(this.amount, total.amount);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.amount.hashCode() + b.a(this.type, this.label.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.label;
        String str2 = this.type;
        return P0.gold(q.india("Total(label=", str, ", type=", str2, ", amount="), this.amount, ")");
    }
}
