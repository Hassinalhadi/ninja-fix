package com.checkout.components.insight;

import android.os.Build;
import com.clevertap.android.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/insight/TimestampFormatter;", "", "", "sdkVersion", "Ljava/text/SimpleDateFormat;", "formatter", "<init>", "(ILjava/text/SimpleDateFormat;)V", "Ljava/util/Date;", Constants.KEY_DATE, "", "format", "(Ljava/util/Date;)Ljava/lang/String;", "b", "Ljava/text/SimpleDateFormat;", "getFormatter$insight_standardRelease", "()Ljava/text/SimpleDateFormat;", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimestampFormatter {

    /* renamed from: a, reason: collision with root package name */
    private final int f5123a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SimpleDateFormat formatter;

    /* JADX WARN: Multi-variable type inference failed */
    public TimestampFormatter() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final synchronized String format(Date date) {
        Intrinsics.echo(date, "date");
        String format = this.formatter.format(date);
        if (this.f5123a < 24) {
            Intrinsics.checkNotNull(format);
            Intrinsics.echo(format, "<this>");
            int length = format.length() - 2;
            if (length < 0) {
                length = 0;
            }
            return StringsKt.yellow(length, format) + ":" + StringsKt.a(2, format);
        }
        Intrinsics.checkNotNull(format);
        return format;
    }

    /* renamed from: getFormatter$insight_standardRelease, reason: from getter */
    public final SimpleDateFormat getFormatter() {
        return this.formatter;
    }

    public TimestampFormatter(int i4, SimpleDateFormat formatter) {
        Intrinsics.echo(formatter, "formatter");
        this.f5123a = i4;
        this.formatter = formatter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TimestampFormatter(int i4, SimpleDateFormat simpleDateFormat, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, simpleDateFormat);
        i4 = (i5 & 1) != 0 ? Build.VERSION.SDK_INT : i4;
        if ((i5 & 2) != 0) {
            simpleDateFormat = new SimpleDateFormat(i4 >= 24 ? com.checkout.components.insight.common.Constants.DATE_TIME_PATTERN_ISO_8601 : com.checkout.components.insight.common.Constants.DATE_TIME_PATTERN, Locale.ROOT);
        }
    }
}
