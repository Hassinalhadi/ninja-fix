package com.fingerprintjs.android.fpjs_pro;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/UnknownError;", "Lcom/fingerprintjs/android/fpjs_pro/Error;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnknownError extends Error {
    public UnknownError(String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        super((i4 & 1) != 0 ? "Unknown" : str, (i4 & 2) != 0 ? "Unknown" : str2);
    }
}
