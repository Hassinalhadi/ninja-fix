package io.getunleash.android.errors;

import ao.ad;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/getunleash/android/errors/ServerException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "statusCode", "", "<init>", "(I)V", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServerException extends Exception {
    public ServerException(int i4) {
        super(ad.zulu(i4, "Unleash responded with "));
    }
}
