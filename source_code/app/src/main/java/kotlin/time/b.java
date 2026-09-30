package kotlin.time;

import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.J4;

/* loaded from: classes2.dex */
public final class b implements Comparable {
    public static final long purple;
    public static final long red;
    public static final /* synthetic */ int silver = 0;
    public final long alpha;

    static {
        int i4 = c.alpha;
        purple = g.echo(4611686018427387903L);
        red = g.echo(-4611686018427387903L);
    }

    public static final long alpha(long j5, long j6) {
        long j7 = 1000000;
        long j10 = j6 / j7;
        long j11 = j5 + j10;
        if (-4611686018426L <= j11 && j11 < 4611686018427L) {
            return g.golf((j11 * j7) + (j6 - (j10 * j7)));
        }
        return g.echo(J4.echo(j11, -4611686018427387903L, 4611686018427387903L));
    }

    public static final void bravo(StringBuilder sb2, int i4, int i5, int i10, String str, boolean z2) {
        sb2.append(i4);
        if (i5 != 0) {
            sb2.append('.');
            String lavender = StringsKt.lavender(i10, String.valueOf(i5));
            int i11 = -1;
            int length = lavender.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (lavender.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (!z2 && i13 < 3) {
                sb2.append((CharSequence) lavender, 0, i13);
            } else {
                sb2.append((CharSequence) lavender, 0, ((i11 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static final long charlie(long j5) {
        if ((((int) j5) & 1) == 1 && !echo(j5)) {
            return j5 >> 1;
        }
        return golf(j5, d.silver);
    }

    public static final int delta(long j5) {
        boolean z2 = false;
        if (echo(j5)) {
            return 0;
        }
        if ((((int) j5) & 1) == 1) {
            z2 = true;
        }
        if (z2) {
            return (int) (((j5 >> 1) % 1000) * 1000000);
        }
        return (int) ((j5 >> 1) % 1000000000);
    }

    public static final boolean echo(long j5) {
        if (j5 != purple && j5 != red) {
            return false;
        }
        return true;
    }

    public static final long foxtrot(long j5, long j6) {
        if (echo(j5)) {
            if (echo(j6) && (j6 ^ j5) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j5;
        }
        if (echo(j6)) {
            return j6;
        }
        int i4 = ((int) j5) & 1;
        if (i4 == (((int) j6) & 1)) {
            long j7 = (j5 >> 1) + (j6 >> 1);
            if (i4 == 0) {
                if (-4611686018426999999L <= j7 && j7 < 4611686018427000000L) {
                    return g.golf(j7);
                }
                return g.echo(j7 / 1000000);
            }
            return g.foxtrot(j7);
        }
        if (i4 == 1) {
            return alpha(j5 >> 1, j6 >> 1);
        }
        return alpha(j6 >> 1, j5 >> 1);
    }

    public static final long golf(long j5, d unit) {
        d dVar;
        Intrinsics.echo(unit, "unit");
        if (j5 == purple) {
            return Long.MAX_VALUE;
        }
        if (j5 == red) {
            return Long.MIN_VALUE;
        }
        long j6 = j5 >> 1;
        if ((((int) j5) & 1) == 0) {
            dVar = d.purple;
        } else {
            dVar = d.silver;
        }
        return g.charlie(j6, dVar, unit);
    }

    public static final long hotel(long j5) {
        long j6 = ((-(j5 >> 1)) << 1) + (((int) j5) & 1);
        int i4 = c.alpha;
        return j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j5 = ((b) obj).alpha;
        long j6 = this.alpha;
        long j7 = j6 ^ j5;
        if (j7 >= 0 && (((int) j7) & 1) != 0) {
            int i4 = (((int) j6) & 1) - (((int) j5) & 1);
            if (j6 < 0) {
                return -i4;
            }
            return i4;
        }
        return Intrinsics.hotel(j6, j5);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (this.alpha != ((b) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        boolean z2;
        int golf;
        long j5;
        int golf2;
        int golf3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j6 = this.alpha;
        if (j6 == 0) {
            return "0s";
        }
        if (j6 == purple) {
            return "Infinity";
        }
        if (j6 == red) {
            return "-Infinity";
        }
        int i4 = 0;
        if (j6 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
        }
        if (j6 < 0) {
            j6 = hotel(j6);
        }
        long golf4 = golf(j6, d.f12936a);
        if (echo(j6)) {
            golf = 0;
        } else {
            golf = (int) (golf(j6, d.yellow) % 24);
        }
        if (echo(j6)) {
            j5 = 0;
            golf2 = 0;
        } else {
            j5 = 0;
            golf2 = (int) (golf(j6, d.white) % 60);
        }
        if (echo(j6)) {
            golf3 = 0;
        } else {
            golf3 = (int) (golf(j6, d.teal) % 60);
        }
        int delta = delta(j6);
        if (golf4 != j5) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (golf != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (golf2 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (golf3 == 0 && delta == 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z10) {
            sb2.append(golf4);
            sb2.append('d');
            i4 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(golf);
            sb2.append('h');
            i4 = i5;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i10 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(golf2);
            sb2.append('m');
            i4 = i10;
        }
        if (z13) {
            int i11 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            if (golf3 == 0 && !z10 && !z11 && !z12) {
                if (delta >= 1000000) {
                    bravo(sb2, delta / 1000000, delta % 1000000, 6, "ms", false);
                } else if (delta >= 1000) {
                    bravo(sb2, delta / 1000, delta % 1000, 3, "us", false);
                } else {
                    sb2.append(delta);
                    sb2.append("ns");
                }
            } else {
                bravo(sb2, golf3, delta, 9, "s", false);
            }
            i4 = i11;
        }
        if (z2 && i4 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
