package V5;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class p extends q {
    public final /* synthetic */ Intent alpha;
    public final /* synthetic */ T5.h purple;

    public p(Intent intent, T5.h hVar) {
        this.alpha = intent;
        this.purple = hVar;
    }

    @Override // V5.q
    public final void alpha() {
        Intent intent = this.alpha;
        if (intent != null) {
            this.purple.startActivityForResult(intent, 2);
        }
    }
}
