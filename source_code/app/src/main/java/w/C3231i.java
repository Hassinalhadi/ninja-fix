package w;

import androidx.compose.runtime.n0;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.I;
import vf.ab;
import vf.ad;

/* renamed from: w.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3231i extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ I purple;
    public final /* synthetic */ k red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3231i(I i4, k kVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = i4;
        this.red = kVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3231i(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((C3231i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (vf.ad.november(500, r11) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        if (vf.ad.lima(r12, r11) == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:9:0x0072). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        k kVar = this.red;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                ResultKt.alpha(obj);
                                ((n0) kVar.charlie).kilo(1.0f);
                                this.alpha = 3;
                                if (ad.november(500L, this) == aVar) {
                                    return aVar;
                                }
                                ((n0) kVar.charlie).kilo(0.0f);
                                this.alpha = 4;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj);
                            ((n0) kVar.charlie).kilo(0.0f);
                            this.alpha = 4;
                        }
                    } else {
                        ResultKt.alpha(obj);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    ResultKt.alpha(obj);
                }
            } else {
                ResultKt.alpha(obj);
                I i5 = this.purple;
                if (i5 != null) {
                    this.alpha = 1;
                }
            }
            ((n0) kVar.charlie).kilo(1.0f);
            if (!kVar.alpha) {
                this.alpha = 2;
                ad.india(this);
                return aVar;
            }
            this.alpha = 3;
            if (ad.november(500L, this) == aVar) {
            }
            ((n0) kVar.charlie).kilo(0.0f);
            this.alpha = 4;
        } catch (Throwable th) {
            ((n0) kVar.charlie).kilo(0.0f);
            throw th;
        }
    }
}
