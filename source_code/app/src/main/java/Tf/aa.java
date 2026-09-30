package Tf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class aa implements ap, AutoCloseable {
    public byte alpha;
    public final ak purple;
    public final Inflater red;
    public final ab silver;
    public final CRC32 teal;

    public aa(m source) {
        Intrinsics.echo(source, "source");
        ak akVar = new ak(source);
        this.purple = akVar;
        Inflater inflater = new Inflater(true);
        this.red = inflater;
        this.silver = new ab(akVar, inflater);
        this.teal = new CRC32();
    }

    public static void charlie(int i4, int i5, String str) {
        if (i5 == i4) {
            return;
        }
        StringBuilder beige = ao.ad.beige(str, ": actual 0x");
        beige.append(StringsKt.lavender(8, b.mike(i5)));
        beige.append(" != expected 0x");
        beige.append(StringsKt.lavender(8, b.mike(i4)));
        throw new IOException(beige.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.silver.close();
    }

    public final void echo(long j5, k kVar, long j6) {
        al alVar = kVar.alpha;
        Intrinsics.checkNotNull(alVar);
        while (true) {
            int i4 = alVar.charlie;
            int i5 = alVar.bravo;
            if (j5 < i4 - i5) {
                break;
            }
            j5 -= i4 - i5;
            alVar = alVar.foxtrot;
            Intrinsics.checkNotNull(alVar);
        }
        while (j6 > 0) {
            int min = (int) Math.min(alVar.charlie - r5, j6);
            this.teal.update(alVar.alpha, (int) (alVar.bravo + j5), min);
            j6 -= min;
            alVar = alVar.foxtrot;
            Intrinsics.checkNotNull(alVar);
            j5 = 0;
        }
    }

    @Override // Tf.ap
    public final long read(k sink, long j5) {
        boolean z2;
        aa aaVar = this;
        Intrinsics.echo(sink, "sink");
        if (j5 >= 0) {
            if (j5 == 0) {
                return 0L;
            }
            byte b2 = aaVar.alpha;
            CRC32 crc32 = aaVar.teal;
            ak akVar = aaVar.purple;
            if (b2 == 0) {
                akVar.kilo(10L);
                k kVar = akVar.purple;
                byte juliet = kVar.juliet(3L);
                if (((juliet >> 1) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    aaVar.echo(0L, kVar, 10L);
                }
                charlie(8075, akVar.readShort(), "ID1ID2");
                akVar.india(8L);
                if (((juliet >> 2) & 1) == 1) {
                    akVar.kilo(2L);
                    if (z2) {
                        echo(0L, kVar, 2L);
                    }
                    long crimson = kVar.crimson() & 65535;
                    akVar.kilo(crimson);
                    if (z2) {
                        echo(0L, kVar, crimson);
                    }
                    akVar.india(crimson);
                }
                if (((juliet >> 3) & 1) == 1) {
                    long charlie = akVar.charlie((byte) 0, 0L, Long.MAX_VALUE);
                    if (charlie != -1) {
                        if (z2) {
                            echo(0L, kVar, charlie + 1);
                        }
                        akVar.india(charlie + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((juliet >> 4) & 1) == 1) {
                    long charlie2 = akVar.charlie((byte) 0, 0L, Long.MAX_VALUE);
                    if (charlie2 != -1) {
                        if (z2) {
                            aaVar = this;
                            aaVar.echo(0L, kVar, charlie2 + 1);
                        } else {
                            aaVar = this;
                        }
                        akVar.india(charlie2 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    aaVar = this;
                }
                if (z2) {
                    charlie(akVar.golf(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                aaVar.alpha = (byte) 1;
            }
            if (aaVar.alpha == 1) {
                long j6 = sink.purple;
                long read = aaVar.silver.read(sink, j5);
                if (read != -1) {
                    aaVar.echo(j6, sink, read);
                    return read;
                }
                aaVar.alpha = (byte) 2;
            }
            if (aaVar.alpha == 2) {
                charlie(akVar.echo(), (int) crc32.getValue(), "CRC");
                charlie(akVar.echo(), (int) aaVar.red.getBytesWritten(), "ISIZE");
                aaVar.alpha = (byte) 3;
                if (!akVar.hotel()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(A0.z.india(j5, "byteCount < 0: ").toString());
    }

    @Override // Tf.ap
    /* renamed from: timeout */
    public final as getTimeout() {
        return this.purple.alpha.getTimeout();
    }
}
