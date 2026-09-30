package yd;

import androidx.recyclerview.widget.RecyclerView;
import io.ktor.utils.io.ag;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import s6.Z4;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class g implements InterfaceC3440j {
    public int alpha;
    public final /* synthetic */ ag purple;
    public final /* synthetic */ C3417a red;
    public final /* synthetic */ j silver;
    public final /* synthetic */ KSerializer teal;
    public final /* synthetic */ Charset white;

    public g(ag agVar, C3417a c3417a, j jVar, KSerializer kSerializer, Charset charset) {
        this.purple = agVar;
        this.red = c3417a;
        this.silver = jVar;
        this.teal = kSerializer;
        this.white = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (((io.ktor.utils.io.m) r4).charlie(r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (io.ktor.utils.io.ak.sierra(r4, r8, r8.length, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (io.ktor.utils.io.ak.sierra(r4, r9, r9.length, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        C3422f c3422f;
        int i4;
        if (cVar instanceof C3422f) {
            c3422f = (C3422f) cVar;
            int i5 = c3422f.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3422f.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = c3422f.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c3422f.purple;
                ag agVar = this.purple;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                ResultKt.alpha(obj2);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.alpha(obj2);
                        c3422f.purple = 3;
                    } else {
                        obj = c3422f.silver;
                        ResultKt.alpha(obj2);
                    }
                } else {
                    ResultKt.alpha(obj2);
                    int i10 = this.alpha;
                    this.alpha = i10 + 1;
                    if (i10 >= 0) {
                        if (i10 > 0) {
                            byte[] bArr = this.red.charlie;
                            c3422f.silver = obj;
                            c3422f.purple = 1;
                        }
                    } else {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                }
                byte[] charlie = Z4.charlie(this.silver.alpha.alpha(this.teal, obj), this.white);
                c3422f.silver = null;
                c3422f.purple = 2;
            }
        }
        c3422f = new C3422f(this, cVar);
        Object obj22 = c3422f.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c3422f.purple;
        ag agVar2 = this.purple;
        if (i4 == 0) {
        }
        byte[] charlie2 = Z4.charlie(this.silver.alpha.alpha(this.teal, obj), this.white);
        c3422f.silver = null;
        c3422f.purple = 2;
    }
}
