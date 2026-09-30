package dd;

import gd.k;
import io.ktor.utils.io.ak;
import io.ktor.utils.io.s;
import io.ktor.utils.io.t;
import kotlin.jvm.internal.Intrinsics;
import pd.AbstractC2304b;
import sd.m;
import sd.u;
import sd.v;

/* renamed from: dd.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1617h extends AbstractC2304b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12063a;
    public final /* synthetic */ int alpha = 1;

    /* renamed from: b, reason: collision with root package name */
    public final m f12064b;
    public final Nd.h purple;
    public final v red;
    public final u silver;
    public final Bd.e teal;
    public final Bd.e white;
    public final C1614e yellow;

    public C1617h(C1614e c1614e, od.g gVar) {
        this.yellow = c1614e;
        this.purple = gVar.foxtrot;
        this.red = gVar.alpha;
        this.silver = gVar.delta;
        this.teal = gVar.bravo;
        this.white = gVar.golf;
        Object obj = gVar.echo;
        t tVar = obj instanceof t ? (t) obj : null;
        if (tVar == null) {
            t.alpha.getClass();
            tVar = s.bravo;
        }
        this.f12063a = tVar;
        this.f12064b = gVar.charlie;
    }

    @Override // sd.r
    public final m alpha() {
        switch (this.alpha) {
            case 0:
                return this.f12064b;
            default:
                return (k) this.f12064b;
        }
    }

    @Override // pd.AbstractC2304b
    public final C1614e bravo() {
        switch (this.alpha) {
            case 0:
                return (C1616g) this.yellow;
            default:
                return this.yellow;
        }
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        switch (this.alpha) {
            case 0:
                return this.purple;
            default:
                return this.purple;
        }
    }

    @Override // pd.AbstractC2304b
    public final t delta() {
        switch (this.alpha) {
            case 0:
                return ak.alpha((byte[]) this.f12063a);
            default:
                return (t) this.f12063a;
        }
    }

    @Override // pd.AbstractC2304b
    public final Bd.e echo() {
        switch (this.alpha) {
            case 0:
                return this.teal;
            default:
                return this.teal;
        }
    }

    @Override // pd.AbstractC2304b
    public final Bd.e foxtrot() {
        switch (this.alpha) {
            case 0:
                return this.white;
            default:
                return this.white;
        }
    }

    @Override // pd.AbstractC2304b
    public final v golf() {
        switch (this.alpha) {
            case 0:
                return this.red;
            default:
                return this.red;
        }
    }

    @Override // pd.AbstractC2304b
    public final u hotel() {
        switch (this.alpha) {
            case 0:
                return this.silver;
            default:
                return this.silver;
        }
    }

    public C1617h(C1616g call, byte[] bArr, AbstractC2304b abstractC2304b) {
        Intrinsics.echo(call, "call");
        this.yellow = call;
        this.f12063a = bArr;
        this.red = abstractC2304b.golf();
        this.silver = abstractC2304b.hotel();
        this.teal = abstractC2304b.echo();
        this.white = abstractC2304b.foxtrot();
        this.f12064b = abstractC2304b.alpha();
        this.purple = abstractC2304b.charlie();
    }
}
