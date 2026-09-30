package com.checkout.components.insight.data.dto;

import Q0.c;
import av.q;
import com.checkout.components.insight.a;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017Jb\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010#\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u000fR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010#\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010\u000fR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010#\u0012\u0004\b1\u0010&\u001a\u0004\b0\u0010\u000fR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010#\u0012\u0004\b4\u0010&\u001a\u0004\b3\u0010\u000fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010#\u0012\u0004\b7\u0010&\u001a\u0004\b6\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0017¨\u0006;"}, d2 = {"Lcom/checkout/components/insight/data/dto/DeviceData;", "", "", "productVersion", "platform", "osVersion", "deviceName", "appInstallId", "appPackageName", "appPackageNameVersion", "Lcom/checkout/components/insight/data/dto/Accessibility;", "accessibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Accessibility;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/checkout/components/insight/data/dto/Accessibility;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Accessibility;)Lcom/checkout/components/insight/data/dto/DeviceData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getProductVersion", "getProductVersion$annotations", "()V", "b", "getPlatform", "c", "getOsVersion", "getOsVersion$annotations", Constants.INAPP_DATA_TAG, "getDeviceName", "getDeviceName$annotations", "e", "getAppInstallId", "getAppInstallId$annotations", "f", "getAppPackageName", "getAppPackageName$annotations", "g", "getAppPackageNameVersion", "getAppPackageNameVersion$annotations", "h", "Lcom/checkout/components/insight/data/dto/Accessibility;", "getAccessibility", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeviceData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String productVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String platform;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String osVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String deviceName;

    /* renamed from: e, reason: from kotlin metadata */
    private final String appInstallId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String appPackageName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String appPackageNameVersion;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Accessibility accessibility;

    public DeviceData(@Json(name = "product_version") String productVersion, String platform, @Json(name = "os_version") String osVersion, @Json(name = "device_name") String deviceName, @Json(name = "app_install_id") String appInstallId, @Json(name = "app_package_name") String appPackageName, @Json(name = "app_package_version") String appPackageNameVersion, Accessibility accessibility) {
        Intrinsics.echo(productVersion, "productVersion");
        Intrinsics.echo(platform, "platform");
        Intrinsics.echo(osVersion, "osVersion");
        Intrinsics.echo(deviceName, "deviceName");
        Intrinsics.echo(appInstallId, "appInstallId");
        Intrinsics.echo(appPackageName, "appPackageName");
        Intrinsics.echo(appPackageNameVersion, "appPackageNameVersion");
        this.productVersion = productVersion;
        this.platform = platform;
        this.osVersion = osVersion;
        this.deviceName = deviceName;
        this.appInstallId = appInstallId;
        this.appPackageName = appPackageName;
        this.appPackageNameVersion = appPackageNameVersion;
        this.accessibility = accessibility;
    }

    public static /* synthetic */ DeviceData copy$default(DeviceData deviceData, String str, String str2, String str3, String str4, String str5, String str6, String str7, Accessibility accessibility, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = deviceData.productVersion;
        }
        if ((i4 & 2) != 0) {
            str2 = deviceData.platform;
        }
        if ((i4 & 4) != 0) {
            str3 = deviceData.osVersion;
        }
        if ((i4 & 8) != 0) {
            str4 = deviceData.deviceName;
        }
        if ((i4 & 16) != 0) {
            str5 = deviceData.appInstallId;
        }
        if ((i4 & 32) != 0) {
            str6 = deviceData.appPackageName;
        }
        if ((i4 & 64) != 0) {
            str7 = deviceData.appPackageNameVersion;
        }
        if ((i4 & 128) != 0) {
            accessibility = deviceData.accessibility;
        }
        String str8 = str7;
        Accessibility accessibility2 = accessibility;
        String str9 = str5;
        String str10 = str6;
        return deviceData.copy(str, str2, str3, str4, str9, str10, str8, accessibility2);
    }

    @Json(name = "app_install_id")
    public static /* synthetic */ void getAppInstallId$annotations() {
    }

    @Json(name = "app_package_name")
    public static /* synthetic */ void getAppPackageName$annotations() {
    }

    @Json(name = "app_package_version")
    public static /* synthetic */ void getAppPackageNameVersion$annotations() {
    }

    @Json(name = "device_name")
    public static /* synthetic */ void getDeviceName$annotations() {
    }

    @Json(name = "os_version")
    public static /* synthetic */ void getOsVersion$annotations() {
    }

    @Json(name = "product_version")
    public static /* synthetic */ void getProductVersion$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductVersion() {
        return this.productVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAppInstallId() {
        return this.appInstallId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAppPackageName() {
        return this.appPackageName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAppPackageNameVersion() {
        return this.appPackageNameVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final Accessibility getAccessibility() {
        return this.accessibility;
    }

    public final DeviceData copy(@Json(name = "product_version") String productVersion, String platform, @Json(name = "os_version") String osVersion, @Json(name = "device_name") String deviceName, @Json(name = "app_install_id") String appInstallId, @Json(name = "app_package_name") String appPackageName, @Json(name = "app_package_version") String appPackageNameVersion, Accessibility accessibility) {
        Intrinsics.echo(productVersion, "productVersion");
        Intrinsics.echo(platform, "platform");
        Intrinsics.echo(osVersion, "osVersion");
        Intrinsics.echo(deviceName, "deviceName");
        Intrinsics.echo(appInstallId, "appInstallId");
        Intrinsics.echo(appPackageName, "appPackageName");
        Intrinsics.echo(appPackageNameVersion, "appPackageNameVersion");
        return new DeviceData(productVersion, platform, osVersion, deviceName, appInstallId, appPackageName, appPackageNameVersion, accessibility);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceData)) {
            return false;
        }
        DeviceData deviceData = (DeviceData) other;
        return Intrinsics.areEqual(this.productVersion, deviceData.productVersion) && Intrinsics.areEqual(this.platform, deviceData.platform) && Intrinsics.areEqual(this.osVersion, deviceData.osVersion) && Intrinsics.areEqual(this.deviceName, deviceData.deviceName) && Intrinsics.areEqual(this.appInstallId, deviceData.appInstallId) && Intrinsics.areEqual(this.appPackageName, deviceData.appPackageName) && Intrinsics.areEqual(this.appPackageNameVersion, deviceData.appPackageNameVersion) && Intrinsics.areEqual(this.accessibility, deviceData.accessibility);
    }

    public final Accessibility getAccessibility() {
        return this.accessibility;
    }

    public final String getAppInstallId() {
        return this.appInstallId;
    }

    public final String getAppPackageName() {
        return this.appPackageName;
    }

    public final String getAppPackageNameVersion() {
        return this.appPackageNameVersion;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getProductVersion() {
        return this.productVersion;
    }

    public final int hashCode() {
        int hashCode;
        int a6 = a.a(this.appPackageNameVersion, a.a(this.appPackageName, a.a(this.appInstallId, a.a(this.deviceName, a.a(this.osVersion, a.a(this.platform, this.productVersion.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        Accessibility accessibility = this.accessibility;
        if (accessibility == null) {
            hashCode = 0;
        } else {
            hashCode = accessibility.hashCode();
        }
        return a6 + hashCode;
    }

    public final String toString() {
        String str = this.productVersion;
        String str2 = this.platform;
        String str3 = this.osVersion;
        String str4 = this.deviceName;
        String str5 = this.appInstallId;
        String str6 = this.appPackageName;
        String str7 = this.appPackageNameVersion;
        Accessibility accessibility = this.accessibility;
        StringBuilder india = q.india("DeviceData(productVersion=", str, ", platform=", str2, ", osVersion=");
        c.azure(india, str3, ", deviceName=", str4, ", appInstallId=");
        c.azure(india, str5, ", appPackageName=", str6, ", appPackageNameVersion=");
        india.append(str7);
        india.append(", accessibility=");
        india.append(accessibility);
        india.append(")");
        return india.toString();
    }
}
