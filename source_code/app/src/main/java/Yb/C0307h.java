package Yb;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C0564b;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.FileProvider;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import f1.AbstractC1683c;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYb/h;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: Yb.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0307h extends at {
    public File A;
    public File B;
    public boolean C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2412D;

    /* renamed from: E, reason: collision with root package name */
    public vf.Y f2413E;

    /* renamed from: F, reason: collision with root package name */
    public File f2414F;

    /* renamed from: G, reason: collision with root package name */
    public final ah.b f2415G;

    /* renamed from: H, reason: collision with root package name */
    public final ah.b f2416H;

    /* renamed from: u, reason: collision with root package name */
    public E9.b f2417u;

    /* renamed from: v, reason: collision with root package name */
    public Function1 f2418v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.compose.runtime.ax f2419w = C0564b.zulu(null);

    /* renamed from: x, reason: collision with root package name */
    public boolean f2420x;

    /* renamed from: y, reason: collision with root package name */
    public File f2421y;

    /* renamed from: z, reason: collision with root package name */
    public File f2422z;

    public C0307h() {
        final int i4 = 0;
        ah.b registerForActivityResult = registerForActivityResult(new a4.s(7), new ah.a(this) { // from class: Yb.a
            public final /* synthetic */ C0307h purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                Uri uriForFile;
                switch (i4) {
                    case 0:
                        Boolean success = (Boolean) obj;
                        Intrinsics.echo(success, "success");
                        C0307h c0307h = this.purple;
                        File file = c0307h.f2421y;
                        if (file != null) {
                            if (!success.booleanValue() || !file.exists()) {
                                file = null;
                            }
                            if (file != null) {
                                Intrinsics.delta(c0307h.requireContext(), "requireContext(...)");
                                Intrinsics.delta(c0307h.requireContext(), "requireContext(...)");
                                I9.b.echo(file, "camera", "delivery_proof");
                                if (c0307h.isAdded()) {
                                    Intrinsics.delta(c0307h.requireContext(), "requireContext(...)");
                                    Intrinsics.delta(c0307h.requireContext(), "requireContext(...)");
                                    vf.Y y10 = c0307h.f2413E;
                                    if (y10 != null) {
                                        y10.foxtrot(null);
                                    }
                                    Context requireContext = c0307h.requireContext();
                                    Intrinsics.delta(requireContext, "requireContext(...)");
                                    c0307h.f2414F = file;
                                    androidx.lifecycle.al viewLifecycleOwner = c0307h.getViewLifecycleOwner();
                                    Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                    c0307h.f2413E = vf.ad.zulu(androidx.lifecycle.T.foxtrot(viewLifecycleOwner), null, null, new C0301e(c0307h, file, requireContext, null), 3);
                                    return;
                                }
                                return;
                            }
                        }
                        String string = c0307h.getString(R.string.image_capture_failed);
                        Intrinsics.delta(string, "getString(...)");
                        c0307h.black(string);
                        return;
                    default:
                        Map result = (Map) obj;
                        Intrinsics.echo(result, "result");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : result.entrySet()) {
                            if (!((Boolean) entry.getValue()).booleanValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set keySet = linkedHashMap.keySet();
                        boolean isEmpty = keySet.isEmpty();
                        C0307h c0307h2 = this.purple;
                        if (isEmpty) {
                            File file2 = new File(c0307h2.requireContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES), ao.ad.gray("JPEG_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()), ".jpg"));
                            Intrinsics.delta(c0307h2.requireContext(), "requireContext(...)");
                            File file3 = c0307h2.f2422z;
                            if (file3 == null || c0307h2.C) {
                                file3 = null;
                            }
                            c0307h2.B = file3;
                            c0307h2.A = null;
                            c0307h2.f2422z = null;
                            c0307h2.C = false;
                            c0307h2.f2414F = null;
                            ((androidx.compose.runtime.t0) c0307h2.f2419w).setValue(null);
                            String crimson = androidx.appcompat.widget.P0.crimson(c0307h2.requireContext().getPackageName(), ".provider");
                            try {
                                uriForFile = FileProvider.getUriForFile(c0307h2.requireContext(), crimson, file2);
                            } catch (IllegalArgumentException unused) {
                                File file4 = new File(c0307h2.requireContext().getCacheDir(), file2.getName());
                                try {
                                    uriForFile = FileProvider.getUriForFile(c0307h2.requireContext(), crimson, file4);
                                    file2 = file4;
                                } catch (IllegalArgumentException unused2) {
                                    String string2 = c0307h2.getString(R.string.storage_unavailable);
                                    Intrinsics.delta(string2, "getString(...)");
                                    c0307h2.black(string2);
                                    return;
                                }
                            }
                            c0307h2.f2421y = file2;
                            if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(c0307h2.requireContext().getPackageManager()) != null) {
                                c0307h2.f2415G.alpha(uriForFile);
                                return;
                            }
                            String string3 = c0307h2.getString(R.string.no_camera_app_found);
                            Intrinsics.delta(string3, "getString(...)");
                            c0307h2.black(string3);
                            return;
                        }
                        Set set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                if (!AbstractC1683c.foxtrot(c0307h2.requireActivity(), (String) it.next())) {
                                    c0307h2.f2420x = false;
                                    new AlertDialog.Builder(c0307h2.requireContext()).setTitle(R.string.permission_required_title).setMessage(R.string.permission_required_msg_camera).setPositiveButton(R.string.open_settings, new Gc.e(3, c0307h2)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                                    return;
                                }
                            }
                        }
                        c0307h2.f2420x = false;
                        String string4 = c0307h2.getString(R.string.camera_permission_denied_try_again);
                        Intrinsics.delta(string4, "getString(...)");
                        c0307h2.black(string4);
                        return;
                }
            }
        });
        Intrinsics.delta(registerForActivityResult, "registerForActivityResult(...)");
        this.f2415G = registerForActivityResult;
        final int i5 = 1;
        ah.b registerForActivityResult2 = registerForActivityResult(new a4.s(3), new ah.a(this) { // from class: Yb.a
            public final /* synthetic */ C0307h purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                Uri uriForFile;
                switch (i5) {
                    case 0:
                        Boolean success = (Boolean) obj;
                        Intrinsics.echo(success, "success");
                        C0307h c0307h = this.purple;
                        File file = c0307h.f2421y;
                        if (file != null) {
                            if (!success.booleanValue() || !file.exists()) {
                                file = null;
                            }
                            if (file != null) {
                                Intrinsics.delta(c0307h.requireContext(), "requireContext(...)");
                                Intrinsics.delta(c0307h.requireContext(), "requireContext(...)");
                                I9.b.echo(file, "camera", "delivery_proof");
                                if (c0307h.isAdded()) {
                                    Intrinsics.delta(c0307h.requireContext(), "requireContext(...)");
                                    Intrinsics.delta(c0307h.requireContext(), "requireContext(...)");
                                    vf.Y y10 = c0307h.f2413E;
                                    if (y10 != null) {
                                        y10.foxtrot(null);
                                    }
                                    Context requireContext = c0307h.requireContext();
                                    Intrinsics.delta(requireContext, "requireContext(...)");
                                    c0307h.f2414F = file;
                                    androidx.lifecycle.al viewLifecycleOwner = c0307h.getViewLifecycleOwner();
                                    Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                    c0307h.f2413E = vf.ad.zulu(androidx.lifecycle.T.foxtrot(viewLifecycleOwner), null, null, new C0301e(c0307h, file, requireContext, null), 3);
                                    return;
                                }
                                return;
                            }
                        }
                        String string = c0307h.getString(R.string.image_capture_failed);
                        Intrinsics.delta(string, "getString(...)");
                        c0307h.black(string);
                        return;
                    default:
                        Map result = (Map) obj;
                        Intrinsics.echo(result, "result");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : result.entrySet()) {
                            if (!((Boolean) entry.getValue()).booleanValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set keySet = linkedHashMap.keySet();
                        boolean isEmpty = keySet.isEmpty();
                        C0307h c0307h2 = this.purple;
                        if (isEmpty) {
                            File file2 = new File(c0307h2.requireContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES), ao.ad.gray("JPEG_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()), ".jpg"));
                            Intrinsics.delta(c0307h2.requireContext(), "requireContext(...)");
                            File file3 = c0307h2.f2422z;
                            if (file3 == null || c0307h2.C) {
                                file3 = null;
                            }
                            c0307h2.B = file3;
                            c0307h2.A = null;
                            c0307h2.f2422z = null;
                            c0307h2.C = false;
                            c0307h2.f2414F = null;
                            ((androidx.compose.runtime.t0) c0307h2.f2419w).setValue(null);
                            String crimson = androidx.appcompat.widget.P0.crimson(c0307h2.requireContext().getPackageName(), ".provider");
                            try {
                                uriForFile = FileProvider.getUriForFile(c0307h2.requireContext(), crimson, file2);
                            } catch (IllegalArgumentException unused) {
                                File file4 = new File(c0307h2.requireContext().getCacheDir(), file2.getName());
                                try {
                                    uriForFile = FileProvider.getUriForFile(c0307h2.requireContext(), crimson, file4);
                                    file2 = file4;
                                } catch (IllegalArgumentException unused2) {
                                    String string2 = c0307h2.getString(R.string.storage_unavailable);
                                    Intrinsics.delta(string2, "getString(...)");
                                    c0307h2.black(string2);
                                    return;
                                }
                            }
                            c0307h2.f2421y = file2;
                            if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(c0307h2.requireContext().getPackageManager()) != null) {
                                c0307h2.f2415G.alpha(uriForFile);
                                return;
                            }
                            String string3 = c0307h2.getString(R.string.no_camera_app_found);
                            Intrinsics.delta(string3, "getString(...)");
                            c0307h2.black(string3);
                            return;
                        }
                        Set set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                if (!AbstractC1683c.foxtrot(c0307h2.requireActivity(), (String) it.next())) {
                                    c0307h2.f2420x = false;
                                    new AlertDialog.Builder(c0307h2.requireContext()).setTitle(R.string.permission_required_title).setMessage(R.string.permission_required_msg_camera).setPositiveButton(R.string.open_settings, new Gc.e(3, c0307h2)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                                    return;
                                }
                            }
                        }
                        c0307h2.f2420x = false;
                        String string4 = c0307h2.getString(R.string.camera_permission_denied_try_again);
                        Intrinsics.delta(string4, "getString(...)");
                        c0307h2.black(string4);
                        return;
                }
            }
        });
        Intrinsics.delta(registerForActivityResult2, "registerForActivityResult(...)");
        this.f2416H = registerForActivityResult2;
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setContent(new P.d(new Ac.k(16, this), -53615506, true));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onDestroyView() {
        super.onDestroyView();
        vf.Y y10 = this.f2413E;
        if (y10 != null) {
            y10.foxtrot(null);
        }
        androidx.lifecycle.al viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.ag foxtrot = androidx.lifecycle.T.foxtrot(viewLifecycleOwner);
        vf.U u4 = vf.U.alpha;
        Cf.e eVar = vf.ao.alpha;
        vf.ad.zulu(foxtrot, u4.plus(Cf.d.purple), null, new C0305g(this, null), 2);
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        if (this.f2412D && isAdded()) {
            this.f2412D = false;
            this.f2416H.alpha(new String[]{"android.permission.CAMERA"});
        }
    }
}
