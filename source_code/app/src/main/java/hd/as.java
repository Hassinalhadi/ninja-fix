package hd;

import dd.C1614e;
import kotlin.ResultKt;
import kotlin.Unit;
import ld.C2065a;
import od.C2226c;
import od.InterfaceC2225b;

/* loaded from: classes2.dex */
public final class as extends Pd.i implements Xd.m {
    public final /* synthetic */ int alpha;
    public int purple;
    public /* synthetic */ Dd.f red;
    public final /* synthetic */ Xd.m silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as(Xd.m mVar, Nd.c cVar, int i4) {
        super(3, cVar);
        this.alpha = i4;
        this.silver = mVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Dd.f fVar = (Dd.f) obj;
        switch (this.alpha) {
            case 0:
                as asVar = new as(this.silver, (Nd.c) obj3, 0);
                asVar.red = fVar;
                return asVar.invokeSuspend(Unit.INSTANCE);
            case 1:
                as asVar2 = new as(this.silver, (Nd.c) obj3, 1);
                asVar2.red = fVar;
                return asVar2.invokeSuspend(Unit.INSTANCE);
            case 2:
                as asVar3 = new as(this.silver, (Nd.c) obj3, 2);
                asVar3.red = fVar;
                return asVar3.invokeSuspend(Unit.INSTANCE);
            case 3:
                as asVar4 = new as(this.silver, (Nd.c) obj3, 3);
                asVar4.red = fVar;
                return asVar4.invokeSuspend(Unit.INSTANCE);
            case 4:
                as asVar5 = new as(this.silver, (Nd.c) obj3, 4);
                asVar5.red = fVar;
                return asVar5.invokeSuspend(Unit.INSTANCE);
            case 5:
                as asVar6 = new as(this.silver, (Nd.c) obj3, 5);
                asVar6.red = fVar;
                return asVar6.invokeSuspend(Unit.INSTANCE);
            case 6:
                as asVar7 = new as(this.silver, (Nd.c) obj3, 6);
                asVar7.red = fVar;
                return asVar7.invokeSuspend(Unit.INSTANCE);
            default:
                as asVar8 = new as(this.silver, (Nd.c) obj3, 7);
                asVar8.red = fVar;
                return asVar8.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Dd.f fVar;
        Throwable th;
        Dd.f fVar2;
        Throwable th2;
        Xd.m mVar = this.silver;
        switch (this.alpha) {
            case 0:
                Od.a aVar = Od.a.alpha;
                int i4 = this.purple;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            th = (Throwable) obj;
                            if (th != null) {
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        fVar = this.red;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            Object obj2 = th;
                            InterfaceC2225b delta = ((C1614e) fVar.alpha).delta();
                            this.red = null;
                            this.purple = 2;
                            obj = mVar.invoke(delta, obj2, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            th = (Throwable) obj;
                            if (th != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar3 = this.red;
                    try {
                        this.red = fVar3;
                        this.purple = 1;
                        if (fVar3.delta(this) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fVar = fVar3;
                        Object obj22 = th;
                        InterfaceC2225b delta2 = ((C1614e) fVar.alpha).delta();
                        this.red = null;
                        this.purple = 2;
                        obj = mVar.invoke(delta2, obj22, this);
                        if (obj == aVar) {
                        }
                        th = (Throwable) obj;
                        if (th != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                Od.a aVar2 = Od.a.alpha;
                int i5 = this.purple;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            ResultKt.alpha(obj);
                            th2 = (Throwable) obj;
                            if (th2 != null) {
                                throw th2;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        fVar2 = this.red;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            Object obj3 = th;
                            C2226c c2226c = (C2226c) fVar2.alpha;
                            rg.b bVar = v.alpha;
                            u uVar = new u(c2226c);
                            this.red = null;
                            this.purple = 2;
                            obj = mVar.invoke(uVar, obj3, this);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            th2 = (Throwable) obj;
                            if (th2 != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar4 = this.red;
                    try {
                        this.red = fVar4;
                        this.purple = 1;
                        if (fVar4.delta(this) == aVar2) {
                            return aVar2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        fVar2 = fVar4;
                        Object obj32 = th;
                        C2226c c2226c2 = (C2226c) fVar2.alpha;
                        rg.b bVar2 = v.alpha;
                        u uVar2 = new u(c2226c2);
                        this.red = null;
                        this.purple = 2;
                        obj = mVar.invoke(uVar2, obj32, this);
                        if (obj == aVar2) {
                        }
                        th2 = (Throwable) obj;
                        if (th2 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                Od.a aVar3 = Od.a.alpha;
                int i10 = this.purple;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar5 = this.red;
                    Object obj4 = fVar5.alpha;
                    av avVar = new av(1, fVar5, Dd.f.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 0);
                    this.purple = 1;
                    if (mVar.invoke(obj4, avVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                Od.a aVar4 = Od.a.alpha;
                int i11 = this.purple;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar6 = this.red;
                    kd.ah ahVar = new kd.ah(fVar6);
                    this.purple = 1;
                    if (mVar.invoke(ahVar, fVar6.alpha, this) == aVar4) {
                        return aVar4;
                    }
                }
                return Unit.INSTANCE;
            case 4:
                Od.a aVar5 = Od.a.alpha;
                int i12 = this.purple;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar7 = this.red;
                    kd.aj ajVar = new kd.aj(fVar7);
                    Object bravo = fVar7.bravo();
                    this.purple = 1;
                    if (mVar.invoke(ajVar, bravo, this) == aVar5) {
                        return aVar5;
                    }
                }
                return Unit.INSTANCE;
            case 5:
                Od.a aVar6 = Od.a.alpha;
                int i13 = this.purple;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar8 = this.red;
                    kd.ak akVar = new kd.ak(fVar8);
                    Object bravo2 = fVar8.bravo();
                    this.purple = 1;
                    if (mVar.invoke(akVar, bravo2, this) == aVar6) {
                        return aVar6;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                Od.a aVar7 = Od.a.alpha;
                int i14 = this.purple;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar9 = this.red;
                    kd.al alVar = new kd.al(fVar9);
                    this.purple = 1;
                    if (mVar.invoke(alVar, fVar9.alpha, this) == aVar7) {
                        return aVar7;
                    }
                }
                return Unit.INSTANCE;
            default:
                Od.a aVar8 = Od.a.alpha;
                int i15 = this.purple;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Dd.f fVar10 = this.red;
                    C2065a c2065a = new C2065a(fVar10);
                    Object bravo3 = fVar10.bravo();
                    this.purple = 1;
                    if (mVar.invoke(c2065a, bravo3, this) == aVar8) {
                        return aVar8;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
