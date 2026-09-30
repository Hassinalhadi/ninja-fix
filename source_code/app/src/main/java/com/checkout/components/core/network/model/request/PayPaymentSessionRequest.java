package com.checkout.components.core.network.model.request;

import ao.ad;
import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "", "GooglePay", "Card", "RememberMe", "Apm", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Apm;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Card;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$RememberMe;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PayPaymentSessionRequest {
    public static final int $stable = 0;

    public PayPaymentSessionRequest(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Apm;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "", Constants.KEY_TYPE, "", "", "fields", "Lcom/checkout/components/core/network/model/request/SessionMetaData;", "sessionMetaData", "Lcom/checkout/components/core/network/model/request/Risk;", "risk", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/checkout/components/core/network/model/request/SessionMetaData;Lcom/checkout/components/core/network/model/request/Risk;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/checkout/components/core/network/model/request/SessionMetaData;", "component4", "()Lcom/checkout/components/core/network/model/request/Risk;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/util/Map;Lcom/checkout/components/core/network/model/request/SessionMetaData;Lcom/checkout/components/core/network/model/request/Risk;)Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Apm;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Ljava/util/Map;", "getFields", "c", "Lcom/checkout/components/core/network/model/request/SessionMetaData;", "getSessionMetaData", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/core/network/model/request/Risk;", "getRisk", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Apm extends PayPaymentSessionRequest {
        public static final int $stable = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String type;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map fields;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final SessionMetaData sessionMetaData;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Risk risk;

        public /* synthetic */ Apm(String str, Map map, SessionMetaData sessionMetaData, Risk risk, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? t.alpha : map, (i4 & 4) != 0 ? null : sessionMetaData, (i4 & 8) != 0 ? null : risk);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Apm copy$default(Apm apm, String str, Map map, SessionMetaData sessionMetaData, Risk risk, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = apm.type;
            }
            if ((i4 & 2) != 0) {
                map = apm.fields;
            }
            if ((i4 & 4) != 0) {
                sessionMetaData = apm.sessionMetaData;
            }
            if ((i4 & 8) != 0) {
                risk = apm.risk;
            }
            return apm.copy(str, map, sessionMetaData, risk);
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
        public final SessionMetaData getSessionMetaData() {
            return this.sessionMetaData;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Risk getRisk() {
            return this.risk;
        }

        @NotNull
        public final Apm copy(@NotNull String type, @NotNull Map<String, ? extends Object> fields, @Nullable SessionMetaData sessionMetaData, @Nullable Risk risk) {
            Intrinsics.echo(type, "type");
            Intrinsics.echo(fields, "fields");
            return new Apm(type, fields, sessionMetaData, risk);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Apm)) {
                return false;
            }
            Apm apm = (Apm) other;
            return Intrinsics.areEqual(this.type, apm.type) && Intrinsics.areEqual(this.fields, apm.fields) && Intrinsics.areEqual(this.sessionMetaData, apm.sessionMetaData) && Intrinsics.areEqual(this.risk, apm.risk);
        }

        @NotNull
        public final Map<String, Object> getFields() {
            return this.fields;
        }

        @Nullable
        public final Risk getRisk() {
            return this.risk;
        }

        @Nullable
        public final SessionMetaData getSessionMetaData() {
            return this.sessionMetaData;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int hashCode = (this.fields.hashCode() + (this.type.hashCode() * 31)) * 31;
            SessionMetaData sessionMetaData = this.sessionMetaData;
            int hashCode2 = (hashCode + (sessionMetaData == null ? 0 : sessionMetaData.hashCode())) * 31;
            Risk risk = this.risk;
            return hashCode2 + (risk != null ? risk.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Apm(type=" + this.type + ", fields=" + this.fields + ", sessionMetaData=" + this.sessionMetaData + ", risk=" + this.risk + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Apm(@NotNull String type, @NotNull Map<String, ? extends Object> fields, @Nullable SessionMetaData sessionMetaData, @Nullable Risk risk) {
            super(null);
            Intrinsics.echo(type, "type");
            Intrinsics.echo(fields, "fields");
            this.type = type;
            this.fields = fields;
            this.sessionMetaData = sessionMetaData;
            this.risk = risk;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJP\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0011R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001b¨\u0006<"}, d2 = {"Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Card;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "Lcom/checkout/components/core/network/model/request/CardMetadata;", "cardMetadata", "Lcom/checkout/components/core/network/model/request/SessionMetaData;", "sessionMetaData", "Lcom/checkout/components/core/network/model/request/Processing;", "processing", "Lcom/checkout/components/core/network/model/request/Source;", "source", "", Constants.KEY_TYPE, "Lcom/checkout/components/core/network/model/request/Risk;", "risk", "<init>", "(Lcom/checkout/components/core/network/model/request/CardMetadata;Lcom/checkout/components/core/network/model/request/SessionMetaData;Lcom/checkout/components/core/network/model/request/Processing;Lcom/checkout/components/core/network/model/request/Source;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/Risk;)V", "component1", "()Lcom/checkout/components/core/network/model/request/CardMetadata;", "component2", "()Lcom/checkout/components/core/network/model/request/SessionMetaData;", "component3", "()Lcom/checkout/components/core/network/model/request/Processing;", "component4", "()Lcom/checkout/components/core/network/model/request/Source;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/checkout/components/core/network/model/request/Risk;", Constants.COPY_TYPE, "(Lcom/checkout/components/core/network/model/request/CardMetadata;Lcom/checkout/components/core/network/model/request/SessionMetaData;Lcom/checkout/components/core/network/model/request/Processing;Lcom/checkout/components/core/network/model/request/Source;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/Risk;)Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$Card;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/core/network/model/request/CardMetadata;", "getCardMetadata", "getCardMetadata$annotations", "()V", "b", "Lcom/checkout/components/core/network/model/request/SessionMetaData;", "getSessionMetaData", "getSessionMetaData$annotations", "c", "Lcom/checkout/components/core/network/model/request/Processing;", "getProcessing", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/core/network/model/request/Source;", "getSource", "e", "Ljava/lang/String;", "getType", "f", "Lcom/checkout/components/core/network/model/request/Risk;", "getRisk", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Card extends PayPaymentSessionRequest {
        public static final int $stable = PhoneNetworkEntity.$stable | BillingAddressNetworkEntity.$stable;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CardMetadata cardMetadata;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SessionMetaData sessionMetaData;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Processing processing;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Source source;

        /* renamed from: e, reason: from kotlin metadata */
        private final String type;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Risk risk;

        public /* synthetic */ Card(CardMetadata cardMetadata, SessionMetaData sessionMetaData, Processing processing, Source source, String str, Risk risk, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(cardMetadata, sessionMetaData, (i4 & 4) != 0 ? null : processing, source, (i4 & 16) != 0 ? PaymentMethodName.INSTANCE.getCard().getValue() : str, (i4 & 32) != 0 ? null : risk);
        }

        public static /* synthetic */ Card copy$default(Card card, CardMetadata cardMetadata, SessionMetaData sessionMetaData, Processing processing, Source source, String str, Risk risk, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                cardMetadata = card.cardMetadata;
            }
            if ((i4 & 2) != 0) {
                sessionMetaData = card.sessionMetaData;
            }
            if ((i4 & 4) != 0) {
                processing = card.processing;
            }
            if ((i4 & 8) != 0) {
                source = card.source;
            }
            if ((i4 & 16) != 0) {
                str = card.type;
            }
            if ((i4 & 32) != 0) {
                risk = card.risk;
            }
            String str2 = str;
            Risk risk2 = risk;
            return card.copy(cardMetadata, sessionMetaData, processing, source, str2, risk2);
        }

        @Json(name = "card_metadata")
        public static /* synthetic */ void getCardMetadata$annotations() {
        }

        @Json(name = "session_metadata")
        public static /* synthetic */ void getSessionMetaData$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CardMetadata getCardMetadata() {
            return this.cardMetadata;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SessionMetaData getSessionMetaData() {
            return this.sessionMetaData;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Processing getProcessing() {
            return this.processing;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Source getSource() {
            return this.source;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Risk getRisk() {
            return this.risk;
        }

        @NotNull
        public final Card copy(@Json(name = "card_metadata") @NotNull CardMetadata cardMetadata, @Json(name = "session_metadata") @NotNull SessionMetaData sessionMetaData, @Nullable Processing processing, @NotNull Source source, @NotNull String type, @Nullable Risk risk) {
            Intrinsics.echo(cardMetadata, "cardMetadata");
            Intrinsics.echo(sessionMetaData, "sessionMetaData");
            Intrinsics.echo(source, "source");
            Intrinsics.echo(type, "type");
            return new Card(cardMetadata, sessionMetaData, processing, source, type, risk);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.cardMetadata, card.cardMetadata) && Intrinsics.areEqual(this.sessionMetaData, card.sessionMetaData) && Intrinsics.areEqual(this.processing, card.processing) && Intrinsics.areEqual(this.source, card.source) && Intrinsics.areEqual(this.type, card.type) && Intrinsics.areEqual(this.risk, card.risk);
        }

        @NotNull
        public final CardMetadata getCardMetadata() {
            return this.cardMetadata;
        }

        @Nullable
        public final Processing getProcessing() {
            return this.processing;
        }

        @Nullable
        public final Risk getRisk() {
            return this.risk;
        }

        @NotNull
        public final SessionMetaData getSessionMetaData() {
            return this.sessionMetaData;
        }

        @NotNull
        public final Source getSource() {
            return this.source;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.sessionMetaData.hashCode() + (this.cardMetadata.hashCode() * 31)) * 31;
            Processing processing = this.processing;
            int i4 = 0;
            if (processing == null) {
                hashCode = 0;
            } else {
                hashCode = processing.hashCode();
            }
            int sierra = AbstractC2327c.sierra((this.source.hashCode() + ((hashCode2 + hashCode) * 31)) * 31, 31, this.type);
            Risk risk = this.risk;
            if (risk != null) {
                i4 = risk.hashCode();
            }
            return sierra + i4;
        }

        @NotNull
        public final String toString() {
            return "Card(cardMetadata=" + this.cardMetadata + ", sessionMetaData=" + this.sessionMetaData + ", processing=" + this.processing + ", source=" + this.source + ", type=" + this.type + ", risk=" + this.risk + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(@Json(name = "card_metadata") @NotNull CardMetadata cardMetadata, @Json(name = "session_metadata") @NotNull SessionMetaData sessionMetaData, @Nullable Processing processing, @NotNull Source source, @NotNull String type, @Nullable Risk risk) {
            super(null);
            Intrinsics.echo(cardMetadata, "cardMetadata");
            Intrinsics.echo(sessionMetaData, "sessionMetaData");
            Intrinsics.echo(source, "source");
            Intrinsics.echo(type, "type");
            this.cardMetadata = cardMetadata;
            this.sessionMetaData = sessionMetaData;
            this.processing = processing;
            this.source = source;
            this.type = type;
            this.risk = risk;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001:\u0001=BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJP\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0011R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u0013R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001b¨\u0006>"}, d2 = {"Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay$GooglePayMetadata;", "metadata", "Lcom/checkout/components/core/network/model/request/SessionMetaData;", "sessionMetaData", "Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;", "configurationOverrides", "Lcom/checkout/components/core/network/model/request/Source;", "source", "", Constants.KEY_TYPE, "Lcom/checkout/components/core/network/model/request/Risk;", "risk", "<init>", "(Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay$GooglePayMetadata;Lcom/checkout/components/core/network/model/request/SessionMetaData;Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;Lcom/checkout/components/core/network/model/request/Source;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/Risk;)V", "component1", "()Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay$GooglePayMetadata;", "component2", "()Lcom/checkout/components/core/network/model/request/SessionMetaData;", "component3", "()Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;", "component4", "()Lcom/checkout/components/core/network/model/request/Source;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/checkout/components/core/network/model/request/Risk;", Constants.COPY_TYPE, "(Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay$GooglePayMetadata;Lcom/checkout/components/core/network/model/request/SessionMetaData;Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;Lcom/checkout/components/core/network/model/request/Source;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/Risk;)Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay$GooglePayMetadata;", "getMetadata", "getMetadata$annotations", "()V", "b", "Lcom/checkout/components/core/network/model/request/SessionMetaData;", "getSessionMetaData", "getSessionMetaData$annotations", "c", "Lcom/checkout/components/core/network/model/request/ConfigurationOverrides;", "getConfigurationOverrides", "getConfigurationOverrides$annotations", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/core/network/model/request/Source;", "getSource", "e", "Ljava/lang/String;", "getType", "f", "Lcom/checkout/components/core/network/model/request/Risk;", "getRisk", "GooglePayMetadata", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class GooglePay extends PayPaymentSessionRequest {
        public static final int $stable = PhoneNetworkEntity.$stable | BillingAddressNetworkEntity.$stable;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final GooglePayMetadata metadata;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SessionMetaData sessionMetaData;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ConfigurationOverrides configurationOverrides;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Source source;

        /* renamed from: e, reason: from kotlin metadata */
        private final String type;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Risk risk;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay$GooglePayMetadata;", "", "", "gatewayMerchantID", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$GooglePay$GooglePayMetadata;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getGatewayMerchantID", "getGatewayMerchantID$annotations", "()V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class GooglePayMetadata {
            public static final int $stable = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String gatewayMerchantID;

            public GooglePayMetadata(@Json(name = "gateway_merchant_id") @NotNull String gatewayMerchantID) {
                Intrinsics.echo(gatewayMerchantID, "gatewayMerchantID");
                this.gatewayMerchantID = gatewayMerchantID;
            }

            public static /* synthetic */ GooglePayMetadata copy$default(GooglePayMetadata googlePayMetadata, String str, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = googlePayMetadata.gatewayMerchantID;
                }
                return googlePayMetadata.copy(str);
            }

            @Json(name = "gateway_merchant_id")
            public static /* synthetic */ void getGatewayMerchantID$annotations() {
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getGatewayMerchantID() {
                return this.gatewayMerchantID;
            }

            @NotNull
            public final GooglePayMetadata copy(@Json(name = "gateway_merchant_id") @NotNull String gatewayMerchantID) {
                Intrinsics.echo(gatewayMerchantID, "gatewayMerchantID");
                return new GooglePayMetadata(gatewayMerchantID);
            }

            public final boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GooglePayMetadata) && Intrinsics.areEqual(this.gatewayMerchantID, ((GooglePayMetadata) other).gatewayMerchantID);
            }

            @NotNull
            public final String getGatewayMerchantID() {
                return this.gatewayMerchantID;
            }

            public final int hashCode() {
                return this.gatewayMerchantID.hashCode();
            }

            @NotNull
            public final String toString() {
                return ad.gray("GooglePayMetadata(gatewayMerchantID=", this.gatewayMerchantID, ")");
            }
        }

        public /* synthetic */ GooglePay(GooglePayMetadata googlePayMetadata, SessionMetaData sessionMetaData, ConfigurationOverrides configurationOverrides, Source source, String str, Risk risk, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(googlePayMetadata, sessionMetaData, (i4 & 4) != 0 ? null : configurationOverrides, source, (i4 & 16) != 0 ? PaymentMethodName.INSTANCE.getGooglePay().getValue() : str, (i4 & 32) != 0 ? null : risk);
        }

        public static /* synthetic */ GooglePay copy$default(GooglePay googlePay, GooglePayMetadata googlePayMetadata, SessionMetaData sessionMetaData, ConfigurationOverrides configurationOverrides, Source source, String str, Risk risk, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                googlePayMetadata = googlePay.metadata;
            }
            if ((i4 & 2) != 0) {
                sessionMetaData = googlePay.sessionMetaData;
            }
            if ((i4 & 4) != 0) {
                configurationOverrides = googlePay.configurationOverrides;
            }
            if ((i4 & 8) != 0) {
                source = googlePay.source;
            }
            if ((i4 & 16) != 0) {
                str = googlePay.type;
            }
            if ((i4 & 32) != 0) {
                risk = googlePay.risk;
            }
            String str2 = str;
            Risk risk2 = risk;
            return googlePay.copy(googlePayMetadata, sessionMetaData, configurationOverrides, source, str2, risk2);
        }

        @Json(name = "configuration_overrides")
        public static /* synthetic */ void getConfigurationOverrides$annotations() {
        }

        @Json(name = "googlepay_metadata")
        public static /* synthetic */ void getMetadata$annotations() {
        }

        @Json(name = "session_metadata")
        public static /* synthetic */ void getSessionMetaData$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final GooglePayMetadata getMetadata() {
            return this.metadata;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SessionMetaData getSessionMetaData() {
            return this.sessionMetaData;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final ConfigurationOverrides getConfigurationOverrides() {
            return this.configurationOverrides;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Source getSource() {
            return this.source;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Risk getRisk() {
            return this.risk;
        }

        @NotNull
        public final GooglePay copy(@Json(name = "googlepay_metadata") @NotNull GooglePayMetadata metadata, @Json(name = "session_metadata") @NotNull SessionMetaData sessionMetaData, @Json(name = "configuration_overrides") @Nullable ConfigurationOverrides configurationOverrides, @NotNull Source source, @NotNull String type, @Nullable Risk risk) {
            Intrinsics.echo(metadata, "metadata");
            Intrinsics.echo(sessionMetaData, "sessionMetaData");
            Intrinsics.echo(source, "source");
            Intrinsics.echo(type, "type");
            return new GooglePay(metadata, sessionMetaData, configurationOverrides, source, type, risk);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GooglePay)) {
                return false;
            }
            GooglePay googlePay = (GooglePay) other;
            return Intrinsics.areEqual(this.metadata, googlePay.metadata) && Intrinsics.areEqual(this.sessionMetaData, googlePay.sessionMetaData) && Intrinsics.areEqual(this.configurationOverrides, googlePay.configurationOverrides) && Intrinsics.areEqual(this.source, googlePay.source) && Intrinsics.areEqual(this.type, googlePay.type) && Intrinsics.areEqual(this.risk, googlePay.risk);
        }

        @Nullable
        public final ConfigurationOverrides getConfigurationOverrides() {
            return this.configurationOverrides;
        }

        @NotNull
        public final GooglePayMetadata getMetadata() {
            return this.metadata;
        }

        @Nullable
        public final Risk getRisk() {
            return this.risk;
        }

        @NotNull
        public final SessionMetaData getSessionMetaData() {
            return this.sessionMetaData;
        }

        @NotNull
        public final Source getSource() {
            return this.source;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.sessionMetaData.hashCode() + (this.metadata.hashCode() * 31)) * 31;
            ConfigurationOverrides configurationOverrides = this.configurationOverrides;
            int i4 = 0;
            if (configurationOverrides == null) {
                hashCode = 0;
            } else {
                hashCode = configurationOverrides.hashCode();
            }
            int sierra = AbstractC2327c.sierra((this.source.hashCode() + ((hashCode2 + hashCode) * 31)) * 31, 31, this.type);
            Risk risk = this.risk;
            if (risk != null) {
                i4 = risk.hashCode();
            }
            return sierra + i4;
        }

        @NotNull
        public final String toString() {
            return "GooglePay(metadata=" + this.metadata + ", sessionMetaData=" + this.sessionMetaData + ", configurationOverrides=" + this.configurationOverrides + ", source=" + this.source + ", type=" + this.type + ", risk=" + this.risk + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePay(@Json(name = "googlepay_metadata") @NotNull GooglePayMetadata metadata, @Json(name = "session_metadata") @NotNull SessionMetaData sessionMetaData, @Json(name = "configuration_overrides") @Nullable ConfigurationOverrides configurationOverrides, @NotNull Source source, @NotNull String type, @Nullable Risk risk) {
            super(null);
            Intrinsics.echo(metadata, "metadata");
            Intrinsics.echo(sessionMetaData, "sessionMetaData");
            Intrinsics.echo(source, "source");
            Intrinsics.echo(type, "type");
            this.metadata = metadata;
            this.sessionMetaData = sessionMetaData;
            this.configurationOverrides = configurationOverrides;
            this.source = source;
            this.type = type;
            this.risk = risk;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010\u001c\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0013R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001b¨\u0006<"}, d2 = {"Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$RememberMe;", "Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest;", "Lcom/checkout/components/core/network/model/request/CardMetadata;", "cardMetadata", "Lcom/checkout/components/core/network/model/request/Processing;", "processing", "Lcom/checkout/components/core/network/model/request/SessionMetaData;", "sessionMetaData", "Lcom/checkout/components/core/network/model/request/RememberMeSource;", "source", "", Constants.KEY_TYPE, "Lcom/checkout/components/core/network/model/request/Risk;", "risk", "<init>", "(Lcom/checkout/components/core/network/model/request/CardMetadata;Lcom/checkout/components/core/network/model/request/Processing;Lcom/checkout/components/core/network/model/request/SessionMetaData;Lcom/checkout/components/core/network/model/request/RememberMeSource;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/Risk;)V", "component1", "()Lcom/checkout/components/core/network/model/request/CardMetadata;", "component2", "()Lcom/checkout/components/core/network/model/request/Processing;", "component3", "()Lcom/checkout/components/core/network/model/request/SessionMetaData;", "component4", "()Lcom/checkout/components/core/network/model/request/RememberMeSource;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/checkout/components/core/network/model/request/Risk;", Constants.COPY_TYPE, "(Lcom/checkout/components/core/network/model/request/CardMetadata;Lcom/checkout/components/core/network/model/request/Processing;Lcom/checkout/components/core/network/model/request/SessionMetaData;Lcom/checkout/components/core/network/model/request/RememberMeSource;Ljava/lang/String;Lcom/checkout/components/core/network/model/request/Risk;)Lcom/checkout/components/core/network/model/request/PayPaymentSessionRequest$RememberMe;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/core/network/model/request/CardMetadata;", "getCardMetadata", "getCardMetadata$annotations", "()V", "b", "Lcom/checkout/components/core/network/model/request/Processing;", "getProcessing", "c", "Lcom/checkout/components/core/network/model/request/SessionMetaData;", "getSessionMetaData", "getSessionMetaData$annotations", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/core/network/model/request/RememberMeSource;", "getSource", "e", "Ljava/lang/String;", "getType", "f", "Lcom/checkout/components/core/network/model/request/Risk;", "getRisk", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class RememberMe extends PayPaymentSessionRequest {
        public static final int $stable = BillingAddressNetworkEntity.$stable;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CardMetadata cardMetadata;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Processing processing;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final SessionMetaData sessionMetaData;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final RememberMeSource source;

        /* renamed from: e, reason: from kotlin metadata */
        private final String type;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Risk risk;

        public /* synthetic */ RememberMe(CardMetadata cardMetadata, Processing processing, SessionMetaData sessionMetaData, RememberMeSource rememberMeSource, String str, Risk risk, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(cardMetadata, (i4 & 2) != 0 ? null : processing, sessionMetaData, rememberMeSource, (i4 & 16) != 0 ? PaymentMethodName.INSTANCE.getRememberMe().getValue() : str, (i4 & 32) != 0 ? null : risk);
        }

        public static /* synthetic */ RememberMe copy$default(RememberMe rememberMe, CardMetadata cardMetadata, Processing processing, SessionMetaData sessionMetaData, RememberMeSource rememberMeSource, String str, Risk risk, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                cardMetadata = rememberMe.cardMetadata;
            }
            if ((i4 & 2) != 0) {
                processing = rememberMe.processing;
            }
            if ((i4 & 4) != 0) {
                sessionMetaData = rememberMe.sessionMetaData;
            }
            if ((i4 & 8) != 0) {
                rememberMeSource = rememberMe.source;
            }
            if ((i4 & 16) != 0) {
                str = rememberMe.type;
            }
            if ((i4 & 32) != 0) {
                risk = rememberMe.risk;
            }
            String str2 = str;
            Risk risk2 = risk;
            return rememberMe.copy(cardMetadata, processing, sessionMetaData, rememberMeSource, str2, risk2);
        }

        @Json(name = "card_metadata")
        public static /* synthetic */ void getCardMetadata$annotations() {
        }

        @Json(name = "session_metadata")
        public static /* synthetic */ void getSessionMetaData$annotations() {
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final CardMetadata getCardMetadata() {
            return this.cardMetadata;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Processing getProcessing() {
            return this.processing;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final SessionMetaData getSessionMetaData() {
            return this.sessionMetaData;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final RememberMeSource getSource() {
            return this.source;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Risk getRisk() {
            return this.risk;
        }

        @NotNull
        public final RememberMe copy(@Json(name = "card_metadata") @Nullable CardMetadata cardMetadata, @Nullable Processing processing, @Json(name = "session_metadata") @NotNull SessionMetaData sessionMetaData, @NotNull RememberMeSource source, @NotNull String type, @Nullable Risk risk) {
            Intrinsics.echo(sessionMetaData, "sessionMetaData");
            Intrinsics.echo(source, "source");
            Intrinsics.echo(type, "type");
            return new RememberMe(cardMetadata, processing, sessionMetaData, source, type, risk);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RememberMe)) {
                return false;
            }
            RememberMe rememberMe = (RememberMe) other;
            return Intrinsics.areEqual(this.cardMetadata, rememberMe.cardMetadata) && Intrinsics.areEqual(this.processing, rememberMe.processing) && Intrinsics.areEqual(this.sessionMetaData, rememberMe.sessionMetaData) && Intrinsics.areEqual(this.source, rememberMe.source) && Intrinsics.areEqual(this.type, rememberMe.type) && Intrinsics.areEqual(this.risk, rememberMe.risk);
        }

        @Nullable
        public final CardMetadata getCardMetadata() {
            return this.cardMetadata;
        }

        @Nullable
        public final Processing getProcessing() {
            return this.processing;
        }

        @Nullable
        public final Risk getRisk() {
            return this.risk;
        }

        @NotNull
        public final SessionMetaData getSessionMetaData() {
            return this.sessionMetaData;
        }

        @NotNull
        public final RememberMeSource getSource() {
            return this.source;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            CardMetadata cardMetadata = this.cardMetadata;
            int i4 = 0;
            if (cardMetadata == null) {
                hashCode = 0;
            } else {
                hashCode = cardMetadata.hashCode();
            }
            int i5 = hashCode * 31;
            Processing processing = this.processing;
            if (processing == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = processing.hashCode();
            }
            int sierra = AbstractC2327c.sierra((this.source.hashCode() + ((this.sessionMetaData.hashCode() + ((i5 + hashCode2) * 31)) * 31)) * 31, 31, this.type);
            Risk risk = this.risk;
            if (risk != null) {
                i4 = risk.hashCode();
            }
            return sierra + i4;
        }

        @NotNull
        public final String toString() {
            return "RememberMe(cardMetadata=" + this.cardMetadata + ", processing=" + this.processing + ", sessionMetaData=" + this.sessionMetaData + ", source=" + this.source + ", type=" + this.type + ", risk=" + this.risk + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RememberMe(@Json(name = "card_metadata") @Nullable CardMetadata cardMetadata, @Nullable Processing processing, @Json(name = "session_metadata") @NotNull SessionMetaData sessionMetaData, @NotNull RememberMeSource source, @NotNull String type, @Nullable Risk risk) {
            super(null);
            Intrinsics.echo(sessionMetaData, "sessionMetaData");
            Intrinsics.echo(source, "source");
            Intrinsics.echo(type, "type");
            this.cardMetadata = cardMetadata;
            this.processing = processing;
            this.sessionMetaData = sessionMetaData;
            this.source = source;
            this.type = type;
            this.risk = risk;
        }
    }
}
