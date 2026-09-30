package M1;

import A0.z;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import s6.AbstractC2734o6;

/* loaded from: classes3.dex */
public final class g {
    public static final byte[] amber;
    public static final byte[] azure;
    public static final String[] beige;
    public static final int[] black;
    public static final byte[] blue;
    public static final d bronze;
    public static final d[][] coral;
    public static final d[] crimson;
    public static final HashMap[] cyan;
    public static final HashMap[] emerald;
    public static final HashSet fuchsia;
    public static final HashMap gold;
    public static final Charset gray;
    public static final byte[] green;
    public static final byte[] indigo;
    public static final boolean mike = Log.isLoggable("ExifInterface", 3);
    public static final int[] november;
    public static final int[] oscar;
    public static final byte[] papa;
    public static final byte[] quebec;
    public static final byte[] romeo;
    public static final byte[] sierra;
    public static final byte[] tango;
    public static final byte[] uniform;
    public static final byte[] victor;
    public static final byte[] whiskey;
    public static final byte[] xray;
    public static final byte[] yankee;
    public static final byte[] zulu;
    public final String alpha;
    public final FileDescriptor bravo;
    public final AssetManager.AssetInputStream charlie;
    public int delta;
    public final HashMap[] echo;
    public final HashSet foxtrot;
    public ByteOrder golf;
    public boolean hotel;
    public int india;
    public int juliet;
    public int kilo;
    public int lima;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        november = new int[]{8, 8, 8};
        oscar = new int[]{8};
        papa = new byte[]{-1, -40, -1};
        quebec = new byte[]{102, 116, 121, 112};
        romeo = new byte[]{109, 105, 102, 49};
        sierra = new byte[]{104, 101, 105, 99};
        tango = new byte[]{79, 76, 89, 77, 80, 0};
        uniform = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        victor = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        whiskey = new byte[]{101, 88, 73, 102};
        xray = new byte[]{73, 72, 68, 82};
        yankee = new byte[]{73, 69, 78, 68};
        zulu = new byte[]{82, 73, 70, 70};
        amber = new byte[]{87, 69, 66, 80};
        azure = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        beige = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        black = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        blue = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(Barcode.FORMAT_QR_CODE, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", HttpConstants.HTTP_USE_PROXY, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(Barcode.FORMAT_QR_CODE, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", HttpConstants.HTTP_USE_PROXY, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        bronze = new d("StripOffsets", 273, 3);
        coral = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", Barcode.FORMAT_QR_CODE, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        crimson = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        cyan = new HashMap[10];
        emerald = new HashMap[10];
        fuchsia = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        gold = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        gray = forName;
        green = "Exif\u0000\u0000".getBytes(forName);
        indigo = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i4 = 0;
        while (true) {
            d[][] dVarArr6 = coral;
            if (i4 < dVarArr6.length) {
                cyan[i4] = new HashMap();
                emerald[i4] = new HashMap();
                for (d dVar : dVarArr6[i4]) {
                    cyan[i4].put(Integer.valueOf(dVar.alpha), dVar);
                    emerald[i4].put(dVar.bravo, dVar);
                }
                i4++;
            } else {
                HashMap hashMap = gold;
                d[] dVarArr7 = crimson;
                hashMap.put(Integer.valueOf(dVarArr7[0].alpha), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].alpha), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].alpha), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].alpha), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].alpha), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].alpha), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public g(String str) {
        FileInputStream fileInputStream;
        boolean z2;
        d[][] dVarArr = coral;
        this.echo = new HashMap[dVarArr.length];
        this.foxtrot = new HashSet(dVarArr.length);
        this.golf = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.charlie = null;
            this.alpha = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    h.charlie(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    if (mike) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z2 = false;
                }
                if (z2) {
                    this.bravo = fileInputStream.getFD();
                } else {
                    this.bravo = null;
                }
                papa(fileInputStream);
                AbstractC2734o6.alpha(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC2734o6.alpha(fileInputStream2);
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }

    public static ByteOrder sierra(b bVar) {
        short readShort = bVar.readShort();
        boolean z2 = mike;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z2) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void alpha() {
        String bravo = bravo("DateTimeOriginal");
        HashMap[] hashMapArr = this.echo;
        if (bravo != null && bravo("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.alpha(bravo));
        }
        if (bravo("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.bravo(0L, this.golf));
        }
        if (bravo("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.bravo(0L, this.golf));
        }
        if (bravo("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.bravo(0L, this.golf));
        }
        if (bravo("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.bravo(0L, this.golf));
        }
    }

    public final String bravo(String str) {
        if (str != null) {
            c delta = delta(str);
            if (delta != null) {
                if (!fuchsia.contains(str)) {
                    return delta.golf(this.golf);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i4 = delta.alpha;
                    if (i4 != 5 && i4 != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i4);
                        return null;
                    }
                    e[] eVarArr = (e[]) delta.hotel(this.golf);
                    if (eVarArr != null && eVarArr.length == 3) {
                        e eVar = eVarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) eVar.alpha) / ((float) eVar.bravo)));
                        e eVar2 = eVarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.alpha) / ((float) eVar2.bravo)));
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.alpha) / ((float) eVar3.bravo))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                try {
                    return Double.toString(delta.echo(this.golf));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final int charlie(int i4, String str) {
        c delta = delta(str);
        if (delta != null) {
            try {
            } catch (NumberFormatException unused) {
                return i4;
            }
        }
        return delta.foxtrot(this.golf);
    }

    public final c delta(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (mike) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i4 = 0; i4 < coral.length; i4++) {
                c cVar = (c) this.echo[i4].get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void echo(f fVar) {
        String str;
        String str2;
        String str3;
        int i4;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    i.alpha(mediaMetadataRetriever, new a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.echo;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", c.delta(Integer.parseInt(str), this.golf));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", c.delta(Integer.parseInt(str2), this.golf));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i4 = 1;
                                } else {
                                    i4 = 8;
                                }
                            } else {
                                i4 = 3;
                            }
                        } else {
                            i4 = 6;
                        }
                        hashMapArr[0].put("Orientation", c.delta(i4, this.golf));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.echo(parseInt2);
                            byte[] bArr = new byte[6];
                            fVar.readFully(bArr);
                            int i5 = parseInt2 + 6;
                            int i10 = parseInt3 - 6;
                            if (Arrays.equals(bArr, green)) {
                                byte[] bArr2 = new byte[i10];
                                fVar.readFully(bArr2);
                                this.india = i5;
                                tango(0, bArr2);
                            } else {
                                throw new IOException("Invalid identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (mike) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
    
        r23.red = r22.golf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018c, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0175 A[LOOP:0: B:9:0x0033->B:32:0x0175, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void foxtrot(b bVar, int i4, int i5) {
        String str;
        String str2;
        boolean z2 = mike;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.red = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b2 = -1;
        if (readByte == -1) {
            if (bVar.readByte() == -40) {
                int i10 = 2;
                while (true) {
                    byte readByte2 = bVar.readByte();
                    if (readByte2 == b2) {
                        byte readByte3 = bVar.readByte();
                        if (z2) {
                            Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                        }
                        if (readByte3 != -39 && readByte3 != -38) {
                            int readUnsignedShort = bVar.readUnsignedShort();
                            int i11 = readUnsignedShort - 2;
                            int i12 = i10 + 4;
                            if (z2) {
                                Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                            }
                            if (i11 >= 0) {
                                HashMap[] hashMapArr = this.echo;
                                if (readByte3 != -31) {
                                    if (readByte3 != -2) {
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                            default:
                                                                switch (readByte3) {
                                                                }
                                                            case -55:
                                                            case -54:
                                                            case -53:
                                                                bVar.charlie(1);
                                                                HashMap hashMap = hashMapArr[i5];
                                                                if (i5 != 4) {
                                                                    str = "ImageLength";
                                                                } else {
                                                                    str = "ThumbnailImageLength";
                                                                }
                                                                hashMap.put(str, c.bravo(bVar.readUnsignedShort(), this.golf));
                                                                HashMap hashMap2 = hashMapArr[i5];
                                                                if (i5 != 4) {
                                                                    str2 = "ImageWidth";
                                                                } else {
                                                                    str2 = "ThumbnailImageWidth";
                                                                }
                                                                hashMap2.put(str2, c.bravo(bVar.readUnsignedShort(), this.golf));
                                                                i11 = readUnsignedShort - 7;
                                                                break;
                                                        }
                                                    case -59:
                                                    case -58:
                                                    case -57:
                                                        break;
                                                }
                                            case -64:
                                            case -63:
                                            case -62:
                                            case -61:
                                                break;
                                        }
                                        if (i11 < 0) {
                                            bVar.charlie(i11);
                                            i10 = i12 + i11;
                                            b2 = -1;
                                        } else {
                                            throw new IOException("Invalid length");
                                        }
                                    } else {
                                        byte[] bArr = new byte[i11];
                                        bVar.readFully(bArr);
                                        if (bravo("UserComment") == null) {
                                            hashMapArr[1].put("UserComment", c.alpha(new String(bArr, gray)));
                                        }
                                    }
                                } else {
                                    byte[] bArr2 = new byte[i11];
                                    bVar.readFully(bArr2);
                                    int i13 = i12 + i11;
                                    byte[] bArr3 = green;
                                    if (bArr3 != null && i11 >= bArr3.length) {
                                        for (int i14 = 0; i14 < bArr3.length; i14++) {
                                            if (bArr2[i14] == bArr3[i14]) {
                                            }
                                        }
                                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i11);
                                        this.india = i4 + i12 + bArr3.length;
                                        tango(i5, copyOfRange);
                                        whiskey(new b(copyOfRange));
                                        i12 = i13;
                                    }
                                    byte[] bArr4 = indigo;
                                    if (bArr4 != null && i11 >= bArr4.length) {
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < bArr4.length) {
                                                if (bArr2[i15] == bArr4[i15]) {
                                                    i15++;
                                                }
                                            } else {
                                                int length = i12 + bArr4.length;
                                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i11);
                                                if (bravo("Xmp") == null) {
                                                    hashMapArr[0].put("Xmp", new c(length, copyOfRange2, 1, copyOfRange2.length));
                                                }
                                            }
                                        }
                                    }
                                    i12 = i13;
                                }
                                i11 = 0;
                                if (i11 < 0) {
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
                    }
                }
            } else {
                throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
            }
        } else {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(16:106|(2:108|109)(1:152)|111|112|(1:114)|115|(4:118|119|(7:123|124|125|(3:127|(1:129)(2:138|(1:140))|(3:132|133|134))(1:141)|136|120|121)|144)|117|22|23|25|26|27|(1:93)(1:31)|32|(1:34)(8:36|37|39|40|41|(1:43)(1:80)|44|(1:46)(3:47|(2:48|(2:50|(2:53|54)(1:52))(2:78|79))|(1:56)(3:57|(2:58|(2:60|(1:63)(1:62))(3:68|69|(2:70|(2:72|(1:75)(1:74))(2:76|77))))|(1:66)(1:67)))))|21|22|23|25|26|27|(1:29)|93|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f0, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f6, code lost:
    
        if (r6 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00f8, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00fb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00ca, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0162, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00fc, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00fe, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0101, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int golf(BufferedInputStream bufferedInputStream) {
        int i4;
        b bVar;
        int i5;
        int i10;
        int i11;
        int i12;
        b bVar2;
        short readShort;
        long readInt;
        byte[] bArr;
        long j5;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i13 = 0;
        while (true) {
            byte[] bArr3 = papa;
            if (i13 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i13] != bArr3[i13]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i14 = 0; i14 < bytes.length; i14++) {
                    if (bArr2[i14] != bytes[i14]) {
                        b bVar3 = null;
                        try {
                            bVar = new b(bArr2);
                            try {
                                try {
                                    readInt = bVar.readInt();
                                    bArr = new byte[4];
                                    bVar.readFully(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i4 = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bVar3 = bVar;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i4 = 0;
                            bVar = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, quebec)) {
                            if (readInt == 1) {
                                readInt = bVar.readLong();
                                j5 = 16;
                            } else {
                                j5 = 8;
                            }
                            i4 = 0;
                            long j6 = 5000;
                            if (readInt > j6) {
                                readInt = j6;
                            }
                            long j7 = readInt - j5;
                            if (j7 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z2 = false;
                                    boolean z10 = false;
                                    for (long j10 = 0; j10 < j7 / 4; j10++) {
                                        try {
                                            bVar.readFully(bArr4);
                                            if (j10 != 1) {
                                                if (Arrays.equals(bArr4, romeo)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, sierra)) {
                                                    z10 = true;
                                                }
                                                if (z2 && z10) {
                                                    bVar.close();
                                                    return 12;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    if (mike) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            bVar.close();
                            b bVar4 = new b(bArr2);
                            ByteOrder sierra2 = sierra(bVar4);
                            this.golf = sierra2;
                            bVar4.red = sierra2;
                            readShort = bVar4.readShort();
                            if (readShort == 20306 && readShort != 21330) {
                                i5 = i4;
                            } else {
                                i5 = 1;
                            }
                            bVar4.close();
                            if (i5 != 0) {
                                return 7;
                            }
                            try {
                                bVar2 = new b(bArr2);
                            } catch (Exception unused2) {
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                ByteOrder sierra3 = sierra(bVar2);
                                this.golf = sierra3;
                                bVar2.red = sierra3;
                                if (bVar2.readShort() == 85) {
                                    i10 = 1;
                                } else {
                                    i10 = i4;
                                }
                                bVar2.close();
                            } catch (Exception unused3) {
                                bVar3 = bVar2;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                i10 = i4;
                                if (i10 == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                bVar3 = bVar2;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                            if (i10 == 0) {
                                return 10;
                            }
                            int i15 = i4;
                            while (true) {
                                byte[] bArr5 = victor;
                                if (i15 < bArr5.length) {
                                    if (bArr2[i15] != bArr5[i15]) {
                                        i11 = i4;
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i11 = 1;
                                    break;
                                }
                            }
                            if (i11 != 0) {
                                return 13;
                            }
                            int i16 = i4;
                            while (true) {
                                byte[] bArr6 = zulu;
                                if (i16 < bArr6.length) {
                                    if (bArr2[i16] != bArr6[i16]) {
                                        break;
                                    }
                                    i16++;
                                } else {
                                    int i17 = i4;
                                    while (true) {
                                        byte[] bArr7 = amber;
                                        if (i17 < bArr7.length) {
                                            if (bArr2[bArr6.length + i17 + 4] != bArr7[i17]) {
                                                break;
                                            }
                                            i17++;
                                        } else {
                                            i12 = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (i12 != 0) {
                                return 14;
                            }
                            return i4;
                        }
                        bVar.close();
                        i4 = 0;
                        b bVar42 = new b(bArr2);
                        ByteOrder sierra22 = sierra(bVar42);
                        this.golf = sierra22;
                        bVar42.red = sierra22;
                        readShort = bVar42.readShort();
                        if (readShort == 20306) {
                        }
                        i5 = 1;
                        bVar42.close();
                        if (i5 != 0) {
                        }
                    }
                }
                return 9;
            }
            i13++;
        }
    }

    public final void hotel(f fVar) {
        int i4;
        int i5;
        kilo(fVar);
        HashMap[] hashMapArr = this.echo;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.delta);
            fVar2.red = this.golf;
            byte[] bArr = tango;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.echo(0L);
            byte[] bArr3 = uniform;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.echo(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.echo(12L);
            }
            uniform(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.hotel(this.golf);
                if (iArr != null && iArr.length == 4) {
                    int i10 = iArr[2];
                    int i11 = iArr[0];
                    if (i10 > i11 && (i4 = iArr[3]) > (i5 = iArr[1])) {
                        int i12 = (i10 - i11) + 1;
                        int i13 = (i4 - i5) + 1;
                        if (i12 < i13) {
                            int i14 = i12 + i13;
                            i13 = i14 - i13;
                            i12 = i14 - i13;
                        }
                        c delta = c.delta(i12, this.golf);
                        c delta2 = c.delta(i13, this.golf);
                        hashMapArr[0].put("ImageWidth", delta);
                        hashMapArr[0].put("ImageLength", delta2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void india(b bVar) {
        if (mike) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.red = ByteOrder.BIG_ENDIAN;
        byte[] bArr = victor;
        bVar.charlie(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i4 = length + 8;
                if (i4 == 16 && !Arrays.equals(bArr2, xray)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, yankee)) {
                    return;
                }
                if (Arrays.equals(bArr2, whiskey)) {
                    byte[] bArr3 = new byte[readInt];
                    bVar.readFully(bArr3);
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.india = i4;
                        tango(0, bArr3);
                        zulu();
                        whiskey(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i5 = readInt + 4;
                bVar.charlie(i5);
                length = i4 + i5;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void juliet(b bVar) {
        boolean z2 = mike;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.charlie(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i4 = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        int i10 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i5];
        bVar.charlie(i4 - bVar.purple);
        bVar.readFully(bArr4);
        foxtrot(new b(bArr4), i4, 5);
        bVar.charlie(i10 - bVar.purple);
        bVar.red = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i11 = 0; i11 < readInt; i11++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == bronze.alpha) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c delta = c.delta(readShort, this.golf);
                c delta2 = c.delta(readShort2, this.golf);
                HashMap[] hashMapArr = this.echo;
                hashMapArr[0].put("ImageLength", delta);
                hashMapArr[0].put("ImageWidth", delta2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.charlie(readUnsignedShort2);
        }
    }

    public final void kilo(f fVar) {
        quebec(fVar);
        uniform(fVar, 0);
        yankee(fVar, 0);
        yankee(fVar, 5);
        yankee(fVar, 4);
        zulu();
        if (this.delta == 8) {
            HashMap[] hashMapArr = this.echo;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.delta);
                fVar2.red = this.golf;
                fVar2.charlie(6);
                uniform(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void lima(f fVar) {
        if (mike) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        kilo(fVar);
        HashMap[] hashMapArr = this.echo;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            foxtrot(new b(cVar.delta), (int) cVar.charlie, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void mike(b bVar) {
        if (mike) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.red = ByteOrder.LITTLE_ENDIAN;
        bVar.charlie(zulu.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = amber;
        bVar.charlie(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i4 = length + 8;
                if (Arrays.equals(azure, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.india = i4;
                    tango(0, bArr3);
                    whiskey(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i4 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    bVar.charlie(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void november(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int foxtrot = cVar.foxtrot(this.golf);
            int foxtrot2 = cVar2.foxtrot(this.golf);
            if (this.delta == 7) {
                foxtrot += this.juliet;
            }
            if (foxtrot > 0 && foxtrot2 > 0 && this.alpha == null && this.charlie == null && this.bravo == null) {
                bVar.charlie(foxtrot);
                bVar.readFully(new byte[foxtrot2]);
            }
            if (mike) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + foxtrot + ", length: " + foxtrot2);
            }
        }
    }

    public final boolean oscar(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int foxtrot = cVar.foxtrot(this.golf);
            int foxtrot2 = cVar2.foxtrot(this.golf);
            if (foxtrot <= 512 && foxtrot2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:7:0x001e, B:13:0x003b, B:15:0x0046, B:16:0x005c, B:25:0x004d, B:28:0x0055, B:29:0x0059, B:30:0x0066, B:32:0x006f, B:34:0x0075, B:36:0x007b, B:38:0x0081, B:48:0x008f), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void papa(InputStream inputStream) {
        boolean z2 = mike;
        for (int i4 = 0; i4 < coral.length; i4++) {
            try {
                try {
                    this.echo[i4] = new HashMap();
                } catch (Throwable th) {
                    alpha();
                    if (z2) {
                        romeo();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                alpha();
                if (!z2) {
                    romeo();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e4) {
                e = e4;
                if (z2) {
                }
                alpha();
                if (!z2) {
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int golf = golf(bufferedInputStream);
        this.delta = golf;
        if (golf != 4 && golf != 9 && golf != 13 && golf != 14) {
            f fVar = new f(bufferedInputStream);
            int i5 = this.delta;
            if (i5 == 12) {
                echo(fVar);
            } else if (i5 == 7) {
                hotel(fVar);
            } else if (i5 == 10) {
                lima(fVar);
            } else {
                kilo(fVar);
            }
            fVar.echo(this.india);
            whiskey(fVar);
            alpha();
            if (!z2) {
                romeo();
                return;
            }
            return;
        }
        b bVar = new b(bufferedInputStream);
        int i10 = this.delta;
        if (i10 == 4) {
            foxtrot(bVar, 0, 0);
        } else if (i10 == 13) {
            india(bVar);
        } else if (i10 == 9) {
            juliet(bVar);
        } else if (i10 == 14) {
            mike(bVar);
        }
        alpha();
        if (!z2) {
        }
    }

    public final void quebec(f fVar) {
        ByteOrder sierra2 = sierra(fVar);
        this.golf = sierra2;
        fVar.red = sierra2;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i4 = this.delta;
        if (i4 != 7 && i4 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt >= 8) {
            int i5 = readInt - 8;
            if (i5 > 0) {
                fVar.charlie(i5);
                return;
            }
            return;
        }
        throw new IOException(ad.zulu(readInt, "Invalid first Ifd offset: "));
    }

    public final void romeo() {
        int i4 = 0;
        while (true) {
            HashMap[] hashMapArr = this.echo;
            if (i4 < hashMapArr.length) {
                StringBuilder sierra2 = Q0.c.sierra(i4, "The size of tag group[", "]: ");
                sierra2.append(hashMapArr[i4].size());
                Log.d("ExifInterface", sierra2.toString());
                for (Map.Entry entry : hashMapArr[i4].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.golf(this.golf) + "'");
                }
                i4++;
            } else {
                return;
            }
        }
    }

    public final void tango(int i4, byte[] bArr) {
        f fVar = new f(bArr);
        quebec(fVar);
        uniform(fVar, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uniform(f fVar, int i4) {
        HashMap[] hashMapArr;
        short s3;
        int i5;
        long j5;
        long j6;
        boolean z2;
        int i10;
        long j7;
        boolean z10;
        short s9;
        HashMap[] hashMapArr2;
        int readUnsignedShort;
        long j10;
        String str;
        int i11 = i4;
        Integer valueOf = Integer.valueOf(fVar.purple);
        HashSet hashSet = this.foxtrot;
        hashSet.add(valueOf);
        short readShort = fVar.readShort();
        boolean z11 = mike;
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort > 0) {
            short s10 = 0;
            while (true) {
                hashMapArr = this.echo;
                if (s10 >= readShort) {
                    break;
                }
                int readUnsignedShort2 = fVar.readUnsignedShort();
                int readUnsignedShort3 = fVar.readUnsignedShort();
                int readInt = fVar.readInt();
                long j11 = fVar.purple + 4;
                d dVar = (d) cyan[i11].get(Integer.valueOf(readUnsignedShort2));
                if (z11) {
                    Integer valueOf2 = Integer.valueOf(i11);
                    Integer valueOf3 = Integer.valueOf(readUnsignedShort2);
                    if (dVar != null) {
                        str = dVar.bravo;
                    } else {
                        str = null;
                    }
                    s3 = readShort;
                    Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", valueOf2, valueOf3, str, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
                } else {
                    s3 = readShort;
                }
                if (dVar == null) {
                    if (z11) {
                        Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                    }
                    i5 = readUnsignedShort2;
                } else {
                    if (readUnsignedShort3 > 0) {
                        if (readUnsignedShort3 < black.length) {
                            int i12 = dVar.charlie;
                            if (i12 == 7 || readUnsignedShort3 == 7 || i12 == readUnsignedShort3 || (i10 = dVar.delta) == readUnsignedShort3) {
                                i5 = readUnsignedShort2;
                            } else {
                                i5 = readUnsignedShort2;
                                if (((i12 != 4 && i10 != 4) || readUnsignedShort3 != 3) && (((i12 != 9 && i10 != 9) || readUnsignedShort3 != 8) && ((i12 != 12 && i10 != 12) || readUnsignedShort3 != 11))) {
                                    if (z11) {
                                        Log.d("ExifInterface", "Skip the tag entry since data format (" + beige[readUnsignedShort3] + ") is unexpected for tag: " + dVar.bravo);
                                    }
                                }
                            }
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i12;
                            }
                            j5 = r6[readUnsignedShort3] * readInt;
                            if (j5 >= 0 && j5 <= 2147483647L) {
                                z2 = true;
                            } else {
                                if (z11) {
                                    j6 = j5;
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                } else {
                                    j6 = j5;
                                }
                                z2 = false;
                                j5 = j6;
                            }
                            if (z2) {
                                fVar.echo(j11);
                                z10 = z11;
                                s9 = s10;
                            } else {
                                if (j5 > 4) {
                                    z10 = z11;
                                    int readInt2 = fVar.readInt();
                                    s9 = s10;
                                    if (z10) {
                                        hashMapArr2 = hashMapArr;
                                        Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                    } else {
                                        hashMapArr2 = hashMapArr;
                                    }
                                    if (this.delta == 7) {
                                        if ("MakerNote".equals(dVar.bravo)) {
                                            this.juliet = readInt2;
                                        } else if (i11 == 6 && "ThumbnailImage".equals(dVar.bravo)) {
                                            this.kilo = readInt2;
                                            this.lima = readInt;
                                            c delta = c.delta(6, this.golf);
                                            j7 = j11;
                                            c bravo = c.bravo(this.kilo, this.golf);
                                            c bravo2 = c.bravo(this.lima, this.golf);
                                            hashMapArr2[4].put("Compression", delta);
                                            hashMapArr2[4].put("JPEGInterchangeFormat", bravo);
                                            hashMapArr2[4].put("JPEGInterchangeFormatLength", bravo2);
                                            fVar.echo(readInt2);
                                        }
                                    }
                                    j7 = j11;
                                    fVar.echo(readInt2);
                                } else {
                                    j7 = j11;
                                    z10 = z11;
                                    s9 = s10;
                                    hashMapArr2 = hashMapArr;
                                }
                                Integer num = (Integer) gold.get(Integer.valueOf(i5));
                                if (z10) {
                                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j5);
                                }
                                if (num != null) {
                                    if (readUnsignedShort3 != 3) {
                                        if (readUnsignedShort3 != 4) {
                                            if (readUnsignedShort3 != 8) {
                                                if (readUnsignedShort3 != 9 && readUnsignedShort3 != 13) {
                                                    j10 = -1;
                                                } else {
                                                    readUnsignedShort = fVar.readInt();
                                                }
                                            } else {
                                                readUnsignedShort = fVar.readShort();
                                            }
                                        } else {
                                            j10 = fVar.readInt() & 4294967295L;
                                        }
                                        if (!z10) {
                                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j10), dVar.bravo));
                                        }
                                        int i13 = fVar.teal;
                                        if (j10 <= 0 && (i13 == -1 || j10 < i13)) {
                                            if (!hashSet.contains(Integer.valueOf((int) j10))) {
                                                fVar.echo(j10);
                                                uniform(fVar, num.intValue());
                                            } else if (z10) {
                                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j10 + ")");
                                            }
                                        } else if (z10) {
                                            String india = z.india(j10, "Skip jump into the IFD since its offset is invalid: ");
                                            if (i13 != -1) {
                                                india = india + " (total length: " + i13 + ")";
                                            }
                                            Log.d("ExifInterface", india);
                                        }
                                        fVar.echo(j7);
                                    } else {
                                        readUnsignedShort = fVar.readUnsignedShort();
                                    }
                                    j10 = readUnsignedShort;
                                    if (!z10) {
                                    }
                                    int i132 = fVar.teal;
                                    if (j10 <= 0) {
                                    }
                                    if (z10) {
                                    }
                                    fVar.echo(j7);
                                } else {
                                    long j12 = j7;
                                    int i14 = fVar.purple + this.india;
                                    byte[] bArr = new byte[(int) j5];
                                    fVar.readFully(bArr);
                                    c cVar = new c(i14, bArr, readUnsignedShort3, readInt);
                                    hashMapArr2[i4].put(dVar.bravo, cVar);
                                    String str2 = dVar.bravo;
                                    if ("DNGVersion".equals(str2)) {
                                        this.delta = 3;
                                    }
                                    if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.golf(this.golf).contains("PENTAX")) || ("Compression".equals(str2) && cVar.foxtrot(this.golf) == 65535)) {
                                        this.delta = 8;
                                    }
                                    if (fVar.purple != j12) {
                                        fVar.echo(j12);
                                    }
                                    s10 = (short) (s9 + 1);
                                    i11 = i4;
                                    readShort = s3;
                                    z11 = z10;
                                }
                            }
                            s10 = (short) (s9 + 1);
                            i11 = i4;
                            readShort = s3;
                            z11 = z10;
                        }
                    }
                    i5 = readUnsignedShort2;
                    if (z11) {
                        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                    }
                }
                z2 = false;
                j5 = 0;
                if (z2) {
                }
                s10 = (short) (s9 + 1);
                i11 = i4;
                readShort = s3;
                z11 = z10;
            }
            boolean z12 = z11;
            int readInt3 = fVar.readInt();
            if (z12) {
                Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
            }
            long j13 = readInt3;
            if (j13 > 0) {
                if (!hashSet.contains(Integer.valueOf(readInt3))) {
                    fVar.echo(j13);
                    if (hashMapArr[4].isEmpty()) {
                        uniform(fVar, 4);
                        return;
                    } else {
                        if (hashMapArr[5].isEmpty()) {
                            uniform(fVar, 5);
                            return;
                        }
                        return;
                    }
                }
                if (z12) {
                    Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                    return;
                }
                return;
            }
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
            }
        }
    }

    public final void victor(int i4, String str, String str2) {
        HashMap[] hashMapArr = this.echo;
        if (!hashMapArr[i4].isEmpty() && hashMapArr[i4].get(str) != null) {
            HashMap hashMap = hashMapArr[i4];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i4].remove(str);
        }
    }

    public final void whiskey(b bVar) {
        c cVar;
        int foxtrot;
        HashMap hashMap = this.echo[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 != null) {
            int foxtrot2 = cVar2.foxtrot(this.golf);
            if (foxtrot2 != 1) {
                if (foxtrot2 != 6) {
                    if (foxtrot2 != 7) {
                        return;
                    }
                } else {
                    november(bVar, hashMap);
                    return;
                }
            }
            c cVar3 = (c) hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.hotel(this.golf);
                int[] iArr2 = november;
                if (Arrays.equals(iArr2, iArr) || (this.delta == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((foxtrot = cVar.foxtrot(this.golf)) == 1 && Arrays.equals(iArr, oscar)) || (foxtrot == 6 && Arrays.equals(iArr, iArr2))))) {
                    c cVar4 = (c) hashMap.get("StripOffsets");
                    c cVar5 = (c) hashMap.get("StripByteCounts");
                    if (cVar4 != null && cVar5 != null) {
                        long[] bravo = AbstractC2734o6.bravo(cVar4.hotel(this.golf));
                        long[] bravo2 = AbstractC2734o6.bravo(cVar5.hotel(this.golf));
                        if (bravo != null && bravo.length != 0) {
                            if (bravo2 != null && bravo2.length != 0) {
                                if (bravo.length != bravo2.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j5 = 0;
                                for (long j6 : bravo2) {
                                    j5 += j6;
                                }
                                byte[] bArr = new byte[(int) j5];
                                this.hotel = true;
                                int i4 = 0;
                                int i5 = 0;
                                for (int i10 = 0; i10 < bravo.length; i10++) {
                                    int i11 = (int) bravo[i10];
                                    int i12 = (int) bravo2[i10];
                                    if (i10 < bravo.length - 1 && i11 + i12 != bravo[i10 + 1]) {
                                        this.hotel = false;
                                    }
                                    int i13 = i11 - i4;
                                    if (i13 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    try {
                                        bVar.charlie(i13);
                                        int i14 = i4 + i13;
                                        byte[] bArr2 = new byte[i12];
                                        try {
                                            bVar.readFully(bArr2);
                                            i4 = i14 + i12;
                                            System.arraycopy(bArr2, 0, bArr, i5, i12);
                                            i5 += i12;
                                        } catch (EOFException unused) {
                                            Log.d("ExifInterface", "Failed to read " + i12 + " bytes.");
                                            return;
                                        }
                                    } catch (EOFException unused2) {
                                        Log.d("ExifInterface", "Failed to skip " + i13 + " bytes.");
                                        return;
                                    }
                                }
                                if (this.hotel) {
                                    long j7 = bravo[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (mike) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        november(bVar, hashMap);
    }

    public final void xray(int i4, int i5) {
        HashMap[] hashMapArr = this.echo;
        boolean isEmpty = hashMapArr[i4].isEmpty();
        boolean z2 = mike;
        if (!isEmpty && !hashMapArr[i5].isEmpty()) {
            c cVar = (c) hashMapArr[i4].get("ImageLength");
            c cVar2 = (c) hashMapArr[i4].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i5].get("ImageLength");
            c cVar4 = (c) hashMapArr[i5].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int foxtrot = cVar.foxtrot(this.golf);
                    int foxtrot2 = cVar2.foxtrot(this.golf);
                    int foxtrot3 = cVar3.foxtrot(this.golf);
                    int foxtrot4 = cVar4.foxtrot(this.golf);
                    if (foxtrot < foxtrot3 && foxtrot2 < foxtrot4) {
                        HashMap hashMap = hashMapArr[i4];
                        hashMapArr[i4] = hashMapArr[i5];
                        hashMapArr[i5] = hashMap;
                        return;
                    }
                    return;
                }
                if (z2) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (z2) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void yankee(f fVar, int i4) {
        c delta;
        c delta2;
        HashMap[] hashMapArr = this.echo;
        c cVar = (c) hashMapArr[i4].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i4].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i4].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i4].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i4].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.alpha == 5) {
                e[] eVarArr = (e[]) cVar.hotel(this.golf);
                if (eVarArr != null && eVarArr.length == 2) {
                    delta = c.charlie(new e[]{eVarArr[0]}, this.golf);
                    delta2 = c.charlie(new e[]{eVarArr[1]}, this.golf);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.hotel(this.golf);
                if (iArr != null && iArr.length == 2) {
                    delta = c.delta(iArr[0], this.golf);
                    delta2 = c.delta(iArr[1], this.golf);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i4].put("ImageWidth", delta);
            hashMapArr[i4].put("ImageLength", delta2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int foxtrot = cVar2.foxtrot(this.golf);
            int foxtrot2 = cVar4.foxtrot(this.golf);
            int foxtrot3 = cVar5.foxtrot(this.golf);
            int foxtrot4 = cVar3.foxtrot(this.golf);
            if (foxtrot2 > foxtrot && foxtrot3 > foxtrot4) {
                c delta3 = c.delta(foxtrot2 - foxtrot, this.golf);
                c delta4 = c.delta(foxtrot3 - foxtrot4, this.golf);
                hashMapArr[i4].put("ImageLength", delta3);
                hashMapArr[i4].put("ImageWidth", delta4);
                return;
            }
            return;
        }
        c cVar6 = (c) hashMapArr[i4].get("ImageLength");
        c cVar7 = (c) hashMapArr[i4].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i4].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i4].get("JPEGInterchangeFormatLength");
            if (cVar8 != null && cVar9 != null) {
                int foxtrot5 = cVar8.foxtrot(this.golf);
                int foxtrot6 = cVar8.foxtrot(this.golf);
                fVar.echo(foxtrot5);
                byte[] bArr = new byte[foxtrot6];
                fVar.readFully(bArr);
                foxtrot(new b(bArr), foxtrot5, i4);
            }
        }
    }

    public final void zulu() {
        xray(0, 5);
        xray(0, 4);
        xray(5, 4);
        HashMap[] hashMapArr = this.echo;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && oscar(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!oscar(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        victor(0, "ThumbnailOrientation", "Orientation");
        victor(0, "ThumbnailImageLength", "ImageLength");
        victor(0, "ThumbnailImageWidth", "ImageWidth");
        victor(5, "ThumbnailOrientation", "Orientation");
        victor(5, "ThumbnailImageLength", "ImageLength");
        victor(5, "ThumbnailImageWidth", "ImageWidth");
        victor(4, "Orientation", "ThumbnailOrientation");
        victor(4, "ImageLength", "ThumbnailImageLength");
        victor(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public g(InputStream inputStream) {
        d[][] dVarArr = coral;
        this.echo = new HashMap[dVarArr.length];
        this.foxtrot = new HashSet(dVarArr.length);
        this.golf = ByteOrder.BIG_ENDIAN;
        this.alpha = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.charlie = (AssetManager.AssetInputStream) inputStream;
            this.bravo = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    h.charlie(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.charlie = null;
                    this.bravo = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (mike) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.charlie = null;
            this.bravo = null;
        }
        papa(inputStream);
    }
}
