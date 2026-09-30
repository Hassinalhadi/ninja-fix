package td;

import io.ktor.http.cio.internals.UnsupportedMediaTypeExceptionCIO;
import io.ktor.utils.io.t;
import java.io.IOException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.AbstractC2743p6;
import t6.AbstractC3017k3;
import vf.AbstractC3197a;
import vf.AbstractC3218w;
import vf.ab;
import vf.ac;
import xf.EnumC3340a;
import xf.q;

/* renamed from: td.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3117a implements ab {
    public final /* synthetic */ int alpha = 1;
    public final Nd.h purple;

    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.s, java.lang.Object] */
    public C3117a(Nd.h coroutineContext, t channel, String str, Long l10) {
        char c3;
        char c4;
        char c10;
        char c11;
        Intrinsics.echo(coroutineContext, "coroutineContext");
        Intrinsics.echo(channel, "channel");
        this.purple = coroutineContext;
        Hf.a aVar = n.alpha;
        sd.e eVar = sd.c.alpha;
        if (StringsKt.olive(str, "multipart/", true)) {
            int length = str.length();
            int i4 = 0;
            char c12 = 0;
            int i5 = 0;
            while (true) {
                c3 = '\\';
                c4 = 2;
                if (i4 >= length) {
                    i4 = -1;
                    break;
                }
                char charAt = str.charAt(i4);
                if (c12 != 0) {
                    if (c12 != 1) {
                        if (c12 == 2) {
                            if (charAt != '\"') {
                                if (charAt != ',') {
                                    if (charAt != ';') {
                                    }
                                    c12 = 1;
                                }
                                c12 = 0;
                            }
                            c12 = 3;
                        } else if (c12 != 3) {
                            if (c12 != 4) {
                            }
                            c12 = 3;
                        } else {
                            if (charAt != '\"') {
                                if (charAt == '\\') {
                                    c12 = 4;
                                }
                            }
                            c12 = 1;
                        }
                    } else if (charAt == '=') {
                        c12 = 2;
                    } else if (charAt != ';') {
                        if (charAt != ',') {
                            if (charAt != ' ') {
                                if (i5 == 0 && StringsKt.ochre(i4, str)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else {
                                continue;
                            }
                        }
                        c12 = 0;
                    }
                } else {
                    i4 = charAt != ';' ? i4 + 1 : i4;
                    c12 = 1;
                }
                i5 = 0;
            }
            if (i4 != -1) {
                int i10 = i4 + 9;
                byte[] bArr = new byte[74];
                ?? obj = new Object();
                n.charlie(obj, bArr, (byte) 13);
                n.charlie(obj, bArr, (byte) 10);
                n.charlie(obj, bArr, (byte) 45);
                n.charlie(obj, bArr, (byte) 45);
                int length2 = str.length();
                char c13 = 0;
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    int i11 = charAt2 & 65535;
                    if (i11 > 127) {
                        StringBuilder sb2 = new StringBuilder("Failed to parse multipart: wrong boundary byte 0x");
                        AbstractC2743p6.alpha(16);
                        String num = Integer.toString(i11, 16);
                        Intrinsics.delta(num, "toString(...)");
                        sb2.append(num);
                        sb2.append(" - should be 7bit character");
                        throw new IOException(sb2.toString());
                    }
                    if (c13 == 0) {
                        c10 = ',';
                        c11 = ';';
                        if (charAt2 == ' ') {
                            continue;
                        } else if (charAt2 == '\"') {
                            c13 = 2;
                        } else {
                            if (charAt2 == ',' || charAt2 == ';') {
                                break;
                            }
                            n.charlie(obj, bArr, (byte) i11);
                            c13 = 1;
                        }
                        i10++;
                        c4 = 2;
                        c3 = '\\';
                    } else if (c13 == 1) {
                        if (charAt2 == ' ') {
                            break;
                        }
                        c10 = ',';
                        if (charAt2 == ',') {
                            break;
                        }
                        c11 = ';';
                        if (charAt2 == ';') {
                            break;
                        }
                        n.charlie(obj, bArr, (byte) i11);
                        i10++;
                        c4 = 2;
                        c3 = '\\';
                    } else {
                        if (c13 == c4) {
                            if (charAt2 == '\"') {
                                break;
                            } else if (charAt2 != c3) {
                                n.charlie(obj, bArr, (byte) i11);
                            } else {
                                c13 = 3;
                            }
                        } else if (c13 == 3) {
                            n.charlie(obj, bArr, (byte) i11);
                            c13 = c4;
                        }
                        c10 = ',';
                        c11 = ';';
                        i10++;
                        c4 = 2;
                        c3 = '\\';
                    }
                }
                int i12 = obj.alpha;
                if (i12 != 4) {
                    j jVar = new j(channel, new Hf.a(0, ArraysKt.copyOfRange(bArr, 0, i12)), l10, null);
                    Nd.i iVar = Nd.i.alpha;
                    EnumC3340a enumC3340a = EnumC3340a.alpha;
                    ac acVar = ac.alpha;
                    AbstractC3197a qVar = new q(AbstractC3218w.bravo(this, iVar), AbstractC3017k3.bravo(0, 4, enumC3340a), true, true);
                    qVar.b(acVar, qVar, jVar);
                    return;
                }
                throw new IOException("Empty multipart boundary is not allowed");
            }
            throw new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        throw new UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) str));
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        switch (this.alpha) {
            case 0:
                return this.purple;
            default:
                return this.purple;
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 1:
                return "CoroutineScope(coroutineContext=" + this.purple + ')';
            default:
                return super.toString();
        }
    }

    public C3117a(Nd.h hVar) {
        this.purple = hVar;
    }
}
