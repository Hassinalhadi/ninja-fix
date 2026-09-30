package com.checkout.components.rememberme.model;

import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\tR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\tR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u0012\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\t¨\u0006!"}, d2 = {"Lcom/checkout/components/rememberme/model/CvvTokenResponse;", "", "", "expiresOn", "token", Constants.KEY_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/rememberme/model/CvvTokenResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getExpiresOn", "getExpiresOn$annotations", "()V", "b", "getToken", "getToken$annotations", "c", "getType", "getType$annotations", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CvvTokenResponse {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String expiresOn;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String token;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String type;

    public CvvTokenResponse(@Json(name = "expires_on") @NotNull String expiresOn, @Json(name = "token") @NotNull String token, @Json(name = "type") @NotNull String type) {
        Intrinsics.echo(expiresOn, "expiresOn");
        Intrinsics.echo(token, "token");
        Intrinsics.echo(type, "type");
        this.expiresOn = expiresOn;
        this.token = token;
        this.type = type;
    }

    public static /* synthetic */ CvvTokenResponse copy$default(CvvTokenResponse cvvTokenResponse, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cvvTokenResponse.expiresOn;
        }
        if ((i4 & 2) != 0) {
            str2 = cvvTokenResponse.token;
        }
        if ((i4 & 4) != 0) {
            str3 = cvvTokenResponse.type;
        }
        return cvvTokenResponse.copy(str, str2, str3);
    }

    @Json(name = "expires_on")
    public static /* synthetic */ void getExpiresOn$annotations() {
    }

    @Json(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @Json(name = Constants.KEY_TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getExpiresOn() {
        return this.expiresOn;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final CvvTokenResponse copy(@Json(name = "expires_on") @NotNull String expiresOn, @Json(name = "token") @NotNull String token, @Json(name = "type") @NotNull String type) {
        Intrinsics.echo(expiresOn, "expiresOn");
        Intrinsics.echo(token, "token");
        Intrinsics.echo(type, "type");
        return new CvvTokenResponse(expiresOn, token, type);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvvTokenResponse)) {
            return false;
        }
        CvvTokenResponse cvvTokenResponse = (CvvTokenResponse) other;
        return Intrinsics.areEqual(this.expiresOn, cvvTokenResponse.expiresOn) && Intrinsics.areEqual(this.token, cvvTokenResponse.token) && Intrinsics.areEqual(this.type, cvvTokenResponse.type);
    }

    @NotNull
    public final String getExpiresOn() {
        return this.expiresOn;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + AbstractC2327c.sierra(this.expiresOn.hashCode() * 31, 31, this.token);
    }

    @NotNull
    public final String toString() {
        String str = this.expiresOn;
        String str2 = this.token;
        return P0.gold(q.india("CvvTokenResponse(expiresOn=", str, ", token=", str2, ", type="), this.type, ")");
    }
}
