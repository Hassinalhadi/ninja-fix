package com.app.network.network.models;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%¨\u0006*"}, d2 = {"Lcom/app/network/network/models/Envelop;", "", "<init>", "()V", "envelopsCount", "", "getEnvelopsCount", "()I", "setEnvelopsCount", "(I)V", "privacyPolicyUrl", "", "getPrivacyPolicyUrl", "()Ljava/lang/String;", "setPrivacyPolicyUrl", "(Ljava/lang/String;)V", "trainingUrl", "getTrainingUrl", "setTrainingUrl", "faqUrl", "getFaqUrl", "setFaqUrl", "storeUrl", "getStoreUrl", "setStoreUrl", "referralProgramEnabled", "", "getReferralProgramEnabled", "()Ljava/lang/Boolean;", "setReferralProgramEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "locationFastestInterval", "", "getLocationFastestInterval", "()Ljava/lang/Long;", "setLocationFastestInterval", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "locationInterval", "getLocationInterval", "setLocationInterval", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Envelop {
    private int envelopsCount;

    @Nullable
    private String faqUrl;

    @Nullable
    private Long locationFastestInterval;

    @Nullable
    private Long locationInterval;

    @Nullable
    private String privacyPolicyUrl;

    @Nullable
    private Boolean referralProgramEnabled;

    @Nullable
    private String storeUrl;

    @Nullable
    private String trainingUrl;

    public final int getEnvelopsCount() {
        return this.envelopsCount;
    }

    @Nullable
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    @Nullable
    public final Long getLocationFastestInterval() {
        return this.locationFastestInterval;
    }

    @Nullable
    public final Long getLocationInterval() {
        return this.locationInterval;
    }

    @Nullable
    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    @Nullable
    public final Boolean getReferralProgramEnabled() {
        return this.referralProgramEnabled;
    }

    @Nullable
    public final String getStoreUrl() {
        return this.storeUrl;
    }

    @Nullable
    public final String getTrainingUrl() {
        return this.trainingUrl;
    }

    public final void setEnvelopsCount(int i4) {
        this.envelopsCount = i4;
    }

    public final void setFaqUrl(@Nullable String str) {
        this.faqUrl = str;
    }

    public final void setLocationFastestInterval(@Nullable Long l10) {
        this.locationFastestInterval = l10;
    }

    public final void setLocationInterval(@Nullable Long l10) {
        this.locationInterval = l10;
    }

    public final void setPrivacyPolicyUrl(@Nullable String str) {
        this.privacyPolicyUrl = str;
    }

    public final void setReferralProgramEnabled(@Nullable Boolean bool) {
        this.referralProgramEnabled = bool;
    }

    public final void setStoreUrl(@Nullable String str) {
        this.storeUrl = str;
    }

    public final void setTrainingUrl(@Nullable String str) {
        this.trainingUrl = str;
    }
}
