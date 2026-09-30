package com.canhub.cropper;

import A0.p;
import B9.ab;
import J2.e;
import Yb.C0331t0;
import a4.ad;
import a4.d;
import a4.s;
import a4.w;
import a4.z;
import ae.ai;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.i;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.google.android.material.datepicker.j;
import delivery.samurai.android.R;
import j1.EnumC1927a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.AbstractC2813x5;
import t6.AbstractC3007i3;
import vf.ao;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Landroidx/appcompat/app/i;", "La4/ad;", "La4/z;", "<init>", "()V", "a4/q", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public class CropImageActivity extends i implements ad, z {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3611b = 0;
    public Uri alpha;
    public CropImageOptions purple;
    public CropImageView red;
    public e silver;
    public Uri teal;
    public final ah.b white;
    public final ah.b yellow;

    public CropImageActivity() {
        final int i4 = 0;
        ah.b registerForActivityResult = registerForActivityResult(new s(1), new ah.a(this) { // from class: a4.o
            public final /* synthetic */ CropImageActivity purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                CropImageActivity cropImageActivity = this.purple;
                switch (i4) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i5 = CropImageActivity.f3611b;
                        if (uri == null) {
                            cropImageActivity.golf();
                            return;
                        }
                        cropImageActivity.alpha = uri;
                        CropImageView cropImageView = cropImageActivity.red;
                        if (cropImageView != null) {
                            cropImageView.setImageUriAsync(uri);
                            return;
                        }
                        return;
                    default:
                        Boolean it = (Boolean) obj;
                        int i10 = CropImageActivity.f3611b;
                        Intrinsics.delta(it, "it");
                        if (it.booleanValue()) {
                            Uri uri2 = cropImageActivity.teal;
                            if (uri2 == null) {
                                cropImageActivity.golf();
                                return;
                            }
                            cropImageActivity.alpha = uri2;
                            CropImageView cropImageView2 = cropImageActivity.red;
                            if (cropImageView2 != null) {
                                cropImageView2.setImageUriAsync(uri2);
                                return;
                            }
                            return;
                        }
                        cropImageActivity.golf();
                        return;
                }
            }
        });
        Intrinsics.delta(registerForActivityResult, "registerForActivityResul…nPickImageResult(uri)\n  }");
        this.white = registerForActivityResult;
        final int i5 = 1;
        ah.b registerForActivityResult2 = registerForActivityResult(new s(7), new ah.a(this) { // from class: a4.o
            public final /* synthetic */ CropImageActivity purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                CropImageActivity cropImageActivity = this.purple;
                switch (i5) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i52 = CropImageActivity.f3611b;
                        if (uri == null) {
                            cropImageActivity.golf();
                            return;
                        }
                        cropImageActivity.alpha = uri;
                        CropImageView cropImageView = cropImageActivity.red;
                        if (cropImageView != null) {
                            cropImageView.setImageUriAsync(uri);
                            return;
                        }
                        return;
                    default:
                        Boolean it = (Boolean) obj;
                        int i10 = CropImageActivity.f3611b;
                        Intrinsics.delta(it, "it");
                        if (it.booleanValue()) {
                            Uri uri2 = cropImageActivity.teal;
                            if (uri2 == null) {
                                cropImageActivity.golf();
                                return;
                            }
                            cropImageActivity.alpha = uri2;
                            CropImageView cropImageView2 = cropImageActivity.red;
                            if (cropImageView2 != null) {
                                cropImageView2.setImageUriAsync(uri2);
                                return;
                            }
                            return;
                        }
                        cropImageActivity.golf();
                        return;
                }
            }
        });
        Intrinsics.delta(registerForActivityResult2, "registerForActivityResul…ageResult(null)\n    }\n  }");
        this.yellow = registerForActivityResult2;
    }

    public static void hotel(Menu menu, int i4, int i5) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i4);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                EnumC1927a enumC1927a = EnumC1927a.purple;
                ColorFilter colorFilter = null;
                if (Build.VERSION.SDK_INT >= 29) {
                    Object india = I2.b.india(enumC1927a);
                    if (india != null) {
                        colorFilter = I2.b.alpha(i5, india);
                    }
                } else {
                    PorterDuff.Mode alpha = AbstractC2813x5.alpha(enumC1927a);
                    if (alpha != null) {
                        colorFilter = new PorterDuffColorFilter(i5, alpha);
                    }
                }
                icon.setColorFilter(colorFilter);
                findItem.setIcon(icon);
            } catch (Exception e) {
                Log.w("AIC", "Failed to update menu item color", e);
            }
        }
    }

    public final void echo() {
        a4.e eVar;
        Pair pair;
        int i4;
        int i5;
        CropImageOptions cropImageOptions = this.purple;
        if (cropImageOptions != null) {
            if (cropImageOptions.f3621M) {
                foxtrot(null, null, 1);
                return;
            }
            CropImageView cropImageView = this.red;
            if (cropImageView != null) {
                Bitmap.CompressFormat saveCompressFormat = cropImageOptions.f3617I;
                Intrinsics.echo(saveCompressFormat, "saveCompressFormat");
                int i10 = cropImageOptions.f3652j0;
                j.papa(i10, "options");
                if (cropImageView.f3691u != null) {
                    Bitmap bitmap = cropImageView.f3673b;
                    if (bitmap != null) {
                        WeakReference weakReference = cropImageView.f3670E;
                        if (weakReference != null) {
                            Intrinsics.checkNotNull(weakReference);
                            eVar = (a4.e) weakReference.get();
                        } else {
                            eVar = null;
                        }
                        if (eVar != null) {
                            eVar.f2615m.foxtrot(null);
                        }
                        if (cropImageView.f3693w <= 1 && i10 != 2) {
                            pair = new Pair(0, 0);
                        } else {
                            pair = new Pair(Integer.valueOf(bitmap.getWidth() * cropImageView.f3693w), Integer.valueOf(bitmap.getHeight() * cropImageView.f3693w));
                        }
                        Integer orgWidth = (Integer) pair.first;
                        Integer orgHeight = (Integer) pair.second;
                        Context context = cropImageView.getContext();
                        Intrinsics.delta(context, "context");
                        WeakReference weakReference2 = new WeakReference(cropImageView);
                        Uri uri = cropImageView.imageUri;
                        int i11 = 0;
                        float[] cropPoints = cropImageView.getCropPoints();
                        int i12 = cropImageView.f3675d;
                        Intrinsics.delta(orgWidth, "orgWidth");
                        int intValue = orgWidth.intValue();
                        Intrinsics.delta(orgHeight, "orgHeight");
                        int intValue2 = orgHeight.intValue();
                        CropOverlayView cropOverlayView = cropImageView.purple;
                        Intrinsics.checkNotNull(cropOverlayView);
                        boolean z2 = cropOverlayView.f3717s;
                        int f3718t = cropOverlayView.getF3718t();
                        int f3719u = cropOverlayView.getF3719u();
                        if (i10 != 1) {
                            i5 = cropImageOptions.f3619K;
                            i4 = 1;
                        } else {
                            i4 = 1;
                            i5 = 0;
                        }
                        if (i10 != i4) {
                            i11 = cropImageOptions.f3620L;
                        }
                        boolean z10 = cropImageView.e;
                        boolean z11 = cropImageView.f3676f;
                        Uri uri2 = cropImageOptions.f3616H;
                        if (uri2 == null) {
                            uri2 = cropImageView.customOutputUri;
                        }
                        int i13 = i5;
                        WeakReference weakReference3 = new WeakReference(new a4.e(context, weakReference2, uri, bitmap, cropPoints, i12, intValue, intValue2, z2, f3718t, f3719u, i13, i11, z10, z11, i10, saveCompressFormat, cropImageOptions.f3618J, uri2));
                        cropImageView.f3670E = weakReference3;
                        Intrinsics.checkNotNull(weakReference3);
                        Object obj = weakReference3.get();
                        Intrinsics.checkNotNull(obj);
                        a4.e eVar2 = (a4.e) obj;
                        eVar2.getClass();
                        eVar2.f2615m = vf.ad.zulu(eVar2, ao.alpha, null, new d(eVar2, null), 2);
                        cropImageView.hotel();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
            }
            return;
        }
        Intrinsics.lima("cropImageOptions");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a4.w, android.os.Parcelable] */
    public final void foxtrot(Uri uri, Exception exc, int i4) {
        int i5;
        Uri uri2;
        float[] fArr;
        Rect rect;
        int i10;
        if (exc != null) {
            i5 = 204;
        } else {
            i5 = -1;
        }
        CropImageView cropImageView = this.red;
        Rect rect2 = null;
        if (cropImageView != null) {
            uri2 = cropImageView.getImageUri();
        } else {
            uri2 = null;
        }
        CropImageView cropImageView2 = this.red;
        if (cropImageView2 != null) {
            fArr = cropImageView2.getCropPoints();
        } else {
            fArr = null;
        }
        CropImageView cropImageView3 = this.red;
        if (cropImageView3 != null) {
            rect = cropImageView3.getCropRect();
        } else {
            rect = null;
        }
        CropImageView cropImageView4 = this.red;
        if (cropImageView4 != null) {
            i10 = cropImageView4.getF3675d();
        } else {
            i10 = 0;
        }
        int i11 = i10;
        CropImageView cropImageView5 = this.red;
        if (cropImageView5 != null) {
            rect2 = cropImageView5.getWholeImageRect();
        }
        Intrinsics.checkNotNull(fArr);
        ?? wVar = new w(uri2, uri, exc, fArr, rect, rect2, i11, i4);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", (Parcelable) wVar);
        setResult(i5, intent);
        finish();
    }

    public final void golf() {
        setResult(0);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0182, code lost:
    
        if (checkSelfPermission("android.permission.CAMERA") != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03c7  */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.lifecycle.al] */
    /* JADX WARN: Type inference failed for: r53v0, types: [android.content.Context, ae.o, java.lang.Object, com.canhub.cropper.CropImageActivity, android.app.Activity, androidx.appcompat.app.i, androidx.fragment.app.an] */
    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Uri uri;
        CropImageOptions cropImageOptions;
        Throwable th;
        Uri uri2;
        CropImageOptions cropImageOptions2;
        Uri uri3;
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of2;
        Intent intent;
        PackageManager.PackageInfoFlags of3;
        PackageInfo packageInfo;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.crop_image_activity, (ViewGroup) null, false);
        if (inflate != null) {
            CropImageView cropImageView = (CropImageView) inflate;
            this.silver = new e(25, cropImageView, cropImageView);
            setContentView(cropImageView);
            e eVar = this.silver;
            if (eVar != null) {
                this.red = (CropImageView) eVar.red;
                Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
                if (bundleExtra != null) {
                    Parcelable parcelable = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
                    if (!(parcelable instanceof Uri)) {
                        parcelable = null;
                    }
                    uri = (Uri) parcelable;
                } else {
                    uri = null;
                }
                this.alpha = uri;
                if (bundleExtra != null) {
                    Parcelable parcelable2 = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
                    if (!(parcelable2 instanceof CropImageOptions)) {
                        parcelable2 = null;
                    }
                    cropImageOptions = (CropImageOptions) parcelable2;
                }
                String str = null;
                cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1);
                this.purple = cropImageOptions;
                if (bundle == null) {
                    Uri uri4 = this.alpha;
                    if (uri4 != null && !Intrinsics.areEqual(uri4, Uri.EMPTY)) {
                        CropImageView cropImageView2 = this.red;
                        if (cropImageView2 != null) {
                            cropImageView2.setImageUriAsync(this.alpha);
                        }
                        th = null;
                        str = "cropImageOptions";
                    } else {
                        CropImageOptions cropImageOptions3 = this.purple;
                        if (cropImageOptions3 != null) {
                            if (cropImageOptions3.f3632Y) {
                                ab abVar = new ab((CropImageActivity) this, new O7.j(20, (Object) this));
                                CropImageOptions cropImageOptions4 = this.purple;
                                if (cropImageOptions4 != null) {
                                    String str2 = cropImageOptions4.f3633Z;
                                    if (str2 != null) {
                                        if (StringsKt.gray(str2)) {
                                            str2 = null;
                                        }
                                        if (str2 != null) {
                                            abVar.white = str2;
                                        }
                                    }
                                    List list = cropImageOptions4.f3635a0;
                                    if (list != null) {
                                        if (list.isEmpty()) {
                                            list = null;
                                        }
                                        if (list != null) {
                                            abVar.red = list;
                                        }
                                    }
                                    if (cropImageOptions4.purple) {
                                        File createTempFile = File.createTempFile("tmp_image_file", ".png", getCacheDir());
                                        createTempFile.createNewFile();
                                        createTempFile.deleteOnExit();
                                        uri3 = V8.a.bravo(this, createTempFile);
                                    } else {
                                        uri3 = null;
                                    }
                                    boolean z2 = cropImageOptions4.purple;
                                    boolean z10 = cropImageOptions4.alpha;
                                    abVar.silver = uri3;
                                    ArrayList arrayList = new ArrayList();
                                    PackageManager packageManager = getPackageManager();
                                    int i4 = Build.VERSION.SDK_INT;
                                    th = null;
                                    String packageName = getPackageName();
                                    try {
                                        if (i4 < 33) {
                                            str = "cropImageOptions";
                                            packageInfo = getPackageManager().getPackageInfo(packageName, 4096);
                                        } else {
                                            try {
                                                PackageManager packageManager2 = getPackageManager();
                                                str = "cropImageOptions";
                                                of3 = PackageManager.PackageInfoFlags.of(4096);
                                                packageInfo = packageManager2.getPackageInfo(packageName, of3);
                                            } catch (PackageManager.NameNotFoundException e) {
                                                e = e;
                                                str = "cropImageOptions";
                                                e.printStackTrace();
                                                if (z2) {
                                                }
                                                if (z10) {
                                                }
                                                if (!arrayList.isEmpty()) {
                                                }
                                                Intent createChooser = Intent.createChooser(intent, (String) abVar.white);
                                                Object[] array = arrayList.toArray(new Parcelable[0]);
                                                Intrinsics.charlie(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) array);
                                                ((ah.b) abVar.teal).alpha(createChooser);
                                                cropImageOptions2 = this.purple;
                                                if (cropImageOptions2 == null) {
                                                }
                                            }
                                        }
                                        String[] strArr = packageInfo.requestedPermissions;
                                        if (strArr != null) {
                                            int length = strArr.length;
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= length) {
                                                    break;
                                                }
                                                String str3 = strArr[i5];
                                                if (str3 == null || !str3.equalsIgnoreCase("android.permission.CAMERA")) {
                                                    i5++;
                                                }
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException e4) {
                                        e = e4;
                                    }
                                    if (z2) {
                                        Intrinsics.delta(packageManager, "packageManager");
                                        ArrayList arrayList2 = new ArrayList();
                                        Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            of2 = PackageManager.ResolveInfoFlags.of(0);
                                            queryIntentActivities = packageManager.queryIntentActivities(intent2, of2);
                                        } else {
                                            queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                                        }
                                        Intrinsics.delta(queryIntentActivities, "when {\n      SDK_INT >= …ptureIntent, flags)\n    }");
                                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                                            Intent intent3 = new Intent(intent2);
                                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                                            intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                                            intent3.setPackage(resolveInfo.activityInfo.packageName);
                                            grantUriPermission(resolveInfo.activityInfo.packageName, (Uri) abVar.silver, 3);
                                            intent3.putExtra("output", (Uri) abVar.silver);
                                            arrayList2.add(intent3);
                                        }
                                        arrayList.addAll(arrayList2);
                                    }
                                    if (z10) {
                                        Intrinsics.delta(packageManager, "packageManager");
                                        ArrayList bronze = abVar.bronze(packageManager, "android.intent.action.GET_CONTENT");
                                        if (bronze.isEmpty()) {
                                            bronze = abVar.bronze(packageManager, "android.intent.action.PICK");
                                        }
                                        arrayList.addAll(bronze);
                                    }
                                    if (!arrayList.isEmpty()) {
                                        intent = new Intent();
                                    } else {
                                        Intent intent4 = new Intent("android.intent.action.CHOOSER", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                                        if (z10) {
                                            intent4.setAction("android.intent.action.PICK");
                                            intent4.setType("image/*");
                                        }
                                        intent = intent4;
                                    }
                                    Intent createChooser2 = Intent.createChooser(intent, (String) abVar.white);
                                    Object[] array2 = arrayList.toArray(new Parcelable[0]);
                                    Intrinsics.charlie(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                    createChooser2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) array2);
                                    ((ah.b) abVar.teal).alpha(createChooser2);
                                } else {
                                    Intrinsics.lima("cropImageOptions");
                                    throw null;
                                }
                            } else {
                                th = null;
                                str = "cropImageOptions";
                                boolean z11 = cropImageOptions3.alpha;
                                if (z11 && cropImageOptions3.purple) {
                                    C0331t0 c0331t0 = new C0331t0(1, this, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0, 5);
                                    Fe.c cVar = new Fe.c((Context) this);
                                    androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
                                    dVar.mike = false;
                                    dVar.oscar = new DialogInterface.OnKeyListener() { // from class: a4.p
                                        @Override // android.content.DialogInterface.OnKeyListener
                                        public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                                            int i11 = CropImageActivity.f3611b;
                                            CropImageActivity this$0 = CropImageActivity.this;
                                            Intrinsics.echo(this$0, "this$0");
                                            if (i10 == 4 && keyEvent.getAction() == 1) {
                                                this$0.golf();
                                                this$0.finish();
                                            }
                                            return true;
                                        }
                                    };
                                    dVar.delta = dVar.alpha.getText(R.string.pick_image_chooser_title);
                                    String[] strArr2 = {getString(R.string.pick_image_camera), getString(R.string.pick_image_gallery)};
                                    Gc.e eVar2 = new Gc.e(5, c0331t0);
                                    dVar.papa = strArr2;
                                    dVar.romeo = eVar2;
                                    cVar.november();
                                } else if (z11) {
                                    this.white.alpha("image/*");
                                } else if (cropImageOptions3.purple) {
                                    File createTempFile2 = File.createTempFile("tmp_image_file", ".png", getCacheDir());
                                    createTempFile2.createNewFile();
                                    createTempFile2.deleteOnExit();
                                    Uri bravo = V8.a.bravo(this, createTempFile2);
                                    this.teal = bravo;
                                    this.yellow.alpha(bravo);
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            Intrinsics.lima("cropImageOptions");
                            throw null;
                        }
                    }
                } else {
                    th = null;
                    str = "cropImageOptions";
                    String string = bundle.getString("bundle_key_tmp_uri");
                    if (string != null) {
                        uri2 = Uri.parse(string);
                        Intrinsics.delta(uri2, "parse(this)");
                    } else {
                        uri2 = null;
                    }
                    this.teal = uri2;
                }
                cropImageOptions2 = this.purple;
                if (cropImageOptions2 == null) {
                    e eVar3 = this.silver;
                    if (eVar3 != null) {
                        ((CropImageView) eVar3.purple).setBackgroundColor(cropImageOptions2.f3642e0);
                        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
                        if (supportActionBar != null) {
                            CropImageOptions cropImageOptions5 = this.purple;
                            if (cropImageOptions5 != null) {
                                CharSequence charSequence = cropImageOptions5.f3613E;
                                if (charSequence.length() == 0) {
                                    charSequence = "";
                                }
                                setTitle(charSequence);
                                supportActionBar.oscar(true);
                                CropImageOptions cropImageOptions6 = this.purple;
                                if (cropImageOptions6 != null) {
                                    Integer num = cropImageOptions6.f3644f0;
                                    if (num != null) {
                                        supportActionBar.mike(new ColorDrawable(num.intValue()));
                                    }
                                    CropImageOptions cropImageOptions7 = this.purple;
                                    if (cropImageOptions7 != null) {
                                        Integer num2 = cropImageOptions7.f3646g0;
                                        if (num2 != null) {
                                            int intValue = num2.intValue();
                                            SpannableString spannableString = new SpannableString(getTitle());
                                            spannableString.setSpan(new ForegroundColorSpan(intValue), 0, spannableString.length(), 33);
                                            setTitle(spannableString);
                                        }
                                        CropImageOptions cropImageOptions8 = this.purple;
                                        if (cropImageOptions8 != null) {
                                            Integer num3 = cropImageOptions8.f3648h0;
                                            if (num3 != null) {
                                                int intValue2 = num3.intValue();
                                                try {
                                                    Drawable drawable = getDrawable(R.drawable.ic_arrow_back_24);
                                                    if (drawable != null) {
                                                        drawable.setColorFilter(new PorterDuffColorFilter(intValue2, PorterDuff.Mode.SRC_ATOP));
                                                    }
                                                    supportActionBar.romeo(drawable);
                                                } catch (Exception e5) {
                                                    e5.printStackTrace();
                                                }
                                            }
                                        } else {
                                            Intrinsics.lima(str);
                                            throw th;
                                        }
                                    } else {
                                        Intrinsics.lima(str);
                                        throw th;
                                    }
                                } else {
                                    Intrinsics.lima(str);
                                    throw th;
                                }
                            } else {
                                Intrinsics.lima(str);
                                throw th;
                            }
                        }
                        ai onBackPressedDispatcher = getOnBackPressedDispatcher();
                        Intrinsics.delta(onBackPressedDispatcher, "onBackPressedDispatcher");
                        AbstractC3007i3.alpha(onBackPressedDispatcher, th, new p(24, this), 3);
                        return;
                    }
                    Throwable th2 = th;
                    Intrinsics.lima("binding");
                    throw th2;
                }
                Throwable th3 = th;
                Intrinsics.lima(str);
                throw th3;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        throw new NullPointerException("rootView");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        CropImageOptions cropImageOptions;
        CropImageOptions cropImageOptions2;
        Intrinsics.echo(menu, "menu");
        CropImageOptions cropImageOptions3 = this.purple;
        if (cropImageOptions3 != null) {
            if (!cropImageOptions3.f3631X) {
                getMenuInflater().inflate(R.menu.crop_image_menu, menu);
                CropImageOptions cropImageOptions4 = this.purple;
                if (cropImageOptions4 != null) {
                    if (!cropImageOptions4.f3624P) {
                        menu.removeItem(R.id.ic_rotate_left_24);
                        menu.removeItem(R.id.ic_rotate_right_24);
                    } else if (cropImageOptions4.f3625R) {
                        menu.findItem(R.id.ic_rotate_left_24).setVisible(true);
                    }
                    CropImageOptions cropImageOptions5 = this.purple;
                    if (cropImageOptions5 != null) {
                        if (!cropImageOptions5.Q) {
                            menu.removeItem(R.id.ic_flip_24);
                        }
                        CropImageOptions cropImageOptions6 = this.purple;
                        if (cropImageOptions6 != null) {
                            if (cropImageOptions6.f3629V != null) {
                                MenuItem findItem = menu.findItem(R.id.crop_image_menu_crop);
                                CropImageOptions cropImageOptions7 = this.purple;
                                if (cropImageOptions7 != null) {
                                    findItem.setTitle(cropImageOptions7.f3629V);
                                } else {
                                    Intrinsics.lima("cropImageOptions");
                                    throw null;
                                }
                            }
                            try {
                                cropImageOptions2 = this.purple;
                            } catch (Exception e) {
                                e = e;
                            }
                            if (cropImageOptions2 != null) {
                                int i4 = cropImageOptions2.f3630W;
                                if (i4 != 0) {
                                    drawable = getDrawable(i4);
                                    try {
                                        menu.findItem(R.id.crop_image_menu_crop).setIcon(drawable);
                                    } catch (Exception e4) {
                                        e = e4;
                                        Log.w("AIC", "Failed to read menu crop drawable", e);
                                        cropImageOptions = this.purple;
                                        if (cropImageOptions != null) {
                                        }
                                    }
                                } else {
                                    drawable = null;
                                }
                                cropImageOptions = this.purple;
                                if (cropImageOptions != null) {
                                    int i5 = cropImageOptions.f3614F;
                                    if (i5 != 0) {
                                        hotel(menu, R.id.ic_rotate_left_24, i5);
                                        CropImageOptions cropImageOptions8 = this.purple;
                                        if (cropImageOptions8 != null) {
                                            hotel(menu, R.id.ic_rotate_right_24, cropImageOptions8.f3614F);
                                            CropImageOptions cropImageOptions9 = this.purple;
                                            if (cropImageOptions9 != null) {
                                                hotel(menu, R.id.ic_flip_24, cropImageOptions9.f3614F);
                                                if (drawable != null) {
                                                    CropImageOptions cropImageOptions10 = this.purple;
                                                    if (cropImageOptions10 != null) {
                                                        hotel(menu, R.id.crop_image_menu_crop, cropImageOptions10.f3614F);
                                                    } else {
                                                        Intrinsics.lima("cropImageOptions");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                Intrinsics.lima("cropImageOptions");
                                                throw null;
                                            }
                                        } else {
                                            Intrinsics.lima("cropImageOptions");
                                            throw null;
                                        }
                                    }
                                    CropImageOptions cropImageOptions11 = this.purple;
                                    if (cropImageOptions11 != null) {
                                        Integer num = cropImageOptions11.f3615G;
                                        if (num != null) {
                                            int intValue = num.intValue();
                                            Iterator it = CollectionsKt.listOf(Integer.valueOf(R.id.ic_rotate_left_24), Integer.valueOf(R.id.ic_rotate_right_24), Integer.valueOf(R.id.ic_flip_24), Integer.valueOf(R.id.ic_flip_24_horizontally), Integer.valueOf(R.id.ic_flip_24_vertically), Integer.valueOf(R.id.crop_image_menu_crop)).iterator();
                                            while (it.hasNext()) {
                                                MenuItem findItem2 = menu.findItem(((Number) it.next()).intValue());
                                                CharSequence title = findItem2.getTitle();
                                                if (title != null && (!StringsKt.gray(title))) {
                                                    try {
                                                        SpannableString spannableString = new SpannableString(title);
                                                        spannableString.setSpan(new ForegroundColorSpan(intValue), 0, spannableString.length(), 33);
                                                        findItem2.setTitle(spannableString);
                                                    } catch (Exception e5) {
                                                        Log.w("AIC", "Failed to update menu item color", e5);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        Intrinsics.lima("cropImageOptions");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.lima("cropImageOptions");
                                    throw null;
                                }
                            } else {
                                try {
                                    Intrinsics.lima("cropImageOptions");
                                    throw null;
                                } catch (Exception e10) {
                                    e = e10;
                                    drawable = null;
                                    Log.w("AIC", "Failed to read menu crop drawable", e);
                                    cropImageOptions = this.purple;
                                    if (cropImageOptions != null) {
                                    }
                                }
                            }
                        } else {
                            Intrinsics.lima("cropImageOptions");
                            throw null;
                        }
                    } else {
                        Intrinsics.lima("cropImageOptions");
                        throw null;
                    }
                } else {
                    Intrinsics.lima("cropImageOptions");
                    throw null;
                }
            }
            return true;
        }
        Intrinsics.lima("cropImageOptions");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.echo(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.crop_image_menu_crop) {
            echo();
            return true;
        }
        if (itemId == R.id.ic_rotate_left_24) {
            CropImageOptions cropImageOptions = this.purple;
            if (cropImageOptions != null) {
                int i4 = -cropImageOptions.f3626S;
                CropImageView cropImageView = this.red;
                if (cropImageView != null) {
                    cropImageView.echo(i4);
                    return true;
                }
            } else {
                Intrinsics.lima("cropImageOptions");
                throw null;
            }
        } else if (itemId == R.id.ic_rotate_right_24) {
            CropImageOptions cropImageOptions2 = this.purple;
            if (cropImageOptions2 != null) {
                int i5 = cropImageOptions2.f3626S;
                CropImageView cropImageView2 = this.red;
                if (cropImageView2 != null) {
                    cropImageView2.echo(i5);
                    return true;
                }
            } else {
                Intrinsics.lima("cropImageOptions");
                throw null;
            }
        } else if (itemId == R.id.ic_flip_24_horizontally) {
            CropImageView cropImageView3 = this.red;
            if (cropImageView3 != null) {
                cropImageView3.e = !cropImageView3.e;
                cropImageView3.alpha(cropImageView3.getWidth(), cropImageView3.getHeight(), true, false);
                return true;
            }
        } else if (itemId == R.id.ic_flip_24_vertically) {
            CropImageView cropImageView4 = this.red;
            if (cropImageView4 != null) {
                cropImageView4.f3676f = !cropImageView4.f3676f;
                cropImageView4.alpha(cropImageView4.getWidth(), cropImageView4.getHeight(), true, false);
            }
        } else {
            if (itemId == 16908332) {
                golf();
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override // ae.o, f1.i, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.echo(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("bundle_key_tmp_uri", String.valueOf(this.teal));
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onStart() {
        super.onStart();
        CropImageView cropImageView = this.red;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.red;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onStop() {
        super.onStop();
        CropImageView cropImageView = this.red;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.red;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }
}
