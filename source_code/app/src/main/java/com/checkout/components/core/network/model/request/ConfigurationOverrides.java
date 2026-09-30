package com.checkout.components.core.network.model.request;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;", "", "", "amount", "", "currency", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", Constants.COPY_TYPE, "(ILjava/lang/String;)Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getAmount", "b", "Ljava/lang/String;", "getCurrency", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConfigurationOverrides {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int amount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String currency;

    public ConfigurationOverrides(int i4, @Nullable String str) {
        this.amount = i4;
        this.currency = str;
    }

    public static ConfigurationOverrides copy$default(ConfigurationOverrides configurationOverrides, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = configurationOverrides.amount;
        }
        if ((i5 & 2) != 0) {
            str = configurationOverrides.currency;
        }
        configurationOverrides.getClass();
        return new ConfigurationOverrides(i4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final ConfigurationOverrides copy(int amount, @Nullable String currency) {
        return new ConfigurationOverrides(amount, currency);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigurationOverrides)) {
            return false;
        }
        ConfigurationOverrides configurationOverrides = (ConfigurationOverrides) other;
        return this.amount == configurationOverrides.amount && Intrinsics.areEqual(this.currency, configurationOverrides.currency);
    }

    public final int getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    public final int hashCode() {
        int i4 = this.amount * 31;
        String str = this.currency;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ConfigurationOverrides(amount=" + this.amount + ", currency=" + this.currency + ")";
    }

    public ConfigurationOverrides(int i4, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i5 & 2) != 0 ? null : str;
        this.amount = i4;
        this.currency = str;
    }
}
