package com.clevertap.android.sdk.inbox;

import com.clevertap.android.sdk.task.OnFailureListener;
import com.google.gson.JsonIOException;
import com.google.gson.internal.n;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements OnFailureListener, n {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;

    public /* synthetic */ c(String str, int i4) {
        this.alpha = i4;
        this.purple = str;
    }

    @Override // com.google.gson.internal.n
    public Object delta() {
        switch (this.alpha) {
            case 1:
                throw new JsonIOException(this.purple);
            case 2:
                throw new JsonIOException(this.purple);
            case 3:
                throw new JsonIOException(this.purple);
            default:
                throw new JsonIOException(this.purple);
        }
    }

    @Override // com.clevertap.android.sdk.task.OnFailureListener
    public void onFailure(Object obj) {
        CTInboxController.lambda$_markReadForMessageWithId$1(this.purple, (Exception) obj);
    }
}
