package h6;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* loaded from: classes2.dex */
public final class h implements View.OnClickListener {
    public final /* synthetic */ Context alpha;
    public final /* synthetic */ Intent purple;

    public h(Context context, Intent intent) {
        this.alpha = context;
        this.purple = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.alpha.startActivity(this.purple);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
