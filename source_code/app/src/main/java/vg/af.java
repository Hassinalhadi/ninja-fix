package vg;

import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class af extends A {
    public final Method delta;
    public final int echo;
    public final String foxtrot;
    public final C3222a golf;
    public final boolean hotel;

    public af(Method method, int i4, String str, boolean z2) {
        C3222a c3222a = C3222a.purple;
        this.delta = method;
        this.echo = i4;
        Objects.requireNonNull(str, "name == null");
        this.foxtrot = str;
        this.golf = c3222a;
        this.hotel = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARN: Type inference failed for: r2v10, types: [Tf.k] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v2, types: [Tf.k, java.lang.Object] */
    @Override // vg.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(an anVar, Object obj) {
        String str;
        String replace;
        char c3;
        String str2 = this.foxtrot;
        if (obj != null) {
            this.golf.getClass();
            String obj2 = obj.toString();
            if (anVar.charlie != null) {
                int length = obj2.length();
                int i4 = 0;
                while (i4 < length) {
                    int codePointAt = obj2.codePointAt(i4);
                    boolean z2 = this.hotel;
                    int i5 = 47;
                    int i10 = -1;
                    int i11 = 127;
                    int i12 = 32;
                    if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z2 || (codePointAt != 47 && codePointAt != 37))) {
                        i4 += Character.charCount(codePointAt);
                    } else {
                        ?? obj3 = new Object();
                        obj3.l(0, i4, obj2);
                        ?? r22 = 0;
                        while (i4 < length) {
                            int codePointAt2 = obj2.codePointAt(i4);
                            if (!z2 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                                if (codePointAt2 >= i12 && codePointAt2 < i11 && " \"<>^`{}|\\?#".indexOf(codePointAt2) == i10 && (z2 || (codePointAt2 != i5 && codePointAt2 != 37))) {
                                    obj3.p(codePointAt2);
                                } else {
                                    if (r22 == 0) {
                                        r22 = new Object();
                                    }
                                    r22.p(codePointAt2);
                                    long j5 = r22.purple;
                                    for (long j6 = 0; j6 < j5; j6++) {
                                        byte juliet = r22.juliet(j6);
                                        obj3.pink(37);
                                        char[] cArr = an.lima;
                                        obj3.pink(cArr[((juliet & 255) >> 4) & 15]);
                                        obj3.pink(cArr[juliet & 15]);
                                    }
                                    c3 = '%';
                                    r22.charlie();
                                    i4 += Character.charCount(codePointAt2);
                                    i5 = 47;
                                    i10 = -1;
                                    i11 = 127;
                                    i12 = 32;
                                    r22 = r22;
                                }
                            }
                            c3 = '%';
                            i4 += Character.charCount(codePointAt2);
                            i5 = 47;
                            i10 = -1;
                            i11 = 127;
                            i12 = 32;
                            r22 = r22;
                        }
                        str = obj3.green();
                        replace = anVar.charlie.replace("{" + str2 + "}", str);
                        if (an.mike.matcher(replace).matches()) {
                            anVar.charlie = replace;
                            return;
                        }
                        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(obj2));
                    }
                }
                str = obj2;
                replace = anVar.charlie.replace("{" + str2 + "}", str);
                if (an.mike.matcher(replace).matches()) {
                }
            } else {
                throw new AssertionError();
            }
        } else {
            throw A.oscar(this.delta, this.echo, ao.ad.gray("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
    }
}
