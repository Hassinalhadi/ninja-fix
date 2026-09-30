package com.incognia;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/incognia/OnboardingEvent;", "", "accountId", "", "externalId", "address", "Lcom/incognia/EventAddress;", "tag", "properties", "Lcom/incognia/EventProperties;", "status", "(Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventAddress;Ljava/lang/String;Lcom/incognia/EventProperties;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getAddress", "()Lcom/incognia/EventAddress;", "getExternalId", "getProperties", "()Lcom/incognia/EventProperties;", "getStatus", "getTag", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Builder", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OnboardingEvent {
    private final String accountId;
    private final EventAddress address;
    private final String externalId;
    private final EventProperties properties;
    private final String status;
    private final String tag;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/incognia/OnboardingEvent$Builder;", "", "()V", "accountId", "", "address", "Lcom/incognia/EventAddress;", "externalId", "properties", "Lcom/incognia/EventProperties;", "status", "tag", "build", "Lcom/incognia/OnboardingEvent;", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String accountId;
        private EventAddress address;
        private String externalId;
        private EventProperties properties;
        private String status;
        private String tag;

        public final Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public final Builder address(EventAddress address) {
            this.address = address;
            return this;
        }

        public final OnboardingEvent build() {
            return new OnboardingEvent(this.accountId, this.externalId, this.address, this.tag, this.properties, this.status);
        }

        public final Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public final Builder properties(EventProperties properties) {
            this.properties = properties;
            return this;
        }

        public final Builder status(String status) {
            this.status = status;
            return this;
        }

        public final Builder tag(String tag) {
            this.tag = tag;
            return this;
        }
    }

    public OnboardingEvent() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OnboardingEvent copy$default(OnboardingEvent onboardingEvent, String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = onboardingEvent.accountId;
        }
        if ((i4 & 2) != 0) {
            str2 = onboardingEvent.externalId;
        }
        if ((i4 & 4) != 0) {
            eventAddress = onboardingEvent.address;
        }
        if ((i4 & 8) != 0) {
            str3 = onboardingEvent.tag;
        }
        if ((i4 & 16) != 0) {
            eventProperties = onboardingEvent.properties;
        }
        if ((i4 & 32) != 0) {
            str4 = onboardingEvent.status;
        }
        EventProperties eventProperties2 = eventProperties;
        String str5 = str4;
        return onboardingEvent.copy(str, str2, eventAddress, str3, eventProperties2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* renamed from: component3, reason: from getter */
    public final EventAddress getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component5, reason: from getter */
    public final EventProperties getProperties() {
        return this.properties;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final OnboardingEvent copy(String accountId, String externalId, EventAddress address, String tag, EventProperties properties, String status) {
        return new OnboardingEvent(accountId, externalId, address, tag, properties, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingEvent)) {
            return false;
        }
        OnboardingEvent onboardingEvent = (OnboardingEvent) other;
        return Intrinsics.areEqual(this.accountId, onboardingEvent.accountId) && Intrinsics.areEqual(this.externalId, onboardingEvent.externalId) && Intrinsics.areEqual(this.address, onboardingEvent.address) && Intrinsics.areEqual(this.tag, onboardingEvent.tag) && Intrinsics.areEqual(this.properties, onboardingEvent.properties) && Intrinsics.areEqual(this.status, onboardingEvent.status);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final EventAddress getAddress() {
        return this.address;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final EventProperties getProperties() {
        return this.properties;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.accountId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.externalId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EventAddress eventAddress = this.address;
        int hashCode3 = (hashCode2 + (eventAddress == null ? 0 : eventAddress.hashCode())) * 31;
        String str3 = this.tag;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EventProperties eventProperties = this.properties;
        int hashCode5 = (hashCode4 + (eventProperties == null ? 0 : eventProperties.hashCode())) * 31;
        String str4 = this.status;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingEvent(accountId=");
        sb2.append(this.accountId);
        sb2.append(", externalId=");
        sb2.append(this.externalId);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", tag=");
        sb2.append(this.tag);
        sb2.append(", properties=");
        sb2.append(this.properties);
        sb2.append(", status=");
        return P0.fuchsia(sb2, this.status, ')');
    }

    public OnboardingEvent(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        this.accountId = str;
        this.externalId = str2;
        this.address = eventAddress;
        this.tag = str3;
        this.properties = eventProperties;
        this.status = str4;
    }

    public /* synthetic */ OnboardingEvent(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : eventAddress, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? null : eventProperties, (i4 & 32) != 0 ? null : str4);
    }
}
