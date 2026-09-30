package Hd;

import Nd.i;
import Tf.ak;
import Tf.al;
import Tf.am;
import Tf.k;
import com.airbnb.lottie.compose.LottieConstants;
import io.ktor.utils.io.t;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import vf.ad;

/* loaded from: classes2.dex */
public final class b extends InputStream implements AutoCloseable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void charlie() {
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.alpha) {
            case 1:
                return (int) Math.min(((k) this.purple).purple, LottieConstants.IterateForever);
            case 2:
                ak akVar = (ak) this.purple;
                if (!akVar.red) {
                    return (int) Math.min(akVar.purple.purple, LottieConstants.IterateForever);
                }
                throw new IOException("closed");
            case 3:
                return ((b) this.purple).available();
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.alpha) {
            case 0:
                io.ktor.utils.io.ak.bravo((t) this.purple);
                return;
            case 1:
                return;
            case 2:
                ((ak) this.purple).close();
                return;
            default:
                super.close();
                ((b) this.purple).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.alpha) {
            case 0:
                t tVar = (t) this.purple;
                if (!tVar.hotel()) {
                    if (tVar.golf().hotel()) {
                        ad.amber(i.alpha, new a(tVar, null));
                    }
                    if (!tVar.hotel()) {
                        return tVar.golf().readByte() & 255;
                    }
                }
                return -1;
            case 1:
                k kVar = (k) this.purple;
                if (kVar.purple > 0) {
                    return kVar.readByte() & 255;
                }
                return -1;
            case 2:
                ak akVar = (ak) this.purple;
                if (!akVar.red) {
                    k kVar2 = akVar.purple;
                    if (kVar2.purple == 0 && akVar.alpha.read(kVar2, 8192L) == -1) {
                        return -1;
                    }
                    return kVar2.readByte() & 255;
                }
                throw new IOException("closed");
            default:
                return ((b) this.purple).read();
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 1:
                return ((k) this.purple) + ".inputStream()";
            case 2:
                return ((ak) this.purple) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream out) {
        switch (this.alpha) {
            case 2:
                Intrinsics.echo(out, "out");
                ak akVar = (ak) this.purple;
                if (!akVar.red) {
                    long j5 = 0;
                    long j6 = 0;
                    while (true) {
                        k kVar = akVar.purple;
                        if (kVar.purple == j5 && akVar.alpha.read(kVar, 8192L) == -1) {
                            return j6;
                        }
                        long j7 = kVar.purple;
                        j6 += j7;
                        Tf.b.echo(j7, 0L, j7);
                        al alVar = kVar.alpha;
                        while (j7 > j5) {
                            Intrinsics.checkNotNull(alVar);
                            int min = (int) Math.min(j7, alVar.charlie - alVar.bravo);
                            out.write(alVar.alpha, alVar.bravo, min);
                            int i4 = alVar.bravo + min;
                            alVar.bravo = i4;
                            long j10 = min;
                            kVar.purple -= j10;
                            j7 -= j10;
                            if (i4 == alVar.charlie) {
                                al alpha = alVar.alpha();
                                kVar.alpha = alpha;
                                am.alpha(alVar);
                                alVar = alpha;
                            }
                            j5 = 0;
                        }
                    }
                } else {
                    throw new IOException("closed");
                }
                break;
            default:
                return super.transferTo(out);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] b2, int i4, int i5) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(b2, "b");
                t tVar = (t) this.purple;
                if (!tVar.hotel()) {
                    if (tVar.golf().hotel()) {
                        ad.amber(i.alpha, new a(tVar, null));
                    }
                    Gf.a golf = tVar.golf();
                    golf.getClass();
                    int charlie = tVar.golf().charlie(b2, i4, Math.min((int) golf.red, i5) + i4);
                    if (charlie >= 0) {
                        return charlie;
                    }
                    if (!tVar.hotel()) {
                        return 0;
                    }
                }
                return -1;
            case 1:
                Intrinsics.echo(b2, "sink");
                return ((k) this.purple).azure(b2, i4, i5);
            case 2:
                Intrinsics.echo(b2, "data");
                ak akVar = (ak) this.purple;
                if (!akVar.red) {
                    Tf.b.echo(b2.length, i4, i5);
                    k kVar = akVar.purple;
                    if (kVar.purple == 0 && akVar.alpha.read(kVar, 8192L) == -1) {
                        return -1;
                    }
                    return kVar.azure(b2, i4, i5);
                }
                throw new IOException("closed");
            default:
                Intrinsics.echo(b2, "b");
                return ((b) this.purple).read(b2, i4, i5);
        }
    }
}
