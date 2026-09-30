package Fc;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import delivery.samurai.android.ui.splash.AuthViewModel;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class v extends Pd.i implements Xd.l {
    public String alpha;
    public String purple;
    public boolean red;
    public int silver;
    public final AuthViewModel teal;
    public final String white;
    public final String yellow;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(3, v.class);
        Hidden0.special_clinit_3_00(v.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AuthViewModel authViewModel, String str, String str2, Nd.c cVar) {
        super(2, cVar);
        this.teal = authViewModel;
        this.white = str;
        this.yellow = str2;
    }

    @Override // Pd.a
    public final native Nd.c create(Object obj, Nd.c cVar);

    @Override // Xd.l
    public final native Object invoke(Object obj, Object obj2);

    @Override // Pd.a
    public final native Object invokeSuspend(Object obj);
}
