package com.checkout.components.rememberme.model;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/checkout/components/rememberme/model/CvvTokenPayload;", "", "Lcom/checkout/components/rememberme/model/TokenData;", "tokenData", "", Constants.KEY_TYPE, "<init>", "(Lcom/checkout/components/rememberme/model/TokenData;Ljava/lang/String;)V", "component1", "()Lcom/checkout/components/rememberme/model/TokenData;", "component2", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Lcom/checkout/components/rememberme/model/TokenData;Ljava/lang/String;)Lcom/checkout/components/rememberme/model/CvvTokenPayload;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/rememberme/model/TokenData;", "getTokenData", "getTokenData$annotations", "()V", "b", "Ljava/lang/String;", "getType", "getType$annotations", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CvvTokenPayload {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TokenData tokenData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String type;

    public CvvTokenPayload(@Json(name = "token_data") @NotNull TokenData tokenData, @Json(name = "type") @NotNull String type) {
        Intrinsics.echo(tokenData, "tokenData");
        Intrinsics.echo(type, "type");
        this.tokenData = tokenData;
        this.type = type;
    }

    public static /* synthetic */ CvvTokenPayload copy$default(CvvTokenPayload cvvTokenPayload, TokenData tokenData, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            tokenData = cvvTokenPayload.tokenData;
        }
        if ((i4 & 2) != 0) {
            str = cvvTokenPayload.type;
        }
        return cvvTokenPayload.copy(tokenData, str);
    }

    @Json(name = "token_data")
    public static /* synthetic */ void getTokenData$annotations() {
    }

    @Json(name = Constants.KEY_TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TokenData getTokenData() {
        return this.tokenData;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final CvvTokenPayload copy(@Json(name = "token_data") @NotNull TokenData tokenData, @Json(name = "type") @NotNull String type) {
        Intrinsics.echo(tokenData, "tokenData");
        Intrinsics.echo(type, "type");
        return new CvvTokenPayload(tokenData, type);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvvTokenPayload)) {
            return false;
        }
        CvvTokenPayload cvvTokenPayload = (CvvTokenPayload) other;
        return Intrinsics.areEqual(this.tokenData, cvvTokenPayload.tokenData) && Intrinsics.areEqual(this.type, cvvTokenPayload.type);
    }

    @NotNull
    public final TokenData getTokenData() {
        return this.tokenData;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.tokenData.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CvvTokenPayload(tokenData=" + this.tokenData + ", type=" + this.type + ")";
    }

    public /* synthetic */ CvvTokenPayload(TokenData tokenData, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenData, (i4 & 2) != 0 ? com.checkout.components.rememberme.utils.Constants.CVV_TYPE : str);
    }
}
