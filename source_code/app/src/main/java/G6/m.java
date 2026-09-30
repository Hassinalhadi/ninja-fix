package G6;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import s6.E;

/* loaded from: classes2.dex */
public final class m implements o, OnSuccessListener, OnFailureListener, d {
    public final /* synthetic */ int alpha;
    public final Executor purple;
    public final c red;
    public final q silver;

    public /* synthetic */ m(Executor executor, c cVar, q qVar, int i4) {
        this.alpha = i4;
        this.purple = executor;
        this.red = cVar;
        this.silver = qVar;
    }

    @Override // G6.d
    public void alpha() {
        this.silver.quebec();
    }

    @Override // G6.o
    public final void bravo(Task task) {
        switch (this.alpha) {
            case 0:
                this.purple.execute(new E(1, this, task, false));
                return;
            default:
                this.purple.execute(new be.g(2, this, task, false));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.silver.oscar(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        this.silver.papa(obj);
    }
}
