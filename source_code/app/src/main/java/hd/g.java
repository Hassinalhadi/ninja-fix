package hd;

/* loaded from: classes2.dex */
public final class g extends vd.c {
    public final sd.e alpha;
    public final long bravo;
    public final /* synthetic */ Object charlie;

    public g(sd.e eVar, Object obj) {
        this.charlie = obj;
        if (eVar == null) {
            sd.e eVar2 = sd.b.alpha;
            eVar = sd.b.bravo;
        }
        this.alpha = eVar;
        this.bravo = ((byte[]) obj).length;
    }

    @Override // vd.e
    public final Long alpha() {
        return Long.valueOf(this.bravo);
    }

    @Override // vd.e
    public final sd.e bravo() {
        return this.alpha;
    }

    @Override // vd.c
    public final byte[] echo() {
        return (byte[]) this.charlie;
    }
}
