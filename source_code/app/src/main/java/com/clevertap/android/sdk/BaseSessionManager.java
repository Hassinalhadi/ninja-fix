package com.clevertap.android.sdk;

import android.content.Context;

/* loaded from: classes3.dex */
abstract class BaseSessionManager {
    public abstract void destroySession();

    public abstract void lazyCreateSession(Context context);
}
