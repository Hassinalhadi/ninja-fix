package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import id.C1915c;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class a implements E3.k {
    public final /* synthetic */ int alpha;
    public final Object bravo;
    public final Object charlie;

    public /* synthetic */ a(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.bravo = obj;
        this.charlie = obj2;
    }

    @Override // E3.k
    public final boolean alpha(Object obj, E3.i iVar) {
        switch (this.alpha) {
            case 0:
                return ((E3.k) this.bravo).alpha(obj, iVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((o) this.bravo).getClass();
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.InputStream] */
    @Override // E3.k
    public final com.bumptech.glide.load.engine.w bravo(Object obj, int i4, int i5, E3.i iVar) {
        boolean z2;
        w wVar;
        Y3.e eVar;
        Y3.e eVar2;
        switch (this.alpha) {
            case 0:
                com.bumptech.glide.load.engine.w bravo = ((E3.k) this.bravo).bravo(obj, i4, i5, iVar);
                if (bravo == null) {
                    return null;
                }
                return new c((Resources) this.charlie, bravo);
            case 1:
                com.bumptech.glide.load.engine.w charlie = ((N3.c) this.bravo).charlie((Uri) obj, iVar);
                if (charlie == null) {
                    return null;
                }
                return q.alpha((G3.b) this.charlie, (Drawable) ((N3.b) charlie).get(), i4, i5);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof w) {
                    wVar = (w) inputStream;
                    z2 = false;
                } else {
                    z2 = true;
                    wVar = new w(inputStream, (G3.g) this.charlie);
                }
                ArrayDeque arrayDeque = Y3.e.red;
                synchronized (arrayDeque) {
                    eVar = (Y3.e) arrayDeque.poll();
                    eVar2 = eVar;
                }
                if (eVar == null) {
                    eVar2 = new InputStream();
                }
                Y3.e eVar3 = eVar2;
                eVar3.alpha = wVar;
                Oe.a aVar = new Oe.a(eVar3);
                J2.l lVar = new J2.l(wVar, eVar3);
                try {
                    o oVar = (o) this.bravo;
                    c alpha = oVar.alpha(new C1915c(aVar, oVar.delta, oVar.charlie), i4, i5, iVar, lVar);
                    eVar3.charlie();
                    if (z2) {
                        wVar.echo();
                    }
                    return alpha;
                } finally {
                }
        }
    }

    public a(Resources resources, E3.k kVar) {
        this.alpha = 0;
        this.charlie = resources;
        this.bravo = kVar;
    }
}
