package P3;

import Y3.l;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.m;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class h {
    public final D3.d alpha;
    public final Handler bravo;
    public final ArrayList charlie;
    public final m delta;
    public final G3.b echo;
    public boolean foxtrot;
    public boolean golf;
    public com.bumptech.glide.j hotel;
    public e india;
    public boolean juliet;
    public e kilo;
    public Bitmap lima;
    public e mike;
    public int november;
    public int oscar;
    public int papa;

    public h(com.bumptech.glide.b bVar, D3.d dVar, int i4, int i5, Bitmap bitmap) {
        L3.c cVar = L3.c.bravo;
        G3.b bVar2 = bVar.alpha;
        com.bumptech.glide.f fVar = bVar.red;
        m echo = com.bumptech.glide.b.echo(fVar.getBaseContext());
        com.bumptech.glide.j alpha = com.bumptech.glide.b.echo(fVar.getBaseContext()).foxtrot().alpha(((U3.g) ((U3.g) ((U3.g) new U3.a().echo(com.bumptech.glide.load.engine.k.bravo)).whiskey()).romeo()).kilo(i4, i5));
        this.charlie = new ArrayList();
        this.delta = echo;
        Handler handler = new Handler(Looper.getMainLooper(), new g(0, this));
        this.echo = bVar2;
        this.bravo = handler;
        this.hotel = alpha;
        this.alpha = dVar;
        charlie(cVar, bitmap);
    }

    public final void alpha() {
        int i4;
        int i5;
        if (this.foxtrot && !this.golf) {
            e eVar = this.mike;
            if (eVar != null) {
                this.mike = null;
                bravo(eVar);
                return;
            }
            this.golf = true;
            D3.d dVar = this.alpha;
            D3.b bVar = dVar.lima;
            int i10 = bVar.charlie;
            if (i10 > 0 && (i5 = dVar.kilo) >= 0) {
                if (i5 >= 0 && i5 < i10) {
                    i4 = ((D3.a) bVar.echo.get(i5)).india;
                } else {
                    i4 = -1;
                }
            } else {
                i4 = 0;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i4;
            int i11 = (dVar.kilo + 1) % dVar.lima.charlie;
            dVar.kilo = i11;
            this.kilo = new e(this.bravo, i11, uptimeMillis);
            com.bumptech.glide.j crimson = this.hotel.alpha((U3.g) new U3.a().quebec(new X3.d(Double.valueOf(Math.random())))).crimson(dVar);
            crimson.beige(this.kilo, null, crimson, Y3.f.alpha);
        }
    }

    public final void bravo(e eVar) {
        int i4;
        this.golf = false;
        boolean z2 = this.juliet;
        Handler handler = this.bravo;
        if (z2) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.foxtrot) {
            this.mike = eVar;
            return;
        }
        if (eVar.yellow != null) {
            Bitmap bitmap = this.lima;
            if (bitmap != null) {
                this.echo.delta(bitmap);
                this.lima = null;
            }
            e eVar2 = this.india;
            this.india = eVar;
            ArrayList arrayList = this.charlie;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    e eVar3 = ((h) cVar.alpha.bravo).india;
                    if (eVar3 != null) {
                        i4 = eVar3.teal;
                    } else {
                        i4 = -1;
                    }
                    if (i4 == r5.alpha.lima.charlie - 1) {
                        cVar.white++;
                    }
                    int i5 = cVar.yellow;
                    if (i5 != -1 && cVar.white >= i5) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        alpha();
    }

    public final void charlie(E3.m mVar, Bitmap bitmap) {
        Y3.f.charlie(mVar, "Argument must not be null");
        Y3.f.charlie(bitmap, "Argument must not be null");
        this.lima = bitmap;
        this.hotel = this.hotel.alpha(new U3.a().tango(mVar, true));
        this.november = l.charlie(bitmap);
        this.oscar = bitmap.getWidth();
        this.papa = bitmap.getHeight();
    }
}
