package io.ktor.http;

import Q0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/http/IllegalHeaderNameException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "headerName", "", "position", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "getHeaderName", "()Ljava/lang/String;", "I", "getPosition", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IllegalHeaderNameException extends IllegalArgumentException {

    @NotNull
    private final String headerName;
    private final int position;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IllegalHeaderNameException(@NotNull String headerName, int i4) {
        super(c.quebec(r0, headerName.charAt(i4) & 255, ')'));
        Intrinsics.echo(headerName, "headerName");
        StringBuilder sb2 = new StringBuilder("Header name '");
        sb2.append(headerName);
        sb2.append("' contains illegal character '");
        sb2.append(headerName.charAt(i4));
        sb2.append("' (code ");
        this.headerName = headerName;
        this.position = i4;
    }

    @NotNull
    public final String getHeaderName() {
        return this.headerName;
    }

    public final int getPosition() {
        return this.position;
    }
}
