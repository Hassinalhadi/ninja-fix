package com.clevertap.android.sdk.inbox;

import com.clevertap.android.sdk.task.OnSuccessListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements OnSuccessListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CTInboxController purple;

    public /* synthetic */ b(CTInboxController cTInboxController, int i4) {
        this.alpha = i4;
        this.purple = cTInboxController;
    }

    @Override // com.clevertap.android.sdk.task.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.alpha) {
            case 0:
                CTInboxController.alpha(this.purple, (Void) obj);
                return;
            default:
                CTInboxController.delta(this.purple, (Void) obj);
                return;
        }
    }
}
