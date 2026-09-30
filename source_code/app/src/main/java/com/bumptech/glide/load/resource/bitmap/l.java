package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class l implements E3.e {
    public static final byte[] alpha = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] bravo = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int echo(k kVar, G3.g gVar) {
        boolean z2;
        try {
            int mike = kVar.mike();
            if ((mike & 65496) != 65496 && mike != 19789 && mike != 18761) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + mike);
                    return -1;
                }
            } else {
                int golf = golf(kVar);
                if (golf == -1) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                        return -1;
                    }
                } else {
                    byte[] bArr = (byte[]) gVar.echo(golf, byte[].class);
                    try {
                        return hotel(kVar, bArr, golf);
                    } finally {
                        gVar.juliet(bArr);
                    }
                }
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType foxtrot(k kVar) {
        boolean z2;
        try {
            int mike = kVar.mike();
            if (mike == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int sierra = (mike << 8) | kVar.sierra();
            if (sierra == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int sierra2 = (sierra << 8) | kVar.sierra();
            if (sierra2 == -1991225785) {
                kVar.india(21L);
                try {
                    if (kVar.sierra() >= 3) {
                        return ImageHeaderParser$ImageType.PNG_A;
                    }
                    return ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (sierra2 != 1380533830) {
                if (((kVar.mike() << 16) | kVar.mike()) != 1718909296) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int mike2 = (kVar.mike() << 16) | kVar.mike();
                if (mike2 == 1635150195) {
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                int i4 = 0;
                if (mike2 == 1635150182) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                kVar.india(4L);
                int i5 = sierra2 - 16;
                if (i5 % 4 == 0) {
                    while (i4 < 5 && i5 > 0) {
                        int mike3 = (kVar.mike() << 16) | kVar.mike();
                        if (mike3 == 1635150195) {
                            return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                        }
                        if (mike3 == 1635150182) {
                            z2 = true;
                        }
                        i4++;
                        i5 -= 4;
                    }
                }
                if (z2) {
                    return ImageHeaderParser$ImageType.AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            kVar.india(4L);
            if (((kVar.mike() << 16) | kVar.mike()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int mike4 = (kVar.mike() << 16) | kVar.mike();
            if ((mike4 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i10 = mike4 & 255;
            if (i10 == 88) {
                kVar.india(4L);
                short sierra3 = kVar.sierra();
                if ((sierra3 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                if ((sierra3 & 16) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            if (i10 == 76) {
                kVar.india(4L);
                if ((kVar.sierra() & 8) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            return ImageHeaderParser$ImageType.WEBP;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int golf(k kVar) {
        while (true) {
            short sierra = kVar.sierra();
            if (sierra != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sierra));
                    return -1;
                }
            } else {
                short sierra2 = kVar.sierra();
                if (sierra2 == 218) {
                    break;
                }
                if (sierra2 == 217) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                        return -1;
                    }
                } else {
                    int mike = kVar.mike() - 2;
                    if (sierra2 != 225) {
                        long j5 = mike;
                        long india = kVar.india(j5);
                        if (india != j5) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder hotel = av.q.hotel(sierra2, mike, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
                                hotel.append(india);
                                Log.d("DfltImageHeaderParser", hotel.toString());
                            }
                        }
                    } else {
                        return mike;
                    }
                }
            }
        }
    }

    public static int hotel(k kVar, byte[] bArr, int i4) {
        boolean z2;
        short s3;
        ByteOrder byteOrder;
        int i5;
        short s9;
        short s10;
        short s11;
        int i10;
        int tango = kVar.tango(i4, bArr);
        if (tango != i4) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i4 + ", actually read: " + tango);
                return -1;
            }
        } else {
            short s12 = 1;
            int i11 = 0;
            byte[] bArr2 = alpha;
            if (bArr != null && i4 > bArr2.length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i12 = 0;
                while (true) {
                    if (i12 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i12] != bArr2[i12]) {
                        z2 = false;
                        break;
                    }
                    i12++;
                }
            }
            if (z2) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i4);
                if (byteBuffer.remaining() - 6 >= 2) {
                    s3 = byteBuffer.getShort(6);
                } else {
                    s3 = -1;
                }
                if (s3 != 18761) {
                    if (s3 != 19789) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s3));
                        }
                        byteOrder = ByteOrder.BIG_ENDIAN;
                    } else {
                        byteOrder = ByteOrder.BIG_ENDIAN;
                    }
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
                if (byteBuffer.remaining() - 10 >= 4) {
                    i5 = byteBuffer.getInt(10);
                } else {
                    i5 = -1;
                }
                int i13 = i5 + 6;
                if (byteBuffer.remaining() - i13 >= 2) {
                    s9 = byteBuffer.getShort(i13);
                } else {
                    s9 = -1;
                }
                while (i11 < s9) {
                    int i14 = (i11 * 12) + i5 + 8;
                    if (byteBuffer.remaining() - i14 >= 2) {
                        s10 = byteBuffer.getShort(i14);
                    } else {
                        s10 = -1;
                    }
                    if (s10 == 274) {
                        int i15 = i14 + 2;
                        if (byteBuffer.remaining() - i15 >= 2) {
                            s11 = byteBuffer.getShort(i15);
                        } else {
                            s11 = -1;
                        }
                        if (s11 >= s12 && s11 <= 12) {
                            int i16 = i14 + 4;
                            if (byteBuffer.remaining() - i16 >= 4) {
                                i10 = byteBuffer.getInt(i16);
                            } else {
                                i10 = -1;
                            }
                            if (i10 < 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                }
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder hotel = av.q.hotel(i11, s10, "Got tagIndex=", " tagType=", " formatCode=");
                                    hotel.append((int) s11);
                                    hotel.append(" componentCount=");
                                    hotel.append(i10);
                                    Log.d("DfltImageHeaderParser", hotel.toString());
                                }
                                int i17 = i10 + bravo[s11];
                                if (i17 > 4) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s11));
                                    }
                                } else {
                                    int i18 = i14 + 8;
                                    if (i18 >= 0 && i18 <= byteBuffer.remaining()) {
                                        if (i17 >= 0 && i17 + i18 <= byteBuffer.remaining()) {
                                            if (byteBuffer.remaining() - i18 < 2) {
                                                return -1;
                                            }
                                            return byteBuffer.getShort(i18);
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s10));
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i18 + " tagType=" + ((int) s10));
                                    }
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s11));
                        }
                    }
                    i11++;
                    s12 = 1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
        }
        return -1;
    }

    @Override // E3.e
    public final ImageHeaderParser$ImageType alpha(ByteBuffer byteBuffer) {
        Y3.f.charlie(byteBuffer, "Argument must not be null");
        return foxtrot(new M3.b(byteBuffer, 1));
    }

    @Override // E3.e
    public final int bravo(ByteBuffer byteBuffer, G3.g gVar) {
        M3.b bVar = new M3.b(byteBuffer, 1);
        Y3.f.charlie(gVar, "Argument must not be null");
        return echo(bVar, gVar);
    }

    @Override // E3.e
    public final ImageHeaderParser$ImageType charlie(InputStream inputStream) {
        return foxtrot(new androidx.core.widget.f(20, inputStream));
    }

    @Override // E3.e
    public final int delta(InputStream inputStream, G3.g gVar) {
        androidx.core.widget.f fVar = new androidx.core.widget.f(20, inputStream);
        Y3.f.charlie(gVar, "Argument must not be null");
        return echo(fVar, gVar);
    }
}
