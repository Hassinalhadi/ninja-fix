package se;

import gf.C1791f;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;

/* renamed from: se.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2852b extends y {
    public final Ne.f alpha;
    public final ff.i purple;
    public final ff.i red;
    public final ff.i silver;

    public AbstractC2852b(ff.l lVar, Ne.f fVar) {
        if (lVar != null) {
            if (fVar != null) {
                this.alpha = fVar;
                this.purple = lVar.bravo(new C2851a(this, 0));
                this.red = lVar.bravo(new C2851a(this, 1));
                this.silver = lVar.bravo(new C2851a(this, 2));
                return;
            }
            victor(1);
            throw null;
        }
        victor(0);
        throw null;
    }

    public static /* synthetic */ void victor(int i4) {
        String str;
        int i5;
        if (i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6 && i4 != 9 && i4 != 12 && i4 != 14 && i4 != 16 && i4 != 17 && i4 != 19 && i4 != 20) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6 && i4 != 9 && i4 != 12 && i4 != 14 && i4 != 16 && i4 != 17 && i4 != 19 && i4 != 20) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    if (i4 != 5) {
                        if (i4 != 6) {
                            if (i4 != 9 && i4 != 12 && i4 != 14 && i4 != 16) {
                                if (i4 != 17) {
                                    if (i4 != 19) {
                                        if (i4 != 20) {
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                                        } else {
                                            objArr[1] = "getDefaultType";
                                        }
                                    } else {
                                        objArr[1] = "substitute";
                                    }
                                } else {
                                    objArr[1] = "getUnsubstitutedMemberScope";
                                }
                            } else {
                                objArr[1] = "getMemberScope";
                            }
                        } else {
                            objArr[1] = "getContextReceivers";
                        }
                    } else {
                        objArr[1] = "getThisAsReceiverParameter";
                    }
                } else {
                    objArr[1] = "getUnsubstitutedInnerClassesScope";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        switch (i4) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 6 || i4 == 9 || i4 == 12 || i4 == 14 || i4 == 16 || i4 == 17 || i4 == 19 || i4 == 20) {
            throw new IllegalStateException(format);
        }
    }

    @Override // pe.InterfaceC2330f
    public final C2871u C() {
        C2871u c2871u = (C2871u) this.silver.invoke();
        if (c2871u != null) {
            return c2871u;
        }
        victor(5);
        throw null;
    }

    @Override // se.y, pe.InterfaceC2330f, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2332h alpha() {
        return this;
    }

    @Override // pe.ap
    /* renamed from: crimson, reason: merged with bridge method [inline-methods] */
    public InterfaceC2330f delta(ax axVar) {
        if (axVar != null) {
            if (axVar.alpha.echo()) {
                return this;
            }
            return new C2874x(this, axVar);
        }
        victor(18);
        throw null;
    }

    @Override // se.y
    public Xe.n foxtrot(av avVar, C1791f c1791f) {
        if (avVar.echo()) {
            Xe.n sierra = sierra(c1791f);
            if (sierra != null) {
                return sierra;
            }
            victor(12);
            throw null;
        }
        return new Xe.t(sierra(c1791f), new ax(avVar));
    }

    @Override // pe.InterfaceC2335k
    public final Ne.f getName() {
        Ne.f fVar = this.alpha;
        if (fVar != null) {
            return fVar;
        }
        victor(2);
        throw null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ae oscar() {
        kotlin.reflect.jvm.internal.impl.types.ae aeVar = (kotlin.reflect.jvm.internal.impl.types.ae) this.purple.invoke();
        if (aeVar != null) {
            return aeVar;
        }
        victor(20);
        throw null;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.jade(this, obj);
    }

    @Override // pe.InterfaceC2330f
    public final Xe.n red(av avVar) {
        Ue.e.india(Qe.e.delta(this));
        Xe.n foxtrot = foxtrot(avVar, C1791f.alpha);
        if (foxtrot != null) {
            return foxtrot;
        }
        victor(16);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public Xe.n s() {
        Xe.n nVar = (Xe.n) this.red.invoke();
        if (nVar != null) {
            return nVar;
        }
        victor(4);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public Xe.n x() {
        Ue.e.india(Qe.e.delta(this));
        Xe.n sierra = sierra(C1791f.alpha);
        if (sierra != null) {
            return sierra;
        }
        victor(17);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public List z() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        victor(6);
        throw null;
    }

    @Override // se.y, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2335k alpha() {
        return this;
    }

    @Override // se.y, pe.InterfaceC2330f, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2330f alpha() {
        return this;
    }
}
