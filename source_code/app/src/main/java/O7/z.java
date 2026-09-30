package O7;

import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderExecutors;
import com.clevertap.android.sdk.task.OnFailureListener;
import com.clevertap.android.sdk.task.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements G6.c, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ CountDownLatch alpha;

    public /* synthetic */ z(CountDownLatch countDownLatch) {
        this.alpha = countDownLatch;
    }

    @Override // G6.c
    public Object ivory(Task task) {
        this.alpha.countDown();
        return null;
    }

    @Override // com.clevertap.android.sdk.task.OnFailureListener
    public void onFailure(Object obj) {
        FilePreloaderExecutors.bravo(this.alpha, (Exception) obj);
    }

    @Override // com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        FilePreloaderExecutors.alpha(this.alpha, (Unit) obj);
    }
}
