package a0;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import t6.M2;

/* loaded from: classes3.dex */
public final class av extends aq {
    public final long charlie;
    public final ArrayList delta;
    public final ArrayList echo;

    public av(long j5, ArrayList arrayList, ArrayList arrayList2) {
        this.charlie = j5;
        this.delta = arrayList;
        this.echo = arrayList2;
    }

    @Override // a0.aq
    public final Shader bravo(long j5) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j6 = this.charlie;
        if ((9223372034707292159L & j6) == 9205357640488583168L) {
            floatToRawIntBits = M2.charlie(j5);
        } else {
            int i4 = (int) (j6 >> 32);
            if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
                i4 = (int) (j5 >> 32);
            }
            float intBitsToFloat2 = Float.intBitsToFloat(i4);
            int i5 = (int) (j6 & 4294967295L);
            if (Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
                intBitsToFloat = Float.intBitsToFloat((int) (j5 & 4294967295L));
            } else {
                intBitsToFloat = Float.intBitsToFloat(i5);
            }
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        }
        ArrayList arrayList = this.delta;
        ArrayList arrayList2 = this.echo;
        ao.crimson(arrayList, arrayList2);
        int lima = ao.lima(arrayList);
        return new SweepGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), ao.sierra(lima, arrayList), ao.tango(arrayList2, arrayList, lima));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof av) {
                av avVar = (av) obj;
                if (!Z.b.bravo(this.charlie, avVar.charlie) || !Intrinsics.areEqual(this.delta, avVar.delta) || !Intrinsics.areEqual(this.echo, avVar.echo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.echo.hashCode() + ((this.delta.hashCode() + (Z.b.echo(this.charlie) * 31)) * 31);
    }

    public final String toString() {
        String str;
        long j5 = this.charlie;
        if ((9223372034707292159L & j5) != 9205357640488583168L) {
            str = "center=" + ((Object) Z.b.india(j5)) + ", ";
        } else {
            str = "";
        }
        StringBuilder victor = Q0.c.victor("SweepGradient(", str, "colors=");
        victor.append(this.delta);
        victor.append(", stops=");
        victor.append(this.echo);
        victor.append(')');
        return victor.toString();
    }
}
