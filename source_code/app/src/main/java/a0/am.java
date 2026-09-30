package a0;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import t6.M2;

/* loaded from: classes3.dex */
public final class am extends aq {
    public final ArrayList charlie;
    public final ArrayList delta;
    public final long echo;
    public final float foxtrot;
    public final int golf;

    public am(ArrayList arrayList, ArrayList arrayList2, long j5, float f5, int i4) {
        this.charlie = arrayList;
        this.delta = arrayList2;
        this.echo = j5;
        this.foxtrot = f5;
        this.golf = i4;
    }

    @Override // a0.aq
    public final Shader bravo(long j5) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j6 = this.echo;
        if ((9223372034707292159L & j6) == 9205357640488583168L) {
            long charlie = M2.charlie(j5);
            intBitsToFloat = Float.intBitsToFloat((int) (charlie >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (charlie & 4294967295L));
        } else {
            int i4 = (int) (j6 >> 32);
            if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
                i4 = (int) (j5 >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i4);
            int i5 = (int) (j6 & 4294967295L);
            if (Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
                i5 = (int) (j5 & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i5);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        float f5 = this.foxtrot;
        if (f5 == Float.POSITIVE_INFINITY) {
            f5 = Z.e.charlie(j5) / 2;
        }
        float f10 = f5;
        ArrayList arrayList = this.charlie;
        ArrayList arrayList2 = this.delta;
        ao.crimson(arrayList, arrayList2);
        int lima = ao.lima(arrayList);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f10, ao.sierra(lima, arrayList), ao.tango(arrayList2, arrayList, lima), ao.azure(this.golf));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof am) {
                am amVar = (am) obj;
                if (Intrinsics.areEqual(this.charlie, amVar.charlie) && Intrinsics.areEqual(this.delta, amVar.delta) && Z.b.bravo(this.echo, amVar.echo) && this.foxtrot == amVar.foxtrot && this.golf == amVar.golf) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ao.ad.sierra(this.foxtrot, (Z.b.echo(this.echo) + ((this.delta.hashCode() + (this.charlie.hashCode() * 31)) * 31)) * 31, 31) + this.golf;
    }

    public final String toString() {
        String str;
        String str2;
        long j5 = this.echo;
        String str3 = "";
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            str = "";
        } else {
            str = "center=" + ((Object) Z.b.india(j5)) + ", ";
        }
        float f5 = this.foxtrot;
        if ((Float.floatToRawIntBits(f5) & LottieConstants.IterateForever) < 2139095040) {
            str3 = "radius=" + f5 + ", ";
        }
        StringBuilder sb2 = new StringBuilder("RadialGradient(colors=");
        sb2.append(this.charlie);
        sb2.append(", stops=");
        sb2.append(this.delta);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(str3);
        sb2.append("tileMode=");
        int i4 = this.golf;
        if (i4 == 0) {
            str2 = "Clamp";
        } else if (i4 == 1) {
            str2 = "Repeated";
        } else if (i4 == 2) {
            str2 = "Mirror";
        } else if (i4 == 3) {
            str2 = "Decal";
        } else {
            str2 = "Unknown";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
