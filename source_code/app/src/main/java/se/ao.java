package se;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import pe.InterfaceC2335k;
import qe.C2470f;
import qe.C2471g;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class ao extends AbstractC2858h {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13744d;
    public boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ao(InterfaceC2335k interfaceC2335k, InterfaceC2472h interfaceC2472h, boolean z2, int i4, Ne.f fVar, int i5, ff.o oVar) {
        super(oVar, interfaceC2335k, interfaceC2472h, fVar, i4, z2, i5, r8);
        pe.ao aoVar = pe.ao.red;
        if (interfaceC2335k != null) {
            if (interfaceC2472h != null) {
                if (i4 != 0) {
                    if (fVar != null) {
                        if (oVar != null) {
                            this.f13744d = new ArrayList(1);
                            this.e = false;
                            return;
                        }
                        D(25);
                        throw null;
                    }
                    D(22);
                    throw null;
                }
                D(21);
                throw null;
            }
            D(20);
            throw null;
        }
        D(19);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        if (i4 != 5 && i4 != 28) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 5 && i4 != 28) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = Constants.KEY_TYPE;
                break;
        }
        if (i4 != 5) {
            if (i4 != 28) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
            } else {
                objArr[1] = "resolveUpperBounds";
            }
        } else {
            objArr[1] = "createWithDefaultBound";
        }
        switch (i4) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 5 || i4 == 28) {
            throw new IllegalStateException(format);
        }
    }

    public static ao c0(InterfaceC2335k interfaceC2335k, InterfaceC2472h interfaceC2472h, boolean z2, int i4, Ne.f fVar, int i5, ff.o oVar) {
        if (interfaceC2335k != null) {
            if (interfaceC2472h != null) {
                if (i4 != 0) {
                    if (fVar != null) {
                        if (oVar != null) {
                            if (i4 != 0) {
                                return new ao(interfaceC2335k, interfaceC2472h, z2, i4, fVar, i5, oVar);
                            }
                            D(14);
                            throw null;
                        }
                        D(11);
                        throw null;
                    }
                    D(9);
                    throw null;
                }
                D(8);
                throw null;
            }
            D(7);
            throw null;
        }
        D(6);
        throw null;
    }

    public static ao d0(AbstractC2852b abstractC2852b, int i4, Ne.f fVar, int i5, ff.l lVar) {
        C2470f c2470f = C2471g.alpha;
        if (abstractC2852b != null) {
            if (i4 != 0) {
                if (lVar != null) {
                    ao c02 = c0(abstractC2852b, c2470f, false, i4, fVar, i5, lVar);
                    kotlin.reflect.jvm.internal.impl.types.ae november = Ue.e.echo(abstractC2852b).november();
                    if (!c02.e) {
                        if (!kotlin.reflect.jvm.internal.impl.types.c.india(november)) {
                            c02.f13744d.add(november);
                        }
                        if (!c02.e) {
                            c02.e = true;
                            return c02;
                        }
                        throw new IllegalStateException("Type parameter descriptor is already initialized: " + c02.e0());
                    }
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + c02.e0());
                }
                D(4);
                throw null;
            }
            D(2);
            throw null;
        }
        D(0);
        throw null;
    }

    @Override // se.AbstractC2858h
    public final void a0(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        if (yVar != null) {
            return;
        }
        D(27);
        throw null;
    }

    @Override // se.AbstractC2858h
    public final List b0() {
        if (this.e) {
            ArrayList arrayList = this.f13744d;
            if (arrayList != null) {
                return arrayList;
            }
            D(28);
            throw null;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + e0());
    }

    public final String e0() {
        return getName() + " declared in " + Qe.e.golf(lima());
    }
}
