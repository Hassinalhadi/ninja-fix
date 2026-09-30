package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
final class ar extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return;
                } else {
                    throw null;
                }
            }
            throw null;
        }
        throw null;
    }
}
