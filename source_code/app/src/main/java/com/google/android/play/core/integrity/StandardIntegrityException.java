package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import o7.AbstractC2200b;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public class StandardIntegrityException extends ApiException {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f8273a;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StandardIntegrityException(int i4, Throwable th) {
        super(new Status(i4, "Standard Integrity API error (" + i4 + "): " + r1 + ".", null, null));
        String str;
        Locale locale = Locale.ROOT;
        HashMap hashMap = AbstractC2200b.alpha;
        Integer valueOf = Integer.valueOf(i4);
        if (hashMap.containsKey(valueOf)) {
            HashMap hashMap2 = AbstractC2200b.bravo;
            if (hashMap2.containsKey(valueOf)) {
                str = AbstractC2327c.xray((String) hashMap.get(valueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#", (String) hashMap2.get(valueOf), ")");
                if (i4 == 0) {
                    this.f8273a = th;
                    return;
                }
                throw new IllegalArgumentException("ErrorCode should not be 0.");
            }
        }
        str = "";
        if (i4 == 0) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f8273a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
