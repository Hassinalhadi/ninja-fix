package J7;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ f purple;
    public final /* synthetic */ Runnable red;
    public final /* synthetic */ D8.c silver;

    public /* synthetic */ e(f fVar, Runnable runnable, D8.c cVar, int i4) {
        this.alpha = i4;
        this.purple = fVar;
        this.red = runnable;
        this.silver = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                f fVar = this.purple;
                final D8.c cVar = this.silver;
                final Runnable runnable = this.red;
                final int i4 = 0;
                fVar.alpha.execute(new Runnable() { // from class: J7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar.purple).kilo(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) cVar.purple).kilo(e4);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) cVar.purple;
                                try {
                                    runnable2.run();
                                    hVar.juliet(null);
                                    return;
                                } catch (Exception e5) {
                                    hVar.kilo(e5);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                f fVar2 = this.purple;
                final D8.c cVar2 = this.silver;
                final Runnable runnable2 = this.red;
                final int i5 = 2;
                fVar2.alpha.execute(new Runnable() { // from class: J7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar2.purple).kilo(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) cVar2.purple).kilo(e4);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) cVar2.purple;
                                try {
                                    runnable22.run();
                                    hVar.juliet(null);
                                    return;
                                } catch (Exception e5) {
                                    hVar.kilo(e5);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                f fVar3 = this.purple;
                final D8.c cVar3 = this.silver;
                final Runnable runnable3 = this.red;
                final int i10 = 1;
                fVar3.alpha.execute(new Runnable() { // from class: J7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar3.purple).kilo(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) cVar3.purple).kilo(e4);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) cVar3.purple;
                                try {
                                    runnable22.run();
                                    hVar.juliet(null);
                                    return;
                                } catch (Exception e5) {
                                    hVar.kilo(e5);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
