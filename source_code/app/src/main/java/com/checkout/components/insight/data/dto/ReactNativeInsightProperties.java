package com.checkout.components.insight.data.dto;

import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;", "", "", "version", "arch", "engine", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVersion", "b", "getArch", "c", "getEngine", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ReactNativeInsightProperties {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String arch;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String engine;

    public ReactNativeInsightProperties() {
        this(null, null, null, 7, null);
    }

    public static ReactNativeInsightProperties copy$default(ReactNativeInsightProperties reactNativeInsightProperties, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = reactNativeInsightProperties.version;
        }
        if ((i4 & 2) != 0) {
            str2 = reactNativeInsightProperties.arch;
        }
        if ((i4 & 4) != 0) {
            str3 = reactNativeInsightProperties.engine;
        }
        reactNativeInsightProperties.getClass();
        return new ReactNativeInsightProperties(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final String getArch() {
        return this.arch;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEngine() {
        return this.engine;
    }

    public final ReactNativeInsightProperties copy(String version, String arch, String engine) {
        return new ReactNativeInsightProperties(version, arch, engine);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactNativeInsightProperties)) {
            return false;
        }
        ReactNativeInsightProperties reactNativeInsightProperties = (ReactNativeInsightProperties) other;
        return Intrinsics.areEqual(this.version, reactNativeInsightProperties.version) && Intrinsics.areEqual(this.arch, reactNativeInsightProperties.arch) && Intrinsics.areEqual(this.engine, reactNativeInsightProperties.engine);
    }

    public final String getArch() {
        return this.arch;
    }

    public final String getEngine() {
        return this.engine;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        String str = this.version;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.arch;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.engine;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.version;
        String str2 = this.arch;
        return P0.gold(q.india("ReactNativeInsightProperties(version=", str, ", arch=", str2, ", engine="), this.engine, ")");
    }

    public ReactNativeInsightProperties(String str, String str2, String str3) {
        this.version = str;
        this.arch = str2;
        this.engine = str3;
    }

    public ReactNativeInsightProperties(String str, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i4 & 1) != 0 ? null : str;
        str2 = (i4 & 2) != 0 ? null : str2;
        str3 = (i4 & 4) != 0 ? null : str3;
        this.version = str;
        this.arch = str2;
        this.engine = str3;
    }
}
