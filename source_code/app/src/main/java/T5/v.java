package T5;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class v extends BroadcastReceiver {
    public Context alpha;
    public final u bravo;

    public v(u uVar) {
        this.bravo = uVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            ai aiVar = (ai) this.bravo;
            aj ajVar = (aj) aiVar.bravo.red;
            ajVar.red.set(null);
            ajVar.india();
            Dialog dialog = aiVar.alpha;
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.alpha;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.alpha = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
