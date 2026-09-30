package com.google.mlkit.vision.barcode.bundled.internal;

import V5.x;
import a9.C0416a;
import a9.e;
import a9.f;
import a9.g;
import a9.i;
import a9.j;
import a9.k;
import a9.l;
import a9.n;
import a9.o;
import a9.p;
import a9.q;
import a9.r;
import a9.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC1414h;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1420n;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1421o;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1422p;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.H;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.as;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.at;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzam;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbe;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbt;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q7.C2416a;
import q7.C2417b;
import q7.C2418c;
import q7.C2419d;
import q7.C2420e;
import q7.C2421f;
import q7.C2422g;
import q7.C2423h;
import q7.C2424i;
import q7.C2425j;

/* loaded from: classes2.dex */
final class zza extends AbstractBinderC1414h {
    private static final int[] zza = {5, 7, 7, 7, 5, 5};
    private static final double[][] zzb = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
    private final Context zzc;
    private final zzba zzd;
    private BarhopperV3 zze;

    public zza(Context context, zzba zzbaVar) {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        this.zzc = context;
        this.zzd = zzbaVar;
    }

    private final RecognitionOptions zzg() {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        recognitionOptions.alpha(this.zzd.alpha);
        recognitionOptions.foxtrot(this.zzd.purple);
        recognitionOptions.bravo();
        recognitionOptions.charlie();
        return recognitionOptions;
    }

