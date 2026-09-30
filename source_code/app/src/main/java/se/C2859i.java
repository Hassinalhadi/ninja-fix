package se;

import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.AbstractC2327c;
import pe.C2339o;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2334j;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;
import pe.InterfaceC2345u;
import qe.InterfaceC2472h;

/* renamed from: se.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2859i extends AbstractC2870t implements InterfaceC2334j {

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2859i(InterfaceC2330f interfaceC2330f, InterfaceC2334j interfaceC2334j, InterfaceC2472h interfaceC2472h, boolean z2, int i4, pe.an anVar) {
        super(i4, Ne.h.echo, interfaceC2330f, interfaceC2334j, anVar, interfaceC2472h);
        if (interfaceC2330f != null) {
            if (interfaceC2472h != null) {
                if (i4 != 0) {
                    if (anVar != null) {
                        this.f13752w = z2;
                        return;
                    } else {
                        D(3);
                        throw null;
                    }
                }
                D(2);
                throw null;
            }
            D(1);
            throw null;
        }
        D(0);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        if (i4 != 21 && i4 != 27) {
            switch (i4) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 21 && i4 != 27) {
                switch (i4) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i5 = 3;
                        break;
                }
                Object[] objArr = new Object[i5];
                switch (i4) {
                    case 1:
                    case 5:
                    case 8:
                    case 25:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case 3:
                    case 6:
                    case 9:
                    case 26:
                        objArr[0] = "source";
                        break;
                    case 4:
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 10:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i4 == 21) {
                    if (i4 != 27) {
                        switch (i4) {
                            case 15:
                            case 16:
                                objArr[1] = "calculateContextReceiverParameters";
                                break;
                            case 17:
                                objArr[1] = "getContainingDeclaration";
                                break;
                            case 18:
                                objArr[1] = "getConstructedClass";
                                break;
                            case 19:
                                objArr[1] = "getOriginal";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                                break;
                        }
                    } else {
                        objArr[1] = Constants.COPY_TYPE;
                    }
                } else {
                    objArr[1] = "getOverriddenDescriptors";
                }
                switch (i4) {
                    case 4:
                    case 5:
                    case 6:
                        objArr[2] = "create";
                        break;
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 21 && i4 != 27) {
                    switch (i4) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i5 = 2;
            Object[] objArr2 = new Object[i5];
            switch (i4) {
            }
            if (i4 == 21) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 21) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 21) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i5];
            switch (i4) {
            }
            if (i4 == 21) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 21) {
            }
            throw new IllegalStateException(format22);
        }
        i5 = 2;
        Object[] objArr222 = new Object[i5];
        switch (i4) {
        }
        if (i4 == 21) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 21) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2328d
    public final InterfaceC2328d A(InterfaceC2330f interfaceC2330f, int i4, C2339o c2339o) {
        return (C2859i) Z(interfaceC2330f, i4, c2339o);
    }

    @Override // se.AbstractC2870t
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C2859i b0(int i4, Ne.f fVar, InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, pe.an anVar, InterfaceC2472h interfaceC2472h) {
        if (interfaceC2335k != null) {
            if (i4 != 0) {
                if (interfaceC2472h != null) {
                    if (i4 != 1 && i4 != 4) {
                        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC2335k + "\nkind: " + AbstractC2327c.bronze(i4));
                    }
                    return new C2859i((InterfaceC2330f) interfaceC2335k, this, interfaceC2472h, this.f13752w, 1, anVar);
                }
                D(25);
                throw null;
            }
            D(24);
            throw null;
        }
        D(23);
        throw null;
    }

    @Override // se.AbstractC2864n, pe.InterfaceC2335k
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2330f lima() {
        InterfaceC2330f interfaceC2330f = (InterfaceC2330f) super.lima();
        if (interfaceC2330f != null) {
            return interfaceC2330f;
        }
        D(17);
        throw null;
    }

    @Override // se.AbstractC2870t, se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    /* renamed from: m0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C2859i alpha() {
        C2859i c2859i = (C2859i) super.alpha();
        if (c2859i != null) {
            return c2859i;
        }
        D(19);
        throw null;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2328d, pe.InterfaceC2326b
    public final Collection mike() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        D(21);
        throw null;
    }

    public final void n0(List list, C2339o c2339o) {
        if (list != null) {
            if (c2339o != null) {
                o0(list, c2339o, lima().papa());
                return;
            } else {
                D(14);
                throw null;
            }
        }
        D(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(List list, C2339o c2339o, List list2) {
        C2871u c2871u;
        InterfaceC2330f lima;
        List list3;
        if (list != null) {
            if (c2339o != null) {
                if (list2 != null) {
                    InterfaceC2330f lima2 = lima();
                    if (lima2.india()) {
                        InterfaceC2335k lima3 = lima2.lima();
                        if (lima3 instanceof InterfaceC2330f) {
                            c2871u = ((InterfaceC2330f) lima3).C();
                            lima = lima();
                            if (lima.z().isEmpty()) {
                                list3 = lima.z();
                                if (list3 == null) {
                                    D(15);
                                    throw null;
                                }
                            } else {
                                list3 = Collections.EMPTY_LIST;
                                if (list3 == null) {
                                    D(16);
                                    throw null;
                                }
                            }
                            e0(null, c2871u, list3, list2, list, null, 1, c2339o);
                            return;
                        }
                    }
                    c2871u = null;
                    lima = lima();
                    if (lima.z().isEmpty()) {
                    }
                    e0(null, c2871u, list3, list2, list, null, 1, c2339o);
                    return;
                }
                D(12);
                throw null;
            }
            D(11);
            throw null;
        }
        D(10);
        throw null;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2345u, pe.ap
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final C2859i delta(ax axVar) {
        if (axVar != null) {
            return (C2859i) super.delta(axVar);
        }
        D(20);
        throw null;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.hotel(this, obj);
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2328d
    public final void r(Collection collection) {
        if (collection != null) {
            return;
        }
        D(22);
        throw null;
    }

    @Override // pe.InterfaceC2334j
    public final boolean yankee() {
        return this.f13752w;
    }

    @Override // pe.InterfaceC2334j
    public final InterfaceC2330f zulu() {
        InterfaceC2330f lima = lima();
        if (lima != null) {
            return lima;
        }
        D(18);
        throw null;
    }
}
