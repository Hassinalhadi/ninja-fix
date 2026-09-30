package io.ktor.util.date;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/util/date/InvalidDateStringException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", Column.DATA, "", "at", "pattern", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvalidDateStringException extends IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvalidDateStringException(@NotNull String data, int i4, @NotNull String pattern) {
        super(P0.fuchsia(r0, pattern, '\"'));
        Intrinsics.echo(data, "data");
        Intrinsics.echo(pattern, "pattern");
        StringBuilder sb2 = new StringBuilder("Failed to parse date string: \"");
        sb2.append(data);
        sb2.append("\" at index ");
        sb2.append(i4);
        sb2.append(". Pattern: \"");
    }
}
