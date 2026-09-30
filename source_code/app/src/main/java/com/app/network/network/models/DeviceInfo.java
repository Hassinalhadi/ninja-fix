package com.app.network.network.models;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010+JÂ\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+¨\u0006B"}, d2 = {"Lcom/app/network/network/models/DeviceInfo;", "", "deviceType", "", "appBuild", "", "installationUid", CtApi.QUERY_PARAM_OS_KEY, "appVersion", "deviceManufacturer", "deviceModel", "bundleId", "fcmToken", "apnToken", "mac", "androidId", "cleverTapId", "language", "locationPermissionAllowed", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDeviceType", "()Ljava/lang/String;", "getAppBuild", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInstallationUid", "setInstallationUid", "(Ljava/lang/String;)V", "getOs", "getAppVersion", "getDeviceManufacturer", "getDeviceModel", "getBundleId", "getFcmToken", "setFcmToken", "getApnToken", "getMac", "getAndroidId", "getCleverTapId", "getLanguage", "getLocationPermissionAllowed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/app/network/network/models/DeviceInfo;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeviceInfo {

    @Nullable
    private final String androidId;

    @Nullable
    private final String apnToken;

    @Nullable
    private final Integer appBuild;

    @Nullable
    private final String appVersion;

    @Nullable
    private final String bundleId;

    @Nullable
    private final String cleverTapId;

    @Nullable
    private final String deviceManufacturer;

    @Nullable
    private final String deviceModel;

    @Nullable
    private final String deviceType;

    @Nullable
    private String fcmToken;

    @Nullable
    private String installationUid;

    @Nullable
    private final String language;

    @Nullable
    private final Boolean locationPermissionAllowed;

    @Nullable
    private final String mac;

    @Nullable
    private final String os;

    public DeviceInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getApnToken() {
        return this.apnToken;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getAndroidId() {
        return this.androidId;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getCleverTapId() {
        return this.cleverTapId;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Boolean getLocationPermissionAllowed() {
        return this.locationPermissionAllowed;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAppBuild() {
        return this.appBuild;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getInstallationUid() {
        return this.installationUid;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getFcmToken() {
        return this.fcmToken;
    }

    @NotNull
    public final DeviceInfo copy(@Nullable String deviceType, @Nullable Integer appBuild, @Nullable String installationUid, @Nullable String os, @Nullable String appVersion, @Nullable String deviceManufacturer, @Nullable String deviceModel, @Nullable String bundleId, @Nullable String fcmToken, @Nullable String apnToken, @Nullable String mac, @Nullable String androidId, @Nullable String cleverTapId, @Nullable String language, @Nullable Boolean locationPermissionAllowed) {
        return new DeviceInfo(deviceType, appBuild, installationUid, os, appVersion, deviceManufacturer, deviceModel, bundleId, fcmToken, apnToken, mac, androidId, cleverTapId, language, locationPermissionAllowed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.deviceType, deviceInfo.deviceType) && Intrinsics.areEqual(this.appBuild, deviceInfo.appBuild) && Intrinsics.areEqual(this.installationUid, deviceInfo.installationUid) && Intrinsics.areEqual(this.os, deviceInfo.os) && Intrinsics.areEqual(this.appVersion, deviceInfo.appVersion) && Intrinsics.areEqual(this.deviceManufacturer, deviceInfo.deviceManufacturer) && Intrinsics.areEqual(this.deviceModel, deviceInfo.deviceModel) && Intrinsics.areEqual(this.bundleId, deviceInfo.bundleId) && Intrinsics.areEqual(this.fcmToken, deviceInfo.fcmToken) && Intrinsics.areEqual(this.apnToken, deviceInfo.apnToken) && Intrinsics.areEqual(this.mac, deviceInfo.mac) && Intrinsics.areEqual(this.androidId, deviceInfo.androidId) && Intrinsics.areEqual(this.cleverTapId, deviceInfo.cleverTapId) && Intrinsics.areEqual(this.language, deviceInfo.language) && Intrinsics.areEqual(this.locationPermissionAllowed, deviceInfo.locationPermissionAllowed);
    }

    @Nullable
    public final String getAndroidId() {
        return this.androidId;
    }

    @Nullable
    public final String getApnToken() {
        return this.apnToken;
    }

    @Nullable
    public final Integer getAppBuild() {
        return this.appBuild;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getBundleId() {
        return this.bundleId;
    }

    @Nullable
    public final String getCleverTapId() {
        return this.cleverTapId;
    }

    @Nullable
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Nullable
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getFcmToken() {
        return this.fcmToken;
    }

    @Nullable
    public final String getInstallationUid() {
        return this.installationUid;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final Boolean getLocationPermissionAllowed() {
        return this.locationPermissionAllowed;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final String getOs() {
        return this.os;
    }

    public int hashCode() {
        String str = this.deviceType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.appBuild;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.installationUid;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.os;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appVersion;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceManufacturer;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceModel;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bundleId;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fcmToken;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.apnToken;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.mac;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.androidId;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cleverTapId;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.language;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.locationPermissionAllowed;
        return hashCode14 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setFcmToken(@Nullable String str) {
        this.fcmToken = str;
    }

    public final void setInstallationUid(@Nullable String str) {
        this.installationUid = str;
    }

    @NotNull
    public String toString() {
        String str = this.deviceType;
        Integer num = this.appBuild;
        String str2 = this.installationUid;
        String str3 = this.os;
        String str4 = this.appVersion;
        String str5 = this.deviceManufacturer;
        String str6 = this.deviceModel;
        String str7 = this.bundleId;
        String str8 = this.fcmToken;
        String str9 = this.apnToken;
        String str10 = this.mac;
        String str11 = this.androidId;
        String str12 = this.cleverTapId;
        String str13 = this.language;
        Boolean bool = this.locationPermissionAllowed;
        StringBuilder sb2 = new StringBuilder("DeviceInfo(deviceType=");
        sb2.append(str);
        sb2.append(", appBuild=");
        sb2.append(num);
        sb2.append(", installationUid=");
        c.azure(sb2, str2, ", os=", str3, ", appVersion=");
        c.azure(sb2, str4, ", deviceManufacturer=", str5, ", deviceModel=");
        c.azure(sb2, str6, ", bundleId=", str7, ", fcmToken=");
        c.azure(sb2, str8, ", apnToken=", str9, ", mac=");
        c.azure(sb2, str10, ", androidId=", str11, ", cleverTapId=");
        c.azure(sb2, str12, ", language=", str13, ", locationPermissionAllowed=");
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }

    public DeviceInfo(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool) {
        this.deviceType = str;
        this.appBuild = num;
        this.installationUid = str2;
        this.os = str3;
        this.appVersion = str4;
        this.deviceManufacturer = str5;
        this.deviceModel = str6;
        this.bundleId = str7;
        this.fcmToken = str8;
        this.apnToken = str9;
        this.mac = str10;
        this.androidId = str11;
        this.cleverTapId = str12;
        this.language = str13;
        this.locationPermissionAllowed = bool;
    }

    public /* synthetic */ DeviceInfo(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? null : str6, (i4 & 128) != 0 ? null : str7, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : str8, (i4 & 512) != 0 ? null : str9, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : str10, (i4 & 2048) != 0 ? null : str11, (i4 & 4096) != 0 ? null : str12, (i4 & 8192) != 0 ? null : str13, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool);
    }
}
