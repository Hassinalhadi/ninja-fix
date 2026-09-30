package com.checkout.eventlogger.domain.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 ,:\u0001,BO\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0003J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0003J\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\u0003J\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0003Jj\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0003R\u0019\u0010\u0011\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\u0003R\u0019\u0010\u000f\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\"\u0010\u0003R\u0019\u0010\u0010\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b#\u0010\u0003R\u0019\u0010\u0012\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b$\u0010\u0003R\u0019\u0010\u000e\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b%\u0010\u0003R\u0019\u0010\u0014\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b&\u0010\u0003R\u0019\u0010\u0013\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b'\u0010\u0003R\u0019\u0010\f\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b(\u0010\u0003R\u0019\u0010\r\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b)\u0010\u0003¨\u0006-"}, d2 = {"Lcom/checkout/eventlogger/domain/model/RemoteProcessorMetadata;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "productIdentifier", "productVersion", "environment", "appPackageName", "appPackageVersion", "appInstallId", "deviceName", "platform", "osVersion", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/eventlogger/domain/model/RemoteProcessorMetadata;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAppInstallId", "getAppPackageName", "getAppPackageVersion", "getDeviceName", "getEnvironment", "getOsVersion", "getPlatform", "getProductIdentifier", "getProductVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "logger_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* loaded from: classes3.dex */
public final /* data */ class RemoteProcessorMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f6588a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f6589b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f6590c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f6591d;

    @NotNull
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f6592f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f6593g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f6594h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f6595i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/checkout/eventlogger/domain/model/RemoteProcessorMetadata$Companion;", "Landroid/content/Context;", "context", "", "environment", "productIdentifier", "productVersion", "Lcom/checkout/eventlogger/domain/model/RemoteProcessorMetadata;", "from", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/eventlogger/domain/model/RemoteProcessorMetadata;", "<init>", "()V", "logger_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final RemoteProcessorMetadata from(@NotNull Context context, @NotNull String environment, @NotNull String productIdentifier, @NotNull String productVersion) {
            Intrinsics.echo(context, "context");
            Intrinsics.echo(environment, "environment");
            Intrinsics.echo(productIdentifier, "productIdentifier");
            Intrinsics.echo(productVersion, "productVersion");
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = Build.MANUFACTURER + " - " + Build.MODEL;
            String str2 = "API-" + Build.VERSION.SDK_INT;
            String str3 = packageInfo.packageName;
            if (str3 == null) {
                str3 = "unknown";
            }
            String str4 = packageInfo.versionName;
            String str5 = str4 != null ? str4 : "unknown";
            String uuid = new UUID(packageInfo.firstInstallTime, packageInfo.lastUpdateTime).toString();
            Intrinsics.delta(uuid, "UUID(\n                  …             ).toString()");
            return new RemoteProcessorMetadata(productIdentifier, productVersion, environment, str3, str5, uuid, str, CtApi.DEFAULT_QUERY_PARAM_OS, str2);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RemoteProcessorMetadata(@NotNull String productIdentifier, @NotNull String productVersion, @NotNull String environment, @NotNull String appPackageName, @NotNull String appPackageVersion, @NotNull String appInstallId, @NotNull String deviceName, @NotNull String platform, @NotNull String osVersion) {
        Intrinsics.echo(productIdentifier, "productIdentifier");
        Intrinsics.echo(productVersion, "productVersion");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(appPackageName, "appPackageName");
        Intrinsics.echo(appPackageVersion, "appPackageVersion");
        Intrinsics.echo(appInstallId, "appInstallId");
        Intrinsics.echo(deviceName, "deviceName");
        Intrinsics.echo(platform, "platform");
        Intrinsics.echo(osVersion, "osVersion");
        this.f6588a = productIdentifier;
        this.f6589b = productVersion;
        this.f6590c = environment;
        this.f6591d = appPackageName;
        this.e = appPackageVersion;
        this.f6592f = appInstallId;
        this.f6593g = deviceName;
        this.f6594h = platform;
        this.f6595i = osVersion;
    }

    public static /* synthetic */ RemoteProcessorMetadata copy$default(RemoteProcessorMetadata remoteProcessorMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = remoteProcessorMetadata.f6588a;
        }
        if ((i4 & 2) != 0) {
            str2 = remoteProcessorMetadata.f6589b;
        }
        if ((i4 & 4) != 0) {
            str3 = remoteProcessorMetadata.f6590c;
        }
        if ((i4 & 8) != 0) {
            str4 = remoteProcessorMetadata.f6591d;
        }
        if ((i4 & 16) != 0) {
            str5 = remoteProcessorMetadata.e;
        }
        if ((i4 & 32) != 0) {
            str6 = remoteProcessorMetadata.f6592f;
        }
        if ((i4 & 64) != 0) {
            str7 = remoteProcessorMetadata.f6593g;
        }
        if ((i4 & 128) != 0) {
            str8 = remoteProcessorMetadata.f6594h;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            str9 = remoteProcessorMetadata.f6595i;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return remoteProcessorMetadata.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getF6588a() {
        return this.f6588a;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getF6589b() {
        return this.f6589b;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getF6590c() {
        return this.f6590c;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getF6591d() {
        return this.f6591d;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getF6592f() {
        return this.f6592f;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getF6593g() {
        return this.f6593g;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getF6594h() {
        return this.f6594h;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getF6595i() {
        return this.f6595i;
    }

    @NotNull
    public final RemoteProcessorMetadata copy(@NotNull String productIdentifier, @NotNull String productVersion, @NotNull String environment, @NotNull String appPackageName, @NotNull String appPackageVersion, @NotNull String appInstallId, @NotNull String deviceName, @NotNull String platform, @NotNull String osVersion) {
        Intrinsics.echo(productIdentifier, "productIdentifier");
        Intrinsics.echo(productVersion, "productVersion");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(appPackageName, "appPackageName");
        Intrinsics.echo(appPackageVersion, "appPackageVersion");
        Intrinsics.echo(appInstallId, "appInstallId");
        Intrinsics.echo(deviceName, "deviceName");
        Intrinsics.echo(platform, "platform");
        Intrinsics.echo(osVersion, "osVersion");
        return new RemoteProcessorMetadata(productIdentifier, productVersion, environment, appPackageName, appPackageVersion, appInstallId, deviceName, platform, osVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteProcessorMetadata)) {
            return false;
        }
        RemoteProcessorMetadata remoteProcessorMetadata = (RemoteProcessorMetadata) other;
        return Intrinsics.areEqual(this.f6588a, remoteProcessorMetadata.f6588a) && Intrinsics.areEqual(this.f6589b, remoteProcessorMetadata.f6589b) && Intrinsics.areEqual(this.f6590c, remoteProcessorMetadata.f6590c) && Intrinsics.areEqual(this.f6591d, remoteProcessorMetadata.f6591d) && Intrinsics.areEqual(this.e, remoteProcessorMetadata.e) && Intrinsics.areEqual(this.f6592f, remoteProcessorMetadata.f6592f) && Intrinsics.areEqual(this.f6593g, remoteProcessorMetadata.f6593g) && Intrinsics.areEqual(this.f6594h, remoteProcessorMetadata.f6594h) && Intrinsics.areEqual(this.f6595i, remoteProcessorMetadata.f6595i);
    }

    @NotNull
    public final String getAppInstallId() {
        return this.f6592f;
    }

    @NotNull
    public final String getAppPackageName() {
        return this.f6591d;
    }

    @NotNull
    public final String getAppPackageVersion() {
        return this.e;
    }

    @NotNull
    public final String getDeviceName() {
        return this.f6593g;
    }

    @NotNull
    public final String getEnvironment() {
        return this.f6590c;
    }

    @NotNull
    public final String getOsVersion() {
        return this.f6595i;
    }

    @NotNull
    public final String getPlatform() {
        return this.f6594h;
    }

    @NotNull
    public final String getProductIdentifier() {
        return this.f6588a;
    }

    @NotNull
    public final String getProductVersion() {
        return this.f6589b;
    }

    public int hashCode() {
        String str = this.f6588a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6589b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6590c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6591d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f6592f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f6593g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f6594h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f6595i;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteProcessorMetadata(productIdentifier=");
        sb2.append(this.f6588a);
        sb2.append(", productVersion=");
        sb2.append(this.f6589b);
        sb2.append(", environment=");
        sb2.append(this.f6590c);
        sb2.append(", appPackageName=");
        sb2.append(this.f6591d);
        sb2.append(", appPackageVersion=");
        sb2.append(this.e);
        sb2.append(", appInstallId=");
        sb2.append(this.f6592f);
        sb2.append(", deviceName=");
        sb2.append(this.f6593g);
        sb2.append(", platform=");
        sb2.append(this.f6594h);
        sb2.append(", osVersion=");
        return P0.gold(sb2, this.f6595i, ")");
    }
}
