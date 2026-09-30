package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aw extends Pd.i implements Xd.l {
    public Ef.c alpha;
    public F purple;
    public int red;
    public final /* synthetic */ F silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ a0 white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(Nd.c cVar, F f5, a0 a0Var, Object obj) {
        super(2, cVar);
        this.silver = f5;
        this.teal = obj;
        this.white = a0Var;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new aw(cVar, this.silver, this.white, this.teal);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aw) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0183, code lost:
    
        if (bz.F.Z(r14, r24) == r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0177, code lost:
    
        if (bz.F.Y(r14, r24) == r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c7, code lost:
    
        if (bz.F.a0(r14, r24) == r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        if (r2 == r0) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j5;
        Ef.c cVar;
        F f5;
        Object b02;
        av avVar;
        l0 l0Var;
        C0789n c0789n;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        Object obj2 = this.teal;
        F f10 = this.silver;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    ResultKt.alpha(obj);
                                    f10.h0(0.0f);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.alpha(obj);
                            f10.Q(obj2);
                            this.red = 5;
                        } else {
                            ResultKt.alpha(obj);
                            j5 = Long.MIN_VALUE;
                            if (!Intrinsics.areEqual(((t0) f10.red).getValue(), obj2)) {
                                if (f10.d0() < 1.0f && ((avVar = f10.f3443g) == null || !Intrinsics.areEqual(null, avVar.bravo))) {
                                    if (avVar != null) {
                                        l0Var = avVar.bravo;
                                    } else {
                                        l0Var = null;
                                    }
                                    C0789n c0789n2 = F.f3437l;
                                    C0789n c0789n3 = F.f3436k;
                                    if (l0Var != null) {
                                        long j6 = avVar.alpha;
                                        C0789n c0789n4 = avVar.foxtrot;
                                        if (c0789n4 == null) {
                                            c0789n = c0789n3;
                                        } else {
                                            c0789n = c0789n4;
                                        }
                                        c0789n3 = (C0789n) l0Var.gray(j6, avVar.echo, c0789n2, c0789n);
                                    } else if (avVar != null && avVar.alpha != 0) {
                                        long j7 = avVar.golf;
                                        if (j7 == j5) {
                                            j7 = f10.white;
                                        }
                                        float f11 = ((float) j7) / 1.0E9f;
                                        if (f11 > 0.0f) {
                                            c0789n3 = new C0789n(1.0f / f11);
                                        }
                                    }
                                    if (avVar == null) {
                                        avVar = new av();
                                    }
                                    avVar.bravo = null;
                                    avVar.charlie = false;
                                    avVar.delta = f10.d0();
                                    avVar.echo.echo(f10.d0(), 0);
                                    long j10 = f10.white;
                                    avVar.golf = j10;
                                    avVar.alpha = 0L;
                                    avVar.foxtrot = c0789n3;
                                    avVar.hotel = Zd.a.echo((1.0d - f10.d0()) * j10);
                                    f10.f3443g = avVar;
                                }
                                this.alpha = null;
                                this.purple = null;
                                this.red = 4;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        ResultKt.alpha(obj);
                        j5 = Long.MIN_VALUE;
                        this.red = 3;
                    }
                } else {
                    f5 = this.purple;
                    cVar = this.alpha;
                    ResultKt.alpha(obj);
                    j5 = Long.MIN_VALUE;
                }
            } else {
                ResultKt.alpha(obj);
                Object value = ((t0) f10.purple).getValue();
                if (!Intrinsics.areEqual(obj2, value)) {
                    F.X(f10);
                    f10.h0(0.0f);
                    j5 = Long.MIN_VALUE;
                    a0 a0Var = this.white;
                    a0Var.quebec(obj2);
                    a0Var.oscar(0L);
                    f10.Q(value);
                    ((t0) f10.purple).setValue(obj2);
                } else {
                    j5 = Long.MIN_VALUE;
                }
                Ef.c cVar2 = f10.f3440c;
                this.alpha = cVar2;
                this.purple = f10;
                this.red = 1;
                if (cVar2.delta(this) != aVar) {
                    cVar = cVar2;
                    f5 = f10;
                }
                return aVar;
            }
            Object obj3 = f5.silver;
            cVar.foxtrot(null);
            if (!Intrinsics.areEqual(obj2, obj3)) {
                this.alpha = null;
                this.purple = null;
                this.red = 2;
                if (f10.e == j5) {
                    b02 = C0564b.sierra(getContext()).blue(f10.f3444h, this);
                    if (b02 != aVar) {
                        b02 = Unit.INSTANCE;
                    }
                } else {
                    b02 = f10.b0(this);
                    if (b02 != aVar) {
                        b02 = Unit.INSTANCE;
                    }
                }
            }
            if (!Intrinsics.areEqual(((t0) f10.red).getValue(), obj2)) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            cVar.foxtrot(null);
            throw th;
        }
    }
}
