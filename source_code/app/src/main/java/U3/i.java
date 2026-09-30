package U3;

/* loaded from: classes3.dex */
public final class i implements d, c {
    public final Object alpha;
    public final Object bravo;
    public volatile h charlie;
    public volatile c delta;
    public int echo = 3;
    public int foxtrot = 3;
    public boolean golf;

    public i(Object obj, d dVar) {
        this.bravo = obj;
        this.alpha = dVar;
    }

    @Override // U3.d, U3.c
    public final boolean alpha() {
        boolean z2;
        synchronized (this.bravo) {
            try {
                if (!this.delta.alpha() && !this.charlie.alpha()) {
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
        synchronized (this.bravo) {
            try {
                ?? r12 = this.alpha;
                if ((r12 == 0 || r12.bravo(this)) && cVar.equals(this.charlie) && this.echo != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } finally {
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final d charlie() {
        d dVar;
        synchronized (this.bravo) {
            try {
                ?? r12 = this.alpha;
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
        synchronized (this.bravo) {
            this.golf = false;
            this.echo = 3;
            this.foxtrot = 3;
            this.delta.clear();
            this.charlie.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final void delta(c cVar) {
        synchronized (this.bravo) {
            try {
                if (cVar.equals(this.delta)) {
                    this.foxtrot = 4;
                    return;
                }
                this.echo = 4;
                ?? r32 = this.alpha;
                if (r32 != 0) {
                    r32.delta(this);
                }
                if (!Q0.c.kilo(this.foxtrot)) {
                    this.delta.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U3.c
    public final boolean echo(c cVar) {
        if (cVar instanceof i) {
            i iVar = (i) cVar;
            if (this.charlie == null) {
                if (iVar.charlie != null) {
                    return false;
                }
            } else if (!this.charlie.echo(iVar.charlie)) {
                return false;
            }
            if (this.delta == null) {
                if (iVar.delta == null) {
                    return true;
                }
                return false;
            }
            if (this.delta.echo(iVar.delta)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // U3.c
    public final boolean foxtrot() {
        boolean z2;
        synchronized (this.bravo) {
            if (this.echo == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final void golf(c cVar) {
        synchronized (this.bravo) {
            try {
                if (!cVar.equals(this.charlie)) {
                    this.foxtrot = 5;
                    return;
                }
                this.echo = 5;
                ?? r32 = this.alpha;
                if (r32 != 0) {
                    r32.golf(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final boolean hotel(c cVar) {
        boolean z2;
        synchronized (this.bravo) {
            try {
                ?? r12 = this.alpha;
                if ((r12 != 0 && !r12.hotel(this)) || (!cVar.equals(this.charlie) && this.echo == 4)) {
                    z2 = false;
                }
                z2 = true;
            } finally {
            }
        }
        return z2;
    }

    @Override // U3.c
    public final void india() {
        synchronized (this.bravo) {
            try {
                this.golf = true;
                try {
                    if (this.echo != 4 && this.foxtrot != 1) {
                        this.foxtrot = 1;
                        this.delta.india();
                    }
                    if (this.golf && this.echo != 1) {
                        this.echo = 1;
                        this.charlie.india();
                    }
                    this.golf = false;
                } catch (Throwable th) {
                    this.golf = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // U3.c
    public final boolean isComplete() {
        boolean z2;
        synchronized (this.bravo) {
            if (this.echo == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // U3.c
    public final boolean isRunning() {
        boolean z2;
        synchronized (this.bravo) {
            z2 = true;
            if (this.echo != 1) {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.d, java.lang.Object] */
    @Override // U3.d
    public final boolean juliet(c cVar) {
        boolean z2;
        synchronized (this.bravo) {
            try {
                ?? r12 = this.alpha;
                if ((r12 == 0 || r12.juliet(this)) && cVar.equals(this.charlie) && !alpha()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // U3.c
    public final void pause() {
        synchronized (this.bravo) {
            try {
                if (!Q0.c.kilo(this.foxtrot)) {
                    this.foxtrot = 2;
                    this.delta.pause();
                }
                if (!Q0.c.kilo(this.echo)) {
                    this.echo = 2;
                    this.charlie.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
