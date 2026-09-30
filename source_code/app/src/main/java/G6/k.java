package G6;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class k implements OnSuccessListener, OnFailureListener, d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1360a;
    public final Object alpha = new Object();
    public final int purple;
    public final q red;
    public int silver;
    public int teal;
    public int white;
    public Exception yellow;

    public k(int i4, q qVar) {
        this.purple = i4;
        this.red = qVar;
    }

    @Override // G6.d
    public final void alpha() {
        synchronized (this.alpha) {
            this.white++;
            this.f1360a = true;
            bravo();
        }
    }

    public final void bravo() {
        int i4 = this.silver + this.teal + this.white;
        int i5 = this.purple;
        if (i4 == i5) {
            Exception exc = this.yellow;
            q qVar = this.red;
            if (exc != null) {
                qVar.oscar(new ExecutionException(this.teal + " out of " + i5 + " underlying tasks failed", this.yellow));
                return;
            }
            if (this.f1360a) {
                qVar.quebec();
            } else {
                qVar.papa(null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.alpha) {
            this.teal++;
            this.yellow = exc;
            bravo();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.alpha) {
            this.silver++;
            bravo();
        }
    }
}
