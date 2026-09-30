package Qe;

import com.checkout.components.redirecthandler.utils.RedirectionConstants;

/* loaded from: classes2.dex */
public final class j {
    public static final j bravo = new j(1, "SUCCESS");
    public final int alpha;

    public j(int i4, String str) {
        if (i4 != 0) {
            this.alpha = i4;
        } else {
            alpha(3);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        String format;
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            i5 = 2;
        } else {
            i5 = 3;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
            } else {
                objArr[0] = RedirectionConstants.REDIRECT_SUCCESS_VALUE;
            }
            switch (i4) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = RedirectionConstants.REDIRECT_SUCCESS_VALUE;
                    break;
            }
            if (i4 == 1) {
                if (i4 != 2) {
                    if (i4 == 3 || i4 == 4) {
                        objArr[2] = "<init>";
                    }
                } else {
                    objArr[2] = "conflict";
                }
            } else {
                objArr[2] = "incompatible";
            }
            format = String.format(str, objArr);
            if (i4 != 1 || i4 == 2 || i4 == 3 || i4 == 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "debugMessage";
        switch (i4) {
        }
        if (i4 == 1) {
        }
        format = String.format(str, objArr);
        if (i4 != 1) {
        }
        throw new IllegalArgumentException(format);
    }

    public static j bravo(String str) {
        return new j(3, str);
    }

    public static j delta(String str) {
        return new j(2, str);
    }

    public final int charlie() {
        int i4 = this.alpha;
        if (i4 != 0) {
            return i4;
        }
        alpha(5);
        throw null;
    }
}
