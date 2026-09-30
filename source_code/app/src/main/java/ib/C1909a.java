package ib;

import Nd.c;
import Pd.i;
import Xd.l;
import androidx.compose.runtime.p0;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;

/* renamed from: ib.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1909a extends i implements l {
    public int alpha;
    public final /* synthetic */ p0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1909a(p0 p0Var, c cVar) {
        super(2, cVar);
        this.purple = p0Var;
    }

    @Override // Pd.a
    public final c create(Object obj, c cVar) {
        return new C1909a(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1909a) create((ab) obj, (c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0028 -> B:5:0x002b). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        p0 p0Var = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                p0Var.kilo(p0Var.juliet() - 1);
                if (p0Var.juliet() > 0) {
                    this.alpha = 1;
                    if (ad.november(1000L, this) == aVar) {
                        return aVar;
                    }
                    p0Var.kilo(p0Var.juliet() - 1);
                    if (p0Var.juliet() > 0) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            if (p0Var.juliet() > 0) {
            }
        }
    }
}
