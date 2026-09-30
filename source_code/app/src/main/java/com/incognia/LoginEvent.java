package com.incognia;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/incognia/LoginEvent;", "", "accountId", "", "externalId", "location", "Lcom/incognia/EventLocation;", "status", "tag", "properties", "Lcom/incognia/EventProperties;", "(Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventLocation;Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventProperties;)V", "getAccountId", "()Ljava/lang/String;", "getExternalId", "getLocation", "()Lcom/incognia/EventLocation;", "getProperties", "()Lcom/incognia/EventProperties;", "getStatus", "getTag", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Builder", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginEvent {
    private final String accountId;
    private final String externalId;
    private final EventLocation location;
    private final EventProperties properties;
    private final String status;
    private final String tag;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/incognia/LoginEvent$Builder;", "", "()V", "accountId", "", "externalId", "location", "Lcom/incognia/EventLocation;", "properties", "Lcom/incognia/EventProperties;", "status", "tag", "build", "Lcom/incognia/LoginEvent;", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String accountId = "";
        private String externalId;
        private EventLocation location;
        private EventProperties properties;
        private String status;
        private String tag;

        public final Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public final LoginEvent build() {
            return new LoginEvent(this.accountId, this.externalId, this.location, this.status, this.tag, this.properties);
        }

        public final Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public final Builder location(EventLocation location) {
            this.location = location;
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

    public LoginEvent(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties) {
        this.accountId = str;
        this.externalId = str2;
        this.location = eventLocation;
        this.status = str3;
        this.tag = str4;
        this.properties = eventProperties;
    }

    public static /* synthetic */ LoginEvent copy$default(LoginEvent loginEvent, String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = loginEvent.accountId;
        }
        if ((i4 & 2) != 0) {
            str2 = loginEvent.externalId;
        }
        if ((i4 & 4) != 0) {
            eventLocation = loginEvent.location;
        }
        if ((i4 & 8) != 0) {
            str3 = loginEvent.status;
        }
        if ((i4 & 16) != 0) {
            str4 = loginEvent.tag;
        }
        if ((i4 & 32) != 0) {
            eventProperties = loginEvent.properties;
        }
        String str5 = str4;
        EventProperties eventProperties2 = eventProperties;
        return loginEvent.copy(str, str2, eventLocation, str3, str5, eventProperties2);
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
    public final EventLocation getLocation() {
        return this.location;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component6, reason: from getter */
    public final EventProperties getProperties() {
        return this.properties;
    }

    public final LoginEvent copy(String accountId, String externalId, EventLocation location, String status, String tag, EventProperties properties) {
        return new LoginEvent(accountId, externalId, location, status, tag, properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginEvent)) {
            return false;
        }
        LoginEvent loginEvent = (LoginEvent) other;
        return Intrinsics.areEqual(this.accountId, loginEvent.accountId) && Intrinsics.areEqual(this.externalId, loginEvent.externalId) && Intrinsics.areEqual(this.location, loginEvent.location) && Intrinsics.areEqual(this.status, loginEvent.status) && Intrinsics.areEqual(this.tag, loginEvent.tag) && Intrinsics.areEqual(this.properties, loginEvent.properties);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final EventLocation getLocation() {
        return this.location;
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
        int hashCode = this.accountId.hashCode() * 31;
        String str = this.externalId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EventLocation eventLocation = this.location;
        int hashCode3 = (hashCode2 + (eventLocation == null ? 0 : eventLocation.hashCode())) * 31;
        String str2 = this.status;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EventProperties eventProperties = this.properties;
        return hashCode5 + (eventProperties != null ? eventProperties.hashCode() : 0);
    }

    public String toString() {
        return "LoginEvent(accountId=" + this.accountId + ", externalId=" + this.externalId + ", location=" + this.location + ", status=" + this.status + ", tag=" + this.tag + ", properties=" + this.properties + ')';
    }

    public /* synthetic */ LoginEvent(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : eventLocation, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? null : eventProperties);
    }
}
