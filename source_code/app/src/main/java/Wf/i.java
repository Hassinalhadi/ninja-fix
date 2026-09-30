package Wf;

import a0.C0352f;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ e red;
    public final /* synthetic */ r silver;
    public final /* synthetic */ x teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, r rVar, x xVar, Nd.c cVar) {
        super(2, cVar);
        this.red = eVar;
        this.silver = rVar;
        this.teal = xVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        i iVar = new i(this.red, this.silver, this.teal, cVar);
        iVar.purple = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        d dVar;
        final int i4;
        Od.a aVar = Od.a.alpha;
        int i5 = this.alpha;
        if (i5 != 0) {
            if (i5 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            v alpha = u.alpha(this.red, (r) this.purple);
            Iterator it = alpha.alpha.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((o) obj2) instanceof d) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (obj2 instanceof d) {
                dVar = (d) obj2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                i4 = dVar.alpha;
            } else {
                W8.a aVar2 = d.purple;
                i4 = 160;
            }
            d dVar2 = this.silver.delta;
            StringBuilder sb2 = new StringBuilder();
            String str = alpha.bravo;
            sb2.append(str);
            sb2.append("-");
            final int i10 = dVar2.alpha;
            sb2.append(i10);
            sb2.append("dpi");
            String sb3 = sb2.toString();
            Function1 function1 = new Function1() { // from class: Wf.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    byte[] bArr = (byte[]) obj3;
                    Intrinsics.echo(bArr, "<this>");
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    int i11 = i4;
                    int i12 = i10;
                    if (i11 > i12) {
                        options.inDensity = i11;
                        options.inTargetDensity = i12;
                    }
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    Intrinsics.delta(decodeByteArray, "decodeByteArray(...)");
                    return new f(new C0352f(decodeByteArray));
                }
            };
            this.alpha = 1;
            Lazy lazy = m.alpha;
            j jVar = new j(function1, this.teal, str, null);
            w.o oVar = m.delta;
            oVar.getClass();
            obj = vf.ad.mike(new c(oVar, sb3, jVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Intrinsics.charlie(obj, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Bitmap");
        return ((f) obj).alpha;
    }
}
