package io.getunleash.android.data;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eBA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lio/getunleash/android/data/UnleashContext;", "", "userId", "", "sessionId", "remoteAddress", "properties", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getUserId", "()Ljava/lang/String;", "getSessionId", "getRemoteAddress", "getProperties", "()Ljava/util/Map;", "newBuilder", "Lio/getunleash/android/data/UnleashContext$Builder;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Companion", "Builder", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UnleashContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, String> properties;

    @Nullable
    private final String remoteAddress;

    @Nullable
    private final String sessionId;

    @Nullable
    private final String userId;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0003J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\u001a\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003JC\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lio/getunleash/android/data/UnleashContext$Builder;", "", "userId", "", "sessionId", "remoteAddress", "properties", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getSessionId", "setSessionId", "getRemoteAddress", "setRemoteAddress", "getProperties", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", "address", "addProperty", Constants.KEY_KEY, "value", "map", "build", "Lio/getunleash/android/data/UnleashContext;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Builder {

        @NotNull
        private Map<String, String> properties;

        @Nullable
        private String remoteAddress;

        @Nullable
        private String sessionId;

        @Nullable
        private String userId;

        public Builder() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder copy$default(Builder builder, String str, String str2, String str3, Map map, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = builder.userId;
            }
            if ((i4 & 2) != 0) {
                str2 = builder.sessionId;
            }
            if ((i4 & 4) != 0) {
                str3 = builder.remoteAddress;
            }
            if ((i4 & 8) != 0) {
                map = builder.properties;
            }
            return builder.copy(str, str2, str3, map);
        }

        @NotNull
        public final Builder addProperty(@NotNull String key, @NotNull String value) {
            Intrinsics.echo(key, "key");
            Intrinsics.echo(value, "value");
            this.properties.put(key, value);
            return this;
        }

        @NotNull
        public final UnleashContext build() {
            return new UnleashContext(this.userId, this.sessionId, this.remoteAddress, y.zulu(this.properties));
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getRemoteAddress() {
            return this.remoteAddress;
        }

        @NotNull
        public final Map<String, String> component4() {
            return this.properties;
        }

        @NotNull
        public final Builder copy(@Nullable String userId, @Nullable String sessionId, @Nullable String remoteAddress, @NotNull Map<String, String> properties) {
            Intrinsics.echo(properties, "properties");
            return new Builder(userId, sessionId, remoteAddress, properties);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.userId, builder.userId) && Intrinsics.areEqual(this.sessionId, builder.sessionId) && Intrinsics.areEqual(this.remoteAddress, builder.remoteAddress) && Intrinsics.areEqual(this.properties, builder.properties);
        }

        @NotNull
        public final Map<String, String> getProperties() {
            return this.properties;
        }

        @Nullable
        public final String getRemoteAddress() {
            return this.remoteAddress;
        }

        @Nullable
        public final String getSessionId() {
            return this.sessionId;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            String str = this.userId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sessionId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.remoteAddress;
            return this.properties.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public final Builder properties(@NotNull Map<String, String> map) {
            Intrinsics.echo(map, "map");
            this.properties = map;
            return this;
        }

        @NotNull
        public final Builder remoteAddress(@NotNull String address) {
            Intrinsics.echo(address, "address");
            this.remoteAddress = address;
            return this;
        }

        @NotNull
        public final Builder sessionId(@NotNull String sessionId) {
            Intrinsics.echo(sessionId, "sessionId");
            this.sessionId = sessionId;
            return this;
        }

        public final void setProperties(@NotNull Map<String, String> map) {
            Intrinsics.echo(map, "<set-?>");
            this.properties = map;
        }

        public final void setRemoteAddress(@Nullable String str) {
            this.remoteAddress = str;
        }

        public final void setSessionId(@Nullable String str) {
            this.sessionId = str;
        }

        public final void setUserId(@Nullable String str) {
            this.userId = str;
        }

        @NotNull
        public String toString() {
            return "Builder(userId=" + this.userId + ", sessionId=" + this.sessionId + ", remoteAddress=" + this.remoteAddress + ", properties=" + this.properties + ')';
        }

        @NotNull
        public final Builder userId(@NotNull String userId) {
            Intrinsics.echo(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, String> properties) {
            Intrinsics.echo(properties, "properties");
            this.userId = str;
            this.sessionId = str2;
            this.remoteAddress = str3;
            this.properties = properties;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? new LinkedHashMap() : map);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lio/getunleash/android/data/UnleashContext$Companion;", "", "<init>", "()V", "newBuilder", "Lio/getunleash/android/data/UnleashContext$Builder;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder newBuilder() {
            return new Builder(null, null, null, null, 15, null);
        }

        private Companion() {
        }
    }

    public UnleashContext() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnleashContext copy$default(UnleashContext unleashContext, String str, String str2, String str3, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = unleashContext.userId;
        }
        if ((i4 & 2) != 0) {
            str2 = unleashContext.sessionId;
        }
        if ((i4 & 4) != 0) {
            str3 = unleashContext.remoteAddress;
        }
        if ((i4 & 8) != 0) {
            map = unleashContext.properties;
        }
        return unleashContext.copy(str, str2, str3, map);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRemoteAddress() {
        return this.remoteAddress;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.properties;
    }

    @NotNull
    public final UnleashContext copy(@Nullable String userId, @Nullable String sessionId, @Nullable String remoteAddress, @NotNull Map<String, String> properties) {
        Intrinsics.echo(properties, "properties");
        return new UnleashContext(userId, sessionId, remoteAddress, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnleashContext)) {
            return false;
        }
        UnleashContext unleashContext = (UnleashContext) other;
        return Intrinsics.areEqual(this.userId, unleashContext.userId) && Intrinsics.areEqual(this.sessionId, unleashContext.sessionId) && Intrinsics.areEqual(this.remoteAddress, unleashContext.remoteAddress) && Intrinsics.areEqual(this.properties, unleashContext.properties);
    }

    @NotNull
    public final Map<String, String> getProperties() {
        return this.properties;
    }

    @Nullable
    public final String getRemoteAddress() {
        return this.remoteAddress;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sessionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remoteAddress;
        return this.properties.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this.userId, this.sessionId, this.remoteAddress, y.amber(this.properties));
    }

    @NotNull
    public String toString() {
        return "UnleashContext(userId=" + this.userId + ", sessionId=" + this.sessionId + ", remoteAddress=" + this.remoteAddress + ", properties=" + this.properties + ')';
    }

    public UnleashContext(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, String> properties) {
        Intrinsics.echo(properties, "properties");
        this.userId = str;
        this.sessionId = str2;
        this.remoteAddress = str3;
        this.properties = properties;
    }

    public /* synthetic */ UnleashContext(String str, String str2, String str3, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? t.alpha : map);
    }
}
