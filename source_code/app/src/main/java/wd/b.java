package wd;

import androidx.recyclerview.widget.RecyclerView;
import io.ktor.utils.io.t;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import xd.C3329b;
import xd.C3337j;
import yd.j;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class b implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ InterfaceC3440j purple;
    public final /* synthetic */ Charset red;
    public final /* synthetic */ Ed.a silver;
    public final /* synthetic */ t teal;

    public /* synthetic */ b(InterfaceC3440j interfaceC3440j, Charset charset, Ed.a aVar, t tVar, int i4) {
        this.alpha = i4;
        this.purple = interfaceC3440j;
        this.red = charset;
        this.silver = aVar;
        this.teal = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        C3263a c3263a;
        Object obj2;
        Od.a aVar;
        int i4;
        InterfaceC3440j interfaceC3440j;
        C3329b c3329b;
        Object obj3;
        Od.a aVar2;
        int i5;
        InterfaceC3440j interfaceC3440j2;
        switch (this.alpha) {
            case 0:
                if (cVar instanceof C3263a) {
                    c3263a = (C3263a) cVar;
                    int i10 = c3263a.purple;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3263a.purple = i10 - RecyclerView.UNDEFINED_DURATION;
                        obj2 = c3263a.alpha;
                        aVar = Od.a.alpha;
                        i4 = c3263a.purple;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    ResultKt.alpha(obj2);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC3440j = c3263a.red;
                            ResultKt.alpha(obj2);
                        } else {
                            ResultKt.alpha(obj2);
                            InterfaceC3440j interfaceC3440j3 = this.purple;
                            c3263a.red = interfaceC3440j3;
                            c3263a.purple = 1;
                            Object alpha = ((C3337j) obj).alpha(this.red, this.silver, this.teal, c3263a);
                            if (alpha != aVar) {
                                obj2 = alpha;
                                interfaceC3440j = interfaceC3440j3;
                            } else {
                                return aVar;
                            }
                        }
                        c3263a.red = null;
                        c3263a.purple = 2;
                        if (interfaceC3440j.emit(obj2, c3263a) == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    }
                }
                c3263a = new C3263a(this, cVar);
                obj2 = c3263a.alpha;
                aVar = Od.a.alpha;
                i4 = c3263a.purple;
                if (i4 == 0) {
                }
                c3263a.red = null;
                c3263a.purple = 2;
                if (interfaceC3440j.emit(obj2, c3263a) == aVar) {
                }
                return Unit.INSTANCE;
            default:
                if (cVar instanceof C3329b) {
                    c3329b = (C3329b) cVar;
                    int i11 = c3329b.purple;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3329b.purple = i11 - RecyclerView.UNDEFINED_DURATION;
                        obj3 = c3329b.alpha;
                        aVar2 = Od.a.alpha;
                        i5 = c3329b.purple;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    ResultKt.alpha(obj3);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC3440j2 = c3329b.red;
                            ResultKt.alpha(obj3);
                        } else {
                            ResultKt.alpha(obj3);
                            InterfaceC3440j interfaceC3440j4 = this.purple;
                            c3329b.red = interfaceC3440j4;
                            c3329b.purple = 1;
                            Object bravo = ((j) obj).bravo(this.red, this.silver, this.teal, c3329b);
                            if (bravo != aVar2) {
                                obj3 = bravo;
                                interfaceC3440j2 = interfaceC3440j4;
                            } else {
                                return aVar2;
                            }
                        }
                        c3329b.red = null;
                        c3329b.purple = 2;
                        if (interfaceC3440j2.emit(obj3, c3329b) == aVar2) {
                            return aVar2;
                        }
                        return Unit.INSTANCE;
                    }
                }
                c3329b = new C3329b(this, cVar);
                obj3 = c3329b.alpha;
                aVar2 = Od.a.alpha;
                i5 = c3329b.purple;
                if (i5 == 0) {
                }
                c3329b.red = null;
                c3329b.purple = 2;
                if (interfaceC3440j2.emit(obj3, c3329b) == aVar2) {
                }
                return Unit.INSTANCE;
        }
    }
}
