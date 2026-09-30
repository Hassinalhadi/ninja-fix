package s6;

import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class T7 {
    public static r6.r alpha;

    public static final boolean alpha(TextInputLayout textInputLayout, A3.a aVar, String str) {
        int i4;
        Object[] objArr;
        Intrinsics.echo(textInputLayout, "<this>");
        B3.a aVar2 = null;
        if (aVar.alpha) {
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
            return true;
        }
        Enum r5 = aVar.charlie;
        if (r5 instanceof B3.a) {
            aVar2 = (B3.a) r5;
        }
        if (aVar2 == null) {
            return true;
        }
        int i5 = Zc.a.$EnumSwitchMapping$0[aVar2.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 == 5) {
                            i4 = R.string.invalid_iban_checksum;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i4 = R.string.invalid_iban_length_country;
                    }
                } else {
                    i4 = R.string.invalid_iban_format;
                }
            } else {
                i4 = R.string.error_remove_iban_prefix;
            }
        } else {
            i4 = R.string.error_empty_field;
        }
        if (aVar2 == B3.a.silver) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.delta(upperCase, "toUpperCase(...)");
            objArr = new Object[]{upperCase};
        } else {
            objArr = new Object[0];
        }
        textInputLayout.setError(textInputLayout.getContext().getString(i4, Arrays.copyOf(objArr, objArr.length)));
        textInputLayout.setErrorEnabled(true);
        return false;
    }

    public static void bravo(String str, boolean z2) {
        if (z2) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void charlie(boolean z2) {
        if (z2) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void delta(int i4, int i5, int i10, String str) {
        if (i4 >= i5) {
            if (i4 <= i10) {
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i5 + ", " + i10 + "] (too high)");
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i5 + ", " + i10 + "] (too low)");
    }

    public static void echo(int i4) {
        if (i4 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void foxtrot(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void golf(String str, boolean z2) {
        if (z2) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static synchronized P7 hotel(K7 k72) {
        P7 p72;
        synchronized (T7.class) {
            try {
                if (alpha == null) {
                    alpha = new r6.r(1);
                }
                p72 = (P7) alpha.get(k72);
            } catch (Throwable th) {
                throw th;
            }
        }
        return p72;
    }
}
