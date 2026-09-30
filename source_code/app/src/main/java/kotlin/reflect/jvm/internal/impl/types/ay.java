package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;

/* loaded from: classes2.dex */
public final class ay extends p {
    public final String purple;

    public ay(String str) {
        this.purple = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void D(int i4) {
        String format;
        String str = (i4 == 1 || i4 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i4 == 1 || i4 == 4) ? 2 : 3];
        if (i4 != 1) {
            if (i4 == 2) {
                objArr[0] = "delegate";
            } else if (i4 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i4 != 4) {
                objArr[0] = "newAttributes";
            }
            if (i4 != 1) {
                objArr[1] = "toString";
            } else if (i4 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i4 == 3) {
                    objArr[2] = "refine";
                } else if (i4 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            format = String.format(str, objArr);
            if (i4 == 1 && i4 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        if (i4 != 1) {
        }
        if (i4 != 1) {
        }
        format = String.format(str, objArr);
        if (i4 == 1) {
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: d */
    public final ae pink(boolean z2) {
        throw new IllegalStateException(this.purple);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al alVar) {
        if (alVar == null) {
            D(0);
            throw null;
        }
        throw new IllegalStateException(this.purple);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.y
    /* renamed from: ivory */
    public final y purple(C1791f c1791f) {
        if (c1791f != null) {
            return this;
        }
        D(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final ae m() {
        throw new IllegalStateException(this.purple);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    /* renamed from: p */
    public final ae ivory(C1791f c1791f) {
        if (c1791f != null) {
            return this;
        }
        D(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae, kotlin.reflect.jvm.internal.impl.types.B
    public final /* bridge */ /* synthetic */ B pink(boolean z2) {
        pink(z2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.B
    public final B purple(C1791f c1791f) {
        if (c1791f != null) {
            return this;
        }
        D(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    public final String toString() {
        String str = this.purple;
        if (str != null) {
            return str;
        }
        D(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final p u(ae aeVar) {
        throw new IllegalStateException(this.purple);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae, kotlin.reflect.jvm.internal.impl.types.B
    public final /* bridge */ /* synthetic */ B white(al alVar) {
        white(alVar);
        throw null;
    }
}
