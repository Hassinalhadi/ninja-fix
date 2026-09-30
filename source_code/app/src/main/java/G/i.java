package G;

import ao.ad;
import av.ah;
import bz.AbstractC0779d;
import bz.C0778c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import s0.an;

/* loaded from: classes3.dex */
public final class i extends Lambda implements Function1 {
    public static final i purple = new i(1, 0);
    public static final i red = new i(1, 1);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                an anVar = (an) obj;
                J2.t tVar = anVar.alpha.purple;
                long oscar = tVar.oscar();
                tVar.mike().golf();
                try {
                    ((J2.t) ((ah) tVar.alpha).purple).mike().lima(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    anVar.charlie();
                    ad.coral(tVar, oscar);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    ad.coral(tVar, oscar);
                    throw th;
                }
            default:
                return new v(new C0778c(Float.valueOf(((Number) obj).floatValue()), AbstractC0779d.juliet, null, 12));
        }
    }
}
