package X9;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import delivery.samurai.android.AndroidApp;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class j extends Pd.i implements Xd.l {
    public int alpha;
    public Object purple;
    public final AndroidApp red;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(17, j.class);
        Hidden0.special_clinit_17_00(j.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AndroidApp androidApp, Nd.c cVar) {
        super(2, cVar);
        this.red = androidApp;
    }

    @Override // Pd.a
    public final native Nd.c create(Object obj, Nd.c cVar);

    @Override // Xd.l
    public final native Object invoke(Object obj, Object obj2);

    @Override // Pd.a
    public final native Object invokeSuspend(Object obj);
}
