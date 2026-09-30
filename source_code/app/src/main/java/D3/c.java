package D3;

import android.util.Log;
import av.q;
import com.google.mlkit.vision.barcode.common.Barcode;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class c {
    public ByteBuffer bravo;
    public b charlie;
    public final byte[] alpha = new byte[Barcode.FORMAT_QR_CODE];
    public int delta = 0;

    public final boolean alpha() {
        if (this.charlie.bravo != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, D3.a] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, D3.a] */
    public final b bravo() {
        boolean z2;
        boolean z10;
        boolean z11;
        byte[] bArr;
        boolean z12;
        if (this.bravo != null) {
            if (alpha()) {
                return this.charlie;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i4 = 0; i4 < 6; i4++) {
                sb2.append((char) charlie());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.charlie.bravo = 1;
            } else {
                this.charlie.foxtrot = this.bravo.getShort();
                this.charlie.golf = this.bravo.getShort();
                int charlie = charlie();
                b bVar = this.charlie;
                if ((charlie & 128) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bVar.hotel = z2;
                bVar.india = (int) Math.pow(2.0d, (charlie & 7) + 1);
                this.charlie.juliet = charlie();
                b bVar2 = this.charlie;
                charlie();
                bVar2.getClass();
                if (this.charlie.hotel && !alpha()) {
                    b bVar3 = this.charlie;
                    bVar3.alpha = echo(bVar3.india);
                    b bVar4 = this.charlie;
                    bVar4.kilo = bVar4.alpha[bVar4.juliet];
                }
            }
            if (!alpha()) {
                boolean z13 = false;
                while (!z13 && !alpha() && this.charlie.charlie <= Integer.MAX_VALUE) {
                    int charlie2 = charlie();
                    if (charlie2 != 33) {
                        if (charlie2 != 44) {
                            if (charlie2 != 59) {
                                this.charlie.bravo = 1;
                            } else {
                                z13 = true;
                            }
                        } else {
                            b bVar5 = this.charlie;
                            if (bVar5.delta == null) {
                                bVar5.delta = new Object();
                            }
                            bVar5.delta.alpha = this.bravo.getShort();
                            this.charlie.delta.bravo = this.bravo.getShort();
                            this.charlie.delta.charlie = this.bravo.getShort();
                            this.charlie.delta.delta = this.bravo.getShort();
                            int charlie3 = charlie();
                            if ((charlie3 & 128) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (charlie3 & 7) + 1);
                            a aVar = this.charlie.delta;
                            if ((charlie3 & 64) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            aVar.echo = z11;
                            if (z10) {
                                aVar.kilo = echo(pow);
                            } else {
                                aVar.kilo = null;
                            }
                            this.charlie.delta.juliet = this.bravo.position();
                            charlie();
                            foxtrot();
                            if (!alpha()) {
                                b bVar6 = this.charlie;
                                bVar6.charlie++;
                                bVar6.echo.add(bVar6.delta);
                            }
                        }
                    } else {
                        int charlie4 = charlie();
                        if (charlie4 != 1) {
                            if (charlie4 != 249) {
                                if (charlie4 != 254) {
                                    if (charlie4 != 255) {
                                        foxtrot();
                                    } else {
                                        delta();
                                        StringBuilder sb3 = new StringBuilder();
                                        int i5 = 0;
                                        while (true) {
                                            bArr = this.alpha;
                                            if (i5 >= 11) {
                                                break;
                                            }
                                            sb3.append((char) bArr[i5]);
                                            i5++;
                                        }
                                        if (sb3.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                delta();
                                                if (bArr[0] == 1) {
                                                    byte b2 = bArr[1];
                                                    byte b4 = bArr[2];
                                                    this.charlie.getClass();
                                                }
                                                if (this.delta > 0) {
                                                }
                                            } while (!alpha());
                                        } else {
                                            foxtrot();
                                        }
                                    }
                                } else {
                                    foxtrot();
                                }
                            } else {
                                this.charlie.delta = new Object();
                                charlie();
                                int charlie5 = charlie();
                                a aVar2 = this.charlie.delta;
                                int i10 = (charlie5 & 28) >> 2;
                                aVar2.golf = i10;
                                if (i10 == 0) {
                                    aVar2.golf = 1;
                                }
                                if ((charlie5 & 1) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                aVar2.foxtrot = z12;
                                short s3 = this.bravo.getShort();
                                if (s3 < 2) {
                                    s3 = 10;
                                }
                                a aVar3 = this.charlie.delta;
                                aVar3.india = s3 * 10;
                                aVar3.hotel = charlie();
                                charlie();
                            }
                        } else {
                            foxtrot();
                        }
                    }
                }
                b bVar7 = this.charlie;
                if (bVar7.charlie < 0) {
                    bVar7.bravo = 1;
                }
            }
            return this.charlie;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int charlie() {
        try {
            return this.bravo.get() & 255;
        } catch (Exception unused) {
            this.charlie.bravo = 1;
            return 0;
        }
    }

    public final void delta() {
        int charlie = charlie();
        this.delta = charlie;
        if (charlie > 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                try {
                    i5 = this.delta;
                    if (i4 < i5) {
                        i5 -= i4;
                        this.bravo.get(this.alpha, i4, i5);
                        i4 += i5;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder hotel = q.hotel(i4, i5, "Error Reading Block n: ", " count: ", " blockSize: ");
                        hotel.append(this.delta);
                        Log.d("GifHeaderParser", hotel.toString(), e);
                    }
                    this.charlie.bravo = 1;
                    return;
                }
            }
        }
    }

    public final int[] echo(int i4) {
        byte[] bArr = new byte[i4 * 3];
        int[] iArr = null;
        try {
            this.bravo.get(bArr);
            iArr = new int[Barcode.FORMAT_QR_CODE];
            int i5 = 0;
            int i10 = 0;
            while (i5 < i4) {
                int i11 = bArr[i10] & 255;
                int i12 = i10 + 2;
                int i13 = bArr[i10 + 1] & 255;
                i10 += 3;
                int i14 = i5 + 1;
                iArr[i5] = (i13 << 8) | (i11 << 16) | ShapeBuilder.DEFAULT_SHAPE_COLOR | (bArr[i12] & 255);
                i5 = i14;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.charlie.bravo = 1;
            return iArr;
        }
    }

    public final void foxtrot() {
        int charlie;
        do {
            charlie = charlie();
            this.bravo.position(Math.min(this.bravo.position() + charlie, this.bravo.limit()));
        } while (charlie > 0);
    }
}
