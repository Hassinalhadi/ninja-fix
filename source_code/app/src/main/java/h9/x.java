package h9;

import com.google.android.gms.tasks.OnFailureListener;
import com.incognia.internal.V2;
import com.incognia.internal.toE;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements OnFailureListener, G6.d {
    public final /* synthetic */ V2 alpha;
    public final /* synthetic */ toE purple;

    public /* synthetic */ x(V2 v22, toE toe) {
        this.alpha = v22;
        this.purple = toe;
    }

    @Override // G6.d
    public void alpha() {
        V2.W(this.alpha, this.purple);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        V2.b(this.alpha, this.purple, exc);
    }
}
