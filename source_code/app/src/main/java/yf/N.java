package yf;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.C3207k;
import xf.EnumC3340a;
import zf.AbstractC3511a;

/* loaded from: classes2.dex */
public final class N extends AbstractC3511a implements at, InterfaceC3439i, zf.v {
    public static final /* synthetic */ AtomicReferenceFieldUpdater white = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int teal;

    public N(Object obj) {
        this._state$volatile = obj;
    }

    @Override // yf.as
    public final boolean alpha(Object obj) {
        india(obj);
        return true;
    }

    @Override // zf.v
    public final InterfaceC3439i bravo(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        if (((i4 >= 0 && i4 < 2) || i4 == -2) && enumC3340a == EnumC3340a.purple) {
            return this;
        }
        return AbstractC3428A.quebec(this, hVar, i4, enumC3340a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (r6.charlie(r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:15:0x0075, B:17:0x007d, B:20:0x0084, B:21:0x0088, B:25:0x008b, B:27:0x00ac, B:30:0x00bc, B:33:0x0091, B:36:0x0098, B:44:0x004d, B:46:0x0057, B:47:0x0066), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:15:0x0075, B:17:0x007d, B:20:0x0084, B:21:0x0088, B:25:0x008b, B:27:0x00ac, B:30:0x00bc, B:33:0x0091, B:36:0x0098, B:44:0x004d, B:46:0x0057, B:47:0x0066), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bb -> B:15:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cc -> B:15:0x0075). Please report as a decompilation issue!!! */
    @Override // yf.InterfaceC3439i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        M m4;
        Od.a aVar;
        int i4;
        N n5;
        O o5;
        InterfaceC3440j interfaceC3440j2;
        vf.I i5;
        Object obj;
        Object andSet;
        Object obj2;
        Object obj3;
        try {
            if (cVar instanceof M) {
                m4 = (M) cVar;
                int i10 = m4.f14160s;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    m4.f14160s = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj4 = m4.white;
                    aVar = Od.a.alpha;
                    i4 = m4.f14160s;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    obj = m4.teal;
                                    i5 = m4.silver;
                                    o5 = m4.red;
                                    interfaceC3440j2 = m4.purple;
                                    n5 = m4.alpha;
                                    ResultKt.alpha(obj4);
                                    obj2 = white.get(n5);
                                    if (i5 != null && !i5.echo()) {
                                        throw i5.quebec();
                                    }
                                    if (obj2 == zf.b.bravo) {
                                        obj3 = null;
                                    } else {
                                        obj3 = obj2;
                                    }
                                    m4.alpha = n5;
                                    m4.purple = interfaceC3440j2;
                                    m4.red = o5;
                                    m4.silver = i5;
                                    m4.teal = obj2;
                                    m4.f14160s = 2;
                                    if (interfaceC3440j2.emit(obj3, m4) != aVar) {
                                        obj = obj2;
                                        andSet = o5.alpha.getAndSet(AbstractC3428A.bravo);
                                        Intrinsics.checkNotNull(andSet);
                                        if (andSet == AbstractC3428A.charlie) {
                                            m4.alpha = n5;
                                            m4.purple = interfaceC3440j2;
                                            m4.red = o5;
                                            m4.silver = i5;
                                            m4.teal = obj;
                                            m4.f14160s = 3;
                                        }
                                        obj2 = white.get(n5);
                                        if (i5 != null) {
                                            throw i5.quebec();
                                        }
                                        if (obj2 == zf.b.bravo) {
                                        }
                                        m4.alpha = n5;
                                        m4.purple = interfaceC3440j2;
                                        m4.red = o5;
                                        m4.silver = i5;
                                        m4.teal = obj2;
                                        m4.f14160s = 2;
                                        if (interfaceC3440j2.emit(obj3, m4) != aVar) {
                                        }
                                    } else {
                                        return aVar;
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                obj = m4.teal;
                                i5 = m4.silver;
                                o5 = m4.red;
                                interfaceC3440j2 = m4.purple;
                                n5 = m4.alpha;
                                ResultKt.alpha(obj4);
                                andSet = o5.alpha.getAndSet(AbstractC3428A.bravo);
                                Intrinsics.checkNotNull(andSet);
                                if (andSet == AbstractC3428A.charlie) {
                                }
                                obj2 = white.get(n5);
                                if (i5 != null) {
                                }
                                if (obj2 == zf.b.bravo) {
                                }
                                m4.alpha = n5;
                                m4.purple = interfaceC3440j2;
                                m4.red = o5;
                                m4.silver = i5;
                                m4.teal = obj2;
                                m4.f14160s = 2;
                                if (interfaceC3440j2.emit(obj3, m4) != aVar) {
                                }
                            }
                        } else {
                            o5 = m4.red;
                            interfaceC3440j = m4.purple;
                            n5 = m4.alpha;
                            ResultKt.alpha(obj4);
                        }
                    } else {
                        ResultKt.alpha(obj4);
                        n5 = this;
                        o5 = (O) charlie();
                    }
                    interfaceC3440j2 = interfaceC3440j;
                    i5 = (vf.I) m4.getContext().get(vf.H.alpha);
                    obj = null;
                    obj2 = white.get(n5);
                    if (i5 != null) {
                    }
                    if (obj2 == zf.b.bravo) {
                    }
                    m4.alpha = n5;
                    m4.purple = interfaceC3440j2;
                    m4.red = o5;
                    m4.silver = i5;
                    m4.teal = obj2;
                    m4.f14160s = 2;
                    if (interfaceC3440j2.emit(obj3, m4) != aVar) {
                    }
                }
            }
            if (i4 == 0) {
            }
            interfaceC3440j2 = interfaceC3440j;
            i5 = (vf.I) m4.getContext().get(vf.H.alpha);
            obj = null;
            obj2 = white.get(n5);
            if (i5 != null) {
            }
            if (obj2 == zf.b.bravo) {
            }
            m4.alpha = n5;
            m4.purple = interfaceC3440j2;
            m4.red = o5;
            m4.silver = i5;
            m4.teal = obj2;
            m4.f14160s = 2;
            if (interfaceC3440j2.emit(obj3, m4) != aVar) {
            }
        } catch (Throwable th) {
            n5.foxtrot(o5);
            throw th;
        }
        m4 = new M(this, cVar);
        Object obj42 = m4.white;
        aVar = Od.a.alpha;
        i4 = m4.f14160s;
    }

    @Override // zf.AbstractC3511a
    public final zf.c delta() {
        return new O();
    }

    @Override // zf.AbstractC3511a
    public final zf.c[] echo() {
        return new O[2];
    }

    @Override // yf.as, yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        india(obj);
        return Unit.INSTANCE;
    }

    @Override // yf.L
    public final Object getValue() {
        Af.t tVar = zf.b.bravo;
        Object obj = white.get(this);
        if (obj == tVar) {
            return null;
        }
        return obj;
    }

    public final boolean hotel(Object obj, Object obj2) {
        Af.t tVar = zf.b.bravo;
        if (obj == null) {
            obj = tVar;
        }
        if (obj2 == null) {
            obj2 = tVar;
        }
        return juliet(obj, obj2);
    }

    public final void india(Object obj) {
        if (obj == null) {
            obj = zf.b.bravo;
        }
        juliet(null, obj);
    }

    public final boolean juliet(Object obj, Object obj2) {
        int i4;
        zf.c[] cVarArr;
        Af.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = white;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i5 = this.teal;
            if ((i5 & 1) == 0) {
                int i10 = i5 + 1;
                this.teal = i10;
                zf.c[] cVarArr2 = this.alpha;
                while (true) {
                    O[] oArr = (O[]) cVarArr2;
                    if (oArr != null) {
                        for (O o5 : oArr) {
                            if (o5 != null) {
                                AtomicReference atomicReference = o5.alpha;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (tVar = AbstractC3428A.charlie)) {
                                        Af.t tVar2 = AbstractC3428A.bravo;
                                        if (obj4 == tVar2) {
                                            while (!atomicReference.compareAndSet(obj4, tVar)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            Result.Companion companion = Result.INSTANCE;
                                            ((C3207k) obj4).resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i4 = this.teal;
                        if (i4 == i10) {
                            this.teal = i10 + 1;
                            return true;
                        }
                        cVarArr = this.alpha;
                    }
                    cVarArr2 = cVarArr;
                    i10 = i4;
                }
            } else {
                this.teal = i5 + 2;
                return true;
            }
        }
    }
}
