package io.ktor.http;

import Q0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/http/IllegalHeaderValueException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "headerValue", "", "position", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "getHeaderValue", "()Ljava/lang/String;", "I", "getPosition", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IllegalHeaderValueException extends IllegalArgumentException {

    @NotNull
    private final String headerValue;
    private final int position;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IllegalHeaderValueException(@NotNull String headerValue, int i4) {
        super(c.quebec(r0, headerValue.charAt(i4) & 255, ')'));
        Intrinsics.echo(headerValue, "headerValue");
        StringBuilder sb2 = new StringBuilder("Header value '");
        sb2.append(headerValue);
        sb2.append("' contains illegal character '");
        sb2.append(headerValue.charAt(i4));
        sb2.append("' (code ");
        this.headerValue = headerValue;
        this.position = i4;
    }

    @NotNull
    public final String getHeaderValue() {
        return this.headerValue;
    }

    public final int getPosition() {
        return this.position;
    }
}
