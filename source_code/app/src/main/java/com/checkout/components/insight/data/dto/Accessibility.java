package com.checkout.components.insight.data.dto;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/insight/data/dto/Accessibility;", "", "", "largeText", "<init>", "(Z)V", "component1", "()Z", Constants.COPY_TYPE, "(Z)Lcom/checkout/components/insight/data/dto/Accessibility;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getLargeText", "getLargeText$annotations", "()V", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Accessibility {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean largeText;

    public Accessibility(@Json(name = "large_text") boolean z2) {
        this.largeText = z2;
    }

    public static /* synthetic */ Accessibility copy$default(Accessibility accessibility, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = accessibility.largeText;
        }
        return accessibility.copy(z2);
    }

    @Json(name = "large_text")
    public static /* synthetic */ void getLargeText$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLargeText() {
        return this.largeText;
    }

    public final Accessibility copy(@Json(name = "large_text") boolean largeText) {
        return new Accessibility(largeText);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Accessibility) && this.largeText == ((Accessibility) other).largeText;
    }

    public final boolean getLargeText() {
        return this.largeText;
    }

    public final int hashCode() {
        return this.largeText ? 1231 : 1237;
    }

    public final String toString() {
        return "Accessibility(largeText=" + this.largeText + ")";
    }
}
