package kotlin.time;

import ao.ad;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.google.android.gms.measurement.internal.C1471u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import s6.J4;

/* loaded from: classes2.dex */
public abstract class g {
    public static final int[] alpha = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] bravo = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] charlie = {3, 6};
    public static final int[] delta = {1, 2, 4, 5, 7, 8};

    public static final long alpha(String str) {
        int i4;
        boolean z2;
        boolean z10;
        d dVar;
        long foxtrot;
        char charAt;
        int length = str.length();
        if (length != 0) {
            int i5 = b.silver;
            char charAt2 = str.charAt(0);
            if (charAt2 != '+' && charAt2 != '-') {
                i4 = 0;
            } else {
                i4 = 1;
            }
            if (i4 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && StringsKt.orange(str, NumberOnlyZipVisualTransformation.HYPHEN)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (length > i4) {
                if (str.charAt(i4) == 'P') {
                    int i10 = i4 + 1;
                    if (i10 != length) {
                        d dVar2 = null;
                        long j5 = 0;
                        boolean z11 = false;
                        while (i10 < length) {
                            if (str.charAt(i10) == 'T') {
                                if (!z11 && (i10 = i10 + 1) != length) {
                                    z11 = true;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                int i11 = i10;
                                while (i11 < str.length() && (('0' <= (charAt = str.charAt(i11)) && charAt < ':') || StringsKt.black("+-.", charAt))) {
                                    i11++;
                                }
                                String substring = str.substring(i10, i11);
                                Intrinsics.delta(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = substring.length() + i10;
                                    if (length2 >= 0 && length2 < str.length()) {
                                        char charAt3 = str.charAt(length2);
                                        int i12 = length2 + 1;
                                        if (!z11) {
                                            if (charAt3 == 'D') {
                                                dVar = d.f12936a;
                                            } else {
                                                throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                                            }
                                        } else if (charAt3 != 'H') {
                                            if (charAt3 != 'M') {
                                                if (charAt3 == 'S') {
                                                    dVar = d.teal;
                                                } else {
                                                    throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                                                }
                                            } else {
                                                dVar = d.white;
                                            }
                                        } else {
                                            dVar = d.yellow;
                                        }
                                        if (dVar2 != null && dVar2.compareTo(dVar) <= 0) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        int emerald = StringsKt.emerald(substring, '.', 0, 6);
                                        if (dVar == d.teal && emerald > 0) {
                                            String substring2 = substring.substring(0, emerald);
                                            Intrinsics.delta(substring2, "substring(...)");
                                            long foxtrot2 = b.foxtrot(j5, quebec(november(substring2), dVar));
                                            String substring3 = substring.substring(emerald);
                                            Intrinsics.delta(substring3, "substring(...)");
                                            double parseDouble = Double.parseDouble(substring3);
                                            double bravo2 = bravo(parseDouble, dVar, d.purple);
                                            if (!Double.isNaN(bravo2)) {
                                                long echo = Zd.a.echo(bravo2);
                                                if (-4611686018426999999L <= echo && echo < 4611686018427000000L) {
                                                    foxtrot = golf(echo);
                                                } else {
                                                    foxtrot = foxtrot(Zd.a.echo(bravo(parseDouble, dVar, d.silver)));
                                                }
                                                j5 = b.foxtrot(foxtrot2, foxtrot);
                                            } else {
                                                throw new IllegalArgumentException("Duration value cannot be NaN.");
                                            }
                                        } else {
                                            j5 = b.foxtrot(j5, quebec(november(substring), dVar));
                                        }
                                        dVar2 = dVar;
                                        i10 = i12;
                                    } else {
                                        throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                        if (z10) {
                            return b.hotel(j5);
                        }
                        return j5;
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    public static final double bravo(double d4, d dVar, d targetUnit) {
        Intrinsics.echo(targetUnit, "targetUnit");
        long convert = targetUnit.alpha.convert(1L, dVar.alpha);
        if (convert > 0) {
            return d4 * convert;
        }
        return d4 / r8.convert(1L, r9);
    }

    public static final long charlie(long j5, d sourceUnit, d targetUnit) {
        Intrinsics.echo(sourceUnit, "sourceUnit");
        Intrinsics.echo(targetUnit, "targetUnit");
        return targetUnit.alpha.convert(j5, sourceUnit.alpha);
    }

    public static final long delta(long j5, d sourceUnit, d targetUnit) {
        Intrinsics.echo(sourceUnit, "sourceUnit");
        Intrinsics.echo(targetUnit, "targetUnit");
        return targetUnit.alpha.convert(j5, sourceUnit.alpha);
    }

    public static final long echo(long j5) {
        long j6 = (j5 << 1) + 1;
        int i4 = b.silver;
        int i5 = c.alpha;
        return j6;
    }

    public static final long foxtrot(long j5) {
        if (-4611686018426L <= j5 && j5 < 4611686018427L) {
            return golf(j5 * 1000000);
        }
        return echo(J4.echo(j5, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long golf(long j5) {
        long j6 = j5 << 1;
        int i4 = b.silver;
        int i5 = c.alpha;
        return j6;
    }

    public static final void hotel(StringBuilder sb2, StringBuilder sb3, int i4) {
        if (i4 < 10) {
            sb2.append('0');
        }
        sb3.append(i4);
    }

    public static e india(int i4, long j5) {
        long j6 = i4;
        long j7 = j6 / 1000000000;
        if ((j6 ^ 1000000000) < 0 && j7 * 1000000000 != j6) {
            j7--;
        }
        long j10 = j5 + j7;
        if ((j5 ^ j10) < 0 && (j7 ^ j5) >= 0) {
            if (j5 > 0) {
                return e.silver;
            }
            return e.red;
        }
        if (j10 < -31557014167219200L) {
            return e.red;
        }
        if (j10 > 31556889864403199L) {
            return e.silver;
        }
        long j11 = j6 % 1000000000;
        return new e(j10, (int) (j11 + ((((j11 ^ 1000000000) & ((-j11) | j11)) >> 63) & 1000000000)));
    }

    public static final long juliet(long j5) {
        if (j5 < 0) {
            int i4 = b.silver;
            return b.red;
        }
        int i5 = b.silver;
        return b.purple;
    }

    public static final C1471u kilo(String str, String str2, int i4, Function1 function1) {
        char charAt = str.charAt(i4);
        if (((Boolean) function1.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return lima(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i4);
    }

    public static final C1471u lima(String str, String str2) {
        StringBuilder beige = ad.beige(str2, " when parsing an Instant from \"");
        beige.append(romeo(64, str));
        beige.append('\"');
        return new C1471u(beige.toString(), str);
    }

    public static final int mike(int i4, String str) {
        return (str.charAt(i4 + 1) - '0') + ((str.charAt(i4) - '0') * 10);
    }

    public static final long november(String str) {
        int i4;
        char charAt;
        int length = str.length();
        if (length > 0 && StringsKt.black("+-", str.charAt(0))) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (length - i4 > 16) {
            int i5 = i4;
            while (true) {
                if (i4 < length) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 == '0') {
                        if (i5 == i4) {
                            i5++;
                        }
                    } else if ('1' > charAt2 || charAt2 >= ':') {
                        break;
                    }
                    i4++;
                } else if (length - i5 > 16) {
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
            }
        }
        if (r.quebec(str, "+", false) && length > 1 && '0' <= (charAt = str.charAt(1)) && charAt < ':') {
            return Long.parseLong(StringsKt.blue(1, str));
        }
        return Long.parseLong(str);
    }

    public static final long oscar(long j5, long j6, d dVar) {
        long j7 = j5 - j6;
        if (((j7 ^ j5) & (~(j7 ^ j6))) < 0) {
            d dVar2 = d.silver;
            if (dVar.compareTo(dVar2) < 0) {
                long charlie2 = charlie(1L, dVar2, dVar);
                long j10 = (j5 / charlie2) - (j6 / charlie2);
                long j11 = (j5 % charlie2) - (j6 % charlie2);
                int i4 = b.silver;
                return b.foxtrot(quebec(j10, dVar2), quebec(j11, dVar));
            }
            return b.hotel(juliet(j7));
        }
        return quebec(j7, dVar);
    }

    public static final long papa(int i4, d unit) {
        Intrinsics.echo(unit, "unit");
        if (unit.compareTo(d.teal) <= 0) {
            return golf(delta(i4, unit, d.purple));
        }
        return quebec(i4, unit);
    }

    public static final long quebec(long j5, d unit) {
        Intrinsics.echo(unit, "unit");
        d dVar = d.purple;
        long delta2 = delta(4611686018426999999L, dVar, unit);
        if ((-delta2) <= j5 && j5 <= delta2) {
            return golf(delta(j5, unit, dVar));
        }
        return echo(J4.echo(charlie(j5, unit, d.silver), -4611686018427387903L, 4611686018427387903L));
    }

    public static final String romeo(int i4, String str) {
        if (str.length() <= i4) {
            return str.toString();
        }
        return str.subSequence(0, i4).toString() + "...";
    }
}
