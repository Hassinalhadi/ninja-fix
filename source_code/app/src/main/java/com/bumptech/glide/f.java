package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import av.ah;
import java.util.List;

/* loaded from: classes3.dex */
public final class f extends ContextWrapper {
    public static final a kilo;
    public final G3.g alpha;
    public final com.google.android.gms.common.f bravo;
    public final com.google.mlkit.common.sdkinternal.b charlie;
    public final com.google.mlkit.common.sdkinternal.b delta;
    public final List echo;
    public final bv.e foxtrot;
    public final com.bumptech.glide.load.engine.l golf;
    public final ah hotel;
    public final int india;
    public U3.g juliet;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bumptech.glide.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.alpha = W3.b.alpha;
        kilo = obj;
    }

    public f(Context context, G3.g gVar, C3.d dVar, com.google.mlkit.common.sdkinternal.b bVar, com.google.mlkit.common.sdkinternal.b bVar2, bv.e eVar, List list, com.bumptech.glide.load.engine.l lVar, ah ahVar, int i4) {
        super(context.getApplicationContext());
        this.alpha = gVar;
        this.charlie = bVar;
        this.delta = bVar2;
        this.echo = list;
        this.foxtrot = eVar;
        this.golf = lVar;
        this.hotel = ahVar;
        this.india = i4;
        this.bravo = new com.google.android.gms.common.f(dVar);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [U3.g, U3.a] */
    public final synchronized U3.g alpha() {
        try {
            if (this.juliet == null) {
                this.delta.getClass();
                ?? aVar = new U3.a();
                aVar.f2124h = true;
                this.juliet = aVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.juliet;
    }

    public final h bravo() {
        return (h) this.bravo.get();
    }
}
