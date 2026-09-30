package Hf;

import Q0.c;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements Comparable {
    public static final a red = new a(new byte[0]);
    public static final char[] silver;
    public final byte[] alpha;
    public int purple;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.delta(charArray, "toCharArray(...)");
        silver = charArray;
    }

    public a(byte[] bArr) {
        this.alpha = bArr;
    }

    public final byte alpha(int i4) {
        byte[] bArr = this.alpha;
        if (i4 >= 0 && i4 < bArr.length) {
            return bArr[i4];
        }
        throw new IndexOutOfBoundsException(c.quebec(c.sierra(i4, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a other = (a) obj;
        Intrinsics.echo(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.alpha;
        int length = bArr.length;
        byte[] bArr2 = other.alpha;
        int min = Math.min(length, bArr2.length);
        for (int i4 = 0; i4 < min; i4++) {
            int golf = Intrinsics.golf(UByte.m209constructorimpl(bArr[i4]) & 255, UByte.m209constructorimpl(bArr2[i4]) & 255);
            if (golf != 0) {
                return golf;
            }
        }
        return Intrinsics.golf(bArr.length, bArr2.length);
    }

    public final boolean equals(Object obj) {
        int i4;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        byte[] bArr = aVar.alpha;
        int length = bArr.length;
        byte[] bArr2 = this.alpha;
        if (length != bArr2.length) {
            return false;
        }
        int i5 = aVar.purple;
        if (i5 != 0 && (i4 = this.purple) != 0 && i5 != i4) {
            return false;
        }
        return Arrays.equals(bArr2, bArr);
    }

    public final int hashCode() {
        int i4 = this.purple;
        if (i4 == 0) {
            int hashCode = Arrays.hashCode(this.alpha);
            this.purple = hashCode;
            return hashCode;
        }
        return i4;
    }

    public final String toString() {
        byte[] bArr = this.alpha;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String valueOf = String.valueOf(bArr.length);
        StringBuilder sb2 = new StringBuilder((bArr.length * 2) + valueOf.length() + 22);
        sb2.append("ByteString(size=");
        sb2.append(valueOf);
        sb2.append(" hex=");
        for (byte b2 : bArr) {
            char[] cArr = silver;
            sb2.append(cArr[(b2 >>> 4) & 15]);
            sb2.append(cArr[b2 & 15]);
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ a(int i4, byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(byte[] data, int i4, int i5) {
        this(ArraysKt.copyOfRange(data, i4, i5));
        Intrinsics.echo(data, "data");
    }
}
