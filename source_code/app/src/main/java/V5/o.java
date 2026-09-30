package V5;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class o extends q {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Intent purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ o(Intent intent, Object obj, int i4, int i5) {
        this.alpha = i5;
        this.purple = intent;
        this.silver = obj;
        this.red = i4;
    }

    @Override // V5.q
    public final void alpha() {
        switch (this.alpha) {
            case 0:
                Intent intent = this.purple;
                if (intent != null) {
                    ((Activity) this.silver).startActivityForResult(intent, this.red);
                    return;
                }
                return;
            default:
                Intent intent2 = this.purple;
                if (intent2 != null) {
                    ((androidx.fragment.app.ai) this.silver).startActivityForResult(intent2, this.red);
                    return;
                }
                return;
        }
    }
}
