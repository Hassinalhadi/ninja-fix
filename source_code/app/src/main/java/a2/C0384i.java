package a2;

import ge.InterfaceC1772d;

/* renamed from: a2.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0384i extends Y1.ab {
    public final C0383h golf;
    public final P.d hotel;

    public C0384i(C0383h c0383h, String str, P.d dVar) {
        super(c0383h, -1, str);
        this.golf = c0383h;
        this.hotel = dVar;
    }

    @Override // Y1.ab
    public final Y1.aa alpha() {
        return (C0382g) super.alpha();
    }

    @Override // Y1.ab
    public final Y1.aa charlie() {
        return new C0382g(this.golf, this.hotel);
    }

    public C0384i(C0383h c0383h, InterfaceC1772d interfaceC1772d, P.d dVar) {
        super(c0383h, interfaceC1772d, kotlin.collections.t.alpha);
        this.golf = c0383h;
        this.hotel = dVar;
    }
}
