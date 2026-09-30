package Jb;

import delivery.samurai.android.notifications.MyFirebaseMessagingService;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class I implements Consumer {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    public /* synthetic */ I(int i4, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        Function1 function1 = this.purple;
        switch (this.alpha) {
            case 0:
                ((G) function1).invoke(obj);
                return;
            case 1:
                ((Fb.j) function1).invoke(obj);
                return;
            case 2:
                ((G) function1).invoke(obj);
                return;
            case 3:
                ((Cb.ad) function1).invoke(obj);
                return;
            case 4:
                ((C) function1).invoke(obj);
                return;
            case 5:
                ((Fb.j) function1).invoke(obj);
                return;
            case 6:
                ((G) function1).invoke(obj);
                return;
            case 7:
                ((Fb.j) function1).invoke(obj);
                return;
            case 8:
                ((G) function1).invoke(obj);
                return;
            case 9:
                ((Kc.f) function1).invoke(obj);
                return;
            case 10:
                ((Kc.f) function1).invoke(obj);
                return;
            case 11:
                ((Kc.h) function1).invoke(obj);
                return;
            case 12:
                ((Kc.h) function1).invoke(obj);
                return;
            case 13:
                ((Fb.j) function1).invoke(obj);
                return;
            case 14:
                ((Ob.a) function1).invoke(obj);
                return;
            case 15:
                ((Fb.j) function1).invoke(obj);
                return;
            case 16:
                ((Ob.a) function1).invoke(obj);
                return;
            case 17:
                ((Fb.j) function1).invoke(obj);
                return;
            case 18:
                ((Cb.ad) function1).invoke(obj);
                return;
            case 19:
                int i4 = MyFirebaseMessagingService.yellow;
                ((Cb.ad) function1).invoke(obj);
                return;
            case 20:
                int i5 = MyFirebaseMessagingService.yellow;
                ((Lb.am) function1).invoke(obj);
                return;
            case 21:
                ((Fb.j) function1).invoke(obj);
                return;
            case 22:
                ((Wc.s) function1).invoke(obj);
                return;
            case 23:
                ((Fb.j) function1).invoke(obj);
                return;
            case 24:
                ((Wc.s) function1).invoke(obj);
                return;
            case 25:
                ((Fb.j) function1).invoke(obj);
                return;
            case 26:
                ((Wc.s) function1).invoke(obj);
                return;
            case 27:
                ((Fb.j) function1).invoke(obj);
                return;
            case 28:
                ((Wc.s) function1).invoke(obj);
                return;
            default:
                ((X9.e) function1).invoke(obj);
                return;
        }
    }
}
