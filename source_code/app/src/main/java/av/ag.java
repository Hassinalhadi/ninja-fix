package av;

import com.clevertap.android.sdk.Constants;
import s6.T7;

/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements V0.i {
    public final /* synthetic */ aj alpha;

    public void alpha() {
        aj ajVar = this.alpha;
        synchronized (ajVar.alpha) {
            try {
                if (ajVar.india == 5) {
                    ajVar.lima(ajVar.foxtrot);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V0.i
    public Object black(V0.h hVar) {
        boolean z2;
        String str;
        aj ajVar = this.alpha;
        synchronized (ajVar.alpha) {
            if (ajVar.kilo == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            T7.golf("Release completer expected to be null", z2);
            ajVar.kilo = hVar;
            str = "Release[session=" + ajVar + Constants.AES_SUFFIX;
        }
        return str;
    }
}
