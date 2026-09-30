package F8;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class d implements OnSuccessListener, OnFailureListener, G6.d, G6.e {
    public final CountDownLatch alpha;

    @Override // G6.d
    public void alpha() {
        this.alpha.countDown();
    }

    @Override // G6.e
    public void onComplete(Task task) {
        this.alpha.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.alpha.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        this.alpha.countDown();
    }

    public d() {
        this.alpha = new CountDownLatch(1);
    }
}
