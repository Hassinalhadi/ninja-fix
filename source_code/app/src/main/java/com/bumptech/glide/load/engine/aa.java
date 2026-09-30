package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import id.C1915c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class aa implements e, d {
    public final f alpha;
    public final i purple;
    public volatile int red;
    public volatile b silver;
    public volatile Object teal;
    public volatile J3.q white;
    public volatile c yellow;

    public aa(f fVar, i iVar) {
        this.alpha = fVar;
        this.purple = iVar;
    }

    @Override // com.bumptech.glide.load.engine.d
    public final void alpha(E3.f fVar, Exception exc, com.bumptech.glide.load.data.e eVar, E3.a aVar) {
        this.purple.alpha(fVar, exc, eVar, this.white.charlie.charlie());
    }

    @Override // com.bumptech.glide.load.engine.d
    public final void bravo(E3.f fVar, Object obj, com.bumptech.glide.load.data.e eVar, E3.a aVar, E3.f fVar2) {
        this.purple.bravo(fVar, obj, eVar, this.white.charlie.charlie(), fVar);
    }

    @Override // com.bumptech.glide.load.engine.e
    public final void cancel() {
        J3.q qVar = this.white;
        if (qVar != null) {
            qVar.charlie.cancel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (delta(r0) == false) goto L16;
     */
    @Override // com.bumptech.glide.load.engine.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean charlie() {
        if (this.teal != null) {
            Object obj = this.teal;
            this.teal = null;
            try {
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.silver == null || !this.silver.charlie()) {
            this.silver = null;
            this.white = null;
            boolean z2 = false;
            while (!z2 && this.red < this.alpha.bravo().size()) {
                ArrayList bravo = this.alpha.bravo();
                int i4 = this.red;
                this.red = i4 + 1;
                this.white = (J3.q) bravo.get(i4);
                if (this.white != null && (this.alpha.papa.alpha(this.white.charlie.charlie()) || this.alpha.charlie(this.white.charlie.alpha()) != null)) {
                    this.white.charlie.delta(this.alpha.oscar, new g(this, this.white));
                    z2 = true;
                }
            }
            return z2;
        }
        return true;
    }

    public final boolean delta(Object obj) {
        Throwable th;
        int i4 = Y3.h.bravo;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z2 = false;
        try {
            com.bumptech.glide.load.data.g hotel = this.alpha.charlie.bravo().hotel(obj);
            Object alpha = hotel.alpha();
            E3.c delta = this.alpha.delta(alpha);
            C1915c c1915c = new C1915c(delta, alpha, this.alpha.india, 27);
            E3.f fVar = this.white.alpha;
            f fVar2 = this.alpha;
            c cVar = new c(fVar, fVar2.november);
            H3.a alpha2 = fVar2.hotel.alpha();
            alpha2.hotel(cVar, c1915c);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + cVar + ", data: " + obj + ", encoder: " + delta + ", duration: " + Y3.h.alpha(elapsedRealtimeNanos));
            }
            if (alpha2.delta(cVar) != null) {
                this.yellow = cVar;
                this.silver = new b(Collections.singletonList(this.white.alpha), this.alpha, this);
                this.white.charlie.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.yellow + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.purple.bravo(this.white.alpha, hotel.alpha(), this.white.charlie, this.white.charlie.charlie(), this.white.alpha);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z2 = true;
                if (!z2) {
                    this.white.charlie.cleanup();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
