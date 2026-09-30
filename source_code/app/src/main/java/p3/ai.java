package p3;

import android.os.Handler;
import com.app.feature.location.api.StompStateHolder;
import ga.as;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final class ai {
    public final Handler alpha;
    public final InterfaceC3142e bravo;
    public final P7.c charlie;
    public final P7.c delta;
    public final C2275g echo;
    public final C2275g foxtrot;
    public final C2275g golf;
    public final C2275g hotel;
    public final C2275g india;
    public final StompStateHolder juliet;
    public final P7.c kilo;
    public final P7.c lima;
    public final C2275g mike;
    public as november;
    public int oscar;

    public ai(Handler handler, InterfaceC3142e interfaceC3142e, P7.c cVar, P7.c cVar2, C2275g c2275g, C2275g c2275g2, C2275g c2275g3, C2275g c2275g4, C2275g c2275g5, StompStateHolder stompStateHolder, P7.c cVar3, P7.c cVar4, C2275g c2275g6) {
        this.alpha = handler;
        this.bravo = interfaceC3142e;
        this.charlie = cVar;
        this.delta = cVar2;
        this.echo = c2275g;
        this.foxtrot = c2275g2;
        this.golf = c2275g3;
        this.hotel = c2275g4;
        this.india = c2275g5;
        this.juliet = stompStateHolder;
        this.kilo = cVar3;
        this.lima = cVar4;
        this.mike = c2275g6;
    }

    public final void alpha(Runnable runnable) {
        this.alpha.postDelayed(runnable, 60000L);
    }
}