    private static zzan zzh(n nVar, String str, String str2) {
        String str3 = null;
        if (nVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int sierra = nVar.sierra();
        int quebec = nVar.quebec();
        int november = nVar.november();
        int oscar = nVar.oscar();
        int papa = nVar.papa();
        int romeo = nVar.romeo();
        boolean uniform = nVar.uniform();
        if (matcher.find()) {
            str3 = matcher.group(1);
        }
        return new zzan(sierra, quebec, november, oscar, papa, romeo, uniform, str3);
    }

    private final C0416a zzi(ByteBuffer byteBuffer, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = this.zze;
        x.hotel(barhopperV3);
        x.hotel(byteBuffer);
        if (byteBuffer.isDirect()) {
            return barhopperV3.echo(zzccVar.purple, zzccVar.red, byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.foxtrot(zzccVar.purple, zzccVar.red, byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.foxtrot(zzccVar.purple, zzccVar.red, bArr, recognitionOptions);
    }

    private final List zzj(InterfaceC1812b interfaceC1812b, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        C0416a golf;
        Matrix matrix;
        int i4;
        int i5;
        zzar zzarVar;
        zzau zzauVar;
        zzav zzavVar;
        zzax zzaxVar;
        zzaw zzawVar;
        zzas zzasVar;
        zzao zzaoVar;
        zzap zzapVar;
        zzaq zzaqVar;
        int i10;
        int i11;
        String str;
        int i12;
        byte[] bArr;
        Point[] pointArr;
        int i13;
        zzat zzatVar;
        zzau[] zzauVarArr;
        zzar[] zzarVarArr;
        zzam[] zzamVarArr;
        String str2;
        String str3;
        int i14 = zzccVar.alpha;
        int i15 = 0;
        int i16 = -1;
        if (i14 != -1) {
            if (i14 != 17) {
                if (i14 != 35) {
                    if (i14 != 842094169) {
                        throw new IllegalArgumentException("Unsupported image format: " + zzccVar.alpha);
                    }
                } else {
                    Image image = (Image) BinderC1814d.magenta(interfaceC1812b);
                    x.hotel(image);
                    golf = zzi(image.getPlanes()[0].getBuffer(), zzccVar, recognitionOptions);
                }
            }
            golf = zzi((ByteBuffer) BinderC1814d.magenta(interfaceC1812b), zzccVar, recognitionOptions);
        } else {
            BarhopperV3 barhopperV3 = this.zze;
            x.hotel(barhopperV3);
            golf = barhopperV3.golf((Bitmap) BinderC1814d.magenta(interfaceC1812b), recognitionOptions);
        }
        ArrayList arrayList = new ArrayList();
        am amVar = null;
        int i17 = zzccVar.silver;
        if (i17 == 0) {
            matrix = null;
        } else {
            matrix = new Matrix();
            int i18 = zzccVar.purple;
            int i19 = zzccVar.red;
            matrix.postTranslate((-i18) / 2.0f, (-i19) / 2.0f);
            matrix.postRotate(i17 * 90);
            int i20 = i17 % 2;
            if (i20 != 0) {
                i4 = i19;
            } else {
                i4 = i18;
            }
            if (i20 == 0) {
                i18 = i19;
            }
            matrix.postTranslate(i4 / 2.0f, i18 / 2.0f);
        }
        for (l lVar : golf.oscar()) {
            int i21 = 5;
            if (lVar.oscar() > 0 && matrix != null) {
                float[] fArr = new float[8];
                as amber = lVar.amber();
                int oscar = lVar.oscar();
                int i22 = i15;
                while (i22 < oscar) {
                    int i23 = i22 + i22;
                    fArr[i23] = ((f) amber.get(i22)).november();
                    fArr[i23 + 1] = ((f) amber.get(i22)).oscar();
                    i22++;
                    i16 = i16;
                }
                i5 = i16;
                matrix.mapPoints(fArr);
                int i24 = i15;
                while (i24 < oscar) {
                    ai aiVar = (ai) lVar.mike(i21, amVar);
                    if (!aiVar.alpha.equals(lVar)) {
                        if (!aiVar.purple.kilo()) {
                            aiVar.foxtrot();
                        }
                        am amVar2 = aiVar.purple;
                        H.charlie.alpha(amVar2.getClass()).delta(amVar2, lVar);
                    }
                    k kVar = (k) aiVar;
                    int i25 = i24 + i24;
                    e papa = f.papa();
                    int i26 = (int) fArr[i25];
                    papa.echo();
                    f.quebec((f) papa.purple, i26);
                    int i27 = (int) fArr[i25 + 1];
                    papa.echo();
                    f.romeo((f) papa.purple, i27);
                    f fVar = (f) papa.bravo();
                    kVar.echo();
                    l.azure((l) kVar.purple, (i24 + i17) % oscar, fVar);
                    lVar = (l) kVar.bravo();
                    i24++;
                    amVar = null;
                    i21 = 5;
                }
            } else {
                i5 = i16;
            }
            if (lVar.bronze()) {
                r tango = lVar.tango();
                zzarVar = new zzar(tango.romeo() - 1, tango.oscar(), tango.quebec(), tango.papa());
            } else {
                zzarVar = null;
            }
            if (lVar.crimson()) {
                zzauVar = new zzau(r5.papa() - 1, lVar.papa().oscar());
            } else {
                zzauVar = null;
            }
            if (lVar.cyan()) {
                g victor = lVar.victor();
                zzavVar = new zzav(victor.oscar(), victor.papa());
            } else {
                zzavVar = null;
            }
            if (lVar.fuchsia()) {
                j xray = lVar.xray();
                zzaxVar = new zzax(xray.papa(), xray.oscar(), xray.quebec() - 1);
            } else {
                zzaxVar = null;
            }
            if (lVar.emerald()) {
                i whiskey = lVar.whiskey();
                zzawVar = new zzaw(whiskey.oscar(), whiskey.papa());
            } else {
                zzawVar = null;
            }
            if (lVar.coral()) {
                t uniform = lVar.uniform();
                zzasVar = new zzas(uniform.november(), uniform.oscar());
            } else {
                zzasVar = null;
            }
            String str4 = "";
            if (lVar.beige()) {
                o quebec = lVar.quebec();
                String uniform2 = quebec.uniform();
                String quebec2 = quebec.quebec();
                String romeo = quebec.romeo();
                String sierra = quebec.sierra();
                String tango2 = quebec.tango();
                n oscar2 = quebec.oscar();
                if (lVar.yankee().sierra()) {
                    AbstractC1431z yankee = lVar.yankee();
                    yankee.getClass();
                    Charset charset = at.alpha;
                    if (yankee.hotel() == 0) {
                        str2 = "";
                    } else {
                        str2 = yankee.quebec(charset);
                    }
                } else {
                    str2 = null;
                }
                zzan zzh = zzh(oscar2, str2, "DTSTART:([0-9TZ]*)");
                n november = quebec.november();
                if (lVar.yankee().sierra()) {
                    AbstractC1431z yankee2 = lVar.yankee();
                    yankee2.getClass();
                    Charset charset2 = at.alpha;
                    if (yankee2.hotel() == 0) {
                        str3 = "";
                    } else {
                        str3 = yankee2.quebec(charset2);
                    }
                } else {
                    str3 = null;
                }
                zzaoVar = new zzao(uniform2, quebec2, romeo, sierra, tango2, zzh, zzh(november, str3, "DTEND:([0-9TZ]*)"));
            } else {
                zzaoVar = null;
            }
            if (lVar.black()) {
                p romeo2 = lVar.romeo();
                C1421o november2 = romeo2.november();
                if (november2 != null) {
                    zzatVar = new zzat(november2.papa(), november2.tango(), november2.sierra(), november2.oscar(), november2.romeo(), november2.quebec(), november2.uniform());
                } else {
                    zzatVar = null;
                }
                String papa2 = romeo2.papa();
                String quebec3 = romeo2.quebec();
                as tango3 = romeo2.tango();
                if (tango3.isEmpty()) {
                    zzauVarArr = null;
                } else {
                    zzau[] zzauVarArr2 = new zzau[tango3.size()];
                    for (int i28 = i15; i28 < tango3.size(); i28++) {
                        zzauVarArr2[i28] = new zzau(((C1422p) tango3.get(i28)).papa() - 1, ((C1422p) tango3.get(i28)).oscar());
                    }
                    zzauVarArr = zzauVarArr2;
                }
                as sierra2 = romeo2.sierra();
                if (sierra2.isEmpty()) {
                    zzarVarArr = null;
                } else {
                    zzar[] zzarVarArr2 = new zzar[sierra2.size()];
                    for (int i29 = i15; i29 < sierra2.size(); i29++) {
                        zzarVarArr2[i29] = new zzar(((r) sierra2.get(i29)).romeo() - 1, ((r) sierra2.get(i29)).oscar(), ((r) sierra2.get(i29)).quebec(), ((r) sierra2.get(i29)).papa());
                    }
                    zzarVarArr = zzarVarArr2;
                }
                String[] strArr = (String[]) romeo2.uniform().toArray(new String[0]);
                as romeo3 = romeo2.romeo();
                if (romeo3.isEmpty()) {
                    zzamVarArr = null;
                } else {
                    zzam[] zzamVarArr2 = new zzam[romeo3.size()];
                    for (int i30 = 0; i30 < romeo3.size(); i30++) {
                        zzamVarArr2[i30] = new zzam(((C1420n) romeo3.get(i30)).oscar() - 1, (String[]) ((C1420n) romeo3.get(i30)).november().toArray(new String[0]));
                    }
                    zzamVarArr = zzamVarArr2;
                }
                zzapVar = new zzap(zzatVar, papa2, quebec3, zzauVarArr, zzarVarArr, strArr, zzamVarArr);
            } else {
                zzapVar = null;
            }
            if (lVar.blue()) {
                q sierra3 = lVar.sierra();
                zzaqVar = new zzaq(sierra3.tango(), sierra3.victor(), sierra3.azure(), sierra3.zulu(), sierra3.whiskey(), sierra3.quebec(), sierra3.oscar(), sierra3.papa(), sierra3.romeo(), sierra3.amber(), sierra3.xray(), sierra3.uniform(), sierra3.sierra(), sierra3.yankee());
            } else {
                zzaqVar = null;
            }
            int i31 = 4;
            switch (lVar.gold() - 1) {
                case 0:
                    i10 = 0;
                    break;
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    i10 = 2;
                    break;
                case 3:
                    i10 = 4;
                    break;
                case 4:
                    i10 = 8;
                    break;
                case 5:
                    i11 = 16;
                    break;
                case 6:
                    i11 = 32;
                    break;
                case 7:
                    i11 = 64;
                    break;
                case 8:
                    i11 = 128;
                    break;
                case 9:
                    i11 = Barcode.FORMAT_QR_CODE;
                    break;
                case 10:
                    i11 = 512;
                    break;
                case 11:
                    i11 = Barcode.FORMAT_UPC_E;
                    break;
                case 12:
                    i11 = 2048;
                    break;
                case 13:
                    i11 = 4096;
                    break;
                default:
                    i10 = i5;
                    break;
            }
            i10 = i11;
            String zulu = lVar.zulu();
            if (lVar.yankee().sierra()) {
                AbstractC1431z yankee3 = lVar.yankee();
                yankee3.getClass();
                Charset charset3 = at.alpha;
                if (yankee3.hotel() != 0) {
                    str4 = yankee3.quebec(charset3);
                }
                str = str4;
            } else {
                str = null;
            }
            AbstractC1431z yankee4 = lVar.yankee();
            int hotel = yankee4.hotel();
            if (hotel == 0) {
                bArr = at.bravo;
                i12 = 0;
            } else {
                byte[] bArr2 = new byte[hotel];
                i12 = 0;
                yankee4.india(0, 0, hotel, bArr2);
                bArr = bArr2;
            }
            as amber2 = lVar.amber();
            if (amber2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[amber2.size()];
                for (int i32 = i12; i32 < amber2.size(); i32++) {
                    pointArr2[i32] = new Point(((f) amber2.get(i32)).november(), ((f) amber2.get(i32)).oscar());
                }
                pointArr = pointArr2;
            }
            switch (lVar.november() - 1) {
                case 1:
                    i13 = 1;
                    continue;
                case 2:
                    i13 = 2;
                    continue;
                case 3:
                    i31 = 3;
                    break;
                case 4:
                    break;
                case 5:
                    i13 = 5;
                    continue;
                case 6:
                    i31 = 6;
                    break;
                case 7:
                    i31 = 7;
                    break;
                case 8:
                    i13 = 8;
                    continue;
                case 9:
                    i31 = 9;
                    break;
                case 10:
                    i31 = 10;
                    break;
                case 11:
                    i31 = 11;
                    break;
                case 12:
                    i31 = 12;
                    break;
                default:
                    i13 = i12;
                    continue;
            }
            i13 = i31;
            arrayList.add(new zzay(i10, zulu, str, bArr, pointArr, i13, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
            i15 = i12;
            i16 = i5;
            amVar = null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1415i
    public final List zzb(InterfaceC1812b interfaceC1812b, zzcc zzccVar) {
        return zzj(interfaceC1812b, zzccVar, zzg());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1415i
    public final List zzc(InterfaceC1812b interfaceC1812b, zzcc zzccVar, zzbc zzbcVar) {
        RecognitionOptions zzg = zzg();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.alpha(zzbcVar.alpha.alpha);
        zzbt zzbtVar = zzbcVar.alpha;
        multiScaleDecodingOptions.bravo(zzbtVar.purple);
        multiScaleDecodingOptions.charlie(zzbtVar.red);
        zzg.delta(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.alpha(zzbtVar.alpha);
        zzg.echo(multiScaleDetectionOptions);
        zzg.golf(zzbcVar.red);
        return zzj(interfaceC1812b, zzccVar, zzg);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.libraries.barhopper.BarhopperV3, java.lang.Object] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1415i
    public final void zzd() {
        if (this.zze == null) {
            ?? obj = new Object();
            System.loadLibrary("barhopper_v3");
            this.zze = obj;
            C2423h november = C2424i.november();
            C2421f november2 = C2422g.november();
            int i4 = 16;
            int i5 = 0;
            for (int i10 = 0; i10 < 6; i10++) {
                C2419d november3 = C2420e.november();
                november3.echo();
                C2420e.romeo((C2420e) november3.purple, i4);
                november3.echo();
                C2420e.oscar((C2420e) november3.purple, i4);
                for (int i11 = 0; i11 < zza[i10]; i11++) {
                    double[] dArr = zzb[i5];
                    double d4 = dArr[0] * 320.0d;
                    float sqrt = (float) Math.sqrt(dArr[1]);
                    float f5 = (float) d4;
                    november3.echo();
                    C2420e.papa((C2420e) november3.purple, f5 / sqrt);
                    november3.echo();
                    C2420e.quebec((C2420e) november3.purple, f5 * sqrt);
                    i5++;
                }
                i4 += i4;
                november2.echo();
                C2422g.oscar((C2422g) november2.purple, (C2420e) november3.bravo());
            }
            november.echo();
            C2424i.oscar((C2424i) november.purple, (C2422g) november2.bravo());
            try {
                InputStream open = this.zzc.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
                try {
                    InputStream open2 = this.zzc.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                    try {
                        InputStream open3 = this.zzc.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                        try {
                            BarhopperV3 barhopperV3 = this.zze;
                            x.hotel(barhopperV3);
                            C2425j november4 = C2416a.november();
                            AbstractC1431z whiskey = AbstractC1431z.whiskey(open);
                            november.echo();
                            C2424i.papa((C2424i) november.purple, whiskey);
                            november4.echo();
                            C2416a.oscar((C2416a) november4.purple, (C2424i) november.bravo());
                            C2417b november5 = C2418c.november();
                            AbstractC1431z whiskey2 = AbstractC1431z.whiskey(open2);
                            november5.echo();
                            C2418c.papa((C2418c) november5.purple, whiskey2);
                            AbstractC1431z whiskey3 = AbstractC1431z.whiskey(open3);
                            november5.echo();
                            C2418c.oscar((C2418c) november5.purple, whiskey3);
                            november4.echo();
                            C2416a.papa((C2416a) november4.purple, (C2418c) november5.bravo());
                            barhopperV3.charlie((C2416a) november4.bravo());
                            if (open3 != null) {
                                open3.close();
                            }
                            if (open2 != null) {
                                open2.close();
                            }
                            if (open != null) {
                                open.close();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                throw new IllegalStateException("Failed to open Barcode models", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1415i
    public final void zze(zzbe zzbeVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1415i
    public final void zzf() {
        BarhopperV3 barhopperV3 = this.zze;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.zze = null;
        }
    }
}
