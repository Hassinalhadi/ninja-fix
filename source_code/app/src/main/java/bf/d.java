package bf;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import bj.l;
import java.util.concurrent.atomic.AtomicBoolean;
import r1.InterfaceC2482a;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements InterfaceC2482a {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;
    public final /* synthetic */ Object charlie;

    public /* synthetic */ d(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.bravo = obj;
        this.charlie = obj2;
    }

    @Override // r1.InterfaceC2482a
    public final void accept(Object obj) {
        switch (this.alpha) {
            case 0:
                ((Surface) this.bravo).release();
                ((SurfaceTexture) this.charlie).release();
                return;
            case 1:
                bj.c cVar = (bj.c) this.bravo;
                cVar.getClass();
                l lVar = (l) this.charlie;
                lVar.close();
                Surface surface = (Surface) cVar.hotel.remove(lVar);
                if (surface != null) {
                    bj.e eVar = cVar.alpha;
                    bl.i.delta((AtomicBoolean) eVar.red, true);
                    bl.i.charlie((Thread) eVar.teal);
                    eVar.oscar(surface, true);
                    return;
                }
                return;
            default:
                bk.e eVar2 = (bk.e) this.bravo;
                eVar2.getClass();
                l lVar2 = (l) this.charlie;
                lVar2.close();
                Surface surface2 = (Surface) eVar2.hotel.remove(lVar2);
                if (surface2 != null) {
                    bk.c cVar2 = eVar2.alpha;
                    bl.i.delta((AtomicBoolean) cVar2.red, true);
                    bl.i.charlie((Thread) cVar2.teal);
                    cVar2.oscar(surface2, true);
                    return;
                }
                return;
        }
    }
}
