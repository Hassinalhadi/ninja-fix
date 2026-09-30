package U7;

import B9.ab;
import C3.d;
import Ge.l;
import Ge.m;
import Ne.f;
import Q7.h;
import Se.g;
import Se.i;
import Se.p;
import Se.r;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import av.ao;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.internal.Intrinsics;
import le.AbstractC2074a;
import pe.InterfaceC2330f;
import pe.an;
import qe.C2467c;
import t6.S3;

/* loaded from: classes2.dex */
public final class c implements l {
    public Object alpha;
    public Object purple;
    public Object red;
    public Object silver;
    public Object teal;
    public Object white;
    public Object yellow;

    public /* synthetic */ c(ConstraintLayout constraintLayout, View view, ViewGroup viewGroup, View view2, View view3, View view4, View view5) {
        this.alpha = constraintLayout;
        this.purple = view;
        this.red = viewGroup;
        this.silver = view2;
        this.teal = view3;
        this.white = view4;
        this.yellow = view5;
    }

    public static c delta(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_location_compliance, (ViewGroup) null, false);
        int i4 = R.id.buttonContainer;
        if (((LinearLayout) S3.bravo(R.id.buttonContainer, inflate)) != null) {
            i4 = R.id.icon;
            ImageView imageView = (ImageView) S3.bravo(R.id.icon, inflate);
            if (imageView != null) {
                i4 = R.id.iconContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) S3.bravo(R.id.iconContainer, inflate);
                if (constraintLayout != null) {
                    i4 = R.id.message;
                    TextView textView = (TextView) S3.bravo(R.id.message, inflate);
                    if (textView != null) {
                        i4 = R.id.negativeButton;
                        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.negativeButton, inflate);
                        if (materialButton != null) {
                            i4 = R.id.positiveButton;
                            MaterialButton materialButton2 = (MaterialButton) S3.bravo(R.id.positiveButton, inflate);
                            if (materialButton2 != null) {
                                i4 = R.id.title;
                                TextView textView2 = (TextView) S3.bravo(R.id.title, inflate);
                                if (textView2 != null) {
                                    return new c((ConstraintLayout) inflate, imageView, constraintLayout, textView, materialButton, materialButton2, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    public static synchronized void foxtrot(File file) {
        synchronized (c.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean hotel(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                hotel(file2);
            }
        }
        return file.delete();
    }

    public static List india(Object[] objArr) {
        if (objArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(objArr);
    }

    public void alpha(String str) {
        File file = new File((File) this.purple, str);
        if (file.exists() && hotel(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    @Override // Ge.l
    public void bravo() {
        r rVar;
        HashMap arguments = (HashMap) this.purple;
        ao aoVar = (ao) this.red;
        aoVar.getClass();
        Ne.b bVar = (Ne.b) this.teal;
        Intrinsics.echo(arguments, "arguments");
        boolean z2 = false;
        if (Intrinsics.areEqual(bVar, AbstractC2074a.bravo)) {
            Object obj = arguments.get(f.echo("value"));
            p pVar = null;
            if (obj instanceof r) {
                rVar = (r) obj;
            } else {
                rVar = null;
            }
            if (rVar != null) {
                Object obj2 = rVar.alpha;
                if (obj2 instanceof p) {
                    pVar = (p) obj2;
                }
                if (pVar != null) {
                    z2 = aoVar.amber(pVar.alpha.alpha);
                }
            }
        }
        if (z2 || aoVar.amber(bVar)) {
            return;
        }
        ((List) this.white).add(new C2467c(((InterfaceC2330f) this.silver).oscar(), arguments, (an) this.yellow));
    }

    public File charlie(String str, String str2) {
        File file = new File((File) this.silver, str);
        file.mkdirs();
        return new File(file, str2);
    }

    @Override // Ge.l
    public void echo(f fVar, Object obj) {
        ((HashMap) this.purple).put(fVar, ao.echo((ao) this.alpha, fVar, obj));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Ge.m, com.google.firebase.messaging.o] */
    @Override // Ge.l
    public m golf(f fVar) {
        ao aoVar = (ao) this.alpha;
        ?? obj = new Object();
        obj.bravo = aoVar;
        obj.charlie = fVar;
        obj.delta = this;
        obj.alpha = new ArrayList();
        return obj;
    }

    @Override // Ge.l
    public void juliet(f fVar, Ne.b bVar, f fVar2) {
        ((HashMap) this.purple).put(fVar, new i(bVar, fVar2));
    }

    @Override // Ge.l
    public void kilo(f fVar, Se.f fVar2) {
        ((HashMap) this.purple).put(fVar, new g(new p(fVar2)));
    }

    @Override // Ge.l
    public l quebec(Ne.b bVar, f fVar) {
        ArrayList arrayList = new ArrayList();
        c azure = ((ao) this.alpha).azure(bVar, an.magenta, arrayList);
        Intrinsics.checkNotNull(azure);
        return new ab(azure, this, fVar, arrayList);
    }

    public c() {
        this.alpha = new AtomicBoolean();
        this.purple = null;
        this.red = new HashMap(16, 1.0f);
        this.silver = new HashMap(16, 1.0f);
        this.teal = new HashMap(16, 1.0f);
        this.white = new HashMap(16, 1.0f);
        this.yellow = null;
    }

    public c(String str, c cVar, P7.f fVar) {
        this.silver = new d(this, false);
        this.teal = new d(this, true);
        this.white = new Fe.c(5);
        this.yellow = new AtomicMarkableReference(null, false);
        this.alpha = str;
        this.purple = new h(cVar);
        this.red = fVar;
    }
}
