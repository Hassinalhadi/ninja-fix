package S5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* loaded from: classes2.dex */
public final class j {
    public final int alpha;
    public final G6.h bravo = new G6.h();
    public final int charlie;
    public final Bundle delta;
    public final /* synthetic */ int echo;

    public j(int i4, int i5, Bundle bundle, int i10) {
        this.echo = i10;
        this.alpha = i4;
        this.charlie = i5;
        this.delta = bundle;
    }

    public final boolean alpha() {
        switch (this.echo) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void bravo(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.bravo.alpha(zztVar);
    }

    public final void charlie(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.bravo.bravo(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.charlie + " id=" + this.alpha + " oneWay=" + alpha() + "}";
    }
}
