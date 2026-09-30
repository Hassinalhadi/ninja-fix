package pe;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2339o {
    public final AbstractC2316H alpha;
    public final /* synthetic */ int bravo;

    public C2339o(AbstractC2316H delegate, int i4) {
        this.bravo = i4;
        Intrinsics.echo(delegate, "delegate");
        this.alpha = delegate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a1, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0272 A[LOOP:1: B:124:0x0272->B:128:0x02a3, LOOP_START, PHI: r9
      0x0272: PHI (r9v2 pe.k) = (r9v0 pe.k), (r9v3 pe.k) binds: [B:123:0x026f, B:128:0x02a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r8v0, types: [pe.n, pe.k] */
    /* JADX WARN: Type inference failed for: r8v6, types: [pe.k] */
    /* JADX WARN: Type inference failed for: r8v7, types: [pe.k] */
    /* JADX WARN: Type inference failed for: r8v9, types: [pe.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean alpha(ao aoVar, InterfaceC2338n interfaceC2338n, InterfaceC2335k interfaceC2335k) {
        InterfaceC2328d interfaceC2328d;
        InterfaceC2330f interfaceC2330f;
        switch (this.bravo) {
            case 0:
                if (interfaceC2335k != null) {
                    if (Qe.e.sierra(interfaceC2338n) && Qe.e.foxtrot(interfaceC2335k) != ao.purple) {
                        return AbstractC2340p.delta(interfaceC2338n, interfaceC2335k);
                    }
                    if (interfaceC2338n instanceof InterfaceC2334j) {
                        ((InterfaceC2334j) interfaceC2338n).lima();
                    }
                    while (interfaceC2338n != 0) {
                        interfaceC2338n = interfaceC2338n.lima();
                        if ((!(interfaceC2338n instanceof InterfaceC2330f) || Qe.e.lima(interfaceC2338n)) && !(interfaceC2338n instanceof InterfaceC2321ad)) {
                        }
                        if (interfaceC2338n != 0) {
                            while (true) {
                                if (interfaceC2335k != null) {
                                    if (interfaceC2338n == interfaceC2335k) {
                                        break;
                                    } else if (interfaceC2335k instanceof InterfaceC2321ad) {
                                        if (!(interfaceC2338n instanceof InterfaceC2321ad) || !((se.ab) interfaceC2338n).teal.equals(((se.ab) ((InterfaceC2321ad) interfaceC2335k)).teal) || !Qe.e.delta(interfaceC2335k).equals(Qe.e.delta(interfaceC2338n))) {
                                        }
                                    } else {
                                        interfaceC2335k = interfaceC2335k.lima();
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    if (interfaceC2338n != 0) {
                    }
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
            case 1:
                if (interfaceC2335k != null) {
                    if (AbstractC2340p.alpha.alpha(aoVar, interfaceC2338n, interfaceC2335k)) {
                        if (aoVar == AbstractC2340p.lima) {
                            return true;
                        }
                        if (aoVar != AbstractC2340p.kilo) {
                            Qe.e.india(interfaceC2338n, InterfaceC2330f.class, true);
                        }
                    }
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
            case 2:
                if (interfaceC2335k != null) {
                    InterfaceC2330f interfaceC2330f2 = (InterfaceC2330f) Qe.e.india(interfaceC2338n, InterfaceC2330f.class, true);
                    InterfaceC2330f interfaceC2330f3 = (InterfaceC2330f) Qe.e.india(interfaceC2335k, InterfaceC2330f.class, false);
                    if (interfaceC2330f3 != null) {
                        if (interfaceC2330f2 != null && Qe.e.lima(interfaceC2330f2) && (interfaceC2330f = (InterfaceC2330f) Qe.e.india(interfaceC2330f2, InterfaceC2330f.class, true)) != null && Qe.e.romeo(interfaceC2330f3.oscar(), interfaceC2330f.alpha())) {
                            return true;
                        }
                        if (interfaceC2338n instanceof InterfaceC2328d) {
                            interfaceC2328d = Qe.e.tango((InterfaceC2328d) interfaceC2338n);
                        } else {
                            interfaceC2328d = interfaceC2338n;
                        }
                        InterfaceC2330f interfaceC2330f4 = (InterfaceC2330f) Qe.e.india(interfaceC2328d, InterfaceC2330f.class, true);
                        if (interfaceC2330f4 != null) {
                            if (Qe.e.romeo(interfaceC2330f3.oscar(), interfaceC2330f4.alpha()) && aoVar != AbstractC2340p.mike) {
                                if (!(interfaceC2328d instanceof InterfaceC2328d) || (interfaceC2328d instanceof InterfaceC2334j) || aoVar == AbstractC2340p.lima) {
                                    return true;
                                }
                                if (aoVar != AbstractC2340p.kilo && aoVar != null) {
                                    aoVar.getType();
                                    throw null;
                                }
                            }
                            return alpha(aoVar, interfaceC2338n, interfaceC2330f3.lima());
                        }
                    }
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
            case 3:
                if (interfaceC2335k != null) {
                    if (!Qe.e.delta(interfaceC2335k).bronze(Qe.e.delta(interfaceC2338n))) {
                        return false;
                    }
                    AbstractC2340p.november.getClass();
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
            case 4:
                if (interfaceC2335k != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (interfaceC2335k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (interfaceC2335k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (interfaceC2335k != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (interfaceC2335k != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (interfaceC2335k != null) {
                    return ye.s.charlie(interfaceC2338n, interfaceC2335k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (interfaceC2335k != null) {
                    return ye.s.bravo(aoVar, interfaceC2338n, interfaceC2335k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (interfaceC2335k != null) {
                    return ye.s.bravo(aoVar, interfaceC2338n, interfaceC2335k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.alpha.bravo();
    }
}
