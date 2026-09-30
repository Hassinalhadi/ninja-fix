package U3;

/* loaded from: classes3.dex */
public final class b implements d, c {
    public final Object alpha;
    public final Object bravo;
    public volatile c charlie;
    public volatile c delta;
    public int echo = 3;
    public int foxtrot = 3;

    public b(Object obj, d dVar) {
        this.alpha = obj;
        this.bravo = dVar;
    }

    @Override // U3.d, U3.c
    public final boolean alpha() {
        boolean z2;
        synchronized (this.alpha) {
            try {
                if (!this.charlie.alpha() && !this.delta.alpha()) {
                    z2 = false;
                }
                z2 = true;
            } finally {
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final boolean bravo(c cVar) {
        boolean z2;
        synchronized (this.alpha) {
            ?? r12 = this.bravo;
            if ((r12 == 0 || r12.bravo(this)) && cVar.equals(this.charlie)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final d charlie() {
        d dVar;
        synchronized (this.alpha) {
            try {
                ?? r12 = this.bravo;
                if (r12 != 0) {
                    dVar = r12.charlie();
                } else {
                    dVar = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // U3.c
    public final void clear() {
        synchronized (this.alpha) {
            try {
                this.echo = 3;
                this.charlie.clear();
                if (this.foxtrot != 3) {
                    this.foxtrot = 3;
                    this.delta.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final void delta(c cVar) {
        synchronized (this.alpha) {
            try {
                if (cVar.equals(this.charlie)) {
                    this.echo = 4;
                } else if (cVar.equals(this.delta)) {
                    this.foxtrot = 4;
                }
                ?? r4 = this.bravo;
                if (r4 != 0) {
                    r4.delta(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U3.c
    public final boolean echo(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.charlie.echo(bVar.charlie) && this.delta.echo(bVar.delta)) {
                return true;
            }
        }
        return false;
    }

    @Override // U3.c
    public final boolean foxtrot() {
        boolean z2;
        synchronized (this.alpha) {
            try {
                if (this.echo == 3 && this.foxtrot == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } finally {
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final void golf(c cVar) {
        synchronized (this.alpha) {
            try {
                if (!cVar.equals(this.delta)) {
                    this.echo = 5;
                    if (this.foxtrot != 1) {
                        this.foxtrot = 1;
                        this.delta.india();
                    }
                    return;
                }
                this.foxtrot = 5;
                ?? r32 = this.bravo;
                if (r32 != 0) {
                    r32.golf(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final boolean hotel(c cVar) {
        boolean z2;
        synchronized (this.alpha) {
            ?? r02 = this.bravo;
            if (r02 != 0 && !r02.hotel(this)) {
                z2 = false;
            }
            z2 = true;
        }
        return z2;
    }

    @Override // U3.c
    public final void india() {
        synchronized (this.alpha) {
            try {
                if (this.echo != 1) {
                    this.echo = 1;
                    this.charlie.india();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U3.c
    public final boolean isComplete() {
        boolean z2;
        synchronized (this.alpha) {
            try {
                if (this.echo != 4 && this.foxtrot != 4) {
                    z2 = false;
                }
                z2 = true;
            } finally {
            }
        }
        return z2;
    }

    @Override // U3.c
    public final boolean isRunning() {
        boolean z2;
        synchronized (this.alpha) {
            try {
                z2 = true;
                if (this.echo != 1 && this.foxtrot != 1) {
                    z2 = false;
                }
            } finally {
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final boolean juliet(c cVar) {
        boolean z2;
        boolean z10;
        int i4;
        synchronized (this.alpha) {
            ?? r12 = this.bravo;
            z2 = false;
            if (r12 == 0 || r12.juliet(this)) {
                if (this.echo != 5) {
                    z10 = cVar.equals(this.charlie);
                } else if (cVar.equals(this.delta) && ((i4 = this.foxtrot) == 4 || i4 == 5)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // U3.c
    public final void pause() {
        synchronized (this.alpha) {
            try {
                if (this.echo == 1) {
                    this.echo = 2;
                    this.charlie.pause();
                }
                if (this.foxtrot == 1) {
                    this.foxtrot = 2;
                    this.delta.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
