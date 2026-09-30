package com.checkout.components.insight.data.dto;

import com.google.android.material.datepicker.j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/insight/data/dto/DeviceDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/insight/data/dto/DeviceData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/checkout/components/insight/data/dto/DeviceData;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/checkout/components/insight/data/dto/DeviceData;)V", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceDataJsonAdapter extends JsonAdapter<DeviceData> {

    /* renamed from: a, reason: collision with root package name */
    private final JsonReader.Options f5147a;

    /* renamed from: b, reason: collision with root package name */
    private final JsonAdapter f5148b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter f5149c;

    public DeviceDataJsonAdapter(Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonReader.Options of2 = JsonReader.Options.of("product_version", "platform", "os_version", "device_name", "app_install_id", "app_package_name", "app_package_version", "accessibility");
        Intrinsics.delta(of2, "of(...)");
        this.f5147a = of2;
        u uVar = u.alpha;
        JsonAdapter adapter = moshi.adapter(String.class, uVar, "productVersion");
        Intrinsics.delta(adapter, "adapter(...)");
        this.f5148b = adapter;
        JsonAdapter adapter2 = moshi.adapter(Accessibility.class, uVar, "accessibility");
        Intrinsics.delta(adapter2, "adapter(...)");
        this.f5149c = adapter2;
    }

    public final String toString() {
        return j.india(32, "GeneratedJsonAdapter(DeviceData)");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x004d. Please report as an issue. */
    @Override // com.squareup.moshi.JsonAdapter
    public final DeviceData fromJson(JsonReader reader) {
        Intrinsics.echo(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Accessibility accessibility = null;
        while (true) {
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            String str13 = str6;
            String str14 = str7;
            if (reader.hasNext()) {
                Accessibility accessibility2 = accessibility;
                switch (reader.selectName(this.f5147a)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        accessibility = accessibility2;
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        str6 = str13;
                        str7 = str14;
                    case 0:
                        str = (String) this.f5148b.fromJson(reader);
                        if (str == null) {
                            throw Util.unexpectedNull("productVersion", "product_version", reader);
                        }
                        accessibility = accessibility2;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        str6 = str13;
                        str7 = str14;
                    case 1:
                        str2 = (String) this.f5148b.fromJson(reader);
                        if (str2 == null) {
                            throw Util.unexpectedNull("platform", "platform", reader);
                        }
                        accessibility = accessibility2;
                        str = str8;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        str6 = str13;
                        str7 = str14;
                    case 2:
                        str3 = (String) this.f5148b.fromJson(reader);
                        if (str3 == null) {
                            throw Util.unexpectedNull("osVersion", "os_version", reader);
                        }
                        accessibility = accessibility2;
                        str = str8;
                        str2 = str9;
                        str4 = str11;
                        str5 = str12;
                        str6 = str13;
                        str7 = str14;
                    case 3:
                        str4 = (String) this.f5148b.fromJson(reader);
                        if (str4 == null) {
                            throw Util.unexpectedNull("deviceName", "device_name", reader);
                        }
                        accessibility = accessibility2;
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str5 = str12;
                        str6 = str13;
                        str7 = str14;
                    case 4:
                        str5 = (String) this.f5148b.fromJson(reader);
                        if (str5 == null) {
                            throw Util.unexpectedNull("appInstallId", "app_install_id", reader);
                        }
                        accessibility = accessibility2;
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str6 = str13;
                        str7 = str14;
                    case 5:
                        str6 = (String) this.f5148b.fromJson(reader);
                        if (str6 == null) {
                            throw Util.unexpectedNull("appPackageName", "app_package_name", reader);
                        }
                        accessibility = accessibility2;
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        str7 = str14;
                    case 6:
                        str7 = (String) this.f5148b.fromJson(reader);
                        if (str7 == null) {
                            throw Util.unexpectedNull("appPackageNameVersion", "app_package_version", reader);
                        }
                        accessibility = accessibility2;
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        str6 = str13;
                    case 7:
                        accessibility = (Accessibility) this.f5149c.fromJson(reader);
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        str6 = str13;
                        str7 = str14;
                    default:
                        accessibility = accessibility2;
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                        str4 = str11;
                        str5 = str12;
                        str6 = str13;
                        str7 = str14;
                }
            } else {
                Accessibility accessibility3 = accessibility;
                reader.endObject();
                if (str8 == null) {
                    throw Util.missingProperty("productVersion", "product_version", reader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("platform", "platform", reader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("osVersion", "os_version", reader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("deviceName", "device_name", reader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("appInstallId", "app_install_id", reader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("appPackageName", "app_package_name", reader);
                }
                if (str14 != null) {
                    return new DeviceData(str8, str9, str10, str11, str12, str13, str14, accessibility3);
                }
                throw Util.missingProperty("appPackageNameVersion", "app_package_version", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter writer, DeviceData value_) {
        Intrinsics.echo(writer, "writer");
        if (value_ != null) {
            writer.beginObject();
            writer.name("product_version");
            this.f5148b.toJson(writer, (JsonWriter) value_.getProductVersion());
            writer.name("platform");
            this.f5148b.toJson(writer, (JsonWriter) value_.getPlatform());
            writer.name("os_version");
            this.f5148b.toJson(writer, (JsonWriter) value_.getOsVersion());
            writer.name("device_name");
            this.f5148b.toJson(writer, (JsonWriter) value_.getDeviceName());
            writer.name("app_install_id");
            this.f5148b.toJson(writer, (JsonWriter) value_.getAppInstallId());
            writer.name("app_package_name");
            this.f5148b.toJson(writer, (JsonWriter) value_.getAppPackageName());
            writer.name("app_package_version");
            this.f5148b.toJson(writer, (JsonWriter) value_.getAppPackageNameVersion());
            writer.name("accessibility");
            this.f5149c.toJson(writer, (JsonWriter) value_.getAccessibility());
            writer.endObject();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
