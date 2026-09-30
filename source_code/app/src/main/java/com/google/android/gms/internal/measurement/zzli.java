package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzli extends IOException {
    public zzli() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzli(long j5, long j6, int i4, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th);
        Locale locale = Locale.US;
        StringBuilder uniform = Q0.c.uniform("Pos: ", j5, ", limit: ");
        uniform.append(j6);
        uniform.append(", len: ");
        uniform.append(i4);
    }

    public zzli(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
