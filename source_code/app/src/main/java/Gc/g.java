package Gc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.an;
import com.canhub.cropper.CropImageOptions;
import delivery.samurai.android.R;
import f1.AbstractC1683c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2707l6;
import t0.A0;
import x9.AbstractC3307a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGc/g;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g extends AbstractC3307a {

    /* renamed from: r, reason: collision with root package name */
    public Function1 f1375r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1376s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1377t;

    /* renamed from: u, reason: collision with root package name */
    public final ah.b f1378u;

    /* renamed from: v, reason: collision with root package name */
    public final ah.b f1379v;

    /* renamed from: w, reason: collision with root package name */
    public final ah.b f1380w;

    public g() {
        final int i4 = 0;
        ah.b registerForActivityResult = registerForActivityResult(new a4.s(0), new ah.a(this) { // from class: Gc.d
            public final /* synthetic */ g purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                Uri uri;
                String str;
                switch (i4) {
                    case 0:
                        a4.w result = (a4.w) obj;
                        Intrinsics.echo(result, "result");
                        if (result.red == null && (uri = result.purple) != null) {
                            g gVar = this.purple;
                            try {
                                Context requireContext = gVar.requireContext();
                                Intrinsics.delta(requireContext, "requireContext(...)");
                                File file = new File(requireContext.getCacheDir(), "samurai_attachment_" + System.currentTimeMillis() + ".jpg");
                                InputStream openInputStream = requireContext.getContentResolver().openInputStream(uri);
                                if (openInputStream != null) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            AbstractC2707l6.echo(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            openInputStream.close();
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                                gVar.juliet();
                                new Handler(Looper.getMainLooper()).postDelayed(new A8.g(3, gVar, file), 300L);
                                return;
                            } catch (Exception unused) {
                                String string = gVar.getString(R.string.image_load_failed);
                                Intrinsics.delta(string, "getString(...)");
                                gVar.black(string);
                                return;
                            }
                        }
                        return;
                    case 1:
                        Boolean granted = (Boolean) obj;
                        Intrinsics.echo(granted, "granted");
                        boolean booleanValue = granted.booleanValue();
                        g gVar2 = this.purple;
                        if (booleanValue) {
                            gVar2.blue(true, false);
                            return;
                        } else {
                            if (!AbstractC1683c.foxtrot(gVar2.requireActivity(), "android.permission.CAMERA")) {
                                gVar2.bronze("android.permission.CAMERA");
                                return;
                            }
                            String string2 = gVar2.getString(R.string.camera_permission_denied_try_again);
                            Intrinsics.delta(string2, "getString(...)");
                            gVar2.black(string2);
                            return;
                        }
                    default:
                        Boolean granted2 = (Boolean) obj;
                        Intrinsics.echo(granted2, "granted");
                        boolean booleanValue2 = granted2.booleanValue();
                        g gVar3 = this.purple;
                        if (booleanValue2) {
                            gVar3.blue(false, true);
                            return;
                        }
                        an requireActivity = gVar3.requireActivity();
                        int i5 = Build.VERSION.SDK_INT;
                        String str2 = "android.permission.READ_EXTERNAL_STORAGE";
                        if (i5 < 33) {
                            str = "android.permission.READ_EXTERNAL_STORAGE";
                        } else {
                            str = "android.permission.READ_MEDIA_IMAGES";
                        }
                        if (!AbstractC1683c.foxtrot(requireActivity, str)) {
                            if (i5 >= 33) {
                                str2 = "android.permission.READ_MEDIA_IMAGES";
                            }
                            gVar3.bronze(str2);
                            return;
                        } else {
                            String string3 = gVar3.getString(R.string.camera_permission_denied_try_again);
                            Intrinsics.delta(string3, "getString(...)");
                            gVar3.black(string3);
                            return;
                        }
                }
            }
        });
        Intrinsics.delta(registerForActivityResult, "registerForActivityResult(...)");
        this.f1378u = registerForActivityResult;
        final int i5 = 1;
        ah.b registerForActivityResult2 = registerForActivityResult(new a4.s(4), new ah.a(this) { // from class: Gc.d
            public final /* synthetic */ g purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                Uri uri;
                String str;
                switch (i5) {
                    case 0:
                        a4.w result = (a4.w) obj;
                        Intrinsics.echo(result, "result");
                        if (result.red == null && (uri = result.purple) != null) {
                            g gVar = this.purple;
                            try {
                                Context requireContext = gVar.requireContext();
                                Intrinsics.delta(requireContext, "requireContext(...)");
                                File file = new File(requireContext.getCacheDir(), "samurai_attachment_" + System.currentTimeMillis() + ".jpg");
                                InputStream openInputStream = requireContext.getContentResolver().openInputStream(uri);
                                if (openInputStream != null) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            AbstractC2707l6.echo(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            openInputStream.close();
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                                gVar.juliet();
                                new Handler(Looper.getMainLooper()).postDelayed(new A8.g(3, gVar, file), 300L);
                                return;
                            } catch (Exception unused) {
                                String string = gVar.getString(R.string.image_load_failed);
                                Intrinsics.delta(string, "getString(...)");
                                gVar.black(string);
                                return;
                            }
                        }
                        return;
                    case 1:
                        Boolean granted = (Boolean) obj;
                        Intrinsics.echo(granted, "granted");
                        boolean booleanValue = granted.booleanValue();
                        g gVar2 = this.purple;
                        if (booleanValue) {
                            gVar2.blue(true, false);
                            return;
                        } else {
                            if (!AbstractC1683c.foxtrot(gVar2.requireActivity(), "android.permission.CAMERA")) {
                                gVar2.bronze("android.permission.CAMERA");
                                return;
                            }
                            String string2 = gVar2.getString(R.string.camera_permission_denied_try_again);
                            Intrinsics.delta(string2, "getString(...)");
                            gVar2.black(string2);
                            return;
                        }
                    default:
                        Boolean granted2 = (Boolean) obj;
                        Intrinsics.echo(granted2, "granted");
                        boolean booleanValue2 = granted2.booleanValue();
                        g gVar3 = this.purple;
                        if (booleanValue2) {
                            gVar3.blue(false, true);
                            return;
                        }
                        an requireActivity = gVar3.requireActivity();
                        int i52 = Build.VERSION.SDK_INT;
                        String str2 = "android.permission.READ_EXTERNAL_STORAGE";
                        if (i52 < 33) {
                            str = "android.permission.READ_EXTERNAL_STORAGE";
                        } else {
                            str = "android.permission.READ_MEDIA_IMAGES";
                        }
                        if (!AbstractC1683c.foxtrot(requireActivity, str)) {
                            if (i52 >= 33) {
                                str2 = "android.permission.READ_MEDIA_IMAGES";
                            }
                            gVar3.bronze(str2);
                            return;
                        } else {
                            String string3 = gVar3.getString(R.string.camera_permission_denied_try_again);
                            Intrinsics.delta(string3, "getString(...)");
                            gVar3.black(string3);
                            return;
                        }
                }
            }
        });
        Intrinsics.delta(registerForActivityResult2, "registerForActivityResult(...)");
        this.f1379v = registerForActivityResult2;
        final int i10 = 2;
        ah.b registerForActivityResult3 = registerForActivityResult(new a4.s(4), new ah.a(this) { // from class: Gc.d
            public final /* synthetic */ g purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                Uri uri;
                String str;
                switch (i10) {
                    case 0:
                        a4.w result = (a4.w) obj;
                        Intrinsics.echo(result, "result");
                        if (result.red == null && (uri = result.purple) != null) {
                            g gVar = this.purple;
                            try {
                                Context requireContext = gVar.requireContext();
                                Intrinsics.delta(requireContext, "requireContext(...)");
                                File file = new File(requireContext.getCacheDir(), "samurai_attachment_" + System.currentTimeMillis() + ".jpg");
                                InputStream openInputStream = requireContext.getContentResolver().openInputStream(uri);
                                if (openInputStream != null) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            AbstractC2707l6.echo(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            openInputStream.close();
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                                gVar.juliet();
                                new Handler(Looper.getMainLooper()).postDelayed(new A8.g(3, gVar, file), 300L);
                                return;
                            } catch (Exception unused) {
                                String string = gVar.getString(R.string.image_load_failed);
                                Intrinsics.delta(string, "getString(...)");
                                gVar.black(string);
                                return;
                            }
                        }
                        return;
                    case 1:
                        Boolean granted = (Boolean) obj;
                        Intrinsics.echo(granted, "granted");
                        boolean booleanValue = granted.booleanValue();
                        g gVar2 = this.purple;
                        if (booleanValue) {
                            gVar2.blue(true, false);
                            return;
                        } else {
                            if (!AbstractC1683c.foxtrot(gVar2.requireActivity(), "android.permission.CAMERA")) {
                                gVar2.bronze("android.permission.CAMERA");
                                return;
                            }
                            String string2 = gVar2.getString(R.string.camera_permission_denied_try_again);
                            Intrinsics.delta(string2, "getString(...)");
                            gVar2.black(string2);
                            return;
                        }
                    default:
                        Boolean granted2 = (Boolean) obj;
                        Intrinsics.echo(granted2, "granted");
                        boolean booleanValue2 = granted2.booleanValue();
                        g gVar3 = this.purple;
                        if (booleanValue2) {
                            gVar3.blue(false, true);
                            return;
                        }
                        an requireActivity = gVar3.requireActivity();
                        int i52 = Build.VERSION.SDK_INT;
                        String str2 = "android.permission.READ_EXTERNAL_STORAGE";
                        if (i52 < 33) {
                            str = "android.permission.READ_EXTERNAL_STORAGE";
                        } else {
                            str = "android.permission.READ_MEDIA_IMAGES";
                        }
                        if (!AbstractC1683c.foxtrot(requireActivity, str)) {
                            if (i52 >= 33) {
                                str2 = "android.permission.READ_MEDIA_IMAGES";
                            }
                            gVar3.bronze(str2);
                            return;
                        } else {
                            String string3 = gVar3.getString(R.string.camera_permission_denied_try_again);
                            Intrinsics.delta(string3, "getString(...)");
                            gVar3.black(string3);
                            return;
                        }
                }
            }
        });
        Intrinsics.delta(registerForActivityResult3, "registerForActivityResult(...)");
        this.f1380w = registerForActivityResult3;
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final void blue(boolean z2, boolean z10) {
        CropImageOptions cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, a4.y.purple, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -129, -1);
        cropImageOptions.purple = z2;
        cropImageOptions.alpha = z10;
        this.f1378u.alpha(new a4.t(cropImageOptions));
    }

    public final void bronze(String str) {
        int i4;
        if (!isAdded()) {
            return;
        }
        if (Intrinsics.areEqual(str, "android.permission.CAMERA")) {
            i4 = R.string.permission_required_msg_camera;
        } else {
            i4 = R.string.permission_required_msg_gallery;
        }
        new AlertDialog.Builder(requireContext()).setTitle(R.string.permission_required_title).setMessage(i4).setPositiveButton(R.string.open_settings, new e(0, this)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f1376s = arguments.getBoolean("show_gallery", false);
            this.f1377t = arguments.getBoolean("show_camera", false);
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(A0.alpha);
        composeView.setContent(new P.d(new Ac.k(6, this), 1267078960, true));
        return composeView;
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        amber();
    }
}
