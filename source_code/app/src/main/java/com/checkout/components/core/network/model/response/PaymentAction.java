package com.checkout.components.core.network.model.response;

import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/core/network/model/response/PaymentAction;", "", "", "getType", "()Ljava/lang/String;", Constants.KEY_TYPE, "Redirect", "ThreeDS", "Lcom/checkout/components/core/network/model/response/PaymentAction$Redirect;", "Lcom/checkout/components/core/network/model/response/PaymentAction$ThreeDS;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PaymentAction {
    public static final int $stable = 0;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/core/network/model/response/PaymentAction$Redirect;", "Lcom/checkout/components/core/network/model/response/PaymentAction;", "", Constants.KEY_URL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/core/network/model/response/PaymentAction$Redirect;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "b", "getType", Constants.KEY_TYPE, "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Redirect extends PaymentAction {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Redirect(@NotNull String url) {
            super(null);
            Intrinsics.echo(url, "url");
            this.url = url;
            this.type = PaymentActionType.Redirect.getValue();
        }

        public static Redirect copy$default(Redirect redirect, String url, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                url = redirect.url;
            }
            redirect.getClass();
            Intrinsics.echo(url, "url");
            return new Redirect(url);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Redirect copy(@NotNull String url) {
            Intrinsics.echo(url, "url");
            return new Redirect(url);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Redirect) && Intrinsics.areEqual(this.url, ((Redirect) other).url);
        }

        @Override // com.checkout.components.core.network.model.response.PaymentAction
        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public final String toString() {
            return ad.gray("Redirect(url=", this.url, ")");
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/core/network/model/response/PaymentAction$ThreeDS;", "Lcom/checkout/components/core/network/model/response/PaymentAction;", "", Constants.KEY_URL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/core/network/model/response/PaymentAction$ThreeDS;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "b", "getType", Constants.KEY_TYPE, "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ThreeDS extends PaymentAction {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreeDS(@NotNull String url) {
            super(null);
            Intrinsics.echo(url, "url");
            this.url = url;
            this.type = PaymentActionType.ThreeDS.getValue();
        }

        public static ThreeDS copy$default(ThreeDS threeDS, String url, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                url = threeDS.url;
            }
            threeDS.getClass();
            Intrinsics.echo(url, "url");
            return new ThreeDS(url);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final ThreeDS copy(@NotNull String url) {
            Intrinsics.echo(url, "url");
            return new ThreeDS(url);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ThreeDS) && Intrinsics.areEqual(this.url, ((ThreeDS) other).url);
        }

        @Override // com.checkout.components.core.network.model.response.PaymentAction
        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public final String toString() {
            return ad.gray("ThreeDS(url=", this.url, ")");
        }
    }

    public PaymentAction(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public abstract String getType();
}
