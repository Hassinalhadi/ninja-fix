package C1;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC3001h2;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class s implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ InterfaceC3440j purple;

    public /* synthetic */ s(InterfaceC3440j interfaceC3440j, int i4) {
        this.alpha = i4;
        this.purple = interfaceC3440j;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f4  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        r rVar;
        int i4;
        Ec.h hVar;
        int i5;
        Ec.an anVar;
        int i10;
        N2.l lVar;
        int i11;
        AbstractC3001h2 abstractC3001h2;
        N2.u uVar;
        int i12;
        boolean z2;
        AbstractC3001h2 abstractC3001h22;
        androidx.work.impl.workers.g gVar;
        int i13;
        db.h hVar2;
        int i14;
        yf.ao aoVar;
        int i15;
        AbstractC3001h2 abstractC3001h23 = Y2.b.alpha;
        Y2.h hVar3 = null;
        InterfaceC3440j interfaceC3440j = this.purple;
        boolean z10 = true;
        switch (this.alpha) {
            case 0:
                if (cVar instanceof r) {
                    rVar = (r) cVar;
                    int i16 = rVar.purple;
                    if ((i16 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        rVar.purple = i16 - RecyclerView.UNDEFINED_DURATION;
                        Object obj2 = rVar.alpha;
                        Od.a aVar = Od.a.alpha;
                        i4 = rVar.purple;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                ResultKt.alpha(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj2);
                            B b2 = (B) obj;
                            if (!(b2 instanceof at)) {
                                if (b2 instanceof C0080b) {
                                    Object obj3 = ((C0080b) b2).bravo;
                                    rVar.purple = 1;
                                    if (interfaceC3440j.emit(obj3, rVar) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (!(b2 instanceof aq)) {
                                        z10 = b2 instanceof C;
                                    }
                                    if (z10) {
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                throw ((at) b2).bravo;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                rVar = new r(this, cVar);
                Object obj22 = rVar.alpha;
                Od.a aVar2 = Od.a.alpha;
                i4 = rVar.purple;
                if (i4 == 0) {
                }
                return Unit.INSTANCE;
            case 1:
                if (cVar instanceof Ec.h) {
                    hVar = (Ec.h) cVar;
                    int i17 = hVar.purple;
                    if ((i17 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        hVar.purple = i17 - RecyclerView.UNDEFINED_DURATION;
                        Object obj4 = hVar.alpha;
                        Od.a aVar3 = Od.a.alpha;
                        i5 = hVar.purple;
                        if (i5 == 0) {
                            if (i5 == 1) {
                                ResultKt.alpha(obj4);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj4);
                            if (((Boolean) obj).booleanValue()) {
                                hVar.purple = 1;
                                if (interfaceC3440j.emit(obj, hVar) == aVar3) {
                                    return aVar3;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                hVar = new Ec.h(this, cVar);
                Object obj42 = hVar.alpha;
                Od.a aVar32 = Od.a.alpha;
                i5 = hVar.purple;
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            case 2:
                if (cVar instanceof Ec.an) {
                    anVar = (Ec.an) cVar;
                    int i18 = anVar.purple;
                    if ((i18 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        anVar.purple = i18 - RecyclerView.UNDEFINED_DURATION;
                        Object obj5 = anVar.alpha;
                        Od.a aVar4 = Od.a.alpha;
                        i10 = anVar.purple;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                ResultKt.alpha(obj5);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj5);
                            if (((Boolean) obj).booleanValue()) {
                                anVar.purple = 1;
                                if (interfaceC3440j.emit(obj, anVar) == aVar4) {
                                    return aVar4;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                anVar = new Ec.an(this, cVar);
                Object obj52 = anVar.alpha;
                Od.a aVar42 = Od.a.alpha;
                i10 = anVar.purple;
                if (i10 == 0) {
                }
                return Unit.INSTANCE;
            case 3:
                if (cVar instanceof N2.l) {
                    lVar = (N2.l) cVar;
                    int i19 = lVar.purple;
                    if ((i19 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        lVar.purple = i19 - RecyclerView.UNDEFINED_DURATION;
                        Object obj6 = lVar.alpha;
                        Od.a aVar5 = Od.a.alpha;
                        i11 = lVar.purple;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                ResultKt.alpha(obj6);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj6);
                            long j5 = ((Z.e) obj).alpha;
                            if (j5 == 9205357640488583168L) {
                                hVar3 = Y2.h.charlie;
                            } else {
                                Y2.e eVar = N2.af.bravo;
                                if (Z.e.delta(j5) >= 0.5d && Z.e.bravo(j5) >= 0.5d) {
                                    float delta = Z.e.delta(j5);
                                    if (!Float.isInfinite(delta) && !Float.isNaN(delta)) {
                                        abstractC3001h2 = new Y2.a(Zd.a.delta(Z.e.delta(j5)));
                                    } else {
                                        abstractC3001h2 = abstractC3001h23;
                                    }
                                    float bravo = Z.e.bravo(j5);
                                    if (!Float.isInfinite(bravo) && !Float.isNaN(bravo)) {
                                        abstractC3001h23 = new Y2.a(Zd.a.delta(Z.e.bravo(j5)));
                                    }
                                    hVar3 = new Y2.h(abstractC3001h2, abstractC3001h23);
                                }
                            }
                            if (hVar3 != null) {
                                lVar.purple = 1;
                                if (interfaceC3440j.emit(hVar3, lVar) == aVar5) {
                                    return aVar5;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                lVar = new N2.l(this, cVar);
                Object obj62 = lVar.alpha;
                Od.a aVar52 = Od.a.alpha;
                i11 = lVar.purple;
                if (i11 == 0) {
                }
                return Unit.INSTANCE;
            case 4:
                if (cVar instanceof N2.u) {
                    uVar = (N2.u) cVar;
                    int i20 = uVar.purple;
                    if ((i20 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        uVar.purple = i20 - RecyclerView.UNDEFINED_DURATION;
                        Object obj7 = uVar.alpha;
                        Od.a aVar6 = Od.a.alpha;
                        i12 = uVar.purple;
                        if (i12 == 0) {
                            if (i12 == 1) {
                                ResultKt.alpha(obj7);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj7);
                            long j6 = ((Q0.a) obj).alpha;
                            Y2.e eVar2 = N2.af.bravo;
                            int i21 = (int) (3 & j6);
                            int i22 = (((i21 & 2) >> 1) * 3) + ((i21 & 1) << 1);
                            int i23 = (((int) (j6 >> 33)) & ((1 << (i22 + 13)) - 1)) - 1;
                            int i24 = (((1 << (18 - i22)) - 1) & ((int) (j6 >> (i22 + 46)))) - 1;
                            boolean z11 = false;
                            if (i23 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i24 == 0) {
                                z11 = true;
                            }
                            if (!(z2 | z11)) {
                                if (Q0.a.delta(j6)) {
                                    abstractC3001h22 = new Y2.a(Q0.a.hotel(j6));
                                } else {
                                    abstractC3001h22 = abstractC3001h23;
                                }
                                if (Q0.a.charlie(j6)) {
                                    abstractC3001h23 = new Y2.a(Q0.a.golf(j6));
                                }
                                hVar3 = new Y2.h(abstractC3001h22, abstractC3001h23);
                            }
                            if (hVar3 != null) {
                                uVar.purple = 1;
                                if (interfaceC3440j.emit(hVar3, uVar) == aVar6) {
                                    return aVar6;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                uVar = new N2.u(this, cVar);
                Object obj72 = uVar.alpha;
                Od.a aVar62 = Od.a.alpha;
                i12 = uVar.purple;
                if (i12 == 0) {
                }
                return Unit.INSTANCE;
            case 5:
                if (cVar instanceof androidx.work.impl.workers.g) {
                    gVar = (androidx.work.impl.workers.g) cVar;
                    int i25 = gVar.purple;
                    if ((i25 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        gVar.purple = i25 - RecyclerView.UNDEFINED_DURATION;
                        Object obj8 = gVar.alpha;
                        Od.a aVar7 = Od.a.alpha;
                        i13 = gVar.purple;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                ResultKt.alpha(obj8);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj8);
                            if (obj instanceof F2.b) {
                                gVar.purple = 1;
                                if (interfaceC3440j.emit(obj, gVar) == aVar7) {
                                    return aVar7;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                gVar = new androidx.work.impl.workers.g(this, cVar);
                Object obj82 = gVar.alpha;
                Od.a aVar72 = Od.a.alpha;
                i13 = gVar.purple;
                if (i13 == 0) {
                }
                return Unit.INSTANCE;
            case 6:
                if (cVar instanceof db.h) {
                    hVar2 = (db.h) cVar;
                    int i26 = hVar2.purple;
                    if ((i26 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        hVar2.purple = i26 - RecyclerView.UNDEFINED_DURATION;
                        Object obj9 = hVar2.alpha;
                        Od.a aVar8 = Od.a.alpha;
                        i14 = hVar2.purple;
                        if (i14 == 0) {
                            if (i14 == 1) {
                                ResultKt.alpha(obj9);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj9);
                            if (((Boolean) obj).booleanValue()) {
                                hVar2.purple = 1;
                                if (interfaceC3440j.emit(obj, hVar2) == aVar8) {
                                    return aVar8;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                hVar2 = new db.h(this, cVar);
                Object obj92 = hVar2.alpha;
                Od.a aVar82 = Od.a.alpha;
                i14 = hVar2.purple;
                if (i14 == 0) {
                }
                return Unit.INSTANCE;
            default:
                if (cVar instanceof yf.ao) {
                    aoVar = (yf.ao) cVar;
                    int i27 = aoVar.purple;
                    if ((i27 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        aoVar.purple = i27 - RecyclerView.UNDEFINED_DURATION;
                        Object obj10 = aoVar.alpha;
                        Od.a aVar9 = Od.a.alpha;
                        i15 = aoVar.purple;
                        if (i15 == 0) {
                            if (i15 == 1) {
                                ResultKt.alpha(obj10);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj10);
                            if (obj != null) {
                                aoVar.purple = 1;
                                if (interfaceC3440j.emit(obj, aoVar) == aVar9) {
                                    return aVar9;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                aoVar = new yf.ao(this, cVar);
                Object obj102 = aoVar.alpha;
                Od.a aVar92 = Od.a.alpha;
                i15 = aoVar.purple;
                if (i15 == 0) {
                }
                return Unit.INSTANCE;
        }
    }
}
