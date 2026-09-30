package com.checkout.eventlogger.data.e;

import com.clevertap.android.sdk.leanplum.Constants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f6563j = new a();

    /* renamed from: a, reason: collision with root package name */
    @P8.c("productVersion")
    @Nullable
    public final String f6564a;

    /* renamed from: b, reason: collision with root package name */
    @P8.c("environment")
    @Nullable
    public final String f6565b;

    /* renamed from: c, reason: collision with root package name */
    @P8.c("appPackageName")
    @Nullable
    public final String f6566c;

    /* renamed from: d, reason: collision with root package name */
    @P8.c("appPackageVersion")
    @Nullable
    public final String f6567d;

    @P8.c("appInstallID")
    @Nullable
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    @P8.c("deviceName")
    @Nullable
    public final String f6568f;

    /* renamed from: g, reason: collision with root package name */
    @P8.c("platform")
    @Nullable
    public final String f6569g;

    /* renamed from: h, reason: collision with root package name */
    @P8.c("osVersion")
    @Nullable
    public final String f6570h;

    /* renamed from: i, reason: collision with root package name */
    @P8.c(Constants.CHARGED_EVENT_PARAM)
    @NotNull
    public final Map<String, Object> f6571i;

    /* loaded from: classes3.dex */
    public static final class a {
    }

    public b(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull Map<String, ? extends Object> event) {
        Intrinsics.echo(event, "event");
        this.f6564a = str;
        this.f6565b = str2;
        this.f6566c = str3;
        this.f6567d = str4;
        this.e = str5;
        this.f6568f = str6;
        this.f6569g = str7;
        this.f6570h = str8;
        this.f6571i = event;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f6564a, bVar.f6564a) && Intrinsics.areEqual(this.f6565b, bVar.f6565b) && Intrinsics.areEqual(this.f6566c, bVar.f6566c) && Intrinsics.areEqual(this.f6567d, bVar.f6567d) && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f6568f, bVar.f6568f) && Intrinsics.areEqual(this.f6569g, bVar.f6569g) && Intrinsics.areEqual(this.f6570h, bVar.f6570h) && Intrinsics.areEqual(this.f6571i, bVar.f6571i);
    }

    public int hashCode() {
        String str = this.f6564a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6565b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6566c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6567d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f6568f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f6569g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f6570h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Map<String, Object> map = this.f6571i;
        return hashCode8 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LogEventDTO(productVersion=" + this.f6564a + ", environment=" + this.f6565b + ", appPackageName=" + this.f6566c + ", appPackageVersion=" + this.f6567d + ", appInstallID=" + this.e + ", deviceName=" + this.f6568f + ", platform=" + this.f6569g + ", osVersion=" + this.f6570h + ", event=" + this.f6571i + ")";
    }
}
