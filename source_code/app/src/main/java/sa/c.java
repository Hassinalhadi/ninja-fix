package sa;

import delivery.samurai.android.AndroidApp;
import io.reactivex.functions.Consumer;
import k4.C2007a;
import kotlin.jvm.functions.Function1;
import ma.C2109a;
import pf.C2361k;
import zc.n;
import zc.o;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Consumer {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    public /* synthetic */ c(int i4, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        Function1 function1 = this.purple;
        switch (this.alpha) {
            case 0:
                ((C2841b) function1).invoke(obj);
                return;
            case 1:
                ((C2841b) function1).invoke(obj);
                return;
            case 2:
                AndroidApp androidApp = AndroidApp.yellow;
                ((C2361k) function1).invoke(obj);
                return;
            case 3:
                ((C2109a) function1).invoke(obj);
                return;
            case 4:
                ((C2007a) function1).invoke(obj);
                return;
            case 5:
                ((n) function1).invoke(obj);
                return;
            case 6:
                ((n) function1).invoke(obj);
                return;
            case 7:
                ((C2109a) function1).invoke(obj);
                return;
            case 8:
                ((o) function1).invoke(obj);
                return;
            case 9:
                ((C2109a) function1).invoke(obj);
                return;
            default:
                ((o) function1).invoke(obj);
                return;
        }
    }
}
