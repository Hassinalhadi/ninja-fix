package se;

import androidx.compose.runtime.G;
import ef.C1658f;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import xe.EnumC3339b;

/* renamed from: se.p */
/* loaded from: classes2.dex */
public final class C2866p extends Xe.o {
    public final ff.e bravo;
    public final ff.e charlie;
    public final ff.i delta;
    public final /* synthetic */ C2867q echo;

    public C2866p(C2867q c2867q, ff.l lVar) {
        if (lVar != null) {
            this.echo = c2867q;
            this.bravo = lVar.charlie(new C2865o(this, 0));
            this.charlie = lVar.charlie(new C2865o(this, 1));
            this.delta = lVar.bravo(new G(2, this));
            return;
        }
        hotel(0);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void hotel(int i4) {
        String str;
        int i5;
        if (i4 != 3 && i4 != 7 && i4 != 9 && i4 != 12) {
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
            if (i4 != 3 && i4 != 7 && i4 != 9 && i4 != 12) {
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
                    case 4:
                    case 5:
                    case 8:
                    case 10:
                        objArr[0] = "name";
                        break;
                    case 2:
                    case 6:
                        objArr[0] = "location";
                        break;
                    case 3:
                    case 7:
                    case 9:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                    case 11:
                        objArr[0] = "fromSupertypes";
                        break;
                    case 13:
                        objArr[0] = "kindFilter";
                        break;
                    case 14:
                        objArr[0] = "nameFilter";
                        break;
                    case 20:
                        objArr[0] = "p";
                        break;
                    default:
                        objArr[0] = "storageManager";
                        break;
                }
                if (i4 == 3) {
                    if (i4 != 7) {
                        if (i4 != 9) {
                            if (i4 != 12) {
                                switch (i4) {
                                    case 15:
                                        objArr[1] = "getContributedDescriptors";
                                        break;
                                    case 16:
                                        objArr[1] = "computeAllDeclarations";
                                        break;
                                    case 17:
                                        objArr[1] = "getFunctionNames";
                                        break;
                                    case 18:
                                        objArr[1] = "getClassifierNames";
                                        break;
                                    case 19:
                                        objArr[1] = "getVariableNames";
                                        break;
                                    default:
                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                        break;
                                }
                            } else {
                                objArr[1] = "resolveFakeOverrides";
                            }
                        } else {
                            objArr[1] = "getSupertypeScope";
                        }
                    } else {
                        objArr[1] = "getContributedFunctions";
                    }
                } else {
                    objArr[1] = "getContributedVariables";
                }
                switch (i4) {
                    case 1:
                    case 2:
                        objArr[2] = "getContributedVariables";
                        break;
                    case 3:
                    case 7:
                    case 9:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    case 4:
                        objArr[2] = "computeProperties";
                        break;
                    case 5:
                    case 6:
                        objArr[2] = "getContributedFunctions";
                        break;
                    case 8:
                        objArr[2] = "computeFunctions";
                        break;
                    case 10:
                    case 11:
                        objArr[2] = "resolveFakeOverrides";
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "getContributedDescriptors";
                        break;
                    case 20:
                        objArr[2] = "printScopeStructure";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 3 && i4 != 7 && i4 != 9 && i4 != 12) {
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
            if (i4 == 3) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 3) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 3) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i5];
            switch (i4) {
            }
            if (i4 == 3) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 3) {
            }
            throw new IllegalStateException(format22);
        }
        i5 = 2;
        Object[] objArr222 = new Object[i5];
        switch (i4) {
        }
        if (i4 == 3) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 3) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // Xe.o, Xe.p
    public final Collection alpha(Xe.f fVar, Function1 function1) {
        if (fVar != null) {
            if (function1 != null) {
                Collection collection = (Collection) this.delta.invoke();
                if (collection != null) {
                    return collection;
                }
                hotel(15);
                throw null;
            }
            hotel(14);
            throw null;
        }
        hotel(13);
        throw null;
    }

    @Override // Xe.o, Xe.n
    public final Set bravo() {
        Set set = (Set) this.echo.f13758b.invoke();
        if (set != null) {
            return set;
        }
        hotel(17);
        throw null;
    }

    @Override // Xe.o, Xe.n
    public final Collection charlie(Ne.f fVar, EnumC3339b enumC3339b) {
        if (fVar != null) {
            return (Collection) this.bravo.invoke(fVar);
        }
        hotel(5);
        throw null;
    }

    @Override // Xe.o, Xe.n
    public final Set delta() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        hotel(18);
        throw null;
    }

    @Override // Xe.o, Xe.n
    public final Set echo() {
        Set set = (Set) this.echo.f13758b.invoke();
        if (set != null) {
            return set;
        }
        hotel(19);
        throw null;
    }

    @Override // Xe.o, Xe.n
    public final Collection foxtrot(Ne.f fVar, EnumC3339b enumC3339b) {
        if (fVar != null) {
            return (Collection) this.charlie.invoke(fVar);
        }
        hotel(1);
        throw null;
    }

    public final Xe.n india() {
        Xe.n olive = ((kotlin.reflect.jvm.internal.impl.types.y) ((kotlin.reflect.jvm.internal.impl.types.i) this.echo.tango()).lima().iterator().next()).olive();
        if (olive != null) {
            return olive;
        }
        hotel(9);
        throw null;
    }

    public final LinkedHashSet juliet(Ne.f fVar, Collection collection) {
        if (fVar != null) {
            if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Qe.k.charlie.hotel(fVar, collection, Collections.EMPTY_SET, this.echo, new C1658f(linkedHashSet, 1));
                return linkedHashSet;
            }
            hotel(11);
            throw null;
        }
        hotel(10);
        throw null;
    }
}
