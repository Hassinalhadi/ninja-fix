package com.checkout.eventlogger.data.e;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @P8.c("correlationId")
    @Nullable
    public final String f6561a;

    /* renamed from: b, reason: collision with root package name */
    @P8.c("loglevel")
    @NotNull
    public final String f6562b;

    public a(@Nullable String str, @NotNull String logLevel) {
        Intrinsics.echo(logLevel, "logLevel");
        this.f6561a = str;
        this.f6562b = logLevel;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f6561a, aVar.f6561a) && Intrinsics.areEqual(this.f6562b, aVar.f6562b);
    }

    public int hashCode() {
        String str = this.f6561a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6562b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CkoMetadataDTO(correlationId=");
        sb2.append(this.f6561a);
        sb2.append(", logLevel=");
        return P0.gold(sb2, this.f6562b, ")");
    }
}
