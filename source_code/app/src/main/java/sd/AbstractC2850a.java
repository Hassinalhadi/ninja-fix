package sd;

import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import fe.AbstractC1709a;
import io.ktor.http.URLDecodeException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.Q4;

/* renamed from: sd.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2850a {
    public static final Set alpha;
    public static final Set bravo;
    public static final ArrayList charlie;
    public static final Set delta;
    public static final ArrayList echo;

    static {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        ArrayList a6 = CollectionsKt.a(CollectionsKt.yellow(new AbstractC1709a('a', 'z'), new AbstractC1709a('A', 'Z')), new AbstractC1709a('0', '9'));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(a6, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = a6.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        alpha = CollectionsKt.D(arrayList);
        bravo = CollectionsKt.D(CollectionsKt.a(CollectionsKt.yellow(new AbstractC1709a('a', 'z'), new AbstractC1709a('A', 'Z')), new AbstractC1709a('0', '9')));
        CollectionsKt.D(CollectionsKt.a(CollectionsKt.yellow(new AbstractC1709a('a', 'f'), new AbstractC1709a('A', 'F')), new AbstractC1709a('0', '9')));
        Set g2 = ArraysKt.g(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', Character.valueOf(NumberOnlyZipVisualTransformation.HYPHEN), '.', '_', '~', '+'});
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(g2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator it2 = g2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        charlie = arrayList2;
        delta = ArraysKt.g(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', Character.valueOf(NumberOnlyZipVisualTransformation.HYPHEN), '.', '_', '~'});
        kotlin.collections.ab.mike(bravo, ArraysKt.g(new Character[]{'!', '#', '$', '&', '+', Character.valueOf(NumberOnlyZipVisualTransformation.HYPHEN), '.', '^', '_', '`', '|', '~'}));
        List listOf = CollectionsKt.listOf(Character.valueOf(NumberOnlyZipVisualTransformation.HYPHEN), '.', '_', '~');
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        Iterator it3 = listOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        echo = arrayList3;
    }

    public static final int alpha(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('A' <= c3 && c3 < 'G') {
            return c3 - '7';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        return -1;
    }

    public static final String bravo(String str, int i4, int i5, boolean z2) {
        int i10 = i4;
        while (i10 < i5) {
            char charAt = str.charAt(i10);
            if (charAt != '%' && (!z2 || charAt != '+')) {
                i10++;
            } else {
                int i11 = i5 - i4;
                if (i11 > 255) {
                    i11 /= 3;
                }
                StringBuilder sb2 = new StringBuilder(i11);
                if (i10 > i4) {
                    sb2.append((CharSequence) str, i4, i10);
                }
                byte[] bArr = null;
                while (i10 < i5) {
                    char charAt2 = str.charAt(i10);
                    if (z2 && charAt2 == '+') {
                        sb2.append(' ');
                    } else if (charAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i5 - i10) / 3];
                        }
                        int i12 = 0;
                        while (i10 < i5 && str.charAt(i10) == '%') {
                            int i13 = i10 + 2;
                            if (i13 < i5) {
                                int i14 = i10 + 1;
                                int alpha2 = alpha(str.charAt(i14));
                                int alpha3 = alpha(str.charAt(i13));
                                if (alpha2 != -1 && alpha3 != -1) {
                                    bArr[i12] = (byte) ((alpha2 * 16) + alpha3);
                                    i10 += 3;
                                    i12++;
                                } else {
                                    throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i14) + str.charAt(i13) + ", in " + ((Object) str) + ", at " + i10);
                                }
                            } else {
                                throw new URLDecodeException("Incomplete trailing HEX escape: " + str.subSequence(i10, str.length()).toString() + ", in " + ((Object) str) + " at " + i10);
                            }
                        }
                        kotlin.collections.ab.charlie(0, i12, bArr.length);
                        sb2.append(new String(bArr, 0, i12, kotlin.text.a.alpha));
                    } else {
                        sb2.append(charAt2);
                    }
                    i10++;
                }
                String sb3 = sb2.toString();
                Intrinsics.delta(sb3, "toString(...)");
                return sb3;
            }
        }
        if (i4 == 0 && i5 == str.length()) {
            return str.toString();
        }
        String substring = str.substring(i4, i5);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static String charlie(String str) {
        int length = str.length();
        Charset charset = kotlin.text.a.alpha;
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(charset, "charset");
        return bravo(str, 0, length, false);
    }

    public static String delta(int i4, int i5, int i10, String str) {
        boolean z2 = false;
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = str.length();
        }
        if ((i10 & 4) == 0) {
            z2 = true;
        }
        Charset charset = kotlin.text.a.alpha;
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(charset, "charset");
        return bravo(str, i4, i5, z2);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Gf.a, java.lang.Object] */
    public static final String echo(String str, boolean z2) {
        Intrinsics.echo(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = kotlin.text.a.alpha.newEncoder();
        Intrinsics.delta(newEncoder, "newEncoder(...)");
        int length = str.length();
        ?? obj = new Object();
        if (length > 0) {
            int i4 = 0;
            do {
                byte[] alpha2 = Q4.alpha(newEncoder, str, i4, length);
                obj.uniform(alpha2.length, alpha2);
                int length2 = alpha2.length;
                if (length2 >= 0) {
                    i4 += length2;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } while (i4 < length);
        }
        golf(obj, new Ec.ad(sb2, z2, 3));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r1 >= r4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r7 = s6.Q4.alpha(r5, r10, r1, r4);
        r6.uniform(r7.length, r7);
        r7 = r7.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r7 < 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        r1 = r1 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r1 < r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (r6.hotel() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        if (r6.hotel() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
    
        r2.append(hotel(r6.readByte()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0082, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Type inference failed for: r6v3, types: [Gf.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String foxtrot(int i4, String str) {
        boolean z2;
        int i5;
        int i10 = 0;
        if ((i4 & 1) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        Intrinsics.echo(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        Charset charset = kotlin.text.a.alpha;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (z2 || charAt != '/') {
                if (!bravo.contains(Character.valueOf(charAt))) {
                    if (!delta.contains(Character.valueOf(charAt))) {
                        if (55296 <= charAt && charAt < 57344) {
                            i5 = 2;
                        } else {
                            i5 = 1;
                        }
                        CharsetEncoder newEncoder = charset.newEncoder();
                        Intrinsics.delta(newEncoder, "newEncoder(...)");
                        int i11 = i5 + i10;
                        ?? obj = new Object();
                    }
                }
            }
            sb2.append(charAt);
            i10++;
        }
        return sb2.toString();
    }

    public static final void golf(Gf.a aVar, Function1 function1) {
        while (!aVar.hotel()) {
            while (!aVar.hotel()) {
                function1.invoke(Byte.valueOf(aVar.readByte()));
            }
        }
    }

    public static final String hotel(byte b2) {
        int i4;
        int i5;
        int i10 = (b2 & 255) >> 4;
        if (i10 >= 0 && i10 < 10) {
            i4 = i10 + 48;
        } else {
            i4 = ((char) (i10 + 65)) - '\n';
        }
        char c3 = (char) i4;
        int i11 = b2 & 15;
        if (i11 >= 0 && i11 < 10) {
            i5 = i11 + 48;
        } else {
            i5 = ((char) (i11 + 65)) - '\n';
        }
        return new String(new char[]{'%', c3, (char) i5});
    }
}
