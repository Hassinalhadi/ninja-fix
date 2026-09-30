package com.bumptech.glide.load.engine;

/* loaded from: classes3.dex */
public final class m implements Runnable {
    public final /* synthetic */ int alpha;
    public final U3.h purple;
    public final /* synthetic */ p red;

    public /* synthetic */ m(p pVar, U3.h hVar, int i4) {
        this.alpha = i4;
        this.red = pVar;
        this.purple = hVar;
    }

    private final void alpha() {
        U3.h hVar = this.purple;
        hVar.bravo.alpha();
        synchronized (hVar.charlie) {
            synchronized (this.red) {
                try {
                    o oVar = this.red.alpha;
                    U3.h hVar2 = this.purple;
                    oVar.getClass();
                    if (oVar.alpha.contains(new n(hVar2, Y3.f.bravo))) {
                        p pVar = this.red;
                        U3.h hVar3 = this.purple;
                        pVar.getClass();
                        try {
                            hVar3.golf(pVar.f3598j, 5);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    this.red.delta();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                alpha();
                return;
            default:
                U3.h hVar = this.purple;
                hVar.bravo.alpha();
                synchronized (hVar.charlie) {
                    synchronized (this.red) {
                        try {
                            o oVar = this.red.alpha;
                            U3.h hVar2 = this.purple;
                            oVar.getClass();
                            if (oVar.alpha.contains(new n(hVar2, Y3.f.bravo))) {
                                this.red.f3600l.alpha();
                                p pVar = this.red;
                                U3.h hVar3 = this.purple;
                                pVar.getClass();
                                try {
                                    hVar3.hotel(pVar.f3600l, pVar.f3596h, pVar.f3603o);
                                    this.red.juliet(this.purple);
                                } catch (Throwable th) {
                                    throw new CallbackException(th);
                                }
                            }
                            this.red.delta();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
