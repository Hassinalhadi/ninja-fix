package kd;

import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.Z4;

/* loaded from: classes2.dex */
public final class v extends Pd.i implements Xd.l {
    public Charset alpha;
    public int purple;
    public final /* synthetic */ io.ktor.utils.io.m red;
    public final /* synthetic */ Charset silver;
    public final /* synthetic */ StringBuilder teal;
    public final /* synthetic */ d white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(io.ktor.utils.io.m mVar, Charset charset, StringBuilder sb2, d dVar, Nd.c cVar) {
        super(2, cVar);
        this.red = mVar;
        this.silver = charset;
        this.teal = sb2;
        this.white = dVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new v(this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Charset charset;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        d dVar = this.white;
        StringBuilder sb2 = this.teal;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    charset = this.alpha;
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                try {
                    io.ktor.utils.io.m mVar = this.red;
                    Charset charset2 = this.silver;
                    this.alpha = charset2;
                    this.purple = 1;
                    obj = io.ktor.utils.io.ak.mike(mVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    charset = charset2;
                } catch (Throwable th) {
                    String sb3 = sb2.toString();
                    Intrinsics.delta(sb3, "toString(...)");
                    dVar.charlie(sb3);
                    dVar.alpha();
                    throw th;
                }
            }
            str = Z4.bravo((Gf.i) obj, charset, 2);
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            str = "[request body omitted]";
        }
        sb2.append("BODY START");
        sb2.append('\n');
        sb2.append(str);
        sb2.append('\n');
        sb2.append("BODY END");
        String sb4 = sb2.toString();
        Intrinsics.delta(sb4, "toString(...)");
        dVar.charlie(sb4);
        dVar.alpha();
        return Unit.INSTANCE;
    }
}
