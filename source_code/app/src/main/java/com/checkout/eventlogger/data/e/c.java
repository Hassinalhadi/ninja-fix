package com.checkout.eventlogger.data.e;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @P8.c("specversion")
    @NotNull
    public final String f6572a;

    /* renamed from: b, reason: collision with root package name */
    @P8.c(Constants.KEY_ID)
    @NotNull
    public final String f6573b;

    /* renamed from: c, reason: collision with root package name */
    @P8.c(Constants.KEY_TYPE)
    @NotNull
    public final String f6574c;

    /* renamed from: d, reason: collision with root package name */
    @P8.c("source")
    @NotNull
    public final String f6575d;

    @P8.c("time")
    @NotNull
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    @P8.c(Column.DATA)
    @NotNull
    public final b f6576f;

    /* renamed from: g, reason: collision with root package name */
    @P8.c("cko")
    @NotNull
    public final a f6577g;

    public c(@NotNull String specVersion, @NotNull String id2, @NotNull String type, @NotNull String source, @NotNull String time, @NotNull b data, @NotNull a cko) {
        Intrinsics.echo(specVersion, "specVersion");
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(source, "source");
        Intrinsics.echo(time, "time");
        Intrinsics.echo(data, "data");
        Intrinsics.echo(cko, "cko");
        this.f6572a = specVersion;
        this.f6573b = id2;
        this.f6574c = type;
        this.f6575d = source;
        this.e = time;
        this.f6576f = data;
        this.f6577g = cko;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f6572a, cVar.f6572a) && Intrinsics.areEqual(this.f6573b, cVar.f6573b) && Intrinsics.areEqual(this.f6574c, cVar.f6574c) && Intrinsics.areEqual(this.f6575d, cVar.f6575d) && Intrinsics.areEqual(this.e, cVar.e) && Intrinsics.areEqual(this.f6576f, cVar.f6576f) && Intrinsics.areEqual(this.f6577g, cVar.f6577g);
    }

    public int hashCode() {
        String str = this.f6572a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6573b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6574c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6575d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        b bVar = this.f6576f;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        a aVar = this.f6577g;
        return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LoggingCloudEventDTO(specVersion=" + this.f6572a + ", id=" + this.f6573b + ", type=" + this.f6574c + ", source=" + this.f6575d + ", time=" + this.e + ", data=" + this.f6576f + ", cko=" + this.f6577g + ")";
    }
}
