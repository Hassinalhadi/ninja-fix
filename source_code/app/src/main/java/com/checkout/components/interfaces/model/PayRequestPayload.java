package com.checkout.components.interfaces.model;

import Q0.c;
import androidx.appcompat.widget.P0;
import av.q;
import com.checkout.components.interfaces.b;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/interfaces/model/PayRequestPayload;", "", "", "getDeviceSessionId", "()Ljava/lang/String;", "deviceSessionId", "Card", "GooglePay", "RememberMe", "Apm", "Lcom/checkout/components/interfaces/model/PayRequestPayload$Apm;", "Lcom/checkout/components/interfaces/model/PayRequestPayload$Card;", "Lcom/checkout/components/interfaces/model/PayRequestPayload$GooglePay;", "Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PayRequestPayload {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lcom/checkout/components/interfaces/model/PayRequestPayload$Card;", "Lcom/checkout/components/interfaces/model/PayRequestPayload;", "Lcom/checkout/components/interfaces/model/CardTokenDetails;", "cardTokenDetails", "", "deviceSessionId", "appIdentifier", "<init>", "(Lcom/checkout/components/interfaces/model/CardTokenDetails;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/checkout/components/interfaces/model/CardTokenDetails;", "component2", "()Ljava/lang/String;", "component3", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/CardTokenDetails;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/PayRequestPayload$Card;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/CardTokenDetails;", "getCardTokenDetails", "b", "Ljava/lang/String;", "getDeviceSessionId", "c", "getAppIdentifier", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Card extends PayRequestPayload {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CardTokenDetails cardTokenDetails;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String deviceSessionId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String appIdentifier;

        public /* synthetic */ Card(CardTokenDetails cardTokenDetails, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(cardTokenDetails, str, (i4 & 4) != 0 ? null : str2);
        }

        public static Card copy$default(Card card, CardTokenDetails cardTokenDetails, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                cardTokenDetails = card.cardTokenDetails;
            }
            if ((i4 & 2) != 0) {
                str = card.deviceSessionId;
            }
            if ((i4 & 4) != 0) {
                str2 = card.appIdentifier;
            }
            card.getClass();
            Intrinsics.echo(cardTokenDetails, "cardTokenDetails");
            return new Card(cardTokenDetails, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CardTokenDetails getCardTokenDetails() {
            return this.cardTokenDetails;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getDeviceSessionId() {
            return this.deviceSessionId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getAppIdentifier() {
            return this.appIdentifier;
        }

        @NotNull
        public final Card copy(@NotNull CardTokenDetails cardTokenDetails, @Nullable String deviceSessionId, @Nullable String appIdentifier) {
            Intrinsics.echo(cardTokenDetails, "cardTokenDetails");
            return new Card(cardTokenDetails, deviceSessionId, appIdentifier);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.cardTokenDetails, card.cardTokenDetails) && Intrinsics.areEqual(this.deviceSessionId, card.deviceSessionId) && Intrinsics.areEqual(this.appIdentifier, card.appIdentifier);
        }

        @Nullable
        public final String getAppIdentifier() {
            return this.appIdentifier;
        }

        @NotNull
        public final CardTokenDetails getCardTokenDetails() {
            return this.cardTokenDetails;
        }

        @Override // com.checkout.components.interfaces.model.PayRequestPayload
        @Nullable
        public final String getDeviceSessionId() {
            return this.deviceSessionId;
        }

        public final int hashCode() {
            int hashCode = this.cardTokenDetails.hashCode() * 31;
            String str = this.deviceSessionId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.appIdentifier;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            CardTokenDetails cardTokenDetails = this.cardTokenDetails;
            String str = this.deviceSessionId;
            String str2 = this.appIdentifier;
            StringBuilder sb2 = new StringBuilder("Card(cardTokenDetails=");
            sb2.append(cardTokenDetails);
            sb2.append(", deviceSessionId=");
            sb2.append(str);
            sb2.append(", appIdentifier=");
            return P0.gold(sb2, str2, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(@NotNull CardTokenDetails cardTokenDetails, @Nullable String str, @Nullable String str2) {
            super(null);
            Intrinsics.echo(cardTokenDetails, "cardTokenDetails");
            this.cardTokenDetails = cardTokenDetails;
            this.deviceSessionId = str;
            this.appIdentifier = str2;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\n¨\u0006\""}, d2 = {"Lcom/checkout/components/interfaces/model/PayRequestPayload$GooglePay;", "Lcom/checkout/components/interfaces/model/PayRequestPayload;", "", "publicKey", "token", "deviceSessionId", "appIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/PayRequestPayload$GooglePay;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPublicKey", "b", "getToken", "c", "getDeviceSessionId", Constants.INAPP_DATA_TAG, "getAppIdentifier", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class GooglePay extends PayRequestPayload {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String publicKey;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String token;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String deviceSessionId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String appIdentifier;

        public /* synthetic */ GooglePay(String str, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i4 & 8) != 0 ? null : str4);
        }

        public static /* synthetic */ GooglePay copy$default(GooglePay googlePay, String str, String str2, String str3, String str4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = googlePay.publicKey;
            }
            if ((i4 & 2) != 0) {
                str2 = googlePay.token;
            }
            if ((i4 & 4) != 0) {
                str3 = googlePay.deviceSessionId;
            }
            if ((i4 & 8) != 0) {
                str4 = googlePay.appIdentifier;
            }
            return googlePay.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPublicKey() {
            return this.publicKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getDeviceSessionId() {
            return this.deviceSessionId;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getAppIdentifier() {
            return this.appIdentifier;
        }

        @NotNull
        public final GooglePay copy(@NotNull String publicKey, @NotNull String token, @Nullable String deviceSessionId, @Nullable String appIdentifier) {
            Intrinsics.echo(publicKey, "publicKey");
            Intrinsics.echo(token, "token");
            return new GooglePay(publicKey, token, deviceSessionId, appIdentifier);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GooglePay)) {
                return false;
            }
            GooglePay googlePay = (GooglePay) other;
            return Intrinsics.areEqual(this.publicKey, googlePay.publicKey) && Intrinsics.areEqual(this.token, googlePay.token) && Intrinsics.areEqual(this.deviceSessionId, googlePay.deviceSessionId) && Intrinsics.areEqual(this.appIdentifier, googlePay.appIdentifier);
        }

        @Nullable
        public final String getAppIdentifier() {
            return this.appIdentifier;
        }

        @Override // com.checkout.components.interfaces.model.PayRequestPayload
        @Nullable
        public final String getDeviceSessionId() {
            return this.deviceSessionId;
        }

        @NotNull
        public final String getPublicKey() {
            return this.publicKey;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        public final int hashCode() {
            int hashCode;
            int a6 = b.a(this.token, this.publicKey.hashCode() * 31, 31);
            String str = this.deviceSessionId;
            int i4 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i5 = (a6 + hashCode) * 31;
            String str2 = this.appIdentifier;
            if (str2 != null) {
                i4 = str2.hashCode();
            }
            return i5 + i4;
        }

        @NotNull
        public final String toString() {
            String str = this.publicKey;
            String str2 = this.token;
            return j.lima(q.india("GooglePay(publicKey=", str, ", token=", str2, ", deviceSessionId="), this.deviceSessionId, ", appIdentifier=", this.appIdentifier, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePay(@NotNull String publicKey, @NotNull String token, @Nullable String str, @Nullable String str2) {
            super(null);
            Intrinsics.echo(publicKey, "publicKey");
            Intrinsics.echo(token, "token");
            this.publicKey = publicKey;
            this.token = token;
            this.deviceSessionId = str;
            this.appIdentifier = str2;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ^\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010\u000e¨\u00060"}, d2 = {"Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "Lcom/checkout/components/interfaces/model/PayRequestPayload;", "", "token", "tokenReference", "bin", "", "storeForFutureUse", "deviceSessionId", "cvvToken", "appIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getToken", "b", "getTokenReference", "c", "getBin", Constants.INAPP_DATA_TAG, "Z", "getStoreForFutureUse", "e", "getDeviceSessionId", "f", "getCvvToken", "g", "getAppIdentifier", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class RememberMe extends PayRequestPayload {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String token;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String tokenReference;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String bin;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean storeForFutureUse;

        /* renamed from: e, reason: from kotlin metadata */
        private final String deviceSessionId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String cvvToken;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String appIdentifier;

        public /* synthetic */ RememberMe(String str, String str2, String str3, boolean z2, String str4, String str5, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z2, str4, str5, (i4 & 64) != 0 ? null : str6);
        }

        public static /* synthetic */ RememberMe copy$default(RememberMe rememberMe, String str, String str2, String str3, boolean z2, String str4, String str5, String str6, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = rememberMe.token;
            }
            if ((i4 & 2) != 0) {
                str2 = rememberMe.tokenReference;
            }
            if ((i4 & 4) != 0) {
                str3 = rememberMe.bin;
            }
            if ((i4 & 8) != 0) {
                z2 = rememberMe.storeForFutureUse;
            }
            if ((i4 & 16) != 0) {
                str4 = rememberMe.deviceSessionId;
            }
            if ((i4 & 32) != 0) {
                str5 = rememberMe.cvvToken;
            }
            if ((i4 & 64) != 0) {
                str6 = rememberMe.appIdentifier;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            String str10 = str3;
            return rememberMe.copy(str, str2, str10, z2, str9, str7, str8);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTokenReference() {
            return this.tokenReference;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getBin() {
            return this.bin;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getStoreForFutureUse() {
            return this.storeForFutureUse;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getDeviceSessionId() {
            return this.deviceSessionId;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getCvvToken() {
            return this.cvvToken;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getAppIdentifier() {
            return this.appIdentifier;
        }

        @NotNull
        public final RememberMe copy(@NotNull String token, @NotNull String tokenReference, @Nullable String bin, boolean storeForFutureUse, @Nullable String deviceSessionId, @Nullable String cvvToken, @Nullable String appIdentifier) {
            Intrinsics.echo(token, "token");
            Intrinsics.echo(tokenReference, "tokenReference");
            return new RememberMe(token, tokenReference, bin, storeForFutureUse, deviceSessionId, cvvToken, appIdentifier);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RememberMe)) {
                return false;
            }
            RememberMe rememberMe = (RememberMe) other;
            return Intrinsics.areEqual(this.token, rememberMe.token) && Intrinsics.areEqual(this.tokenReference, rememberMe.tokenReference) && Intrinsics.areEqual(this.bin, rememberMe.bin) && this.storeForFutureUse == rememberMe.storeForFutureUse && Intrinsics.areEqual(this.deviceSessionId, rememberMe.deviceSessionId) && Intrinsics.areEqual(this.cvvToken, rememberMe.cvvToken) && Intrinsics.areEqual(this.appIdentifier, rememberMe.appIdentifier);
        }

        @Nullable
        public final String getAppIdentifier() {
            return this.appIdentifier;
        }

        @Nullable
        public final String getBin() {
            return this.bin;
        }

        @Nullable
        public final String getCvvToken() {
            return this.cvvToken;
        }

        @Override // com.checkout.components.interfaces.model.PayRequestPayload
        @Nullable
        public final String getDeviceSessionId() {
            return this.deviceSessionId;
        }

        public final boolean getStoreForFutureUse() {
            return this.storeForFutureUse;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        @NotNull
        public final String getTokenReference() {
            return this.tokenReference;
        }

        public final int hashCode() {
            int hashCode;
            int i4;
            int hashCode2;
            int hashCode3;
            int a6 = b.a(this.tokenReference, this.token.hashCode() * 31, 31);
            String str = this.bin;
            int i5 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (a6 + hashCode) * 31;
            if (this.storeForFutureUse) {
                i4 = 1231;
            } else {
                i4 = 1237;
            }
            int i11 = (i4 + i10) * 31;
            String str2 = this.deviceSessionId;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (i11 + hashCode2) * 31;
            String str3 = this.cvvToken;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i13 = (i12 + hashCode3) * 31;
            String str4 = this.appIdentifier;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i13 + i5;
        }

        @NotNull
        public final String toString() {
            String str = this.token;
            String str2 = this.tokenReference;
            String str3 = this.bin;
            boolean z2 = this.storeForFutureUse;
            String str4 = this.deviceSessionId;
            String str5 = this.cvvToken;
            String str6 = this.appIdentifier;
            StringBuilder india = q.india("RememberMe(token=", str, ", tokenReference=", str2, ", bin=");
            india.append(str3);
            india.append(", storeForFutureUse=");
            india.append(z2);
            india.append(", deviceSessionId=");
            c.azure(india, str4, ", cvvToken=", str5, ", appIdentifier=");
            return P0.gold(india, str6, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RememberMe(@NotNull String token, @NotNull String tokenReference, @Nullable String str, boolean z2, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            super(null);
            Intrinsics.echo(token, "token");
            Intrinsics.echo(tokenReference, "tokenReference");
            this.token = token;
            this.tokenReference = tokenReference;
            this.bin = str;
            this.storeForFutureUse = z2;
            this.deviceSessionId = str2;
            this.cvvToken = str3;
            this.appIdentifier = str4;
        }
    }

    public PayRequestPayload(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @Nullable
    public abstract String getDeviceSessionId();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJH\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/checkout/components/interfaces/model/PayRequestPayload$Apm;", "Lcom/checkout/components/interfaces/model/PayRequestPayload;", "", Constants.KEY_TYPE, "", "", "fields", "deviceSessionId", "appIdentifier", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/PayRequestPayload$Apm;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Ljava/util/Map;", "getFields", "c", "getDeviceSessionId", Constants.INAPP_DATA_TAG, "getAppIdentifier", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Apm extends PayRequestPayload {
        public static final int $stable = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String type;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map fields;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String deviceSessionId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String appIdentifier;

        public /* synthetic */ Apm(String str, Map map, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? t.alpha : map, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Apm copy$default(Apm apm, String str, Map map, String str2, String str3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = apm.type;
            }
            if ((i4 & 2) != 0) {
                map = apm.fields;
            }
            if ((i4 & 4) != 0) {
                str2 = apm.deviceSessionId;
            }
            if ((i4 & 8) != 0) {
                str3 = apm.appIdentifier;
            }
            return apm.copy(str, map, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.fields;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getDeviceSessionId() {
            return this.deviceSessionId;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getAppIdentifier() {
            return this.appIdentifier;
        }

        @NotNull
        public final Apm copy(@NotNull String type, @NotNull Map<String, ? extends Object> fields, @Nullable String deviceSessionId, @Nullable String appIdentifier) {
            Intrinsics.echo(type, "type");
            Intrinsics.echo(fields, "fields");
            return new Apm(type, fields, deviceSessionId, appIdentifier);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Apm)) {
                return false;
            }
            Apm apm = (Apm) other;
            return Intrinsics.areEqual(this.type, apm.type) && Intrinsics.areEqual(this.fields, apm.fields) && Intrinsics.areEqual(this.deviceSessionId, apm.deviceSessionId) && Intrinsics.areEqual(this.appIdentifier, apm.appIdentifier);
        }

        @Nullable
        public final String getAppIdentifier() {
            return this.appIdentifier;
        }

        @Override // com.checkout.components.interfaces.model.PayRequestPayload
        @Nullable
        public final String getDeviceSessionId() {
            return this.deviceSessionId;
        }

        @NotNull
        public final Map<String, Object> getFields() {
            return this.fields;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int hashCode = (this.fields.hashCode() + (this.type.hashCode() * 31)) * 31;
            String str = this.deviceSessionId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.appIdentifier;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            String str = this.type;
            Map map = this.fields;
            String str2 = this.deviceSessionId;
            String str3 = this.appIdentifier;
            StringBuilder sb2 = new StringBuilder("Apm(type=");
            sb2.append(str);
            sb2.append(", fields=");
            sb2.append(map);
            sb2.append(", deviceSessionId=");
            return j.lima(sb2, str2, ", appIdentifier=", str3, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Apm(@NotNull String type, @NotNull Map<String, ? extends Object> fields, @Nullable String str, @Nullable String str2) {
            super(null);
            Intrinsics.echo(type, "type");
            Intrinsics.echo(fields, "fields");
            this.type = type;
            this.fields = fields;
            this.deviceSessionId = str;
            this.appIdentifier = str2;
        }
    }
}
