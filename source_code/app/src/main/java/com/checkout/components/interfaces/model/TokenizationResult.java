package com.checkout.components.interfaces.model;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\f¨\u0006'"}, d2 = {"Lcom/checkout/components/interfaces/model/TokenizationResult;", "", "", Constants.KEY_TYPE, "Lcom/checkout/components/interfaces/model/TokenDetails;", Column.DATA, "Lcom/checkout/components/interfaces/model/CardMetadata;", "cardMetadata", "preferredScheme", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/TokenDetails;Lcom/checkout/components/interfaces/model/CardMetadata;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/interfaces/model/TokenDetails;", "component3", "()Lcom/checkout/components/interfaces/model/CardMetadata;", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/TokenDetails;Lcom/checkout/components/interfaces/model/CardMetadata;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/TokenizationResult;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Lcom/checkout/components/interfaces/model/TokenDetails;", "getData", "c", "Lcom/checkout/components/interfaces/model/CardMetadata;", "getCardMetadata", Constants.INAPP_DATA_TAG, "getPreferredScheme", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class TokenizationResult {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TokenDetails data;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CardMetadata cardMetadata;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String preferredScheme;

    public TokenizationResult(@NotNull String type, @NotNull TokenDetails data, @Nullable CardMetadata cardMetadata, @Nullable String str) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(data, "data");
        this.type = type;
        this.data = data;
        this.cardMetadata = cardMetadata;
        this.preferredScheme = str;
    }

    public static /* synthetic */ TokenizationResult copy$default(TokenizationResult tokenizationResult, String str, TokenDetails tokenDetails, CardMetadata cardMetadata, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tokenizationResult.type;
        }
        if ((i4 & 2) != 0) {
            tokenDetails = tokenizationResult.data;
        }
        if ((i4 & 4) != 0) {
            cardMetadata = tokenizationResult.cardMetadata;
        }
        if ((i4 & 8) != 0) {
            str2 = tokenizationResult.preferredScheme;
        }
        return tokenizationResult.copy(str, tokenDetails, cardMetadata, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TokenDetails getData() {
        return this.data;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final CardMetadata getCardMetadata() {
        return this.cardMetadata;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPreferredScheme() {
        return this.preferredScheme;
    }

    @NotNull
    public final TokenizationResult copy(@NotNull String type, @NotNull TokenDetails data, @Nullable CardMetadata cardMetadata, @Nullable String preferredScheme) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(data, "data");
        return new TokenizationResult(type, data, cardMetadata, preferredScheme);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenizationResult)) {
            return false;
        }
        TokenizationResult tokenizationResult = (TokenizationResult) other;
        return Intrinsics.areEqual(this.type, tokenizationResult.type) && Intrinsics.areEqual(this.data, tokenizationResult.data) && Intrinsics.areEqual(this.cardMetadata, tokenizationResult.cardMetadata) && Intrinsics.areEqual(this.preferredScheme, tokenizationResult.preferredScheme);
    }

    @Nullable
    public final CardMetadata getCardMetadata() {
        return this.cardMetadata;
    }

    @NotNull
    public final TokenDetails getData() {
        return this.data;
    }

    @Nullable
    public final String getPreferredScheme() {
        return this.preferredScheme;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        CardMetadata cardMetadata = this.cardMetadata;
        int hashCode2 = (hashCode + (cardMetadata == null ? 0 : cardMetadata.hashCode())) * 31;
        String str = this.preferredScheme;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "TokenizationResult(type=" + this.type + ", data=" + this.data + ", cardMetadata=" + this.cardMetadata + ", preferredScheme=" + this.preferredScheme + ")";
    }
}
