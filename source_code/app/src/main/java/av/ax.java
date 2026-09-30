package av;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.inapp.InAppActionHandler;
import com.google.android.gms.tasks.OnSuccessListener;
import s6.AbstractC2647f0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ax implements V0.i, InAppActionHandler.PushPermissionPromptPresenter, OnSuccessListener {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ax(Object obj, boolean z2) {
        this.purple = obj;
        this.alpha = z2;
    }

    @Override // V0.i
    public Object black(V0.h hVar) {
        A a6 = (A) this.purple;
        a6.getClass();
        boolean z2 = this.alpha;
        a6.delta.execute(new az(a6, hVar, z2));
        return "enableTorch: " + z2;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor edit = AbstractC2647f0.alpha((Context) this.purple).edit();
        edit.putBoolean("proxy_retention", this.alpha);
        edit.apply();
    }

    @Override // com.clevertap.android.sdk.inapp.InAppActionHandler.PushPermissionPromptPresenter
    public void showPrompt(Activity activity) {
        InAppActionHandler.launchPushPermissionPrompt$lambda$0(this.alpha, (InAppActionHandler) this.purple, activity);
    }

    public /* synthetic */ ax(boolean z2, InAppActionHandler inAppActionHandler) {
        this.alpha = z2;
        this.purple = inAppActionHandler;
    }
}
