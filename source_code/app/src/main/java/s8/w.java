package s8;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ RemoteConfigManager alpha;

    public /* synthetic */ w(RemoteConfigManager remoteConfigManager) {
        this.alpha = remoteConfigManager;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        RemoteConfigManager.alpha(this.alpha, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        RemoteConfigManager.bravo(this.alpha, (Boolean) obj);
    }
}
