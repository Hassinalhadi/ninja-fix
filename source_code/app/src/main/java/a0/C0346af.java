package a0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a0.af, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0346af extends aq {
    public final List charlie;
    public final ArrayList delta;
    public final long echo;
    public final long foxtrot;
    public final int golf;

    public C0346af(List list, ArrayList arrayList, long j5, long j6, int i4) {
        this.charlie = list;
        this.delta = arrayList;
        this.echo = j5;
        this.foxtrot = j6;
        this.golf = i4;
    }

    @Override // a0.aq
    public final Shader bravo(long j5) {
        long j6 = this.echo;
        int i4 = (int) (j6 >> 32);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j5 >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i4);
        int i5 = (int) (j6 & 4294967295L);
        if (Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
            i5 = (int) (j5 & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i5);
        long j7 = this.foxtrot;
        int i10 = (int) (j7 >> 32);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j5 >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i10);
        int i11 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j5 & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i11);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        ArrayList arrayList = this.delta;
        List list = this.charlie;
        ao.crimson(list, arrayList);
        int lima = ao.lima(list);
        return new LinearGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)), ao.sierra(lima, list), ao.tango(arrayList, list, lima), ao.azure(this.golf));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0346af) {
                C0346af c0346af = (C0346af) obj;
                if (Intrinsics.areEqual(this.charlie, c0346af.charlie) && Intrinsics.areEqual(this.delta, c0346af.delta) && Z.b.bravo(this.echo, c0346af.echo) && Z.b.bravo(this.foxtrot, c0346af.foxtrot) && this.golf == c0346af.golf) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.charlie.hashCode() * 31;
        ArrayList arrayList = this.delta;
        if (arrayList != null) {
            i4 = arrayList.hashCode();
        } else {
            i4 = 0;
        }
        return ((Z.b.echo(this.foxtrot) + ((Z.b.echo(this.echo) + ((hashCode + i4) * 31)) * 31)) * 31) + this.golf;
    }

    public final String toString() {
        String str;
        String str2;
        long j5 = this.echo;
        String str3 = "";
        if (((((j5 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = "start=" + ((Object) Z.b.india(j5)) + ", ";
        }
        long j6 = this.foxtrot;
        if (((((j6 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str3 = "end=" + ((Object) Z.b.india(j6)) + ", ";
        }
        StringBuilder sb2 = new StringBuilder("LinearGradient(colors=");
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
