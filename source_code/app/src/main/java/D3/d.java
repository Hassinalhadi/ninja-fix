package D3;

import G3.g;
import android.graphics.Bitmap;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d {
    public int[] alpha;
    public final J2.c charlie;
    public ByteBuffer delta;
    public byte[] echo;
    public short[] foxtrot;
    public byte[] golf;
    public byte[] hotel;
    public byte[] india;
    public final int[] juliet;
    public int kilo;
    public b lima;
    public Bitmap mike;
    public final boolean november;
    public int oscar;
    public final int papa;
    public final int quebec;
    public final int romeo;
    public Boolean sierra;
    public final int[] bravo = new int[Barcode.FORMAT_QR_CODE];
    public Bitmap.Config tango = Bitmap.Config.ARGB_8888;

    public d(J2.c cVar, b bVar, ByteBuffer byteBuffer, int i4) {
        byte[] bArr;
        int[] iArr;
        this.charlie = cVar;
        this.lima = new b();
        synchronized (this) {
            try {
                if (i4 > 0) {
                    int highestOneBit = Integer.highestOneBit(i4);
                    this.oscar = 0;
                    this.lima = bVar;
                    this.kilo = -1;
                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    this.delta = asReadOnlyBuffer;
                    asReadOnlyBuffer.position(0);
                    this.delta.order(ByteOrder.LITTLE_ENDIAN);
                    this.november = false;
                    Iterator it = bVar.echo.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((a) it.next()).golf == 3) {
                            this.november = true;
                            break;
                        }
                    }
                    this.papa = highestOneBit;
                    int i5 = bVar.foxtrot;
                    this.romeo = i5 / highestOneBit;
                    int i10 = bVar.golf;
                    this.quebec = i10 / highestOneBit;
                    int i11 = i5 * i10;
                    g gVar = (g) this.charlie.red;
                    if (gVar == null) {
                        bArr = new byte[i11];
                    } else {
                        bArr = (byte[]) gVar.echo(i11, byte[].class);
                    }
                    this.india = bArr;
                    J2.c cVar2 = this.charlie;
                    int i12 = this.romeo * this.quebec;
                    g gVar2 = (g) cVar2.red;
                    if (gVar2 == null) {
                        iArr = new int[i12];
                    } else {
                        iArr = (int[]) gVar2.echo(i12, int[].class);
                    }
                    this.juliet = iArr;
                } else {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap alpha() {
        Bitmap.Config config;
        Boolean bool = this.sierra;
        if (bool != null && !bool.booleanValue()) {
            config = this.tango;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bravo = ((G3.b) this.charlie.purple).bravo(this.romeo, this.quebec, config);
        bravo.setHasAlpha(true);
        return bravo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap bravo() {
        int i4;
        int i5;
        a aVar;
        int[] iArr;
        byte[] bArr;
        try {
            if (this.lima.charlie > 0) {
                if (this.kilo < 0) {
                }
                i4 = this.oscar;
                if (i4 != 1 && i4 != 2) {
                    this.oscar = 0;
                    if (this.echo == null) {
                        g gVar = (g) this.charlie.red;
                        if (gVar == null) {
                            bArr = new byte[255];
                        } else {
                            bArr = (byte[]) gVar.echo(255, byte[].class);
                        }
                        this.echo = bArr;
                    }
                    a aVar2 = (a) this.lima.echo.get(this.kilo);
                    i5 = this.kilo - 1;
                    if (i5 < 0) {
                        aVar = (a) this.lima.echo.get(i5);
                    } else {
                        aVar = null;
                    }
                    iArr = aVar2.kilo;
                    if (iArr != null) {
                        iArr = this.lima.alpha;
                    }
                    this.alpha = iArr;
                    if (iArr != null) {
                        if (Log.isLoggable(Constants.INAPP_DATA_TAG, 3)) {
                            Log.d(Constants.INAPP_DATA_TAG, "No valid color table found for frame #" + this.kilo);
                        }
                        this.oscar = 1;
                        return null;
                    }
                    if (aVar2.foxtrot) {
                        System.arraycopy(iArr, 0, this.bravo, 0, iArr.length);
                        int[] iArr2 = this.bravo;
                        this.alpha = iArr2;
                        iArr2[aVar2.hotel] = 0;
                        if (aVar2.golf == 2 && this.kilo == 0) {
                            this.sierra = Boolean.TRUE;
                        }
                    }
                    return delta(aVar2, aVar);
                }
                if (Log.isLoggable(Constants.INAPP_DATA_TAG, 3)) {
                    Log.d(Constants.INAPP_DATA_TAG, "Unable to decode frame, status=" + this.oscar);
                }
                return null;
            }
            if (Log.isLoggable(Constants.INAPP_DATA_TAG, 3)) {
                Log.d(Constants.INAPP_DATA_TAG, "Unable to decode frame, frameCount=" + this.lima.charlie + ", framePointer=" + this.kilo);
            }
            this.oscar = 1;
            i4 = this.oscar;
            if (i4 != 1) {
                this.oscar = 0;
                if (this.echo == null) {
                }
                a aVar22 = (a) this.lima.echo.get(this.kilo);
                i5 = this.kilo - 1;
                if (i5 < 0) {
                }
                iArr = aVar22.kilo;
                if (iArr != null) {
                }
                this.alpha = iArr;
                if (iArr != null) {
                }
            }
            if (Log.isLoggable(Constants.INAPP_DATA_TAG, 3)) {
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void charlie(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.tango = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r4.juliet == r36.hotel) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap delta(a aVar, a aVar2) {
        byte[] bArr;
        int[] iArr;
        byte b2;
        boolean z2;
        boolean booleanValue;
        int i4;
        boolean z10;
        int i5;
        int i10;
        int i11;
        int i12;
        int[] iArr2;
        int i13;
        byte b4;
        boolean z11;
        short[] sArr;
        short s3;
        short s9;
        int i14;
        Bitmap bitmap;
        int i15;
        int i16;
        int i17;
        int[] iArr3 = this.juliet;
        J2.c cVar = this.charlie;
        byte b6 = 0;
        if (aVar2 == null) {
            Bitmap bitmap2 = this.mike;
            if (bitmap2 != null) {
                ((G3.b) cVar.purple).delta(bitmap2);
            }
            this.mike = null;
            Arrays.fill(iArr3, 0);
        }
        if (aVar2 != null && aVar2.golf == 3 && this.mike == null) {
            Arrays.fill(iArr3, 0);
        }
        if (aVar2 != null && (i14 = aVar2.golf) > 0) {
            if (i14 == 2) {
                if (!aVar.foxtrot) {
                    b bVar = this.lima;
                    i15 = bVar.kilo;
                    if (aVar.kilo != null) {
                    }
                    int i18 = aVar2.delta;
                    int i19 = this.papa;
                    int i20 = i18 / i19;
                    int i21 = aVar2.bravo / i19;
                    int i22 = aVar2.charlie / i19;
                    int i23 = aVar2.alpha / i19;
                    int i24 = this.romeo;
                    i16 = (i21 * i24) + i23;
                    i17 = (i20 * i24) + i16;
                    while (i16 < i17) {
                        int i25 = i16 + i22;
                        for (int i26 = i16; i26 < i25; i26++) {
                            iArr3[i26] = i15;
                        }
                        i16 += this.romeo;
                    }
                }
                i15 = 0;
                int i182 = aVar2.delta;
                int i192 = this.papa;
                int i202 = i182 / i192;
                int i212 = aVar2.bravo / i192;
                int i222 = aVar2.charlie / i192;
                int i232 = aVar2.alpha / i192;
                int i242 = this.romeo;
                i16 = (i212 * i242) + i232;
                i17 = (i202 * i242) + i16;
                while (i16 < i17) {
                }
            } else if (i14 == 3 && (bitmap = this.mike) != null) {
                int i27 = this.romeo;
                bitmap.getPixels(iArr3, 0, i27, 0, 0, i27, this.quebec);
            }
        }
        int[] iArr4 = iArr3;
        this.delta.position(aVar.juliet);
        int i28 = aVar.charlie * aVar.delta;
        byte[] bArr2 = this.india;
        if (bArr2 == null || bArr2.length < i28) {
            g gVar = (g) cVar.red;
            if (gVar == null) {
                bArr = new byte[i28];
            } else {
                bArr = (byte[]) gVar.echo(i28, byte[].class);
            }
            this.india = bArr;
        }
        byte[] bArr3 = this.india;
        if (this.foxtrot == null) {
            this.foxtrot = new short[4096];
        }
        short[] sArr2 = this.foxtrot;
        if (this.golf == null) {
            this.golf = new byte[4096];
        }
        byte[] bArr4 = this.golf;
        if (this.hotel == null) {
            this.hotel = new byte[4097];
        }
        byte[] bArr5 = this.hotel;
        int i29 = this.delta.get() & 255;
        int i30 = 1;
        int i31 = 1 << i29;
        int i32 = i31 + 1;
        int i33 = i31 + 2;
        int i34 = i29 + 1;
        int i35 = (1 << i34) - 1;
        int i36 = 0;
        while (i36 < i31) {
            sArr2[i36] = 0;
            bArr4[i36] = (byte) i36;
            i36++;
            i30 = i30;
        }
        int i37 = i30;
        byte[] bArr6 = this.echo;
        int i38 = i34;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = i33;
        int i48 = i35;
        short s10 = -1;
        while (true) {
            if (i39 < i28) {
                if (i40 == 0) {
                    s3 = -1;
                    int i49 = this.delta.get() & 255;
                    if (i49 <= 0) {
                        iArr = iArr4;
                        sArr = sArr2;
                    } else {
                        ByteBuffer byteBuffer = this.delta;
                        iArr = iArr4;
                        sArr = sArr2;
                        byteBuffer.get(this.echo, 0, Math.min(i49, byteBuffer.remaining()));
                    }
                    if (i49 <= 0) {
                        this.oscar = 3;
                        b2 = 0;
                        break;
                    }
                    i40 = i49;
                    i41 = 0;
                } else {
                    iArr = iArr4;
                    sArr = sArr2;
                    s3 = -1;
                }
                i43 += (bArr6[i41] & 255) << i42;
                i41++;
                i40--;
                int i50 = i42 + 8;
                int i51 = i47;
                short s11 = s10;
                int i52 = i38;
                int i53 = i46;
                while (true) {
                    i42 = i50;
                    if (i50 >= i52) {
                        int i54 = i43 & i48;
                        i43 >>= i52;
                        i42 -= i52;
                        if (i54 == i31) {
                            i52 = i34;
                            i51 = i33;
                            i48 = i35;
                            i50 = i42;
                            s11 = s3;
                        } else {
                            if (i54 == i32) {
                                i47 = i51;
                                s10 = s11;
                                i38 = i52;
                                i46 = i53;
                                iArr4 = iArr;
                                sArr2 = sArr;
                                b6 = 0;
                                break;
                            }
                            int i55 = i39;
                            if (s11 == s3) {
                                bArr3[i44] = bArr4[i54 == true ? 1 : 0];
                                i44++;
                                i39 = i55 + 1;
                                s11 = i54 == true ? 1 : 0;
                                i53 = s11;
                                i50 = i42;
                            } else {
                                if (i54 >= i51) {
                                    bArr5[i45] = (byte) i53;
                                    i45++;
                                    s9 = s11;
                                } else {
                                    s9 = i54 == true ? 1 : 0;
                                }
                                while (s9 >= i31) {
                                    bArr5[i45] = bArr4[s9];
                                    i45++;
                                    s9 = sArr[s9];
                                }
                                i53 = bArr4[s9] & 255;
                                byte b10 = (byte) i53;
                                bArr3[i44] = b10;
                                while (true) {
                                    i44++;
                                    i55++;
                                    if (i45 <= 0) {
                                        break;
                                    }
                                    i45--;
                                    bArr3[i44] = bArr5[i45];
                                }
                                if (i51 < 4096) {
                                    sArr[i51] = s11;
                                    bArr4[i51] = b10;
                                    i51++;
                                    if ((i51 & i48) == 0 && i51 < 4096) {
                                        i52++;
                                        i48 += i51;
                                    }
                                }
                                i50 = i42;
                                i39 = i55;
                                s11 = i54 == true ? 1 : 0;
                            }
                            s3 = -1;
                        }
                    } else {
                        s10 = s11;
                        i38 = i52;
                        i46 = i53;
                        iArr4 = iArr;
                        b6 = 0;
                        i47 = i51;
                        sArr2 = sArr;
                        break;
                    }
                }
            } else {
                iArr = iArr4;
                b2 = b6;
                break;
            }
        }
        Arrays.fill(bArr3, i44, i28, b2);
        if (!aVar.echo && this.papa == i37) {
            int[] iArr5 = this.juliet;
            int i56 = aVar.delta;
            int i57 = aVar.bravo;
            int i58 = aVar.charlie;
            int i59 = aVar.alpha;
            if (this.kilo == 0) {
                b4 = 1;
            } else {
                b4 = b2;
            }
            int i60 = this.romeo;
            byte[] bArr7 = this.india;
            int[] iArr6 = this.alpha;
            int i61 = -1;
            for (int i62 = b2; i62 < i56; i62++) {
                int i63 = (i62 + i57) * i60;
                int i64 = i63 + i59;
                int i65 = i64 + i58;
                int i66 = i63 + i60;
                if (i66 < i65) {
                    i65 = i66;
                }
                int i67 = aVar.charlie * i62;
                while (i64 < i65) {
                    int[] iArr7 = iArr5;
                    int i68 = bArr7[i67];
                    int i69 = i56;
                    int i70 = i68 & 255;
                    if (i70 != i61) {
                        int i71 = iArr6[i70];
                        if (i71 != 0) {
                            iArr7[i64] = i71;
                        } else {
                            i61 = i68;
                        }
                    }
                    i67++;
                    i64++;
                    iArr5 = iArr7;
                    i56 = i69;
                }
            }
            Boolean bool = this.sierra;
            if ((bool != null && bool.booleanValue()) || (this.sierra == null && b4 != 0 && i61 != -1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.sierra = Boolean.valueOf(z11);
        } else {
            int[] iArr8 = this.juliet;
            int i72 = aVar.delta;
            int i73 = this.papa;
            int i74 = i72 / i73;
            int i75 = aVar.bravo / i73;
            int i76 = aVar.charlie / i73;
            int i77 = aVar.alpha / i73;
            if (this.kilo == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i78 = this.romeo;
            int i79 = this.quebec;
            byte[] bArr8 = this.india;
            int[] iArr9 = this.alpha;
            Boolean bool2 = this.sierra;
            int i80 = 8;
            int i81 = 0;
            int i82 = 1;
            int i83 = 0;
            while (i83 < i74) {
                int[] iArr10 = iArr8;
                if (aVar.echo) {
                    if (i81 >= i74) {
                        i82++;
                        if (i82 != 2) {
                            if (i82 != 3) {
                                if (i82 == 4) {
                                    i81 = 1;
                                    i80 = 2;
                                }
                            } else {
                                i80 = 4;
                                i81 = 2;
                            }
                        } else {
                            i81 = 4;
                        }
                    }
                    i4 = i81 + i80;
                } else {
                    i4 = i81;
                    i81 = i83;
                }
                int i84 = i81 + i75;
                int i85 = i4;
                if (i73 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i84 < i79) {
                    int i86 = i84 * i78;
                    int i87 = i86 + i77;
                    boolean z12 = z10;
                    int i88 = i87 + i76;
                    int i89 = i86 + i78;
                    if (i89 < i88) {
                        i88 = i89;
                    }
                    i5 = i74;
                    int i90 = i83 * i73 * aVar.charlie;
                    if (z12) {
                        int i91 = i87;
                        while (i91 < i88) {
                            int i92 = i91;
                            int i93 = iArr9[bArr8[i90] & 255];
                            if (i93 != 0) {
                                iArr10[i92] = i93;
                            } else if (z2 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i90 += i73;
                            i91 = i92 + 1;
                        }
                    } else {
                        int i94 = ((i88 - i87) * i73) + i90;
                        i10 = i73;
                        int i95 = i87;
                        while (i95 < i88) {
                            int i96 = i88;
                            int i97 = aVar.charlie;
                            int i98 = i95;
                            int i99 = i90;
                            int i100 = 0;
                            int i101 = 0;
                            int i102 = 0;
                            int i103 = 0;
                            int i104 = 0;
                            while (true) {
                                if (i99 < this.papa + i90) {
                                    byte[] bArr9 = this.india;
                                    i11 = i75;
                                    if (i99 >= bArr9.length || i99 >= i94) {
                                        break;
                                    }
                                    int i105 = this.alpha[bArr9[i99] & 255];
                                    if (i105 != 0) {
                                        i100 += (i105 >> 24) & 255;
                                        i101 += (i105 >> 16) & 255;
                                        i102 += (i105 >> 8) & 255;
                                        i103 += i105 & 255;
                                        i104++;
                                    }
                                    i99++;
                                    i75 = i11;
                                } else {
                                    i11 = i75;
                                    break;
                                }
                            }
                            int i106 = i90 + i97;
                            int i107 = i106;
                            while (i107 < this.papa + i106) {
                                byte[] bArr10 = this.india;
                                int i108 = i106;
                                if (i107 >= bArr10.length || i107 >= i94) {
                                    break;
                                }
                                int i109 = this.alpha[bArr10[i107] & 255];
                                if (i109 != 0) {
                                    i100 += (i109 >> 24) & 255;
                                    i101 += (i109 >> 16) & 255;
                                    i102 += (i109 >> 8) & 255;
                                    i103 += i109 & 255;
                                    i104++;
                                }
                                i107++;
                                i106 = i108;
                            }
                            if (i104 == 0) {
                                i12 = 0;
                            } else {
                                i12 = ((i100 / i104) << 24) | ((i101 / i104) << 16) | ((i102 / i104) << 8) | (i103 / i104);
                            }
                            if (i12 != 0) {
                                iArr10[i98] = i12;
                            } else if (z2 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i90 += i10;
                            i95 = i98 + 1;
                            i88 = i96;
                            i75 = i11;
                        }
                        i83++;
                        iArr8 = iArr10;
                        i81 = i85;
                        i73 = i10;
                        i74 = i5;
                        i75 = i75;
                    }
                } else {
                    i5 = i74;
                }
                i10 = i73;
                i83++;
                iArr8 = iArr10;
                i81 = i85;
                i73 = i10;
                i74 = i5;
                i75 = i75;
            }
            if (this.sierra == null) {
                if (bool2 == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool2.booleanValue();
                }
                this.sierra = Boolean.valueOf(booleanValue);
            }
        }
        if (!this.november || ((i13 = aVar.golf) != 0 && i13 != 1)) {
            iArr2 = iArr;
        } else {
            if (this.mike == null) {
                this.mike = alpha();
            }
            Bitmap bitmap3 = this.mike;
            int i110 = this.romeo;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i110, 0, 0, i110, this.quebec);
        }
        Bitmap alpha = alpha();
        int i111 = this.romeo;
        alpha.setPixels(iArr2, 0, i111, 0, 0, i111, this.quebec);
        return alpha;
    }
}
