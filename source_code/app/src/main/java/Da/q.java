package Da;

import B9.ab;
import B9.ae;
import Cb.ad;
import a4.s;
import a4.t;
import a4.w;
import a4.y;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.canhub.cropper.CropImageOptions;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import s6.AbstractC2716m6;
import s6.L5;
import y3.AbstractC3396b;
import z3.C3462a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDa/q;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class q extends c {
    public ae B;
    public L5 C;

    /* renamed from: E, reason: collision with root package name */
    public final ah.b f952E;

    /* renamed from: F, reason: collision with root package name */
    public final ah.b f953F;

    /* renamed from: G, reason: collision with root package name */
    public final ah.b f954G;

    /* renamed from: v, reason: collision with root package name */
    public String f956v;

    /* renamed from: w, reason: collision with root package name */
    public String f957w;

    /* renamed from: x, reason: collision with root package name */
    public String f958x;

    /* renamed from: y, reason: collision with root package name */
    public String f959y;

    /* renamed from: u, reason: collision with root package name */
    public int f955u = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f960z = -1;
    public final az A = new au(new HashMap());

    /* renamed from: D, reason: collision with root package name */
    public final ab f951D = new ab(u.alpha.bravo(AuthViewModel.class), new p(this, 0), new p(this, 2), new p(this, 1));

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public q() {
        final int i4 = 0;
        ah.b registerForActivityResult = registerForActivityResult(new s(0), new ah.a(this) { // from class: Da.j
            public final /* synthetic */ q purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                boolean z2;
                long j5;
                q qVar = this.purple;
                String str = null;
                switch (i4) {
                    case 0:
                        w result = (w) obj;
                        Intrinsics.echo(result, "result");
                        Exception exc = result.red;
                        if (exc == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Uri uri = result.purple;
                            if (uri != null) {
                                Cursor query = qVar.requireContext().getContentResolver().query(uri, null, null, null, null);
                                if (query != null) {
                                    try {
                                        int columnIndex = query.getColumnIndex("_size");
                                        if (query.moveToFirst()) {
                                            j5 = query.getLong(columnIndex);
                                        } else {
                                            j5 = 0;
                                        }
                                        query.close();
                                        if (j5 != 0 && j5 <= 2097152) {
                                            Set set = AbstractC3396b.alpha;
                                            Context requireContext = qVar.requireContext();
                                            Intrinsics.delta(requireContext, "requireContext(...)");
                                            String type = requireContext.getContentResolver().getType(uri);
                                            if (type == null || AbstractC3396b.alpha.contains(type)) {
                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                options.inJustDecodeBounds = true;
                                                try {
                                                    InputStream openInputStream = requireContext.getContentResolver().openInputStream(uri);
                                                    if (openInputStream != null) {
                                                        try {
                                                            BitmapFactory.decodeStream(openInputStream, null, options);
                                                            openInputStream.close();
                                                        } finally {
                                                        }
                                                    }
                                                    if (options.outWidth >= 400 && options.outHeight >= 400) {
                                                        File file = new File(qVar.requireContext().getCacheDir(), com.google.android.material.datepicker.j.kilo("samurai_", System.currentTimeMillis(), ".jpg"));
                                                        file.createNewFile();
                                                        Context requireContext2 = qVar.requireContext();
                                                        Intrinsics.delta(requireContext2, "requireContext(...)");
                                                        String uri2 = uri.toString();
                                                        Intrinsics.delta(uri2, "toString(...)");
                                                        L9.d.crimson(requireContext2, uri2, new ad(2, file, qVar), 512);
                                                        return;
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            AbstractC2716m6.alpha(query, th);
                                            throw th2;
                                        }
                                    }
                                }
                                Context requireContext3 = qVar.requireContext();
                                Intrinsics.delta(requireContext3, "requireContext(...)");
                                String string = qVar.getString(R.string.invalid_image_file);
                                Intrinsics.delta(string, "getString(...)");
                                L9.d.pink(requireContext3, string);
                                qVar.bronze(qVar.f960z);
                                return;
                            }
                            return;
                        }
                        if (exc != null) {
                            str = exc.getMessage();
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (!StringsKt.beige(str, "canceled", true) && !StringsKt.beige(str, "cancelled", true) && !StringsKt.gray(str)) {
                            Context requireContext4 = qVar.requireContext();
                            Intrinsics.delta(requireContext4, "requireContext(...)");
                            L9.d.pink(requireContext4, str);
                            return;
                        }
                        return;
                    case 1:
                        Boolean granted = (Boolean) obj;
                        Intrinsics.echo(granted, "granted");
                        C3462a.alpha("UPLOAD_DOC", 12, "Camera permission result received. Granted=" + granted, null);
                        L5 l52 = qVar.C;
                        if (l52 != null) {
                            l52.alpha(granted.booleanValue());
                            return;
                        }
                        return;
                    default:
                        Boolean granted2 = (Boolean) obj;
                        Intrinsics.echo(granted2, "granted");
                        C3462a.alpha("UPLOAD_DOC", 12, "Gallery permission result received. Granted=" + granted2, null);
                        L5 l53 = qVar.C;
                        if (l53 != null) {
                            l53.bravo(granted2.booleanValue());
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.delta(registerForActivityResult, "registerForActivityResult(...)");
        this.f952E = registerForActivityResult;
        final int i5 = 1;
        ah.b registerForActivityResult2 = registerForActivityResult(new s(4), new ah.a(this) { // from class: Da.j
            public final /* synthetic */ q purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                boolean z2;
                long j5;
                q qVar = this.purple;
                String str = null;
                switch (i5) {
                    case 0:
                        w result = (w) obj;
                        Intrinsics.echo(result, "result");
                        Exception exc = result.red;
                        if (exc == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Uri uri = result.purple;
                            if (uri != null) {
                                Cursor query = qVar.requireContext().getContentResolver().query(uri, null, null, null, null);
                                if (query != null) {
                                    try {
                                        int columnIndex = query.getColumnIndex("_size");
                                        if (query.moveToFirst()) {
                                            j5 = query.getLong(columnIndex);
                                        } else {
                                            j5 = 0;
                                        }
                                        query.close();
                                        if (j5 != 0 && j5 <= 2097152) {
                                            Set set = AbstractC3396b.alpha;
                                            Context requireContext = qVar.requireContext();
                                            Intrinsics.delta(requireContext, "requireContext(...)");
                                            String type = requireContext.getContentResolver().getType(uri);
                                            if (type == null || AbstractC3396b.alpha.contains(type)) {
                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                options.inJustDecodeBounds = true;
                                                try {
                                                    InputStream openInputStream = requireContext.getContentResolver().openInputStream(uri);
                                                    if (openInputStream != null) {
                                                        try {
                                                            BitmapFactory.decodeStream(openInputStream, null, options);
                                                            openInputStream.close();
                                                        } finally {
                                                        }
                                                    }
                                                    if (options.outWidth >= 400 && options.outHeight >= 400) {
                                                        File file = new File(qVar.requireContext().getCacheDir(), com.google.android.material.datepicker.j.kilo("samurai_", System.currentTimeMillis(), ".jpg"));
                                                        file.createNewFile();
                                                        Context requireContext2 = qVar.requireContext();
                                                        Intrinsics.delta(requireContext2, "requireContext(...)");
                                                        String uri2 = uri.toString();
                                                        Intrinsics.delta(uri2, "toString(...)");
                                                        L9.d.crimson(requireContext2, uri2, new ad(2, file, qVar), 512);
                                                        return;
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            AbstractC2716m6.alpha(query, th);
                                            throw th2;
                                        }
                                    }
                                }
                                Context requireContext3 = qVar.requireContext();
                                Intrinsics.delta(requireContext3, "requireContext(...)");
                                String string = qVar.getString(R.string.invalid_image_file);
                                Intrinsics.delta(string, "getString(...)");
                                L9.d.pink(requireContext3, string);
                                qVar.bronze(qVar.f960z);
                                return;
                            }
                            return;
                        }
                        if (exc != null) {
                            str = exc.getMessage();
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (!StringsKt.beige(str, "canceled", true) && !StringsKt.beige(str, "cancelled", true) && !StringsKt.gray(str)) {
                            Context requireContext4 = qVar.requireContext();
                            Intrinsics.delta(requireContext4, "requireContext(...)");
                            L9.d.pink(requireContext4, str);
                            return;
                        }
                        return;
                    case 1:
                        Boolean granted = (Boolean) obj;
                        Intrinsics.echo(granted, "granted");
                        C3462a.alpha("UPLOAD_DOC", 12, "Camera permission result received. Granted=" + granted, null);
                        L5 l52 = qVar.C;
                        if (l52 != null) {
                            l52.alpha(granted.booleanValue());
                            return;
                        }
                        return;
                    default:
                        Boolean granted2 = (Boolean) obj;
                        Intrinsics.echo(granted2, "granted");
                        C3462a.alpha("UPLOAD_DOC", 12, "Gallery permission result received. Granted=" + granted2, null);
                        L5 l53 = qVar.C;
                        if (l53 != null) {
                            l53.bravo(granted2.booleanValue());
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.delta(registerForActivityResult2, "registerForActivityResult(...)");
        this.f953F = registerForActivityResult2;
        final int i10 = 2;
        ah.b registerForActivityResult3 = registerForActivityResult(new s(4), new ah.a(this) { // from class: Da.j
            public final /* synthetic */ q purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                boolean z2;
                long j5;
                q qVar = this.purple;
                String str = null;
                switch (i10) {
                    case 0:
                        w result = (w) obj;
                        Intrinsics.echo(result, "result");
                        Exception exc = result.red;
                        if (exc == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Uri uri = result.purple;
                            if (uri != null) {
                                Cursor query = qVar.requireContext().getContentResolver().query(uri, null, null, null, null);
                                if (query != null) {
                                    try {
                                        int columnIndex = query.getColumnIndex("_size");
                                        if (query.moveToFirst()) {
                                            j5 = query.getLong(columnIndex);
                                        } else {
                                            j5 = 0;
                                        }
                                        query.close();
                                        if (j5 != 0 && j5 <= 2097152) {
                                            Set set = AbstractC3396b.alpha;
                                            Context requireContext = qVar.requireContext();
                                            Intrinsics.delta(requireContext, "requireContext(...)");
                                            String type = requireContext.getContentResolver().getType(uri);
                                            if (type == null || AbstractC3396b.alpha.contains(type)) {
                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                options.inJustDecodeBounds = true;
                                                try {
                                                    InputStream openInputStream = requireContext.getContentResolver().openInputStream(uri);
                                                    if (openInputStream != null) {
                                                        try {
                                                            BitmapFactory.decodeStream(openInputStream, null, options);
                                                            openInputStream.close();
                                                        } finally {
                                                        }
                                                    }
                                                    if (options.outWidth >= 400 && options.outHeight >= 400) {
                                                        File file = new File(qVar.requireContext().getCacheDir(), com.google.android.material.datepicker.j.kilo("samurai_", System.currentTimeMillis(), ".jpg"));
                                                        file.createNewFile();
                                                        Context requireContext2 = qVar.requireContext();
                                                        Intrinsics.delta(requireContext2, "requireContext(...)");
                                                        String uri2 = uri.toString();
                                                        Intrinsics.delta(uri2, "toString(...)");
                                                        L9.d.crimson(requireContext2, uri2, new ad(2, file, qVar), 512);
                                                        return;
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            AbstractC2716m6.alpha(query, th);
                                            throw th2;
                                        }
                                    }
                                }
                                Context requireContext3 = qVar.requireContext();
                                Intrinsics.delta(requireContext3, "requireContext(...)");
                                String string = qVar.getString(R.string.invalid_image_file);
                                Intrinsics.delta(string, "getString(...)");
                                L9.d.pink(requireContext3, string);
                                qVar.bronze(qVar.f960z);
                                return;
                            }
                            return;
                        }
                        if (exc != null) {
                            str = exc.getMessage();
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (!StringsKt.beige(str, "canceled", true) && !StringsKt.beige(str, "cancelled", true) && !StringsKt.gray(str)) {
                            Context requireContext4 = qVar.requireContext();
                            Intrinsics.delta(requireContext4, "requireContext(...)");
                            L9.d.pink(requireContext4, str);
                            return;
                        }
                        return;
                    case 1:
                        Boolean granted = (Boolean) obj;
                        Intrinsics.echo(granted, "granted");
                        C3462a.alpha("UPLOAD_DOC", 12, "Camera permission result received. Granted=" + granted, null);
                        L5 l52 = qVar.C;
                        if (l52 != null) {
                            l52.alpha(granted.booleanValue());
                            return;
                        }
                        return;
                    default:
                        Boolean granted2 = (Boolean) obj;
                        Intrinsics.echo(granted2, "granted");
                        C3462a.alpha("UPLOAD_DOC", 12, "Gallery permission result received. Granted=" + granted2, null);
                        L5 l53 = qVar.C;
                        if (l53 != null) {
                            l53.bravo(granted2.booleanValue());
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.delta(registerForActivityResult3, "registerForActivityResult(...)");
        this.f954G = registerForActivityResult3;
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
        ae aeVar = this.B;
        if (aeVar != null) {
            final int i4 = 0;
            aeVar.f330g.setOnClickListener(new View.OnClickListener(this) { // from class: Da.m
                public final /* synthetic */ q purple;

                {
                    this.purple = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5;
                    switch (i4) {
                        case 0:
                            this.purple.juliet();
                            return;
                        default:
                            q qVar = this.purple;
                            K9.a aVar = null;
                            C3462a.alpha("UPLOAD_DOC", 12, "Take photo tapped. docType=" + qVar.f955u, null);
                            int i10 = qVar.f955u;
                            K9.a[] values = K9.a.values();
                            int length = values.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 < length) {
                                    K9.a aVar2 = values[i11];
                                    if (aVar2.alpha == i10) {
                                        aVar = aVar2;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            if (aVar == null) {
                                i5 = -1;
                            } else {
                                i5 = o.$EnumSwitchMapping$0[aVar.ordinal()];
                            }
                            if (i5 != -1) {
                                if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                qVar.bronze(qVar.f955u);
                                return;
                            }
                            return;
                    }
                }
            });
            ae aeVar2 = this.B;
            if (aeVar2 != null) {
                final int i5 = 1;
                aeVar2.f329f.setOnClickListener(new View.OnClickListener(this) { // from class: Da.m
                    public final /* synthetic */ q purple;

                    {
                        this.purple = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i52;
                        switch (i5) {
                            case 0:
                                this.purple.juliet();
                                return;
                            default:
                                q qVar = this.purple;
                                K9.a aVar = null;
                                C3462a.alpha("UPLOAD_DOC", 12, "Take photo tapped. docType=" + qVar.f955u, null);
                                int i10 = qVar.f955u;
                                K9.a[] values = K9.a.values();
                                int length = values.length;
                                int i11 = 0;
                                while (true) {
                                    if (i11 < length) {
                                        K9.a aVar2 = values[i11];
                                        if (aVar2.alpha == i10) {
                                            aVar = aVar2;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                                if (aVar == null) {
                                    i52 = -1;
                                } else {
                                    i52 = o.$EnumSwitchMapping$0[aVar.ordinal()];
                                }
                                if (i52 != -1) {
                                    if (i52 != 1 && i52 != 2 && i52 != 3 && i52 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    qVar.bronze(qVar.f955u);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void bronze(int i4) {
        this.f960z = i4;
        C3462a.alpha("UPLOAD_DOC", 12, "captureImage requestId=" + i4, null);
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        final int i5 = 0;
        Function0 function0 = new Function0(this) { // from class: Da.n
            public final /* synthetic */ q purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                switch (i5) {
                    case 0:
                        C3462a.alpha("UPLOAD_DOC", 12, "Requesting CAMERA permission", null);
                        this.purple.f953F.alpha("android.permission.CAMERA");
                        return Unit.INSTANCE;
                    default:
                        if (Build.VERSION.SDK_INT >= 33) {
                            str = "android.permission.READ_MEDIA_IMAGES";
                        } else {
                            str = "android.permission.READ_EXTERNAL_STORAGE";
                        }
                        C3462a.alpha("UPLOAD_DOC", 12, "Requesting GALLERY permission ".concat(str), null);
                        this.purple.f954G.alpha(str);
                        return Unit.INSTANCE;
                }
            }
        };
        final int i10 = 1;
        Function0 function02 = new Function0(this) { // from class: Da.n
            public final /* synthetic */ q purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                switch (i10) {
                    case 0:
                        C3462a.alpha("UPLOAD_DOC", 12, "Requesting CAMERA permission", null);
                        this.purple.f953F.alpha("android.permission.CAMERA");
                        return Unit.INSTANCE;
                    default:
                        if (Build.VERSION.SDK_INT >= 33) {
                            str = "android.permission.READ_MEDIA_IMAGES";
                        } else {
                            str = "android.permission.READ_EXTERNAL_STORAGE";
                        }
                        C3462a.alpha("UPLOAD_DOC", 12, "Requesting GALLERY permission ".concat(str), null);
                        this.purple.f954G.alpha(str);
                        return Unit.INSTANCE;
                }
            }
        };
        Xd.l lVar = new Xd.l(this) { // from class: Da.k
            public final /* synthetic */ q purple;

            {
                this.purple = this;
            }

            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                int i11;
                switch (i10) {
                    case 0:
                        String which = (String) obj;
                        Function0 onOpen = (Function0) obj2;
                        Intrinsics.echo(which, "which");
                        Intrinsics.echo(onOpen, "onOpen");
                        if (Intrinsics.areEqual(which, "android.permission.CAMERA")) {
                            i11 = R.string.permission_required_msg_camera;
                        } else {
                            i11 = R.string.permission_required_msg_gallery;
                        }
                        C3462a.alpha("UPLOAD_DOC", 12, "Show settings dialog for ".concat(which), null);
                        new AlertDialog.Builder(this.purple.requireContext()).setTitle(R.string.permission_required_title).setMessage(i11).setPositiveButton(R.string.open_settings, new l(onOpen, 0)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                        return Unit.INSTANCE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                        C3462a.alpha("UPLOAD_DOC", 12, "Launching cropper includeCamera=" + booleanValue + " includeGallery=" + booleanValue2, null);
                        CropImageOptions cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, y.purple, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -129, -1);
                        cropImageOptions.purple = booleanValue;
                        cropImageOptions.alpha = booleanValue2;
                        this.purple.f952E.alpha(new t(cropImageOptions));
                        return Unit.INSTANCE;
                }
            }
        };
        final int i11 = 0;
        L5 l52 = new L5(requireContext, function0, function02, lVar, new Xd.l(this) { // from class: Da.k
            public final /* synthetic */ q purple;

            {
                this.purple = this;
            }

            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                int i112;
                switch (i11) {
                    case 0:
                        String which = (String) obj;
                        Function0 onOpen = (Function0) obj2;
                        Intrinsics.echo(which, "which");
                        Intrinsics.echo(onOpen, "onOpen");
                        if (Intrinsics.areEqual(which, "android.permission.CAMERA")) {
                            i112 = R.string.permission_required_msg_camera;
                        } else {
                            i112 = R.string.permission_required_msg_gallery;
                        }
                        C3462a.alpha("UPLOAD_DOC", 12, "Show settings dialog for ".concat(which), null);
                        new AlertDialog.Builder(this.purple.requireContext()).setTitle(R.string.permission_required_title).setMessage(i112).setPositiveButton(R.string.open_settings, new l(onOpen, 0)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                        return Unit.INSTANCE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                        C3462a.alpha("UPLOAD_DOC", 12, "Launching cropper includeCamera=" + booleanValue + " includeGallery=" + booleanValue2, null);
                        CropImageOptions cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, y.purple, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -129, -1);
                        cropImageOptions.purple = booleanValue;
                        cropImageOptions.alpha = booleanValue2;
                        this.purple.f952E.alpha(new t(cropImageOptions));
                        return Unit.INSTANCE;
                }
            }
        });
        this.C = l52;
        l52.charlie();
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f955u = arguments.getInt("arg_doc_type");
            String string = arguments.getString("arg_title", "");
            Intrinsics.delta(string, "getString(...)");
            this.f956v = string;
            String string2 = arguments.getString("arg_desc", "");
            Intrinsics.delta(string2, "getString(...)");
            this.f957w = string2;
            this.f958x = arguments.getString("arg_note1");
            this.f959y = arguments.getString("arg_note2");
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        this.f960z = this.f955u;
        z1.g charlie = z1.d.charlie(inflater, R.layout.bottom_sheet_upload_document, viewGroup, false);
        Intrinsics.delta(charlie, "inflate(...)");
        ae aeVar = (ae) charlie;
        this.B = aeVar;
        View view = aeVar.red;
        Intrinsics.delta(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        View findViewById;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (findViewById = dialog.findViewById(R.id.design_bottom_sheet)) != null) {
            findViewById.getLayoutParams().height = -1;
            BottomSheetBehavior juliet = BottomSheetBehavior.juliet(findViewById);
            juliet.sierra(3);
            juliet.C = true;
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z2;
        int i4;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        amber();
        azure();
        this.A.observe(getViewLifecycleOwner(), new Aa.f(2, new Aa.l(3, this)));
        ae aeVar = this.B;
        if (aeVar != null) {
            String str = this.f956v;
            if (str != null) {
                aeVar.f333j.setText(str);
                ae aeVar2 = this.B;
                if (aeVar2 != null) {
                    String str2 = this.f957w;
                    if (str2 != null) {
                        aeVar2.f334k.setText(str2);
                        ae aeVar3 = this.B;
                        if (aeVar3 != null) {
                            AppCompatTextView tvNote1 = aeVar3.f335l;
                            Intrinsics.delta(tvNote1, "tvNote1");
                            String str3 = this.f958x;
                            int i5 = 0;
                            if (str3 != null && !StringsKt.gray(str3)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (!z2) {
                                i4 = 0;
                            } else {
                                i4 = 8;
                            }
                            tvNote1.setVisibility(i4);
                            ae aeVar4 = this.B;
                            if (aeVar4 != null) {
                                String str4 = this.f958x;
                                String str5 = "";
                                if (str4 == null) {
                                    str4 = "";
                                }
                                aeVar4.f335l.setText(str4);
                                ae aeVar5 = this.B;
                                if (aeVar5 != null) {
                                    AppCompatTextView tvNote2 = aeVar5.f336m;
                                    Intrinsics.delta(tvNote2, "tvNote2");
                                    String str6 = this.f959y;
                                    if (str6 == null || StringsKt.gray(str6)) {
                                        i5 = 8;
                                    }
                                    tvNote2.setVisibility(i5);
                                    ae aeVar6 = this.B;
                                    if (aeVar6 != null) {
                                        String str7 = this.f959y;
                                        if (str7 != null) {
                                            str5 = str7;
                                        }
                                        aeVar6.f336m.setText(str5);
                                        return;
                                    }
                                    Intrinsics.lima("binding");
                                    throw null;
                                }
                                Intrinsics.lima("binding");
                                throw null;
                            }
                            Intrinsics.lima("binding");
                            throw null;
                        }
                        Intrinsics.lima("binding");
                        throw null;
                    }
                    Intrinsics.lima("descriptionText");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("titleText");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
