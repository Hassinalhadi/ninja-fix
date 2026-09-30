package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Registry$MissingComponentException;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class j {
    public final Class alpha;
    public final List bravo;
    public final Q3.a charlie;
    public final J2.t delta;
    public final String echo;

    public j(Class cls, Class cls2, Class cls3, List list, Q3.a aVar, J2.t tVar) {
        this.alpha = cls;
        this.bravo = list;
        this.charlie = aVar;
        this.delta = tVar;
        this.echo = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final w alpha(int i4, int i5, E3.i iVar, com.bumptech.glide.load.data.g gVar, g gVar2) {
        w wVar;
        E3.m mVar;
        int i10;
        boolean z2;
        boolean z10;
        boolean z11;
        E3.f cVar;
        String str;
        J2.t tVar = this.delta;
        List list = (List) tVar.charlie();
        try {
            w bravo = bravo(gVar, i4, i5, iVar, list);
            tVar.alpha(list);
            i iVar2 = (i) gVar2.purple;
            iVar2.getClass();
            Class<?> cls = bravo.get().getClass();
            E3.a aVar = E3.a.silver;
            E3.a aVar2 = (E3.a) gVar2.alpha;
            f fVar = iVar2.alpha;
            E3.l lVar = null;
            if (aVar2 != aVar) {
                E3.m echo = fVar.echo(cls);
                mVar = echo;
                wVar = echo.bravo(iVar2.f3566a, bravo, iVar2.e, iVar2.f3570f);
            } else {
                wVar = bravo;
                mVar = null;
            }
            if (!bravo.equals(wVar)) {
                bravo.bravo();
            }
            if (fVar.charlie.bravo().delta.bravo(wVar.delta()) != null) {
                com.bumptech.glide.h bravo2 = fVar.charlie.bravo();
                bravo2.getClass();
                lVar = bravo2.delta.bravo(wVar.delta());
                if (lVar != null) {
                    i10 = lVar.beige(iVar2.f3572h);
                } else {
                    final Class delta = wVar.delta();
                    throw new Registry$MissingComponentException(delta) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + delta + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
            } else {
                i10 = 3;
            }
            E3.l lVar2 = lVar;
            E3.f fVar2 = iVar2.f3578n;
            ArrayList bravo3 = fVar.bravo();
            int size = bravo3.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (((J3.q) bravo3.get(i11)).alpha.equals(fVar2)) {
                        z2 = true;
                        break;
                    }
                    i11++;
                } else {
                    z2 = false;
                    break;
                }
            }
            switch (iVar2.f3571g.alpha) {
                default:
                    if (((!z2 && aVar2 == E3.a.red) || aVar2 == E3.a.alpha) && i10 == 2) {
                        z10 = true;
                        break;
                    }
                    break;
                case 0:
                case 1:
                    z10 = false;
                    break;
            }
            if (z10) {
                if (lVar2 != null) {
                    int mike = av.q.mike(i10);
                    if (mike != 0) {
                        if (mike == 1) {
                            z11 = true;
                            cVar = new y(fVar.charlie.alpha, iVar2.f3578n, iVar2.f3567b, iVar2.e, iVar2.f3570f, mVar, cls, iVar2.f3572h);
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        str = BuildConfig.TRAVIS;
                                    } else {
                                        str = "NONE";
                                    }
                                } else {
                                    str = "TRANSFORMED";
                                }
                            } else {
                                str = "SOURCE";
                            }
                            throw new IllegalArgumentException("Unknown strategy: ".concat(str));
                        }
                    } else {
                        z11 = true;
                        cVar = new c(iVar2.f3578n, iVar2.f3567b);
                    }
                    v vVar = (v) v.teal.charlie();
                    vVar.silver = false;
                    vVar.red = z11;
                    vVar.purple = wVar;
                    h hVar = iVar2.white;
                    hVar.purple = cVar;
                    hVar.red = lVar2;
                    hVar.silver = vVar;
                    wVar = vVar;
                } else {
                    final Class<?> cls2 = wVar.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
            }
            return this.charlie.alpha(wVar, iVar);
        } catch (Throwable th) {
            tVar.alpha(list);
            throw th;
        }
    }

    public final w bravo(com.bumptech.glide.load.data.g gVar, int i4, int i5, E3.i iVar, List list) {
        List list2 = this.bravo;
        int size = list2.size();
        w wVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            E3.k kVar = (E3.k) list2.get(i10);
            try {
                if (kVar.alpha(gVar.alpha(), iVar)) {
                    wVar = kVar.bravo(gVar.alpha(), i4, i5, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e);
                }
                list.add(e);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new GlideException(this.echo, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.alpha + ", decoders=" + this.bravo + ", transcoder=" + this.charlie + '}';
    }
}
