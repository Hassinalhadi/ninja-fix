package bp;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.impl.EnumC0524w;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.az;
import androidx.lifecycle.au;
import av.B;
import av.C;
import bd.ExecutorC0748a;
import be.C0758d;
import be.RunnableC0756b;
import id.C1915c;
import java.util.ArrayList;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class c implements az {
    public final androidx.lifecycle.az alpha;
    public boolean purple;
    public final Object red;
    public Object silver;
    public final Object teal;
    public Object white;

    public c(InterfaceC0523v interfaceC0523v, androidx.lifecycle.az azVar, i iVar) {
        this.purple = false;
        this.red = interfaceC0523v;
        this.alpha = azVar;
        this.teal = iVar;
        synchronized (this) {
            this.silver = (h) azVar.getValue();
        }
    }

    public void alpha(h hVar) {
        synchronized (this) {
            try {
                if (((h) this.silver).equals(hVar)) {
                    return;
                }
                this.silver = hVar;
                AbstractC3066u3.bravo("StreamStateObserver", "Update Preview stream state to " + hVar);
                this.alpha.postValue(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.az
    public void foxtrot(Object obj) {
        EnumC0524w enumC0524w = (EnumC0524w) obj;
        EnumC0524w enumC0524w2 = EnumC0524w.CLOSING;
        h hVar = h.alpha;
        if (enumC0524w != enumC0524w2 && enumC0524w != EnumC0524w.CLOSED && enumC0524w != EnumC0524w.RELEASING && enumC0524w != EnumC0524w.RELEASED) {
            if ((enumC0524w == EnumC0524w.OPENING || enumC0524w == EnumC0524w.OPEN || enumC0524w == EnumC0524w.PENDING_OPEN) && !this.purple) {
                alpha(hVar);
                ArrayList arrayList = new ArrayList();
                InterfaceC0523v interfaceC0523v = (InterfaceC0523v) this.red;
                C0758d alpha = C0758d.alpha(AbstractC3003i.alpha(new A2.p(this, interfaceC0523v, arrayList, 12)));
                b bVar = new b(this);
                ExecutorC0748a bravo = tg.k.bravo();
                alpha.getClass();
                RunnableC0756b foxtrot = be.h.foxtrot(alpha, bVar, bravo);
                b bVar2 = new b(this);
                RunnableC0756b foxtrot2 = be.h.foxtrot(foxtrot, new androidx.core.widget.f(11, bVar2), tg.k.bravo());
                this.white = foxtrot2;
                C1915c c1915c = new C1915c(this, arrayList, interfaceC0523v);
                foxtrot2.foxtrot(new be.g(0, foxtrot2, c1915c), tg.k.bravo());
                this.purple = true;
                return;
            }
            return;
        }
        alpha(hVar);
        if (this.purple) {
            this.purple = false;
            C0758d c0758d = (C0758d) this.white;
            if (c0758d != null) {
                c0758d.cancel(false);
                this.white = null;
            }
        }
    }

    @Override // androidx.camera.core.impl.az
    public void onError(Throwable th) {
        C0758d c0758d = (C0758d) this.white;
        if (c0758d != null) {
            c0758d.cancel(false);
            this.white = null;
        }
        alpha(h.alpha);
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public c(av.h hVar, androidx.camera.camera2.internal.compat.j jVar, bd.h hVar2) {
        Range range;
        C jVar2;
        CameraCharacteristics.Key key;
        this.purple = false;
        this.white = new B(this);
        this.red = hVar;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) jVar.alpha(key);
            } catch (AssertionError e) {
                AbstractC3066u3.juliet("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
                range = null;
            }
            if (range != null) {
                jVar2 = new Pf.j(jVar);
                this.teal = jVar2;
                Z.a aVar = new Z.a(jVar2.juliet(), jVar2.papa());
                this.silver = aVar;
                aVar.golf();
                this.alpha = new au(new bf.b(aVar.delta(), aVar.bravo(), aVar.charlie(), aVar.alpha()));
                hVar.alpha((B) this.white);
            }
        }
        jVar2 = new androidx.core.widget.f(3, jVar);
        this.teal = jVar2;
        Z.a aVar2 = new Z.a(jVar2.juliet(), jVar2.papa());
        this.silver = aVar2;
        aVar2.golf();
        this.alpha = new au(new bf.b(aVar2.delta(), aVar2.bravo(), aVar2.charlie(), aVar2.alpha()));
        hVar.alpha((B) this.white);
    }
}
